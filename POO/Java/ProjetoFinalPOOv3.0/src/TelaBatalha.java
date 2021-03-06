import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel Of Dead
 */
public class TelaBatalha extends javax.swing.JFrame {
   private Avatar player;
   private Monstro monster;
   private TelaRoom tr;
    /**
     * Creates new form TelaRodando
     */   
    public TelaBatalha(Avatar player,Monstro monster, TelaRoom tr) {
        initComponents();
        this.player=player;
        this.monster=monster;
        this.tr=tr;
        jLabel3.setText("Nick: "+player.getNick());
        jLabel4.setText("Classe: "+player.getClasse());
        jProgressBar1.setMaximum(player.getLimitlife());
        jProgressBar1.setValue(player.getLife());
        jProgressBar2.setMaximum(player.getLimitmp());
        jProgressBar2.setValue(player.getMp());
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/"+player.getClasse()+".png")));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/"+player.getClasse()+"InRoom.png")));
        ImageIcon ic; // Icone que contem a Img
        Dimension dim = new Dimension(0,0); //Dimensao que vai receber o tamanho da img
        ic = new javax.swing.ImageIcon(getClass().getResource("/imagens/Monstros/"+monster.getNick()+".png")); // Inicializando ic
        dim.setSize((ic.getIconWidth()+10), ic.getIconHeight()); //Trocando a dimensao de Dim para a correta
        jLabel12.setSize(dim);  // Alterando o Label para a Dim correta
        jLabel12.setIcon(ic); // Colocando a img do Monstro no label
        if(dim.getHeight()==80.0 && dim.getWidth()==90.0){
            
           jLabel12.setLocation(240, 230); // Modificando a posicao para encaixar
           jLabel20.setLocation(200,jLabel20.getY()); // Modificando o sangue do chao
           jLabel21.setLocation(200,jLabel21.getY()); // Sangue do chao 
        }
        
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);  
        jLabel5.setText(player.getNick()+" Vs "+ monster.getNick());
        
    }
    
    public boolean fimBatalha(){
        if (player.isLife() && !monster.isLife()){
            return true;
        }
        return !player.isLife() && monster.isLife();
    }
    public void encerrar(){
        boolean h=fimBatalha();
        if(h && player.isLife())
            JOptionPane.showMessageDialog(null,"O Jogador foi Vitorioso!");
        else
            JOptionPane.showMessageDialog(null,"Voc?? Morreu!");
        Room r1=tr.getCurrentRoom();
        r1.setExistemonstro(false); // Tirar o Monstro da Room
        tr.returnBatle();  //Modificar o Hp e Mp do player na telaRoom
        dispose();
    }
    
    public TelaBatalha(){
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

        panel2 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(601, 500));
        setPreferredSize(new java.awt.Dimension(610, 540));
        getContentPane().setLayout(null);

        panel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setPreferredSize(new java.awt.Dimension(195, 20));

        jLabel4.setText("jLabel4");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setPreferredSize(new java.awt.Dimension(195, 20));

        jLabel1.setText("HP");

        jProgressBar1.setForeground(new java.awt.Color(255, 0, 0));
        jProgressBar1.setPreferredSize(new java.awt.Dimension(160, 14));

        jLabel2.setText("MP");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jProgressBar2.setForeground(new java.awt.Color(0, 0, 204));
        jProgressBar2.setPreferredSize(new java.awt.Dimension(160, 14));

        jLabel11.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, 0)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panel2);
        panel2.setBounds(0, 0, 300, 100);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel7.setText("Attack");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel6.setText("Seus Comandos:");

        jLabel9.setText("Habilidade");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(300, 0, 190, 100);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ArqueiroInRoom.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(290, 310, 40, 40);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Monstros/Hidra.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel12.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabel12.setRequestFocusEnabled(false);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(290, 260, 40, 40);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sangue.png"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(330, 270, 40, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mana.png"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(30, 15));
        jLabel13.setMinimumSize(new java.awt.Dimension(30, 15));
        jLabel13.setPreferredSize(new java.awt.Dimension(30, 15));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 5)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cura.png"))); // NOI18N
        jLabel14.setToolTipText("");
        jLabel14.setMaximumSize(new java.awt.Dimension(30, 15));
        jLabel14.setMinimumSize(new java.awt.Dimension(30, 15));
        jLabel14.setPreferredSize(new java.awt.Dimension(30, 15));

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("X 0");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("X 0");

        jLabel17.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Invent??rio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(492, 0, 110, 94);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sangue.png"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(240, 310, 40, 30);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sangue.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(330, 310, 40, 30);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sangue.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(240, 270, 40, 30);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RoomBatalha.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 100, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void sangue(){
      if(jLabel18.isVisible()==false){
          jLabel18.setVisible(true);
      }else if(jLabel20.isVisible()==false){
          jLabel20.setVisible(true);
      }else if(jLabel19.isVisible()==false){
          jLabel19.setVisible(true);
      }else if(jLabel21.isVisible()==false){
          jLabel21.setVisible(true);
      }
   }
    private void mensagemDano(int damage){
        if(damage>0)
            System.out.println("Voc?? recebeu "+damage+" de dano!");
        else
            System.out.println("Miss!");
    }
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
                int damage;
                damage=player.attack();
                monster.takeDamage(damage);
                damage-=monster.getDef();
                System.out.println("Voc?? tirou "+damage+" de dano!");
                player.status();
                monster.status();
                System.out.println("");
                if(!fimBatalha()){
                    damage=monster.attack();
                    player.takeDamage(damage);
                    damage-=player.getDef();
                    mensagemDano(damage);
                    player.status();
                    monster.status();
                    System.out.println("");                
                 }
                jProgressBar1.setValue(player.getLife());
                sangue();
                if(fimBatalha())
                    encerrar();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
                int damage;
                damage=player.usarhabilidade();
                monster.takeDamage(damage);
                damage-=monster.getDef();
                System.out.println("Voc?? tirou "+damage+" de dano!");
                player.status();
                monster.status();
                System.out.println("");
                if(!fimBatalha()){
                    damage=monster.attack();
                    player.takeDamage(damage);
                    damage-=player.getDef();
                    mensagemDano(damage);
                    player.status();
                    monster.status();
                    System.out.println("");
                }
                jProgressBar1.setValue(player.getLife());
                jProgressBar2.setValue(player.getMp());
                sangue();
                if(fimBatalha())
                    encerrar();
    }//GEN-LAST:event_jLabel9MouseClicked
               
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
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBatalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBatalha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
