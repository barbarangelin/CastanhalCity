/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package program.interfacegrafica;


import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author barba
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
         String caminho = "peacefulday.wav";
         PlayMusic (caminho);
       
    }
    
      
     
    
   public void setagemdoblocodenotasbairros(){
   BlocoDeNotas.setText("#####################\nLista dos bairros:\n\n"
               + "Rouxinol\n"
               + "Nova Olinda\n"
               + "Novo Estrela\n"
               + "Pirapora\n"
               + "Salles Jardim\n"
               + "Cenóbio\n"
               + "Jaderlandia\n"
               + "Saudade\n"
               + "Santa Catarina\n"
               + "Fonte Boa\n"
               + "Jardim das Acácias\n"
               + "Caiçara\n"
               + "Santa Lídia\n"
               + "Cariri\n"
               + "Bom Jesus\n"
               + "Centro\n"
               + "Pantanal\n"
               + "Heliolândia\n"
               + "São José\n"
               + "Cristo Redentor\n"
               + "Santa Helena\n"
               + "Betânia\n"
               + "Imperador\n"
               + "Ianetama\n"
               + "Salgadinho\n"
               + "Oscar Reis\n"
               + "Titanlândia\n"
               + "Estrela\n\n"
               + "#####################");
   }
   public void setagemdoblocodenotasrestaurantes(){
     BlocoDeNotas.setText("#####################\n\n"
               + "Lista de restaurantes\n"
               + "e lanchonetes:\n\n"
               + "Nosso Quintal = \n"
               + "Endereço: Tv. Floriano Peixoto -\n"
               + "Centro, Castanhal - PA, 68740-140\n"
               + "Contato: *****\n"
               + "Instagram: @nossoquintaloficial\n\n\n"
               + "Point da Picanha = \n"
               + "Endereco:  Alameda Tiradentes, 1117\n"
               + " - Estrela, Castanhal - PA, 68744-100\n"
               + "Contato:  (91) 98246-6341\n"
               + "Instagram: @pointdapicanha_oficial\n\n\n"
               + "Emporio 97 = \n"
               + "Endereco: R. Cmte. Francisco de Assis\n"
               + " - Nova Olinda, Castanhal - PA, 68742-430\n"
               + "Contato: (91) 98156-3909\n"
               + "Instagram: @emporio_97\n\n"
               + "#####################");
   }
   public void setagemdoblocodenotashoteis(){
    BlocoDeNotas.setText("#####################\n\n"
               + "Lista de hoteis\n\n"
               + "Hotel Estrela = \n"
               + "Endereço:  Tv. Benjamin Constant, N° 146\n"
              + " - Caicara, Castanhal - PA, 68743-422"
               + "\nContato: (91) 98733-2241\n\n\n"
               + "Hotel Amazonia = \n"
               + "Endereco: Av. Pres. Getúlio Vargas, 2729 -\n"
              + " Centro, Castanhal - PA, 68740-000"
               + "\nContato: (91) 98814-0207\n\n"
               + "#####################");      
   }
   public void setagemblocodenotaspracas(){
    BlocoDeNotas.setText("#####################\n\n"
              + "Lista de praças:\n\n"
              + "Praça do Estrela\n"
              + "Praça do Cristo\n"
              + "Praça do Milagre\n\n"
              + "#####################");
   }
   public void setagemblocodenotasigrejas(){
   BlocoDeNotas.setText("#####################\n\n"
        + "Cristo Rei = \n"
        + "Endereço:R. Manoel Manoin, 296 - Santa Lídia\n"
        + ",Castanhal - PA, 68745-570 \n"
        + "Contato:***\n\n"
        + "Matriz = \n"
        + "Endereço: Av. Barão do Rio Branco, S/N -\n"
        + "Centro, Castanhal - PA, 68740-110 \n"
        + "Contato:(91) 3721-1664\n\n"
        + "Catedral = \n"
        + "Endereço: R. Maj. Wilson, 413 - Nova Olinda,\n"
        + "Castanhal - PA, 68740-970\n"
        + "Contato: (91) 99332-6125\n\n"
        + "#####################");
   }
   public void setagemmblocodenotassupermercados(){
   BlocoDeNotas.setText("#####################\n\n"
            + "Assai = \n"
            + "Endereço:Av. Pres. Getúlio Vargas, 5.600 -\n"
           + "Jaderlândia, Castanhal - PA, 68745-000\n\n\n"
            + "Lider =\n"
            + "Endereço:Tv. Floriano Peixoto, 1391 -\n"
           + "Centro, Castanhal - PA, 68743-030\n\n\n"
            + "Atacadão = \n"
            + "Endereço: Av. Pres. Getúlio Vargas, S/N -\n"
           + "Cristo Redentor, Castanhal - PA, 68741-000\n\n"
            + "#####################");
   }
   
   public void quadradoembaixodoblocodetexto1(){
   ImageIcon icon1 = new ImageIcon ("display1.png");
   ImagemembaixodoTextPane.setIcon(icon1);
   }
   public void quadradoembaixodoblocotexto2(){
   ImageIcon icon2 = new ImageIcon ("display2.png");
   ImagemembaixodoTextPane.setIcon(icon2);
   }
   public void quadradoembaixodoblocotexto3(){
   ImageIcon icon3 = new ImageIcon ("display3.png");
   ImagemembaixodoTextPane.setIcon(icon3);
   }
   public void quadradoembaixodoblocotexto4(){
   ImageIcon icon4 = new ImageIcon ("display4.png");
   ImagemembaixodoTextPane.setIcon(icon4);
   }
   public void quadradoembaixodoblocotexto5(){
   ImageIcon icon5 = new ImageIcon ("display5.png");
   ImagemembaixodoTextPane.setIcon(icon5);
   }
   public void quadradoembaixodoblocotexto6(){
   ImageIcon icon6 = new ImageIcon ("display6.png");
   ImagemembaixodoTextPane.setIcon(icon6);
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
        PainelDaEsquerda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BlocoDeNotas = new javax.swing.JTextArea();
        ImagemembaixodoTextPane = new javax.swing.JLabel();
        PainelDeCima = new javax.swing.JPanel();
        Bandeira = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PainelDoCentro = new javax.swing.JPanel();
        quadrado1bairros = new javax.swing.JLabel();
        quadrado3hoteis = new javax.swing.JLabel();
        quadrado2restaurantes = new javax.swing.JLabel();
        quadrado4pracas = new javax.swing.JLabel();
        quadrado5igrejas = new javax.swing.JLabel();
        quadrado6supermercados = new javax.swing.JLabel();
        Bairros = new javax.swing.JLabel();
        Restaurantes = new javax.swing.JLabel();
        hoteis = new javax.swing.JLabel();
        Pracas = new javax.swing.JLabel();
        Igrejas = new javax.swing.JLabel();
        Supermercados = new javax.swing.JLabel();
        BotaoLimpar = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Castanhal Informacoes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        PainelDaEsquerda.setBackground(new java.awt.Color(255, 255, 255));
        PainelDaEsquerda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BlocoDeNotas.setEditable(false);
        BlocoDeNotas.setBackground(new java.awt.Color(0, 0, 0));
        BlocoDeNotas.setColumns(20);
        BlocoDeNotas.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        BlocoDeNotas.setForeground(new java.awt.Color(255, 255, 255));
        BlocoDeNotas.setRows(5);
        BlocoDeNotas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BlocoDeNotas.setFocusable(false);
        BlocoDeNotas.setSelectedTextColor(new java.awt.Color(0, 51, 153));
        jScrollPane1.setViewportView(BlocoDeNotas);

        ImagemembaixodoTextPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout PainelDaEsquerdaLayout = new javax.swing.GroupLayout(PainelDaEsquerda);
        PainelDaEsquerda.setLayout(PainelDaEsquerdaLayout);
        PainelDaEsquerdaLayout.setHorizontalGroup(
            PainelDaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDaEsquerdaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(ImagemembaixodoTextPane))
                .addContainerGap())
        );
        PainelDaEsquerdaLayout.setVerticalGroup(
            PainelDaEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDaEsquerdaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ImagemembaixodoTextPane, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PainelDeCima.setBackground(new java.awt.Color(0, 51, 153));
        PainelDeCima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Bandeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bandeiradecastanhal.png"))); // NOI18N
        Bandeira.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Castanhal");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cidade modelo");

        javax.swing.GroupLayout PainelDeCimaLayout = new javax.swing.GroupLayout(PainelDeCima);
        PainelDeCima.setLayout(PainelDeCimaLayout);
        PainelDeCimaLayout.setHorizontalGroup(
            PainelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDeCimaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PainelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        PainelDeCimaLayout.setVerticalGroup(
            PainelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDeCimaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDeCimaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(Bandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        PainelDoCentro.setBackground(new java.awt.Color(255, 0, 0));
        PainelDoCentro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        quadrado1bairros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/quadrado1.png"))); // NOI18N
        quadrado1bairros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quadrado1bairros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                quadrado1bairrosMouseMoved(evt);
            }
        });
        quadrado1bairros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quadrado1bairrosMouseClicked(evt);
            }
        });

        quadrado3hoteis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/quadrado3.png"))); // NOI18N
        quadrado3hoteis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quadrado3hoteis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quadrado3hoteisMouseClicked(evt);
            }
        });

        quadrado2restaurantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/quadrado2.png"))); // NOI18N
        quadrado2restaurantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quadrado2restaurantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quadrado2restaurantesMouseClicked(evt);
            }
        });

        quadrado4pracas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/quadrado4.png"))); // NOI18N
        quadrado4pracas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quadrado4pracas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quadrado4pracasMouseClicked(evt);
            }
        });

        quadrado5igrejas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/quadrado5.png"))); // NOI18N
        quadrado5igrejas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quadrado5igrejas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quadrado5igrejasMouseClicked(evt);
            }
        });

        quadrado6supermercados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/quadrado6.png"))); // NOI18N
        quadrado6supermercados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quadrado6supermercados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quadrado6supermercadosMouseClicked(evt);
            }
        });

        Bairros.setBackground(new java.awt.Color(204, 204, 204));
        Bairros.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        Bairros.setForeground(new java.awt.Color(255, 255, 255));
        Bairros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bairros.setText("Bairros");
        Bairros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BairrosMouseClicked(evt);
            }
        });

        Restaurantes.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        Restaurantes.setForeground(new java.awt.Color(255, 255, 255));
        Restaurantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Restaurantes.setText("Restaurantes");
        Restaurantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestaurantesMouseClicked(evt);
            }
        });

        hoteis.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        hoteis.setForeground(new java.awt.Color(255, 255, 255));
        hoteis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoteis.setText("Hoteis");
        hoteis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hoteisMouseClicked(evt);
            }
        });

        Pracas.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        Pracas.setForeground(new java.awt.Color(255, 255, 255));
        Pracas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pracas.setText("Praças");
        Pracas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PracasMouseClicked(evt);
            }
        });

        Igrejas.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        Igrejas.setForeground(new java.awt.Color(255, 255, 255));
        Igrejas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Igrejas.setText("Igrejas");
        Igrejas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IgrejasMouseClicked(evt);
            }
        });

        Supermercados.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        Supermercados.setForeground(new java.awt.Color(255, 255, 255));
        Supermercados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supermercados.setText("Supermercados");
        Supermercados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupermercadosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PainelDoCentroLayout = new javax.swing.GroupLayout(PainelDoCentro);
        PainelDoCentro.setLayout(PainelDoCentroLayout);
        PainelDoCentroLayout.setHorizontalGroup(
            PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDoCentroLayout.createSequentialGroup()
                .addGroup(PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDoCentroLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quadrado1bairros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quadrado4pracas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PainelDoCentroLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(Pracas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelDoCentroLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(Bairros)))
                .addGroup(PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDoCentroLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(quadrado2restaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDoCentroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Restaurantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quadrado5igrejas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Igrejas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDoCentroLayout.createSequentialGroup()
                            .addComponent(quadrado3hoteis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(82, 82, 82))
                        .addGroup(PainelDoCentroLayout.createSequentialGroup()
                            .addGroup(PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quadrado6supermercados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hoteis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDoCentroLayout.createSequentialGroup()
                        .addComponent(Supermercados)
                        .addGap(73, 73, 73))))
        );
        PainelDoCentroLayout.setVerticalGroup(
            PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDoCentroLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quadrado1bairros, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quadrado2restaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quadrado3hoteis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDoCentroLayout.createSequentialGroup()
                        .addComponent(hoteis)
                        .addGap(18, 18, 18)
                        .addComponent(quadrado6supermercados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelDoCentroLayout.createSequentialGroup()
                        .addComponent(Restaurantes)
                        .addGap(18, 18, 18)
                        .addComponent(quadrado5igrejas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelDoCentroLayout.createSequentialGroup()
                        .addComponent(Bairros)
                        .addGap(18, 18, 18)
                        .addComponent(quadrado4pracas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PainelDoCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pracas)
                    .addComponent(Supermercados)
                    .addComponent(Igrejas))
                .addGap(0, 0, 0))
        );

        BotaoLimpar.setBackground(new java.awt.Color(0, 0, 0));
        BotaoLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoLimpar.setText("Limpar");
        BotaoLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        BotaoLimpar.setFocusable(false);
        BotaoLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoLimparMouseClicked(evt);
            }
        });

        BotaoSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotaoSair.setText("Sair");
        BotaoSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0)));
        BotaoSair.setFocusable(false);
        BotaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSairMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/conhecaCastanhalcidademodelo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelDeCima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelDoCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelDaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PainelDeCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(PainelDoCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PainelDaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          for (double i = 0.0 ; i<=1.0;i+=0.1){
        String s = i+"";
        Float f = Float.valueOf(s);
        this.setOpacity(f);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void BairrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BairrosMouseClicked
setagemdoblocodenotasbairros();
quadradoembaixodoblocodetexto1();
        // TODO add your handling code here:
    }//GEN-LAST:event_BairrosMouseClicked

    private void RestaurantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestaurantesMouseClicked
      setagemdoblocodenotasrestaurantes();
      quadradoembaixodoblocotexto2();
        // TODO add your handling code here:
    }//GEN-LAST:event_RestaurantesMouseClicked

    private void hoteisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoteisMouseClicked
     setagemdoblocodenotashoteis();    
     quadradoembaixodoblocotexto3();
// TODO add your handling code here:
    }//GEN-LAST:event_hoteisMouseClicked

    private void PracasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PracasMouseClicked
    setagemblocodenotaspracas();
    quadradoembaixodoblocotexto4();
        // TODO add your handling code here:
    }//GEN-LAST:event_PracasMouseClicked

    private void IgrejasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IgrejasMouseClicked
 setagemblocodenotasigrejas();
 quadradoembaixodoblocotexto5();
// TODO add your handling code here:
    }//GEN-LAST:event_IgrejasMouseClicked

    private void SupermercadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupermercadosMouseClicked
    setagemmblocodenotassupermercados();
    quadradoembaixodoblocotexto6();
// TODO add your handling code here:
    }//GEN-LAST:event_SupermercadosMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void quadrado1bairrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quadrado1bairrosMouseClicked
        setagemdoblocodenotasbairros();
        quadradoembaixodoblocodetexto1();
        // TODO add your handling code here:
    }//GEN-LAST:event_quadrado1bairrosMouseClicked

    private void quadrado2restaurantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quadrado2restaurantesMouseClicked
 setagemdoblocodenotasrestaurantes();
 quadradoembaixodoblocotexto2();
        // TODO add your handling code here:
    }//GEN-LAST:event_quadrado2restaurantesMouseClicked

    private void quadrado3hoteisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quadrado3hoteisMouseClicked
setagemdoblocodenotashoteis();
quadradoembaixodoblocotexto3();
        // TODO add your handling code here:
    }//GEN-LAST:event_quadrado3hoteisMouseClicked

    private void quadrado4pracasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quadrado4pracasMouseClicked
setagemblocodenotaspracas();
quadradoembaixodoblocotexto4();
        // TODO add your handling code here:
    }//GEN-LAST:event_quadrado4pracasMouseClicked

    private void quadrado5igrejasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quadrado5igrejasMouseClicked
setagemblocodenotasigrejas();
quadradoembaixodoblocotexto5();
        // TODO add your handling code here:
    }//GEN-LAST:event_quadrado5igrejasMouseClicked

    private void quadrado6supermercadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quadrado6supermercadosMouseClicked
setagemmblocodenotassupermercados();
quadradoembaixodoblocotexto6();
        // TODO add your handling code here:
    }//GEN-LAST:event_quadrado6supermercadosMouseClicked

    private void quadrado1bairrosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quadrado1bairrosMouseMoved

        // TODO add your handling code here:
    }//GEN-LAST:event_quadrado1bairrosMouseMoved

    private void BotaoLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoLimparMouseClicked
BlocoDeNotas.setText("");
ImagemembaixodoTextPane.setIcon(null);

        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoLimparMouseClicked

    private void BotaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSairMouseClicked
        System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_BotaoSairMouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairros;
    private javax.swing.JLabel Bandeira;
    private javax.swing.JTextArea BlocoDeNotas;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel Igrejas;
    private javax.swing.JLabel ImagemembaixodoTextPane;
    private javax.swing.JPanel PainelDaEsquerda;
    private javax.swing.JPanel PainelDeCima;
    private javax.swing.JPanel PainelDoCentro;
    private javax.swing.JLabel Pracas;
    private javax.swing.JLabel Restaurantes;
    private javax.swing.JLabel Supermercados;
    private javax.swing.JLabel hoteis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel quadrado1bairros;
    private javax.swing.JLabel quadrado2restaurantes;
    private javax.swing.JLabel quadrado3hoteis;
    private javax.swing.JLabel quadrado4pracas;
    private javax.swing.JLabel quadrado5igrejas;
    private javax.swing.JLabel quadrado6supermercados;
    // End of variables declaration//GEN-END:variables

    public static void PlayMusic (String local){
        try {
            File musicPath = new File (local);
            if (musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
