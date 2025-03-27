/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoeuromilhoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

/**
 *
 * @author 1012395
 */
public class AppEuroMilhoes extends javax.swing.JFrame {

    /**
     * Creates new form AppEuroMilhoes
     */
    public AppEuroMilhoes() {
        initComponents();
        desenharNumeros();
    }

    private void desenharNumeros() {
        int posInicialX = 5, posInicialY = 5, tamanhoX = 18, tamanhoY = 16;
        int posX = posInicialX, posY = posInicialY;
        int espaco = 3;

        int posInicialXE = 20, posInicialYE = 5, tamanhoXE = 22, tamanhoYE = 20;
        int posXE = posInicialXE, posYE = posInicialYE;
        //Numeros
        for (int i = 1; i <= 50; i++) {
            javax.swing.JLabel jLabel = new javax.swing.JLabel();
            jLabel.setBackground(new java.awt.Color(255, 255, 255));
            if (aposta.contains(i)){
                jLabel.setBackground(new java.awt.Color(0, 255, 51));
            }
            jLabel.setText(String.format("%2d", i));
            jLabel.setText("" + i);
            jLabel.setOpaque(true);
            jLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jLabel.setBounds(posX, posY, tamanhoX, tamanhoY);
            posX = posX + tamanhoX + espaco;
            if (i % 6 == 0) {
                posX = posInicialX;
                posY = posY + tamanhoY + espaco;
            }

            jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    int valor = Integer.parseInt(jLabel.getText().trim());
                    if (aposta.size() < 5) {
                        if (!aposta.add(valor)) {
                            jLabel.setBackground(new java.awt.Color(255, 255, 255));
                            aposta.remove(valor);

                        } else {
                            jLabel.setBackground(new java.awt.Color(0, 255, 51));
                        }
                    } else if (aposta.size() == 5) {
                        jLabel.setBackground(new java.awt.Color(255, 255, 255));
                        aposta.remove(valor);

                    }
                }
            }
            );

            jPanel1.add(jLabel);
        }
        //Estrelas
        for (int i = 1; i <= 11; i++) {
            javax.swing.JLabel jLabel = new javax.swing.JLabel();
            jLabel.setBackground(new java.awt.Color(255, 255, 255));
            if (apostas.contains(i)){
                jLabel.setBackground(new java.awt.Color(0, 255, 51));
            }
            jLabel.setText(String.format("%2d", i));
            jLabel.setText("" + i);
            jLabel.setOpaque(true);
            jLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jLabel.setBounds(posXE, posYE, tamanhoXE, tamanhoYE);
            posXE = posXE + tamanhoXE + espaco;
            if (i % 3 == 0) {
                posXE = posInicialXE;
                posYE = posYE + tamanhoYE + espaco;
            }

        jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    int valor = Integer.parseInt(jLabel.getText().trim());
                    if (apostas.size() < 2) {
                        if (!apostas.add(valor)) {
                            jLabel.setBackground(new java.awt.Color(255, 255, 255));
                            apostas.remove(valor);

                        } else {
                            jLabel.setBackground(new java.awt.Color(0, 255, 51));
                        }
                    } else if (apostas.size() == 2) {
                        jLabel.setBackground(new java.awt.Color(255, 255, 255));
                        apostas.remove(valor);

                    }
                }
            }
            );
            
            jPanel2.add(jLabel);
        }
        jPanel1.repaint();
        jPanel2.repaint();
    }
    private void escreverFicheiroTxt(String nome) throws IOException, BadLocationException{
    FileWriter arq = new FileWriter(nome+ ".txt");
    PrintWriter gravarArq = new PrintWriter(arq);
    gravarArq.printf("%s",jTextAreaAposta.getText());
    arq.close();
}
    private Set<Integer> gerarNumeros(int min,int max,int n){
        Set<Integer> v = new TreeSet<>();
        Random random= new Random();
        int i=0;
        do{
            int valor = random.nextInt((max-min)+1)+min;
            if(v.add(valor)){
                i++;
            }
        }while(i< n);   
        return v;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAposta = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButtonRegistarApostas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogar Euromilhoes");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("Apostas:");

        jButton1.setText("AposTAR!!!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextAreaAposta.setColumns(20);
        jTextAreaAposta.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAposta);

        jButton2.setText("Gerar Números");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonRegistarApostas.setText("Registar Apostas");
        jButtonRegistarApostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarApostasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonRegistarApostas)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton1))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRegistarApostas)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (aposta.size() == 5) {
            jTextAreaAposta.append("" + aposta + apostas + "\n");
            aposta.clear();
            apostas.clear();
            jPanel1.removeAll();
            jPanel2.removeAll();
            desenharNumeros();
        } else {
            JOptionPane.showMessageDialog(this, "São necessários CINCO números ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       aposta = gerarNumeros(1,50,5);
       apostas = gerarNumeros(1,11,2);
       jPanel1.removeAll();
       jPanel2.removeAll();
       desenharNumeros();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonRegistarApostasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarApostasActionPerformed


        try {
            escreverFicheiroTxt(LocalDate.now()+"");
            //escreverFicheiroTxt("Lixo");
        } catch (IOException ex) {
            Logger.getLogger(AppEuroMilhoes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadLocationException ex) {
            Logger.getLogger(AppEuroMilhoes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonRegistarApostasActionPerformed

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
            java.util.logging.Logger.getLogger(AppEuroMilhoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppEuroMilhoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppEuroMilhoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppEuroMilhoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppEuroMilhoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRegistarApostas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAposta;
    // End of variables declaration//GEN-END:variables
    Set<Integer> aposta = new TreeSet<Integer>();
    Set<Integer> apostas = new TreeSet<Integer>();
}
