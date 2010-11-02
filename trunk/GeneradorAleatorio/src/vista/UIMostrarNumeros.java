/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UIMostrarNumeros.java
 *
 * Created on 23/05/2010, 18:09:07
 */

package vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.table.TableColumn;
import vista.util.UIMostrarNumerosUtil;

/**
 *
 * @author Carolina
 */
public class UIMostrarNumeros extends javax.swing.JFrame
{

    private Collection numeros = new ArrayList();
    private UIMostrarNumerosUtil util = new UIMostrarNumerosUtil();

    /** Creates new form UIMostrarNumeros */
    public UIMostrarNumeros() {
        initComponents();
    }

    public UIMostrarNumeros(Collection numeros)
    {
        initComponents();
        this.numeros = numeros;
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
        jTableValores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVariables = new javax.swing.JTable();
        jButtonExportar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores Generados"));

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
        jScrollPane1.setViewportView(jTableValores);

        jTableVariables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Variables", "Select"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVariables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVariablesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableVariables);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonExportar.setText("Exportar");
        jButtonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButtonExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExportar)
                    .addComponent(jButtonSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableVariablesMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTableVariablesMouseClicked
    {//GEN-HEADEREND:event_jTableVariablesMouseClicked
        // TODO add your handling code here:
        this.mostrarNumeros();
    }//GEN-LAST:event_jTableVariablesMouseClicked

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSalirActionPerformed
    {//GEN-HEADEREND:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
//        this.ajustarTamanioColumna();
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonExportarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonExportarActionPerformed
    {//GEN-HEADEREND:event_jButtonExportarActionPerformed
        // TODO add your handling code here:
        this.exportar();
    }//GEN-LAST:event_jButtonExportarActionPerformed
//
//    /**
//    * @param args the command line arguments
//    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UIMostrarNumeros().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExportar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableValores;
    private javax.swing.JTable jTableVariables;
    // End of variables declaration//GEN-END:variables

    private void inicializar()
    {
        this.centrar();
        this.cargarVariables();
        this.ajustarTamanioColumna();
    }

    private void ajustarTamanioColumna()
    {
        TableColumn column = null;
        for (int i = 0; i < 2; i++)
        {
            column = jTableVariables.getColumnModel().getColumn(i);
            switch(i)
            {
                case 0:
                        column.setPreferredWidth(220);
//                        System.out.println("El tamaño de la clumna 1 es: "+column.getPreferredWidth());
                        break;
                case 1:
                        column.setPreferredWidth(15);
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

        for (int i = 0; i < 2; i++)
        {
            column = jTableValores.getColumnModel().getColumn(i);
            switch(i)
            {
                case 0:
                        column.setPreferredWidth(15);
//                        System.out.println("El tamaño de la clumna 1 es: "+column.getPreferredWidth());
                        break;
                case 1:
                        column.setPreferredWidth(184);
//                        System.out.println("El tamaño de la clumna 1 es: "+column.getPreferredWidth());
                        break;
                case 2:
                        column.setPreferredWidth(10);
//                        System.out.println("El tamaño de la clumna 1 es: "+column.getPreferredWidth());
                        break;
            }
        }
    }

    private void centrar()
    {
        Dimension pantalla, cuadro;
	pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	cuadro = this.getSize();
	this.setLocation(((pantalla.width - cuadro.width)/2), (pantalla.height - cuadro.height)/2);
    }

    private void cargarVariables()
    {
        Iterator it = this.numeros.iterator();
        while(it.hasNext())
        {
            Vector v = (Vector)it.next();
            this.util.cargarVariable(String.valueOf(v.elementAt(0)), this.jTableVariables);
            v = null;
        }
    }

    private void mostrarNumeros()
    {
        String var = String.valueOf(this.jTableVariables.getValueAt(this.jTableVariables.getSelectedRow(), 0));
        Iterator it = this.numeros.iterator();
        while(it.hasNext())
        {
            Vector v = (Vector)it.next();
            if(var.trim().equals(String.valueOf(v.elementAt(0))))
            {
                this.util.cargarNumeros(this.jTableValores, v);
                break;
            }
            v = null;
        }
    }

    private void exportar()
    {
        this.util.exportar(this.jTableVariables, this.numeros);
    }
}
