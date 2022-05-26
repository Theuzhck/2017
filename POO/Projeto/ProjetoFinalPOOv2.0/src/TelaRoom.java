
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel Of Dead
 */
public class TelaRoom extends javax.swing.JFrame {
   private Avatar player;
   private Room currentRoom;
   private ColecaoMonstro colecaomonstro;
   private ColecaoRoom colecaosala;
   private Timer timer;
   private int entrada;
   private int saida;
    /**
     * Creates new form TelaBatalha
     */
    public TelaRoom(Avatar player) {
        initComponents();
        this.player=player;
        jLabel3.setText("Nick: "+player.getNick());
        jLabel4.setText("Classe: "+player.getClasse());
        jProgressBar1.setMaximum(player.getLimitlife());
        jProgressBar1.setValue(player.getLife());
        jProgressBar2.setMaximum(player.getLimitmp());
        jProgressBar2.setValue(player.getMp());
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/"+player.getClasse()+".png")));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/"+player.getClasse()+"InRoom.png")));
        createRooms();
        createMonster();
        entrada=1;
        saida=1;
        jLabel17.setVisible(false); //Escada
        jLabel18.setVisible(false);// Escada
        
        
    }
    
    public TelaRoom(Avatar jogador,ColecaoRoom cr1, ColecaoMonstro cm1){
        initComponents();
        this.player=jogador;
        jLabel3.setText("Nick: "+player.getNick());
        jLabel4.setText("Classe: "+player.getClasse());
        jProgressBar1.setMaximum(player.getLimitlife());
        jProgressBar1.setValue(player.getLife());
        jProgressBar2.setMaximum(player.getLimitmp());
        jProgressBar2.setValue(player.getMp());
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/"+player.getClasse()+".png")));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/"+player.getClasse()+"InRoom.png")));
        jLabel17.setVisible(false); //Escada
        jLabel18.setVisible(false);// Escada
        entrada=1;
        saida=1;
        // Salas
        Room entrada, sala1, sala2, sala3, sala4, sala5,sala6, escada1;
        Room sala7,sala8,sala9,sala10,sala11,sala12,sala13,escada2;
        Room sala14;
        colecaosala = cr1;
        entrada = cr1.pesquisar(0);
        sala1 = cr1.pesquisar(1);
        sala2 = cr1.pesquisar(2);
        sala3 = cr1.pesquisar(3);
        sala4 = cr1.pesquisar(4);
        sala5 = cr1.pesquisar(5);
        sala6 = cr1.pesquisar(6);
        sala7 = cr1.pesquisar(7);
        sala8 = cr1.pesquisar(8);
        sala9 = cr1.pesquisar(9);
        sala10 = cr1.pesquisar(10);
        sala11 = cr1.pesquisar(11);
        sala12 = cr1.pesquisar(12);
        sala13 = cr1.pesquisar(13);
        sala14 = cr1.pesquisar(14);
        escada1 = cr1.pesquisar(15);
        escada2 = cr1.pesquisar(16);
        currentRoom = cr1.pesquisar(17);
        if(currentRoom.getDescription()=="Entrada"){
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RoomEntrada.png")));
        }else{
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Room.png")));
        } 
        
        
        // Monstros
        colecaomonstro=cm1;
        printLocationInfo();
    }
    
    private void createRooms()
    {
        Room entrada, sala1, sala2, sala3, sala4, sala5,sala6, escada1;
        Room sala7,sala8,sala9,sala10,sala11,sala12,sala13,escada2;
        Room sala14;
      
        // Foram criados dois construtores um para porcao e outro para monstro
        entrada = new Room("Entrada",false);
        sala1 = new Room("Sala 1",true);
        sala2 = new Room("Sala 2",true);
        sala3 = new Room("Sala 3",false);
        sala4 = new Room("Sala 4",true,1);
        sala5 = new Room("Sala 5",true);
        sala6 = new Room("Sala 6",true,2);
        escada1 = new Room("Escada para 1 andar",true);
        sala7 = new Room("Sala 7",false);
        sala8 = new Room("Sala 8",false);
        sala9 = new Room("Sala 9",false);
        sala10 = new Room("Sala 10",true,3);
        sala11 = new Room("Sala 11",true);
        sala12 = new Room("Sala 12",false);
        sala13 = new Room("Sala 13",true);
        escada2 = new Room("Escada para 2 andar",true);
        sala14 = new Room("Sala 14",true);     
        
        colecaosala = new ColecaoRoom();
        colecaosala.inserir(entrada);
        colecaosala.inserir(sala1);
        colecaosala.inserir(sala2);
        colecaosala.inserir(sala3);
        colecaosala.inserir(sala4);
        colecaosala.inserir(sala5);
        colecaosala.inserir(sala6);
        colecaosala.inserir(sala7);
        colecaosala.inserir(sala8);
        colecaosala.inserir(sala9);
        colecaosala.inserir(sala10);
        colecaosala.inserir(sala11);
        colecaosala.inserir(sala12);
        colecaosala.inserir(sala13);
        colecaosala.inserir(sala14);
        colecaosala.inserir(escada1);
        colecaosala.inserir(escada2);
        
       
        // initialise room exits
        entrada.setExits(null, sala1, null, null,null,null);
        sala1.setExits(sala2, sala5, sala3, entrada,null,null);
        sala2.setExits(null, null, sala1, null,null,null);
        sala3.setExits(sala1, null, null, null,null,null);
        sala5.setExits(sala4, null, sala6, sala1,null,null);
        sala4.setExits(null, null, sala5, null,null,null);
        sala6.setExits(sala5,null,escada1,null,null,null);
        escada1.setExits(sala6,null,null,null,sala7,null);
        sala7.setExits(null, sala8, null, null,null,escada1);
        sala8.setExits(null, sala9, null, sala7,null,null);
        sala9.setExits(sala10, sala11, sala12, sala8,null,null);
        sala10.setExits(null, null, sala9, null,null,null);
        sala11.setExits(null, null, null, sala9,null,null);
        sala12.setExits(sala9, null, escada2, sala13,null,null);
        sala13.setExits(null,sala12,null,null,null,null);
        escada2.setExits(sala12,null,null,null,sala14,null);
        sala14.setExits(null, null, null, null, null, escada2);
        currentRoom = entrada;  // start game outside
        colecaosala.inserir(currentRoom);
    }
    
    private void createMonster(){
        Monstro m1 = new Monstro("Demon",1000,100,5);
        Monstro m2 = new Monstro("Pumpkin",800,60,5);
        Monstro m3 = new Monstro("Bruxa",400,50,5);
        Monstro vazio = new Monstro("",0,0,0);
        colecaomonstro = new ColecaoMonstro();
        colecaomonstro.inserir(vazio);
        colecaomonstro.inserir(m3);
        colecaomonstro.inserir(m2);
        colecaomonstro.inserir(m1);
    }
    
    public void returnBatle(){
        jProgressBar1.setValue(player.getLife());
        jProgressBar2.setValue(player.getMp());
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
        
    private boolean goRoom(String direction) 
    {
        // Try to leave current room.
        Room nextRoom = null;
        if(direction!= null) {
            nextRoom = currentRoom.getExit(direction);
        }
        if (nextRoom == null) {
            JOptionPane.showMessageDialog(null,"Esta Porta está trancada!");
            return false;
        }
        else {
            currentRoom = nextRoom;
            colecaosala.remover(17);
            colecaosala.inserir(currentRoom);
            if(currentRoom.getExistemonstro()){
                Monstro m1=colecaomonstro.pesquisar(currentRoom.getIndicemonstro());                
                TelaBatalha tf=new TelaBatalha(player,m1,this);
                tf.setVisible(true);
            }
            if(currentRoom.getDescription()=="Entrada"){
                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RoomEntrada.png")));
            }else{
                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Room.png")));
            }         
            
            printLocationInfo();     
        }
        
        if(currentRoom.getExisteporcao()){
            Random random = new Random();
            int tipo = random.nextInt(1);
            Item porcao = new Item(tipo);
            porcao.guardarinventario(player, currentRoom);
        }
        return true; 
        
        
    }
    
    private void printLocationInfo(){
        System.out.println("Você está na " + currentRoom.getDescription());
        System.out.print("Portas: ");
        if(currentRoom.getExit("north") != null) {
            System.out.print("north ");
        }
        if(currentRoom.getExit("east") != null) {
            System.out.print("east ");
        }
        if(currentRoom.getExit("south") != null) {
            System.out.print("south ");
        }
        if(currentRoom.getExit("west") != null) {
            System.out.print("west ");
        }
        if(currentRoom.getExit("up") != null) {
            System.out.print("up ");
        }
        if(currentRoom.getExit("down") != null) {
            System.out.print("down ");
        }
        System.out.println();
        if(currentRoom.getExit("up") != null) {
                jLabel12.setVisible(false);
                jLabel17.setVisible(true); 
                jLabel12.setVisible(true);
                jLabel12.setFocusCycleRoot(true);
            }else{
                jLabel17.setVisible(false);
            }
            if(currentRoom.getExit("down")!=null){
                jLabel18.setVisible(true);
            }else{
                jLabel18.setVisible(false);
            } 
    }
      
    public TelaRoom(){
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mana.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(30, 15));
        jLabel8.setMinimumSize(new java.awt.Dimension(30, 15));
        jLabel8.setPreferredSize(new java.awt.Dimension(30, 15));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 5)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cura.png"))); // NOI18N
        jLabel7.setToolTipText("");
        jLabel7.setMaximumSize(new java.awt.Dimension(30, 15));
        jLabel7.setMinimumSize(new java.awt.Dimension(30, 15));
        jLabel7.setPreferredSize(new java.awt.Dimension(30, 15));

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X 0");

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X 0");

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Inventário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)))
        );

        panel1.setBackground(new java.awt.Color(204, 204, 255));

        jProgressBar2.setForeground(new java.awt.Color(0, 0, 204));
        jProgressBar2.setPreferredSize(new java.awt.Dimension(160, 14));

        jProgressBar1.setForeground(new java.awt.Color(255, 0, 0));
        jProgressBar1.setPreferredSize(new java.awt.Dimension(160, 14));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("HP");

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("MP");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setText("jLabel4");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setPreferredSize(new java.awt.Dimension(195, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setPreferredSize(new java.awt.Dimension(195, 20));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Guerreiro.png"))); // NOI18N
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 100));

        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, 130));

        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 50, 130));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/GuerreiroInRoom.png"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 35));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 130, 60));

        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 110, 50));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/escadaUp.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/escadaDown.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RoomEntrada.png"))); // NOI18N
        jLabel10.setAlignmentY(0.0F);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 410));

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int x=jLabel12.getX();
                int y=jLabel12.getY();
                boolean concluido;
                switch(entrada){
                    case(1):
                        switch(saida){
                            case(1):
                                timer.stop();
                                concluido=goRoom("south");
                                if(concluido){
                                   jLabel12.setLocation(280, 150);
                                   entrada=3;  
                                }
                            break;
                            case(2):
                                 x=x-2;
                                 jLabel12.setLocation(x, --y);
                                 if(jLabel12.getX()<75 || jLabel12.getY()<270){
                                   timer.stop();
                                   concluido=goRoom("east");
                                   if(concluido){
                                     jLabel12.setLocation(500, 280);
                                     entrada=4;  
                                   }else{
                                       jLabel12.setLocation(280,400);
                                   }

                                 }   
                             break;
                             case(3):
                                 y=y-2;
                                 jLabel12.setLocation(x,y);
                                 if(jLabel12.getY()<150){
                                   timer.stop();
                                   concluido=goRoom("north");
                                   if(concluido){
                                      jLabel12.setLocation(280, 400);
                                      entrada=1; 
                                   }else{
                                       jLabel12.setLocation(280,400);
                                   }

                                 }
                             break;
                             case(4):
                                 x=x+2;
                                 jLabel12.setLocation(x, --y);
                                 if(jLabel12.getX()>500 || jLabel12.getY()<270){
                                   timer.stop();
                                   concluido=goRoom("west");
                                   if(concluido){
                                     jLabel12.setLocation(75, 280);
                                     entrada=2;  
                                   }else{
                                       jLabel12.setLocation(280,400);
                                   }

                                 }
                             break;
                        } 
                    break;
                    case(2):
                        switch(saida){
                            case(1):
                                 x=x+2;
                                 jLabel12.setLocation(x, ++y);
                                 if(jLabel12.getX()>280 || jLabel12.getY()>400){
                                   timer.stop();
                                   concluido=goRoom("south");
                                   if(concluido){
                                     jLabel12.setLocation(280, 150);
                                     entrada=3;  
                                   }else{
                                       jLabel12.setLocation(75,270);
                                   }

                                 }   
                             break;
                             case(2):
                                 timer.stop();
                                 concluido=goRoom("east");
                                 if(concluido){
                                    jLabel12.setLocation(500, 280);
                                    entrada=4;  
                                 }
                             break;
                             case(3):
                                 x=x+2;
                                 jLabel12.setLocation(x, --y);
                                 if(jLabel12.getX()>280 || jLabel12.getY()<150){
                                   timer.stop();
                                   concluido=goRoom("north");
                                   if(concluido){
                                      jLabel12.setLocation(280, 400);
                                      entrada=1; 
                                   }else{
                                       jLabel12.setLocation(75,270);
                                   }

                                 }
                             break;
                             case(4):
                                 x=x+3;
                                 jLabel12.setLocation(x, y);
                                 if(jLabel12.getX()>500){
                                   timer.stop();
                                   concluido=goRoom("west");
                                   if(concluido){
                                     jLabel12.setLocation(75, 280);
                                     entrada=2;  
                                   }else{
                                       jLabel12.setLocation(75,270);
                                   }

                                 }
                             break;
                        } 
                    break;
                    case(3):
                        switch(saida){
                            case(1):
                                y=y+2;
                                 jLabel12.setLocation(x,y);
                                 if(jLabel12.getY()>400){
                                   timer.stop();
                                   concluido=goRoom("south");
                                   if(concluido){
                                     jLabel12.setLocation(280, 150);
                                     entrada=3;  
                                   }else{
                                       jLabel12.setLocation(280,150);
                                   }

                                 }   
                             break;
                             case(2):
                                 x=x-2;
                                 jLabel12.setLocation(x, ++y);
                                 if(jLabel12.getX()<75 || jLabel12.getY()>280){
                                   timer.stop();
                                   concluido=goRoom("east");
                                   if(concluido){
                                      jLabel12.setLocation(500, 280);
                                      entrada=4; 
                                   }else{
                                       jLabel12.setLocation(280,150);
                                   }

                                 }
                             break;
                             case(3):
                                 timer.stop();
                                 concluido=goRoom("north");
                                 if(concluido){
                                    jLabel12.setLocation(280, 400);
                                    entrada=1; 
                                 }
                             break;
                             case(4):
                                 x=x+2;
                                 jLabel12.setLocation(x, ++y);
                                 if(jLabel12.getX()>500 || jLabel12.getY()>280){
                                   timer.stop();
                                   concluido=goRoom("west");
                                   if(concluido){
                                     jLabel12.setLocation(75, 280);
                                     entrada=2;  
                                   }else{
                                       jLabel12.setLocation(280,150);
                                   }

                                 }
                             break;
                        } 
                    break;
                    case(4):
                        switch(saida){
                            case(1):
                                x=x-2;
                                 jLabel12.setLocation(x, ++y);
                                 if(jLabel12.getX()<280 || jLabel12.getY()>400){
                                   timer.stop();
                                   concluido=goRoom("south");
                                   if(concluido){
                                     jLabel12.setLocation(280, 150);
                                     entrada=3;  
                                   }else{
                                       jLabel12.setLocation(500,280);
                                   }

                                 }   
                             break;
                             case(2):
                                 x=x-3;
                                 jLabel12.setLocation(x, y);
                                 if(jLabel12.getX()<75){
                                   timer.stop();
                                   concluido=goRoom("east");
                                   if(concluido){
                                      jLabel12.setLocation(500, 280);
                                      entrada=4; 
                                   }else{
                                       jLabel12.setLocation(500,280);
                                   }

                                 }
                             break;
                             case(3):
                                 x=x-2;
                                 jLabel12.setLocation(x, --y);
                                 if(jLabel12.getX()<280 || jLabel12.getY()<150){
                                   timer.stop();
                                   concluido=goRoom("north");
                                   if(concluido){
                                      jLabel12.setLocation(280, 400);
                                      entrada=1;   
                                   }else{
                                       jLabel12.setLocation(500,280);
                                   }

                                 }
                             break;
                             case(4):
                                 timer.stop();
                                 concluido=goRoom("west");
                                 if(concluido){
                                    jLabel12.setLocation(75, 280);
                                    entrada=2;  
                                 }
                             break;
                        } 
                    break;
                            
                    }
                }
                
       
        };
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
           saida=2;
           timer = new Timer(30 ,taskPerformer); 
           timer.setRepeats(true);
           timer.start(); 
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
           saida=4;
           timer = new Timer(30 ,taskPerformer); 
           timer.setRepeats(true);
           timer.start();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
           saida=3;
           timer = new Timer(30 ,taskPerformer); 
           timer.setRepeats(true);
           timer.start();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
           saida=1;
           timer = new Timer(30 ,taskPerformer); 
           timer.setRepeats(true);
           timer.start();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        goRoom("up");
        entrada=1;
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        goRoom("down");
        entrada=1;
    }//GEN-LAST:event_jLabel18MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        SaveGame save = new SaveGame();
        save.escritor(player, colecaosala, colecaomonstro);
    }//GEN-LAST:event_formWindowClosing
               
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
