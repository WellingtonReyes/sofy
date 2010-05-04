/*
 * VentanaSensor.java
 *
 * Created on 21 de agosto de 2008, 12:07
 */

package abstraccionhardware;

//import controlador.ControladorConsulta;
//import controlador.ControladorModificacion;
import dao.ContenedorDao;
import dao.implementacion.ContenedorDaoImp;
import dominio.Contenedor;
import dominio.Elemento;
import dominio.Ingrediente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import vista.VentanaNuevaReceta;
import vista.VentanaNuevoAlimento;
import vista.VentanaNuevoEstadoAnimo;
import vista.VentanaNuevoPerfil;


/**
 *
 * @author  marcelo
 */
public class VentanaSensor extends javax.swing.JFrame 
{
    private DefaultListModel jListModelo = new DefaultListModel();

    private Collection elementos = new ArrayList();
    private Collection contenedores = new ArrayList();
    private Kernel kernel;
    
    
    /** Creates new form VentanaSensor */
    public VentanaSensor() 
    {
        initComponents();
        this.inicializar();
    }

    /** Creates new form VentanaSensor */
    public VentanaSensor(Kernel kernel)
    {
//        this.setDefaultLookAndFeelDecorated(true);
        initComponents();
        this.inicializar();
        this.kernel = kernel;
//        setDefaultLookAndFeelDecorated(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSliderTemperatura = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListElementos = new javax.swing.JList();
        jTextFieldCantidad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombrePerfil = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelTemperaturaMinima = new javax.swing.JLabel();
        jLabelTemperaturaMaxima = new javax.swing.JLabel();
        jLabelTemperatura = new javax.swing.JLabel();
        jButtonAlimentos = new javax.swing.JButton();
        jButtonRecetas = new javax.swing.JButton();
        jButtonPerfiles = new javax.swing.JButton();
        jButtonEstAnimo = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Simulador de sensores");
        setResizable(false);

        jSliderTemperatura.setMajorTickSpacing(5);
        jSliderTemperatura.setMaximum(50);
        jSliderTemperatura.setMinorTickSpacing(1);
        jSliderTemperatura.setPaintLabels(true);
        jSliderTemperatura.setPaintTicks(true);
        jSliderTemperatura.setValue(25);
        jSliderTemperatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Temperatura"));
        jSliderTemperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSliderTemperaturaMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSliderTemperaturaMouseReleased(evt);
            }
        });
        jSliderTemperatura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderTemperaturaStateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Elementos en heladera"));

        jListElementos.setModel(this.jListModelo);
        jListElementos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListElementosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListElementos);

        jTextFieldCantidad.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextFieldCantidad.setFont(new java.awt.Font("Tahoma", 0, 28));
        jTextFieldCantidad.setForeground(new java.awt.Color(0, 102, 255));
        jTextFieldCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        jTextFieldCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Perfil Activo"));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Nombre");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);

        jLabelNombrePerfil.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelNombrePerfil.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Rango de Temperaturas"));

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Temperatura Minima");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Temperatura Maxima");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setOpaque(true);

        jLabelTemperaturaMinima.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelTemperaturaMinima.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTemperaturaMaxima.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelTemperaturaMaxima.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTemperaturaMinima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTemperaturaMaxima, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTemperaturaMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTemperaturaMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelTemperatura.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabelTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTemperatura.setText("25");
        jLabelTemperatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Temperatura"));

        jButtonAlimentos.setText("Alimentos");
        jButtonAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlimentosActionPerformed(evt);
            }
        });

        jButtonRecetas.setText("Recetas");
        jButtonRecetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecetasActionPerformed(evt);
            }
        });

        jButtonPerfiles.setText("Perfiles");
        jButtonPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilesActionPerformed(evt);
            }
        });

        jButtonEstAnimo.setText("Est. Animo");
        jButtonEstAnimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstAnimoActionPerformed(evt);
            }
        });

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit00c.gif"))); // NOI18N
        jButtonSalir.setToolTipText("Salir del sistema");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonUsuario.setText("Usuario");
        jButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabelTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSliderTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonRecetas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonPerfiles, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonEstAnimo, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addGap(52, 52, 52)
                        .addComponent(jButtonSalir)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSliderTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAlimentos)
                            .addComponent(jButtonRecetas))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPerfiles)
                            .addComponent(jButtonEstAnimo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonUsuario)
                            .addComponent(jButtonSalir))))
                .addContainerGap())
        );

        jButtonAlimentos.getAccessibleContext().setAccessibleName("");
        jButtonRecetas.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
// TODO add your handling code here:
    System.exit(0);
}//GEN-LAST:event_jButtonSalirActionPerformed

private void jButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButtonUsuarioActionPerformed

private void jButtonAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlimentosActionPerformed
// TODO add your handling code here:
    VentanaNuevoAlimento ventanaAlimento = new VentanaNuevoAlimento();
    ventanaAlimento.setVisible(true);
}//GEN-LAST:event_jButtonAlimentosActionPerformed

private void jButtonPerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilesActionPerformed
// TODO add your handling code here:
    VentanaNuevoPerfil nuevoPerfil = new VentanaNuevoPerfil();
    nuevoPerfil.setVisible(true);
}//GEN-LAST:event_jButtonPerfilesActionPerformed

private void jButtonRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecetasActionPerformed
// TODO add your handling code here:
    VentanaNuevaReceta nuevaReceta = new VentanaNuevaReceta();
    nuevaReceta.setVisible(true);
}//GEN-LAST:event_jButtonRecetasActionPerformed

private void jButtonEstAnimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstAnimoActionPerformed
// TODO add your handling code here:
    VentanaNuevoEstadoAnimo estadoAnimo = new VentanaNuevoEstadoAnimo();
    estadoAnimo.setVisible(true);
}//GEN-LAST:event_jButtonEstAnimoActionPerformed

private void jListElementosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListElementosMouseClicked
// TODO add your handling code here:
    this.mostrarSeleccion();
}//GEN-LAST:event_jListElementosMouseClicked

private void jSliderTemperaturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderTemperaturaStateChanged
// TODO add your handling code here:
    this.cambiarTemperatura();
}//GEN-LAST:event_jSliderTemperaturaStateChanged

private void jTextFieldCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadKeyPressed
// TODO add your handling code here:
    if(evt.getKeyCode() == 10)
        this.guardarCantidad();
}//GEN-LAST:event_jTextFieldCantidadKeyPressed

private void jSliderTemperaturaMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jSliderTemperaturaMouseExited
{//GEN-HEADEREND:event_jSliderTemperaturaMouseExited
    // TODO add your handling code here:
    
}//GEN-LAST:event_jSliderTemperaturaMouseExited

private void jSliderTemperaturaMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jSliderTemperaturaMouseReleased
{//GEN-HEADEREND:event_jSliderTemperaturaMouseReleased
    // TODO add your handling code here:
    this.kernel.setTemperatura(this.jSliderTemperatura.getValue());
}//GEN-LAST:event_jSliderTemperaturaMouseReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSensor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlimentos;
    private javax.swing.JButton jButtonEstAnimo;
    private javax.swing.JButton jButtonPerfiles;
    private javax.swing.JButton jButtonRecetas;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNombrePerfil;
    private javax.swing.JLabel jLabelTemperatura;
    private javax.swing.JLabel jLabelTemperaturaMaxima;
    private javax.swing.JLabel jLabelTemperaturaMinima;
    private javax.swing.JList jListElementos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderTemperatura;
    private javax.swing.JTextField jTextFieldCantidad;
    // End of variables declaration//GEN-END:variables

    
    private void inicializar()
    {
        this.setLocation(5, 580);
        this.cargarElementos();
    }
    
    

    private void cargarElementos()
    {
        this.borrarElementos();
        ContenedorDao sql = new ContenedorDaoImp();
        this.contenedores = sql.getAll();
        Iterator it = this.contenedores.iterator();
        DefaultListModel modelo = (DefaultListModel)this.jListElementos.getModel();
        while(it.hasNext())
        {
            Contenedor c = (Contenedor)it.next();
            modelo.addElement(c.getNombre().trim());
            c = null;
        }
        it = null;
        modelo = null;
    }
//    
    private void borrarElementos()
    {
            this.jListElementos.removeAll();
    }
//    
    private Contenedor buscarElemento(String nombre)
    {
        Contenedor e = new Contenedor();
        Iterator it = this.contenedores.iterator();
        while(it.hasNext())
        {
            e = (Contenedor)it.next();
            if(e.getNombre().trim().equals(nombre.trim()))
                break;
        }
        return e;
    }
//    
    private void mostrarSeleccion()
    {
        Contenedor contenedor = this.buscarElemento(String.valueOf(this.jListElementos.getSelectedValue()));
        this.jTextFieldCantidad.setText(String.valueOf(contenedor.getCantidad()));
        contenedor = null;
    }
    
    private void cambiarTemperatura()
    {
        this.jLabelTemperatura.setText(String.valueOf(this.jSliderTemperatura.getValue()));
    }
    
    private void guardarCantidad()
    {
        Contenedor contenedor = this.buscarElemento(String.valueOf(this.jListElementos.getSelectedValue()));
        contenedor.setCantidad(Double.parseDouble(this.jTextFieldCantidad.getText()));
        ContenedorDao sql = new ContenedorDaoImp();
        sql.modificar(contenedor);
    }
}
