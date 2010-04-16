/*
 * VentanaNuevoPerfil.java
 *
 * Created on 18 de septiembre de 2008, 09:13
 */

package vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.table.TableColumn;
import vista.util.VentanaNuevoPerfilUtil;

/**
 *
 * @author  marcelo
 */
public class VentanaNuevoPerfil extends javax.swing.JFrame
{

    private VentanaNuevoPerfilUtil util = new VentanaNuevoPerfilUtil();
    private Collection temas = new ArrayList();
    private Collection canales = new ArrayList();
    private Collection estados = new ArrayList();
    private Collection recetas = new ArrayList();
    private Collection perfiles = new ArrayList();

    /** Creates new form VentanaNuevoPerfil */
    public VentanaNuevoPerfil() {
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
        jButtonNuevoCanal = new javax.swing.JButton();
        jButtonNuevoEstiloMusica = new javax.swing.JButton();
        jButtonNuevoEstiloMusica1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCanales = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMusica = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableRecetas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jSliderTemperatura = new javax.swing.JSlider();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePerfiles = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableEstadosAnimo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo Perfil");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));

        jButtonNuevoCanal.setText("Agregar Canal");
        jButtonNuevoCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoCanalActionPerformed(evt);
            }
        });

        jButtonNuevoEstiloMusica.setText("Agregar Temas");
        jButtonNuevoEstiloMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoEstiloMusicaActionPerformed(evt);
            }
        });

        jButtonNuevoEstiloMusica1.setText("Agregar Receta");
        jButtonNuevoEstiloMusica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoEstiloMusica1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jTableCanales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null}
            },
            new String [] {
                "Canales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableCanales);

        jTableMusica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null}
            },
            new String [] {
                "Estil de Musica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableMusica);

        jTableRecetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null}
            },
            new String [] {
                "Recetas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableRecetas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jButtonNuevoCanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNuevoEstiloMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNuevoEstiloMusica1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNuevoEstiloMusica)
                            .addComponent(jButtonNuevoEstiloMusica1)
                            .addComponent(jButtonNuevoCanal)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Intensidad de la Luz"));

        jSliderTemperatura.setMajorTickSpacing(5);
        jSliderTemperatura.setMinorTickSpacing(1);
        jSliderTemperatura.setPaintLabels(true);
        jSliderTemperatura.setPaintTicks(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSliderTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSliderTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButtonGuardar.setText("Guardar");

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Perfiles"));

        jTablePerfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePerfiles);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Estados de Animo"));

        jTableEstadosAnimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEstadosAnimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableEstadosAnimoMouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(jTableEstadosAnimo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_jButtonSalirActionPerformed

private void jButtonNuevoCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoCanalActionPerformed
// TODO add your handling code here:
    VentanaAgregarCanal agregarCanal = new VentanaAgregarCanal(this);
    agregarCanal.setVisible(true);
}//GEN-LAST:event_jButtonNuevoCanalActionPerformed

private void jButtonNuevoEstiloMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoEstiloMusicaActionPerformed

    VentanaAgregarTema agregar = new VentanaAgregarTema(this);
    agregar.setVisible(true);
}//GEN-LAST:event_jButtonNuevoEstiloMusicaActionPerformed

private void jButtonNuevoEstiloMusica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoEstiloMusica1ActionPerformed
// TODO add your handling code here:
    VentanaNuevaReceta nuevaReceta = new VentanaNuevaReceta(this);
    nuevaReceta.setVisible(true);
}//GEN-LAST:event_jButtonNuevoEstiloMusica1ActionPerformed

private void jTableEstadosAnimoMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTableEstadosAnimoMouseReleased
{//GEN-HEADEREND:event_jTableEstadosAnimoMouseReleased
    // TODO add your handling code here:
    this.desmarcar();
}//GEN-LAST:event_jTableEstadosAnimoMouseReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaNuevoPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevoCanal;
    private javax.swing.JButton jButtonNuevoEstiloMusica;
    private javax.swing.JButton jButtonNuevoEstiloMusica1;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSlider jSliderTemperatura;
    private javax.swing.JTable jTableCanales;
    private javax.swing.JTable jTableEstadosAnimo;
    private javax.swing.JTable jTableMusica;
    private javax.swing.JTable jTablePerfiles;
    private javax.swing.JTable jTableRecetas;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void inicializar()
    {
        this.centrar();
        this.ajustarTamanioColumna();
        this.llenarTablaEstadosDeAnimo();
        this.llenarTablaPerfiles();
    }

    private void centrar()
    {
        Dimension pantalla, cuadro;
	pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	cuadro = this.getSize();
	this.setLocation(((pantalla.width - cuadro.width)/2), (pantalla.height - cuadro.height)/2);
    }
    
    private void ajustarTamanioColumna()
    {
        TableColumn column = null;
        for (int i = 0; i < 2; i++)
        {
            column = jTablePerfiles.getColumnModel().getColumn(i);
            switch(i)
            {
                case 0:
                        column.setPreferredWidth(15);
//                        System.out.println("El tamaño de la clumna 1 es: "+column.getPreferredWidth());
                        break;
                case 1:
                        column.setPreferredWidth(257);
//                        System.out.println("El tamaño de la clumna 2 es: "+column.getPreferredWidth());
                        break;
            }
        }
        for (int i = 0; i < 3; i++)
        {
            column = jTableEstadosAnimo.getColumnModel().getColumn(i);

            switch(i)
            {
                case 0:
                        column.setPreferredWidth(21);
//                        System.out.println("El tamaño de la clumna 1 es: "+column.getPreferredWidth());
                        break;
                case 1:
                        column.setPreferredWidth(176);
//                        System.out.println("El tamaño de la clumna 2 es: "+column.getPreferredWidth());
                        break;
                case 2:
//                        System.out.println("El tamaño de la clumna 3 es: "+column.getPreferredWidth());
                        column.setPreferredWidth(28);
                        break;
            }
        }
    }

    private void desmarcar()
    {
        boolean marca = Boolean.parseBoolean(String.valueOf(this.jTableEstadosAnimo.getValueAt(this.jTableEstadosAnimo.getSelectedRow(), 2)));
        this.util.desmarcar(this.jTableEstadosAnimo, marca, this.jTableEstadosAnimo.getSelectedRow());
    }

    private void llenarTablaMusica()
    {
        System.out.println("El tamaño de musicas es: "+temas.size());
        this.util.cargarTablaTemas(jTableMusica, temas);
    }

    private void llenarTablaCanales()
    {
        System.out.println("El tamaño de canales es: "+canales.size());
        this.util.cargarTablaCanales(this.jTableCanales, canales);
    }

    private void llenarTablaEstadosDeAnimo()
    {
        this.estados = this.util.cargarTablaEstadosDeAnimo(this.jTableEstadosAnimo, this.estados);
    }

    private void llenarTablaPerfiles()
    {
        this.perfiles = this.util.cargarTablaPerfiles(this.jTablePerfiles, this.perfiles);
    }

    private void llenarTablaRecetas()
    {
        this.util.cargarTablaRecetas(this.jTableRecetas, this.recetas);
    }

    public void setTemas(Collection temas)
    {
        this.temas = temas;
        this.llenarTablaMusica();
    }

    public void setCanales(Collection canales)
    {
        this.canales = canales;
        this.llenarTablaCanales();
    }

    public void setRecetas(Collection recetas)
    {
        this.recetas = recetas;
        this.llenarTablaRecetas();
    }
}
