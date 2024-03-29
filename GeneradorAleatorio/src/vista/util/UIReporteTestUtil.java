/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vista.util;

import cern.jet.random.engine.RandomEngine;
import evaluadores.TestCiclos;
import evaluadores.TestIndependencia;
import evaluadores.TestUniformidad;
import generadores.GeneradorCongruencial;
import generadores.GeneradorFourTap;
import generadores.GeneradorLfsr113;
import generadores.GeneradorMrg32k3a;
import generadores.GeneradorMrg32k3aL;
import generadores.GeneradorWell1024;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYDotRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Carolina
 */
public class UIReporteTestUtil
{
    private RandomEngine randomGenerator;
    private TestIndependencia testIndependencia = new TestIndependencia();
    private TestUniformidad testUniformidad = new TestUniformidad();

    private Vector v = new Vector();

    public UIReporteTestUtil()
    {
    }


    /**
     *
     * @param cantidad
     * @param tipoGenerador entero que contiene el tipo de generador a probar
     * 0 -> mersenne twister
     * 1 -> well 1024
     * 2 -> well 907
     */
    public void inicializar(int cantidad, int tipoGenerador)
    {
        v.clear();
        switch(tipoGenerador)
        {
            case 0:
                    randomGenerator = RandomEngine.makeDefault();
                    for(int i=0; i<cantidad; i++)
                    {
                        v.add(randomGenerator.raw());
                    }
                    break;
            case 1:
                    GeneradorWell1024 well = new GeneradorWell1024();
                    for(int i=0; i<cantidad; i++)
                    {
                        v.add(well.getNumero());
                    }
                    break;
            case 2:
                    // generdor LFSR113
                    GeneradorLfsr113 l = new GeneradorLfsr113(1);
                    for(int i=0; i<cantidad; i++)
                    {
                        v.add(l.getNumero());
                    }
                    break;
            case 3:
                    GeneradorMrg32k3a r = new GeneradorMrg32k3a();
                    for(int i=0; i<cantidad; i++)
                    {
                        v.add(r.getNumero());
                    }
                    break;
                    // MRG32k3a
            case 4:
                    // MRG32k3aL
                    GeneradorMrg32k3aL k = new GeneradorMrg32k3aL();
                    for(int i=0; i<cantidad; i++)
                    {
                        v.add(k.getNumero());
                    }
                    break;
            case 5:
                    // Fourtap
                    GeneradorFourTap ft = new GeneradorFourTap();
                    for(int i=0; i<cantidad; i++)
                    {
                        v.add(ft.getNumero());
                    }
                    break;
            case 6:
                    GeneradorCongruencial gc = new GeneradorCongruencial();
                    for(int i=0; i<cantidad; i++)
                    {
                        v.add(gc.nextDouble());
                    }
                    break;
        }
        
    }


    public void testCiclo(JTextArea textoCiclo)
    {
        TestCiclos test = new TestCiclos();
        int ciclo = test.test(v);
        if(ciclo != (v.size()-1))
            textoCiclo.setText("La secuencia generada contiene ciclo, la cantidad de numeros generados antes de repetir el ciclo es: "+ciclo);
        else
            textoCiclo.setText("La secuencia generada no contiene ciclo");
    }

    public void testIndependencia(JTextArea textoIndependencia)
    {
        textoIndependencia.setText(this.testIndependencia.test(this.v));
    }

    public void testUniformidad(JTextArea resultado)
    {
        resultado.setText(this.testUniformidad.test(v));
    }

    public boolean validar(JTextField caja)
    {
        boolean bandera = true;
        if(caja.getText().trim().length() == 0)
        {
            bandera = false;
            JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de valores a generar", "Faltan parametros", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
                int numero = Integer.parseInt(caja.getText());
            }
            catch(NumberFormatException e)
            {
                bandera = false;
                JOptionPane.showMessageDialog(null, "Debe ingresar un cantidad entera de valores a generar", "Parametro Erroneo", JOptionPane.ERROR_MESSAGE);
            }
        }
        return bandera;
    }
    
    private void limpiar(JTable tabla)
    {
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        while(tabla.getRowCount() != 0)
                modelo.removeRow(0);
        modelo = null;
    }

    public void mostrarValores(JTable tabla)
    {
        this.limpiar(tabla);
        boolean bandera = true;
        int cont = 0;
        this.limpiar(tabla);
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        String[] datos = new String[2];
        for(int i=0; i<v.size(); i++)
        {
                datos[1] = String.valueOf(v.elementAt(i));
                cont++;
                datos[0] = String.valueOf(cont);
                modelo.addRow(datos);
        }
    }

    public void mostrarDispersion(String grafico)
    {
        int size = v.size();
        size--;
        XYSeries series = new XYSeries("Gráfico Dispersion");
        double numx, numy;
        for(int i=0; i<size; i++)
        {
            numx = Double.parseDouble(String.valueOf(v.elementAt(i)));
            numy = Double.parseDouble(String.valueOf(v.elementAt(i+1)));
            series.add(numx, numy);
        }
        XYDataset juegoDatos= new XYSeriesCollection(series);


        JFreeChart chart = ChartFactory.createScatterPlot(grafico, null, null, juegoDatos, PlotOrientation.VERTICAL, false, false, true);
        XYPlot xyplot = (XYPlot)chart.getPlot();
        xyplot.setDomainCrosshairVisible(true);
        xyplot.setDomainCrosshairLockedOnData(true);
        xyplot.setRangeCrosshairVisible(true);
        xyplot.setRangeCrosshairLockedOnData(true);
        xyplot.setDomainZeroBaselineVisible(true);
        xyplot.setRangeZeroBaselineVisible(true);
        XYDotRenderer xydotrenderer = new XYDotRenderer();
        xydotrenderer.setDotWidth(2);
        xydotrenderer.setDotHeight(2);
        xyplot.setRenderer(xydotrenderer);
        NumberAxis numberaxis = (NumberAxis)xyplot.getDomainAxis();
        numberaxis.setAutoRangeIncludesZero(false);
        
        ChartFrame frame = new ChartFrame("Gráfico Dispersion", chart);
        frame.pack();
        this.centrar(frame);
        frame.setVisible(true);
    }

    private void centrar(ChartFrame ventana)
    {
        Dimension pantalla, cuadro;
	pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	cuadro = ventana.getSize();
	ventana.setLocation(((pantalla.width - cuadro.width)/2), (pantalla.height - cuadro.height)/2);
    }

}
