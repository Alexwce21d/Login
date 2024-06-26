
package cPresentacion;

import Entidad.Matricula;
import cNegocio.MatriculaNegocio;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroMatricula extends javax.swing.JPanel {

    private MatriculaNegocio matriculaNegocio;

    /**
     * Creates new form RegistroMatricula
     */
    public RegistroMatricula() {
        initComponents();
        matriculaNegocio = new MatriculaNegocio();
        cargarDatosTabla();
    }
    public void cargarDatosTabla() {
    List<Matricula> matriculas = matriculaNegocio.obtenerMatriculas();
    DefaultTableModel modelo = (DefaultTableModel) tableDatosRegistrados.getModel();
    modelo.setRowCount(0); // Limpiar la tabla
    for (Matricula matricula : matriculas) {
        modelo.addRow(new Object[]{matricula.getNombre(), matricula.getDni(), matricula.getApoderado(), matricula.getDniApoderado(), matricula.getEdad(), matricula.getGrado()});
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lblTitleRegistroMatricula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombreApoderado = new javax.swing.JLabel();
        txtNombreApoderado = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblDniApoderado = new javax.swing.JLabel();
        txtDniApoderado = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        lblGrado = new javax.swing.JLabel();
        cboxGrado = new javax.swing.JComboBox<>();
        btnRegistrarAlumno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatosRegistrados = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitleRegistroMatricula.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblTitleRegistroMatricula.setText("REGISTRO DE MATRICULAS");
        background.add(lblTitleRegistroMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        lblNombre.setText("Nombre Completo:");
        background.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));
        background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 250, 30));

        lblNombreApoderado.setText("Nombre del apoderado:");
        background.add(lblNombreApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 170, -1));
        background.add(txtNombreApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 250, 30));

        lblDni.setText("DNI:");
        background.add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));
        background.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 250, 30));

        lblDniApoderado.setText("DNI del apoderado:");
        background.add(lblDniApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 110, -1));
        background.add(txtDniApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 250, 30));

        lblEdad.setText("Edad:");
        background.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, -1));
        background.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 250, 30));

        lblGrado.setText("Grado:");
        background.add(lblGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        cboxGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "primer grado", "segundo grado", "tercer grado", "cuarto grado", "quinto grado" }));
        background.add(cboxGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 250, 30));

        btnRegistrarAlumno.setText("REGISTRAR");
        btnRegistrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlumnoActionPerformed(evt);
            }
        });
        background.add(btnRegistrarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        tableDatosRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "DNI", "Apoderado", "Dni Apoderado", "Edad", "Grado"
            }
        ));
        jScrollPane1.setViewportView(tableDatosRegistrados);

        background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 660, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnRegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAlumnoActionPerformed
    
         String edadText = txtEdad.getText();
    if (edadText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese la edad del alumno.");
        return;
    }
    
    int edad;
    try {
        edad = Integer.parseInt(edadText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La edad debe ser un número entero.");
        return;
    }
       Matricula matricula = new Matricula(
        txtNombre.getText(),
        txtDni.getText(),
        txtNombreApoderado.getText(),
        txtDniApoderado.getText(),
        edad,
        (String) cboxGrado.getSelectedItem()
    );
    
    matriculaNegocio.registrarMatricula(matricula);
    
    // Actualizar la tabla con la nueva matrícula registrada
    DefaultTableModel modelo = (DefaultTableModel) tableDatosRegistrados.getModel();
    modelo.addRow(new Object[]{matricula.getNombre(), matricula.getDni(), matricula.getApoderado(), matricula.getDniApoderado(), matricula.getEdad(), matricula.getGrado()});
    }//GEN-LAST:event_btnRegistrarAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnRegistrarAlumno;
    private javax.swing.JComboBox<String> cboxGrado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDniApoderado;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreApoderado;
    private javax.swing.JLabel lblTitleRegistroMatricula;
    private javax.swing.JTable tableDatosRegistrados;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniApoderado;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreApoderado;
    // End of variables declaration//GEN-END:variables
}
