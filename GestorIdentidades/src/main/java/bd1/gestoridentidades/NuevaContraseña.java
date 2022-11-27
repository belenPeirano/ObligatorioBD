
package bd1.gestoridentidades;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPasswordField;

/**
 *
 * @author belu_
 */
public class NuevaContraseña extends javax.swing.JFrame {

    /**
     * Creates new form NuevaContraseña
     */
    public NuevaContraseña() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNuevaContraseña = new javax.swing.JPanel();
        lblNuevaContraseña = new javax.swing.JLabel();
        lblNuevaContraseña2 = new javax.swing.JLabel();
        btnConfirmarContraseña = new javax.swing.JButton();
        txtNuevaContraseña = new javax.swing.JPasswordField();
        txtNuevaContraseña2 = new javax.swing.JPasswordField();
        btnInicioSesion = new javax.swing.JButton();
        lblContraseñaActual = new javax.swing.JLabel();
        txtContraseñaActual = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblResetear = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNuevaContraseña.setText("Nueva contraseña");

        lblNuevaContraseña2.setText("Repita Nueva Contraseña");

        btnConfirmarContraseña.setText("Confirmar");
        btnConfirmarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarContraseñaActionPerformed(evt);
            }
        });

        btnInicioSesion.setText("Iniciar Sesión");
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });

        lblContraseñaActual.setText("Contraseña Actual");

        lblUsuario.setText("Usuario");

        txtUsuario.setToolTipText("Ingrese nombre de usuario");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        lblResetear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblResetear.setText("Cambiar Contraseña");

        javax.swing.GroupLayout pnlNuevaContraseñaLayout = new javax.swing.GroupLayout(pnlNuevaContraseña);
        pnlNuevaContraseña.setLayout(pnlNuevaContraseñaLayout);
        pnlNuevaContraseñaLayout.setHorizontalGroup(
            pnlNuevaContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaContraseñaLayout.createSequentialGroup()
                .addGroup(pnlNuevaContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevaContraseñaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnlNuevaContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNuevaContraseñaLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(lblUsuario))
                            .addGroup(pnlNuevaContraseñaLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblNuevaContraseña))
                            .addComponent(lblNuevaContraseña2)
                            .addGroup(pnlNuevaContraseñaLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(lblContraseñaActual)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlNuevaContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNuevaContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlNuevaContraseñaLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblResetear))
                    .addGroup(pnlNuevaContraseñaLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnConfirmarContraseña)
                        .addGap(56, 56, 56)
                        .addComponent(btnInicioSesion)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pnlNuevaContraseñaLayout.setVerticalGroup(
            pnlNuevaContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevaContraseñaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResetear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnlNuevaContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pnlNuevaContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContraseñaActual))
                .addGap(38, 38, 38)
                .addGroup(pnlNuevaContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNuevaContraseña)
                    .addComponent(txtNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlNuevaContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevaContraseña2)
                    .addComponent(txtNuevaContraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(pnlNuevaContraseñaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmarContraseña)
                    .addComponent(btnInicioSesion))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlNuevaContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlNuevaContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarContraseñaActionPerformed
        PersonaConexion pc = new PersonaConexion(conect.obtenerConexion());

        try {
            Persona persona = pc.obtenerPersona(txtUsuario.getText());
            if (persona != null && persona.getHashpwd().equalsIgnoreCase(this.aString(txtContraseñaActual))) {
                if (this.aString(txtNuevaContraseña).equals(this.aString(txtNuevaContraseña2))) {
                    pc.cambiarContraseña(this.aString(txtNuevaContraseña), txtUsuario.getText());
                    showMessageDialog(null, "Contraseña modificada con éxito", "Éxito", INFORMATION_MESSAGE);
                } else {
                    showMessageDialog(null, "Ambas contraseñas deben ser iguales", "Error", ERROR_MESSAGE);
                }
            } else {
                showMessageDialog(null, "Usuario y/o Contraseña incorrectos", "Error", ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(NuevaContraseña.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnConfirmarContraseñaActionPerformed

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        InicioSesion inicioSesion = new InicioSesion();
        inicioSesion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    public static String aString(JPasswordField contraseña) {
        String contra = "";
        for (int i = 0; i < contraseña.getPassword().length; i++) {
            contra += contraseña.getPassword()[i];
        }
        return contra;
    }

    ConexionBD conect = new ConexionBD();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarContraseña;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JLabel lblContraseñaActual;
    private javax.swing.JLabel lblNuevaContraseña;
    private javax.swing.JLabel lblNuevaContraseña2;
    private javax.swing.JLabel lblResetear;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlNuevaContraseña;
    private javax.swing.JPasswordField txtContraseñaActual;
    private javax.swing.JPasswordField txtNuevaContraseña;
    private javax.swing.JPasswordField txtNuevaContraseña2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
