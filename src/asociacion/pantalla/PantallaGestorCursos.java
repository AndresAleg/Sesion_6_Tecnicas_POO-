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
        btnVerProfesores = new javax.swing.JButton();
        btnVerEstudiantes = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setText("Gestor de Cursos");

        listCursos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listCursos);

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo1.setText("Nombre curso:");

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
                    .addComponent(lblTitulo))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
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
        // TODO add your handling code here:
        this.setVisible(false);
        EditarPantallaCurso editarPantallaCurso = new EditarPantallaCurso();
        editarPantallaCurso.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
        
        if (!getCursos().isEmpty()){
            String nombre = (String)listCursos.getSelectedValue();
            
            for (Curso curso : getCursos()) {
                if (curso.getNombre().equals(nombre)) {
                    this.setVisible(false);
                    PantallaProfesor pantallaProfesor = new PantallaProfesor(nombre);
                    pantallaProfesor.setVisible(true);
                    break;
                }
            }
        } 
    }//GEN-LAST:event_btnVerProfesoresActionPerformed

    private void btnVerEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEstudiantesActionPerformed
        // TODO add your handling code here:
        
        if (!getCursos().isEmpty()) {
            String nombre = (String)listCursos.getSelectedValue();
            
            for (Curso curso : getCursos()) {
                if (curso.getNombre().equals(nombre)) {
                    this.setVisible(false);
                    PantallaEstudiante pantallaEstudiante = new PantallaEstudiante(nombre);
                    pantallaEstudiante.setVisible(true);
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnVerEstudiantesActionPerformed


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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVerEstudiantes;
    private javax.swing.JButton btnVerProfesores;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JList<String> listCursos;
    // End of variables declaration//GEN-END:variables
}
