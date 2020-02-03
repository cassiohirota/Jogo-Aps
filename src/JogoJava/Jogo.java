package JogoJava;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

	public class Jogo extends JFrame
	{

		//Importacao de imagens
		ImageIcon iconBackground = new ImageIcon(getClass().getResource("Background.png"));
		ImageIcon iconContMet = new ImageIcon(getClass().getResource("ConteinerMetalFP.png"));
		ImageIcon iconContPap = new ImageIcon(getClass().getResource("ConteinerPapelFP.png"));
		ImageIcon iconContPla = new ImageIcon(getClass().getResource("ConteinerPlasticoFP.png"));
		ImageIcon iconContVid = new ImageIcon(getClass().getResource("ConteinerVidroFP.png"));
		ImageIcon iconLixLat = new ImageIcon(getClass().getResource("LataP.png"));
		ImageIcon iconLixFol = new ImageIcon(getClass().getResource("FolhaP.png"));
		ImageIcon iconLixGP = new ImageIcon(getClass().getResource("GarrafaPlasticoP.png"));
		ImageIcon iconLixGV = new ImageIcon(getClass().getResource("GarrafaVidroP.png"));
		ImageIcon iconLixRev = new ImageIcon(getClass().getResource("RevistaP.png"));
		ImageIcon iconLixSac = new ImageIcon(getClass().getResource("SacolaP.png"));
		ImageIcon iconLixTac = new ImageIcon(getClass().getResource("TacaP.png"));
		ImageIcon iconLixVid = new ImageIcon(getClass().getResource("VidroP.png"));

		//Criar labels de imagens
		JLabel lblBack = new JLabel(iconBackground);
		JLabel lblContMet = new JLabel(iconContMet);
		JLabel lblContPap = new JLabel(iconContPap);
		JLabel lblContPla = new JLabel(iconContPla);
		JLabel lblContVid = new JLabel(iconContVid);
		JLabel lblLixLat = new JLabel(iconLixLat);
		JLabel lblLixFol = new JLabel(iconLixFol);
		JLabel lblLixGP = new JLabel(iconLixGP);
		JLabel lblLixGV = new JLabel(iconLixGV);
		JLabel lblLixRev = new JLabel(iconLixRev);
		JLabel lblLixSac = new JLabel(iconLixSac);
		JLabel lblLixTac = new JLabel(iconLixTac);
		JLabel lblLixVid = new JLabel(iconLixVid);
		JLabel lblPonto = new JLabel("Pontos: 0");
		
		int Pontos = 0;

		public String ContPonto = "Pontos: " + Pontos;
		//Sistema de pontuacao no jogo
		public void Pontuacao()
		{
		    Pontos++;

		    lblPonto.setText("Pontos: " + Pontos);
		}
		
		//Criar barra de menu
		JMenuBar barra = new JMenuBar();
		JMenu menu1 = new JMenu("Menu");
		JMenuItem item1 = new JMenuItem("Novo Jogo");
		JMenuItem item2 = new JMenuItem("Sobre");
		
		
		Sequencer player; //Esse e o player de musica
		String musica1 = "src/JogoJava/OST.mid";//Importacao da musica

		public void tocarMusica(String nome, int repetir){
			try{
				player = MidiSystem.getSequencer();		//Inicia o tocador
				Sequence musica = MidiSystem.getSequence(new File(nome));//carrega a musica que vai ser tocada 
				player.open();	//Abre o player
				player.setSequence(musica);	//PASSA A MÃšSICA QUE VAI SER TOCADA PARA O TOCADOR
				player.setLoopCount(repetir); //Define quantas vezes a musica tocara
				player.start();	//comeca a tocar
			}catch(Exception e){
				System.out.println("Erro ao tocar: "+nome);
			}
	
		}
	public void EditarComponentes() 
	{
		//Cria coordenadas aleatorias para as imagens
		int x = 20 + (int)(Math.random()* +1000);
		int y = 200 + (int)(Math.random()* +305);
		int a = 30 + (int)(Math.random()* +1100);
		int b = 100 + (int)(Math.random()* +305);
		int c = 30 + (int)(Math.random()* +1100);
		int d = 400 + (int)(Math.random()* +35);
		int e = 33 + (int)(Math.random()* +1000);
		int f = 300 + (int)(Math.random()* +50);
		int g = 31 + (int)(Math.random()* +1000);
		int h = 500 + (int)(Math.random()* +27);
		int i = 33 + (int)(Math.random()* +1000);
		int j = 300 + (int)(Math.random()* +60);
		int k = 200 + (int)(Math.random()* +400);
		int l = 40 + (int)(Math.random()* +500);
		int m = 40 + (int)(Math.random()* +600);
		int n = 54 + (int)(Math.random()* +500);
		
		//Posiciona as imagens
		lblBack.setBounds(0, 0, 1296, 755);
		lblContPap.setBounds(590, 30, 89, 126);
		lblContMet.setBounds(670, 30, 89, 126);
		lblContVid.setBounds(750, 30, 89, 126);
		lblContPla.setBounds(830, 30, 89, 126);
		lblLixLat.setBounds(x, y, 47, 58);
		lblLixFol.setBounds(a, b, 44, 48);
		lblLixGP.setBounds(c, d, 22, 45);
		lblLixGV.setBounds(e, f, 33, 43);
		lblLixRev.setBounds(g, h, 38, 43);
		lblLixSac.setBounds(i, j, 40, 42);
		lblLixTac.setBounds(k, l, 35, 47);
		lblLixVid.setBounds(m, n, 44, 46);	
		lblPonto.setBounds(20, -320, 300, 700);

	}
	
	//Configura a janela
	public void EditarJanela() 
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1296, 755);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setTitle("Ajudando");
		setLayout(null);
		add(lblLixLat);
		add(lblLixFol);
		add(lblLixGP);
		add(lblLixGV);
		add(lblLixRev);
		add(lblLixSac);
		add(lblLixTac);
		add(lblLixVid);
		add(lblContMet);
		add(lblContPap);
		add(lblContPla);		
		add(lblContVid);
		add(lblPonto);
		add(lblBack);
		setJMenuBar(barra);
		barra.add(menu1);
		menu1.add(item1);
			item1.addActionListener(new ActionListener()
			{@Override
				public void actionPerformed(ActionEvent e) 
				{new Jogo(); }});
		menu1.add(item2);
			item2.addActionListener(new ActionListener() 
			{@Override
				public void actionPerformed(ActionEvent arg0) 
				{JOptionPane.showMessageDialog(null, "Desenvolvido por Cassio Hiroshi - RA: C967335");	}});
			tocarMusica(musica1, 999);
}
	
	  
	public static void main(String[] args) 
	{
		new Jogo();

	}

	public Jogo() 
	{
		EditarJanela();
		EditarComponentes();
		if(lblLixLat.isVisible() && lblLixFol.isVisible() && lblLixGV.isVisible() && lblLixGP.isVisible() && lblLixRev.isVisible()&& lblLixSac.isVisible() && lblLixTac.isVisible() && lblLixVid.isVisible())
		{
			int dialogResult = JOptionPane.showConfirmDialog(null, "Olá, ajude-nos a limpar o bosque e contribuir com o meio ambiente.", "Jogo", JOptionPane.YES_NO_OPTION);
			if(dialogResult == 0) 
			{} 
			else {
					 System.exit(0);
				 }
				}


		//Adiciona a acao do mouse
		lblLixLat.addMouseListener(new MouseListener() 
		{	@Override
			public void mouseClicked(MouseEvent e) {
			Pontuacao();
			lblLixLat.setVisible(false);
			lblLixLat.setVisible(true);
			lblLixLat.setBounds(16 + (int)(Math.random()* +1000), 180 + (int)(Math.random()* +305),47, 58);
		}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) 
			{}
			@Override
			public void mouseReleased(MouseEvent e) 
			{}
		
		});
		lblLixFol.addMouseListener(new MouseListener() 
		{	@Override
			public void mouseClicked(MouseEvent e) {
			Pontuacao();
			lblLixFol.setVisible(false);
			lblLixFol.setVisible(true);
			lblLixFol.setBounds(50 + (int)(Math.random()* +1000), 108 + (int)(Math.random()* +305), 44, 48);
		}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) 
			{}
			@Override
			public void mouseReleased(MouseEvent e) 
			{}
		});
		lblLixGP.addMouseListener(new MouseListener() 
		{	@Override
			public void mouseClicked(MouseEvent e) {
			Pontuacao();
			lblLixGP.setVisible(false);
			lblLixGP.setVisible(true);
			lblLixGP.setBounds(20 + (int)(Math.random()* +1000), 307 + (int)(Math.random()* +35), 22, 45);
		}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) 
			{}
			@Override
			public void mouseReleased(MouseEvent e) 
			{}
		});
		lblLixGV.addMouseListener(new MouseListener() 
		{	@Override
			public void mouseClicked(MouseEvent e) {
			Pontuacao();
			lblLixGV.setVisible(false);
			lblLixGV.setVisible(true);
			lblLixGV.setBounds(40 + (int)(Math.random()* +1000), 300 + (int)(Math.random()* +45), 33, 43);
		}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) 
			{}
			@Override
			public void mouseReleased(MouseEvent e) 
			{}
		});
		lblLixRev.addMouseListener(new MouseListener() 
		{	@Override
			public void mouseClicked(MouseEvent e) {
			Pontuacao();
			lblLixRev.setVisible(false);
			lblLixRev.setVisible(true);
			lblLixRev.setBounds(36 + (int)(Math.random()* +1000), 330 + (int)(Math.random()* +30), 38, 43);
		}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) 
			{}
			@Override
			public void mouseReleased(MouseEvent e) 
			{}
		});
		lblLixSac.addMouseListener(new MouseListener() 
		{	@Override
			public void mouseClicked(MouseEvent e) {
			Pontuacao();
			lblLixSac.setVisible(false);
			lblLixSac.setVisible(true);
			lblLixSac.setBounds(39 + (int)(Math.random()* +1000), 505 + (int)(Math.random()* +27), 40, 42);
		}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) 
			{}
			@Override
			public void mouseReleased(MouseEvent e) 
			{}
		});
		lblLixTac.addMouseListener(new MouseListener() 
		{	@Override
			public void mouseClicked(MouseEvent e) {
			Pontuacao();
			lblLixTac.setVisible(false);
			lblLixTac.setVisible(true);
			lblLixTac.setBounds(33 + (int)(Math.random()* +900), 300 + (int)(Math.random()* +60), 35, 47);
		}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) 
			{}
			@Override
			public void mouseReleased(MouseEvent e) 
			{}
		});
		lblLixVid.addMouseListener(new MouseListener() 
		{	@Override
			public void mouseClicked(MouseEvent e) {
			Pontuacao();
			lblLixVid.setVisible(false);
			lblLixVid.setVisible(true);
			lblLixVid.setBounds(300 + (int)(Math.random()* +400), 80 + (int)(Math.random()* +400), 44, 46);
		}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) 
			{}
			@Override
			public void mouseReleased(MouseEvent e) 
			{}
		});
	}
	
	}
