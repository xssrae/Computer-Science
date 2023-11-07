package biblioteca;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
/**
 *
 * @author fonte
 */
public class TelaInicio extends javax.swing.JFrame {
    
    boolean titulo, autor, codigo;

    public TelaInicio() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        persquisar = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoBusca = new javax.swing.JTextPane();
        txtAutor = new javax.swing.JRadioButton();
        txtTitulo = new javax.swing.JRadioButton();
        txtCodigo = new javax.swing.JRadioButton();
        resultado_da_busca = new javax.swing.JLabel();
        pegarEmprestado = new javax.swing.JButton();
        devolver = new javax.swing.JButton();
        buscar = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Library.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1.setName(""); // NOI18N
        jLabel1.setVerifyInputWhenFocusTarget(false);

        persquisar.setText("Pesquisar");

        txtBusca.setText("Título, autor ou código..");

        jScrollPane1.setViewportView(resultadoBusca);

        txtAutor.setText("Autor");
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        txtTitulo.setText("Título");
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        txtCodigo.setText("Código");
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        resultado_da_busca.setText("Resultados da busca:");

        pegarEmprestado.setText("Pegar emprestado");
        pegarEmprestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarEmprestadoActionPerformed(evt);
            }
        });

        devolver.setText("Devolver");
        devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Biblioteca Virtual");
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel5.setName(""); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(persquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(resultado_da_busca)
                                .addComponent(jScrollPane1)
                                .addComponent(txtBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(txtAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pegarEmprestado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(persquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTitulo)
                        .addComponent(txtAutor)
                        .addComponent(txtCodigo))
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultado_da_busca)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(pegarEmprestado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel5.getAccessibleContext().setAccessibleName("titulo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        autor = true;
    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        titulo = true;
    }//GEN-LAST:event_txtTituloActionPerformed

    private void pegarEmprestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarEmprestadoActionPerformed
        // login
        // pegar emprestado
    }//GEN-LAST:event_pegarEmprestadoActionPerformed

    private void devolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverActionPerformed
        // login
        //devolver o livro
    }//GEN-LAST:event_devolverActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(txtTitulo.equals(evt)){
            
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        codigo = true;
    }//GEN-LAST:event_txtCodigoActionPerformed


//_______________________________________________________________________________________________________________________________________________________
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        new TelaInicio();
        List<Livro> livros = lerLivrosDoArquivo("src/livros.xml");

        

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

//__________________________________________________________________________________________________________________________________________________________

    public static List<Livro> lerLivrosDoArquivo(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            JAXBContext jaxbContext = JAXBContext.newInstance(Livros.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Livros livros = (Livros) jaxbUnmarshaller.unmarshal(arquivo);

            return livros.getLivros();
        } catch (JAXBException e) {
            e.printStackTrace();
            return new ArrayList<Livro>();
        }
    }

    public void buscar(Livro[] livros, String nome) {
        for(Livro livro : livros) {
            //realizando uma busca pelo que foi digitado pelo usuário
            if(livro.getTitulo().toLowerCase().contains(nome.toLowerCase())) {
                System.out.println("Id: " + livro.getId());
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("Autor" + livro.getAutor());
                System.out.println("Quantidade" + livro.getQtde());
                System.out.println("Publicação: " + livro.getAnoPublicacao());
                System.out.println("_________________________________");
            }
            //buscando pelo nome de autor que foi digitado pelo usuário
            if(livro.getAutor().toLowerCase().contains(nome.toLowerCase())) {
                System.out.println("Id: " + livro.getId());
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("Autor" + livro.getAutor());
                System.out.println("Quantidade" + livro.getQtde());
                System.out.println("Publicação: " + livro.getAnoPublicacao());
                System.out.println("_________________________________");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buscar;
    private javax.swing.JButton devolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pegarEmprestado;
    private javax.swing.JLabel persquisar;
    private javax.swing.JTextPane resultadoBusca;
    private javax.swing.JLabel resultado_da_busca;
    private javax.swing.JRadioButton txtAutor;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JRadioButton txtCodigo;
    private javax.swing.JRadioButton txtTitulo;
    // End of variables declaration//GEN-END:variables
}
