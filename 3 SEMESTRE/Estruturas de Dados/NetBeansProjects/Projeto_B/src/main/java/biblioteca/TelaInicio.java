/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca;
import java.awt.event.ActionEvent;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
public class TelaInicio extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicio
     */
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pesquisa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        pesquisaLivro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rTitulo = new javax.swing.JRadioButton();
        rAltor = new javax.swing.JRadioButton();
        rCodigo = new javax.swing.JRadioButton();
        buscar = new javax.swing.JButton();
        resultadoLivro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emprestimo = new javax.swing.JButton();
        devolver = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pesquisa.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Library.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 150));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 150));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 150));

        titulo.setBackground(new java.awt.Color(0, 0, 0));
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Biblioteca Virtual");

        pesquisaLivro.setBackground(new java.awt.Color(204, 204, 204));
        pesquisaLivro.setForeground(new java.awt.Color(0, 0, 0));
        pesquisaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaLivroActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pesquisar:");

        rTitulo.setForeground(new java.awt.Color(0, 0, 0));
        rTitulo.setText("Título");
        rTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rTituloActionPerformed(evt);
            }
        });

        rAltor.setForeground(new java.awt.Color(0, 0, 0));
        rAltor.setText("Autor");

        rCodigo.setForeground(new java.awt.Color(0, 0, 0));
        rCodigo.setText("Código");

        buscar.setBackground(new java.awt.Color(204, 204, 204));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        resultadoLivro.setBackground(new java.awt.Color(204, 204, 204));
        resultadoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoLivroActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Livros:");

        emprestimo.setText("Pegar emprestado");

        devolver.setText("Devolver");

        javax.swing.GroupLayout pesquisaLayout = new javax.swing.GroupLayout(pesquisa);
        pesquisa.setLayout(pesquisaLayout);
        pesquisaLayout.setHorizontalGroup(
            pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaLayout.createSequentialGroup()
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(titulo))
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pesquisaLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2))
                            .addGroup(pesquisaLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultadoLivro)
                            .addComponent(pesquisaLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emprestimo)
                            .addGroup(pesquisaLayout.createSequentialGroup()
                                .addComponent(rAltor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscar)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pesquisaLayout.setVerticalGroup(
            pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rTitulo)
                    .addComponent(rAltor)
                    .addComponent(rCodigo)
                    .addComponent(buscar))
                .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultadoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(pesquisaLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(emprestimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(devolver)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaLivroActionPerformed

    }//GEN-LAST:event_pesquisaLivroActionPerformed

    private void rTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rTituloActionPerformed

    private void resultadoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoLivroActionPerformed
        String pesquisa = 
        return evt;
    }//GEN-LAST:event_resultadoLivroActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt, Livro livro) {//GEN-FIRST:event_buscarActionPerformed
        
        
        return ;
    }//GEN-LAST:event_buscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        
        new TelaInicio();
        List<Livro> livros = lerLivrosDoArquivo("src/livros.xml");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

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
            if(livro.getTitulo().toLowerCase().contains(nome.toLowerCase())) {
                System.out.println("Id: " + livro.getId());
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("Autor" + livro.getAutor());
                System.out.println("Quantidade" + livro.getQtde());
                System.out.println("Publicação: " + livro.getAnoPublicacao());
            }
            //buscando pelo nome de autor que foi digitado pelo usuário
            if(livro.getAutor().toLowerCase().contains(nome.toLowerCase())) {
                System.out.println("Id: " + livro.getId());
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("Autor" + livro.getAutor());
                System.out.println("Quantidade" + livro.getQtde());
                System.out.println("Publicação: " + livro.getAnoPublicacao());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton devolver;
    private javax.swing.JButton emprestimo;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pesquisa;
    private javax.swing.JTextField pesquisaLivro;
    private javax.swing.JRadioButton rAltor;
    private javax.swing.JRadioButton rCodigo;
    private javax.swing.JRadioButton rTitulo;
    private javax.swing.JTextField resultadoLivro;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}