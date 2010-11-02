/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UIReporteTest.java
 *
 * Created on 27/05/2010, 02:15:10
 */

package vista;

import evaluadores.TestIndependencia;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.table.TableColumn;
import vista.util.UIReporteTestUtil;

/**
 *
 * @author Carolina
 */
public class UIReporteTest extends javax.swing.JFrame
{

    private TestIndependencia testIndependencia = new TestIndependencia();
    private Vector numeros = new Vector();
    private UIReporteTestUtil util = new UIReporteTestUtil();

    /** Creates new form UIReporteTest */
    public UIReporteTest() {
        initComponents();
        this.inicializar();
    }

    public UIReporteTest(Vector numeros)
    {
        this.numeros = numeros;
        initComponents();
        this.inicializar();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultadoTestIndependencia = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaResultadoTestUniformidad = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonProbar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaResultadoTestCiclo = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableValores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de Test");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Test de Independencia"));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaResultadoTestIndependencia.setBackground(new java.awt.Color(231, 190, 124));
        jTextAreaResultadoTestIndependencia.setColumns(20);
        jTextAreaResultadoTestIndependencia.setLineWrap(true);
        jTextAreaResultadoTestIndependencia.setRows(5);
        jTextAreaResultadoTestIndependencia.setDisabledTextColor(new java.awt.Color(8, 6, 6));
        jTextAreaResultadoTestIndependencia.setEnabled(false);
        jTextAreaResultadoTestIndependencia.setOpaque(false);
        jScrollPane1.setViewportView(jTextAreaResultadoTestIndependencia);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Test de Uniformidad"));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaResultadoTestUniformidad.setBackground(new java.awt.Color(231, 190, 124));
        jTextAreaResultadoTestUniformidad.setColumns(20);
        jTextAreaResultadoTestUniformidad.setLineWrap(true);
        jTextAreaResultadoTestUniformidad.setRows(5);
        jTextAreaResultadoTestUniformidad.setDisabledTextColor(new java.awt.Color(8, 6, 6));
        jTextAreaResultadoTestUniformidad.setEnabled(false);
        jTextAreaResultadoTestUniformidad.setOpaque(false);
        jScrollPane2.setViewportView(jTextAreaResultadoTestUniformidad);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jTextFieldCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadKeyPressed(evt);
            }
        });

        jLabel1.setText("Cantidad a probar");

        jButtonProbar.setText("Probar");
        jButtonProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProbarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButtonProbar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonProbar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Test de Ciclos"));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaResultadoTestCiclo.setBackground(new java.awt.Color(231, 190, 124));
        jTextAreaResultadoTestCiclo.setColumns(20);
        jTextAreaResultadoTestCiclo.setLineWrap(true);
        jTextAreaResultadoTestCiclo.setRows(5);
        jTextAreaResultadoTestCiclo.setDisabledTextColor(new java.awt.Color(8, 6, 6));
        jTextAreaResultadoTestCiclo.setEnabled(false);
        jTextAreaResultadoTestCiclo.setOpaque(false);
        jScrollPane3.setViewportView(jTextAreaResultadoTestCiclo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));

        jTableValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "#", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableValores);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProbarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonProbarActionPerformed
    {//GEN-HEADEREND:event_jButtonProbarActionPerformed
        // TODO add your handling code here:
        this.probar();
//        this.ajustarColumnas();
    }//GEN-LAST:event_jButtonProbarActionPerformed

    private void jTextFieldCantidadKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_jTextFieldCantidadKeyPressed
    {//GEN-HEADEREND:event_jTextFieldCantidadKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == 10)
            this.probar();
    }//GEN-LAST:event_jTextFieldCantidadKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIReporteTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProbar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableValores;
    private javax.swing.JTextArea jTextAreaResultadoTestCiclo;
    private javax.swing.JTextArea jTextAreaResultadoTestIndependencia;
    private javax.swing.JTextArea jTextAreaResultadoTestUniformidad;
    private javax.swing.JTextField jTextFieldCantidad;
    // End of variables declaration//GEN-END:variables

    private void inicializar()
    {
        this.centrar();
        this.ajustarColumnas();
//        this.mostrarTestIndependencia();
//        this.mostrarTestCiclo();

    }

    private void ajustarColumnas()
    {
        TableColumn column = null;
        for (int i = 0; i < 2; i++)
        {
            column = jTableValores.getColumnModel().getColumn(i);
            switch(i)
            {
                case 0:
                        column.setPreferredWidth(35);
//                        System.out.println("El tamaño de la clumna 1 es: "+column.getPreferredWidth());
                        break;
                case 1:
                        column.setPreferredWidth(135);
//                        System.out.println("El tamaño de la clumna 1 es: "+column.getPreferredWidth());
                        break;
                case 2:
                        column.setPreferredWidth(28);
//                        System.out.println("El tamaño de la clumna 1 es: "+column.getPreferredWidth());
                        break;
                case 3:
//                        column.setPreferredWidth(37);
                        break;
            }
        }
    }

    private void probar()
    {
        System.out.println("La cantidad de digitos ingresados es "+this.jTextFieldCantidad.getText().trim().length());
        if(this.util.validar(this.jTextFieldCantidad))
        {
            this.util.inicializar(Integer.parseInt(this.jTextFieldCantidad.getText()));
            this.mostrarValores();
            this.mostrarTestCiclo();
            this.mostrarTestIndependencia();
            this.mostrarTestUniformidad();
        }
    }

    private void centrar()
    {
        Dimension pantalla, cuadro;
	pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	cuadro = this.getSize();
	this.setLocation(((pantalla.width - cuadro.width)/2), (pantalla.height - cuadro.height)/2);
    }

    private void mostrarValores()
    {
        this.util.mostrarValores(this.jTableValores);
    }

    private void mostrarTestIndependencia()
    {
        this.util.testIndependencia(jTextAreaResultadoTestIndependencia);
    }

    private void mostrarTestCiclo()
    {
        this.util.testCiclo(jTextAreaResultadoTestCiclo);
    }

    private void mostrarTestUniformidad()
    {
        this.util.testUniformidad(this.jTextAreaResultadoTestUniformidad);
    }

}
