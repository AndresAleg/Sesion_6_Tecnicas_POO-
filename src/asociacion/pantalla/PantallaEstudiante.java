package asociacion.pantalla;

import asociacion.entidades.Curso;
import asociacion.entidades.Estudiante;
import static asociacion.entidades.ListaEntidades.getCursos;
import javax.swing.DefaultListModel;

/**
 *
 * @author Andres
 */
public class PantallaEstudiante extends javax.swing.JFrame {

    String nombreCurso;
    Curso curso;
    
    public PantallaEstudiante() {
        initComponents();
    }
    
    public PantallaEstudiante(String nombreCurso) {
        initComponents();
        inicializarFormulario(nombreCurso);
        inicializarListEstudiantes();
        this.nombreCurso = nombreCurso;
    }
    
    private void inicializarFormulario(String nombreCurso) {
        
        for (Curso curso : getCursos()) {
            if (curso.getNombre().equals(nombreCurso)){
                this.curso = curso;
            }
        }
        lblTitulo.setText("Estudiante de [" + nombreCurso + "]");
    }
        
    private void inicializarListEstudiantes(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Estudiante estudiante : this.curso.getEstudiantes()) {
            modelo.addElement(estudiante.getNombre());
        }
        listEstudiantes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listEstudiantes = new javax.swing.JList<>();
        btnRegresar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setText("Profesor de [Nombre de Curso]");

        listEstudiantes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listEstudiantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listEstudiantes);

        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAgregar.setText("agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 169, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PantallaGestorCursos pantallaGestorCursos = new PantallaGestorCursos();
        pantallaGestorCursos.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        EditarPantallaEstudiante editarPantallaEstudiante = new EditarPantallaEstudiante(nombreCurso);
        editarPantallaEstudiante.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:         
        String nombreEstudiante = (String)listEstudiantes.getSelectedValue();
        Estudiante[] estudiantes = new Estudiante[30];
        int numEstudiantes = 0;
        
        for (Estudiante estudiante : this.curso.getEstudiantes()){
            if (!estudiante.getNombre().equals(nombreEstudiante) 
                    && numEstudiantes < 30){
                estudiantes[numEstudiantes] = estudiante;
                numEstudiantes++;
            }
        }
        
        for (Curso curso : getCursos()) {
            if (curso.getNombre().equals(this.curso.getNombre())){
                curso.setEstudiantes(estudiantes);
            }
        }
        
        inicializarListEstudiantes();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> listEstudiantes;
    // End of variables declaration//GEN-END:variables
}