package asociacion.pantalla;

import asociacion.entidades.Curso;
import static asociacion.entidades.ListaEntidades.getCursos;
import javax.swing.DefaultListModel;

/**
 *
 * @author Andres
 */
public class PantallaGestorCursos extends javax.swing.JFrame {

    public PantallaGestorCursos() {
        initComponents();
        inicializarListCursos();
        setLocationRelativeTo(this);
    }
    
    private void inicializarListCursos(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Curso curso : getCursos()) {
            modelo.addElement(curso.getNombre());
        }
        listCursos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCursos = new javax.swing.JList<>();
        lblTitulo1 = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnVerProfesores = new javax.swing.JButton();
        btnVerEstudiantes = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de Gestor de Cursos");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Gestor de Cursos");

        listCursos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listCursos.setAlignmentX(3.0F);
        listCursos.setAlignmentY(3.0F);
        jScrollPane2.setViewportView(listCursos);

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo1.setText("Nombre curso:");

        lblBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBuscar.setText("Buscar:");

        btnBuscar.setText("buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnVerProfesores.setText("profesores");
        btnVerProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProfesoresActionPerformed(evt);
            }
        });

        btnVerEstudiantes.setText("estudiantes");
        btnVerEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEstudiantesActionPerformed(evt);
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

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnVerProfesores)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnVerEstudiantes)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminar))
                        .addComponent(lblTitulo1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.setVisible(false);
        EditarPantallaCurso editarPantallaCurso = new EditarPantallaCurso();
        editarPantallaCurso.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String nombre = (String)listCursos.getSelectedValue();
        
        for (Curso curso : getCursos()) {
            if (curso.getNombre().equals(nombre)) {
                getCursos().remove(curso);
                break;
            }
        }
        inicializarListCursos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProfesoresActionPerformed
        
        if (!getCursos().isEmpty()){
            String nombre = (String)listCursos.getSelectedValue();
            
            for (Curso curso : getCursos()) {
                if (curso.getNombre().equals(nombre)) {
                    this.setVisible(false);
                    PantallaProfesor pantallaProfesor = new PantallaProfesor(curso);
                    pantallaProfesor.setVisible(true);
                    break;
                }
            }
        } 
    }//GEN-LAST:event_btnVerProfesoresActionPerformed

    private void btnVerEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstudiantesActionPerformed
        
        if (!getCursos().isEmpty()) {
            String nombre = (String)listCursos.getSelectedValue();
            
            for (Curso curso : getCursos()) {
                if (curso.getNombre().equals(nombre)) {
                    this.setVisible(false);
                    PantallaEstudiante pantallaEstudiante = new PantallaEstudiante(curso);
                    pantallaEstudiante.setVisible(true);
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnVerEstudiantesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultListModel<String> modelo = new DefaultListModel<>();
        String textoBusqueda = txtBuscar.getText().toLowerCase();
        if (textoBusqueda.isEmpty()) {
            for (Curso curso : getCursos()) {
                modelo.addElement(curso.getNombre());
            }
        } else {
            for (Curso curso : getCursos()) {
                if (curso.getNombre().toLowerCase().contains(textoBusqueda)) {
                    modelo.addElement(curso.getNombre());
                }
            }
        }
        listCursos.setModel(modelo);
    }//GEN-LAST:event_btnBuscarActionPerformed


    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaGestorCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVerEstudiantes;
    private javax.swing.JButton btnVerProfesores;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JList<String> listCursos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
