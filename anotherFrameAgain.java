package musicPlayerMp3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class anotherFrameAgain extends JFrame {

	private JPanel contentPane1;
	private JLabel shoePlayList;
	private JFrame frame;
	private File[] file = new File[5];
	private AudioPlayerExample1 player = new AudioPlayerExample1();
	//private JButton playAll;
	private String[] songNumber = new String[5];
		
	//private JLabel lblNewLabel_1;
	//private JLabel lblNewLabel_2;
	//private JPanel contentPane;
	private JLabel song1;
	private JLabel song2;
	private JLabel song3;
	private JLabel song4;
	private JLabel song5;
	/**
	 * @wbp.nonvisual location=282,-21
	 */
	//private final JLabel label_1 = new JLabel("New label");
	private JButton play1;
	private JButton pause1;
	private JButton resume1;
	private JButton play2;
	private JButton pause2;
	private JButton resume2;
	private JButton play3;
	private JButton pause3;
	private JButton resume3;
	private JButton play4;
	private JButton pause4;
	private JButton resume4;
	private JButton play5;
	private JButton pause5;
	private JButton resume5;
	private JButton btnNewButton_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anotherFrameAgain frame = new anotherFrameAgain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public anotherFrameAgain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 428);
		contentPane1 = new JPanel();
		contentPane1.setBackground(Color.GRAY);
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                Singini");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(133, 11, 281, 39);
		contentPane1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/FirozVai.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(143, 61, 281, 39);
		contentPane1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(192, 192, 192));
		Image img21 = new ImageIcon(this.getClass().getResource("/c.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img21));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				int i=0;
				for(i=0;i<5;i++){
					JFileChooser chooser = new JFileChooser();
					chooser.showOpenDialog(null);
					file[i] = chooser.getSelectedFile();
				
				
					if(i== 0 ){
						song1.setText(file[i].getAbsolutePath());
					}
					else if(i == 1){
						song2.setText(file[i].getAbsolutePath());
					}
					else if(i == 2){
						song3.setText(file[i].getAbsolutePath());
					}
					else if(i == 3){
						song4.setText(file[i].getAbsolutePath());
					}
					else{
						song5.setText(file[i].getAbsolutePath());
					}
				}
			}
		});
		btnNewButton.setBounds(25, 199, 59, 52);
		contentPane1.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Play List");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(143, 120, 233, 25);
		contentPane1.add(lblNewLabel_3);
		
		song1 = new JLabel("Set your song");
		song1.setBounds(133, 156, 233, 25);
		contentPane1.add(song1);
		
		song2 = new JLabel("Set your song");
		song2.setBounds(133, 190, 233, 25);
		contentPane1.add(song2);
		
		song3 = new JLabel("Set your song");
		song3.setBounds(133, 226, 233, 25);
		contentPane1.add(song3);
		
		song4 = new JLabel("Set your song");
		song4.setBounds(133, 262, 233, 25);
		contentPane1.add(song4);
		
		song5 = new JLabel("Set your song");
		song5.setBounds(133, 298, 233, 25);
		contentPane1.add(song5);
		
		play1 = new JButton("");
		Image img11 = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		play1.setIcon(new ImageIcon(img11));
		play1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String audioFilePath = file[0].getAbsolutePath();
				player.play(audioFilePath);
			}
		});
		play1.setBounds(389, 157, 41, 32);
		contentPane1.add(play1);
		
		pause1 = new JButton("");
		pause1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.pause(songNumber[0]);
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/a.png")).getImage();
		pause1.setIcon(new ImageIcon(img2));
		pause1.setBounds(445, 157, 41, 32);
		contentPane1.add(pause1);
		
		resume1 = new JButton("");
		resume1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resume();
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/resu.png")).getImage();
		resume1.setIcon(new ImageIcon(img3));
		resume1.setBounds(503, 157, 41, 32);
		contentPane1.add(resume1);
		
		play2 = new JButton("");
		play2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String audioFilePath = file[1].getAbsolutePath();
				player.play(audioFilePath);
			}
		});
		Image img4 = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		play2.setIcon(new ImageIcon(img4));
		play2.setBounds(389, 191, 41, 32);
		contentPane1.add(play2);
		
		pause2 = new JButton("");
		pause2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.pause(songNumber[1]);
			}
		});
		Image img5 = new ImageIcon(this.getClass().getResource("/a.png")).getImage();
		pause2.setIcon(new ImageIcon(img5));
		pause2.setBounds(445, 191, 41, 32);
		contentPane1.add(pause2);
		
		resume2 = new JButton("");
		resume2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resume();
			}
		});
		Image img6 = new ImageIcon(this.getClass().getResource("/resu.png")).getImage();
		resume2.setIcon(new ImageIcon(img6));
		resume2.setBounds(503, 191, 41, 32);
		contentPane1.add(resume2);
		
		play3 = new JButton("");
		play3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String audioFilePath = file[2].getAbsolutePath();
				player.play(audioFilePath);
			}
		});
		Image img7 = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		play3.setIcon(new ImageIcon(img7));
		play3.setBounds(389, 227, 41, 32);
		contentPane1.add(play3);
		
		pause3 = new JButton("");
		pause3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.pause(songNumber[2]);
			}
		});
		Image img8 = new ImageIcon(this.getClass().getResource("/a.png")).getImage();
		pause3.setIcon(new ImageIcon(img8));
		pause3.setBounds(445, 227, 41, 32);
		contentPane1.add(pause3);
		
		resume3 = new JButton("");
		resume3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resume();
			}
		});
		Image img9 = new ImageIcon(this.getClass().getResource("/resu.png")).getImage();
		resume3.setIcon(new ImageIcon(img9));
		resume3.setBounds(503, 227, 41, 32);
		contentPane1.add(resume3);
		
		play4 = new JButton("");
		Image img10 = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		play4.setIcon(new ImageIcon(img10));
		play4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String audioFilePath = file[3].getAbsolutePath();
				player.play(audioFilePath);
			}
		});
		play4.setBounds(389, 263, 41, 32);
		contentPane1.add(play4);
		
		pause4 = new JButton("");
		pause4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.pause(songNumber[3]);
			}
		});
		Image img12 = new ImageIcon(this.getClass().getResource("/a.png")).getImage();
		pause4.setIcon(new ImageIcon(img12));
		pause4.setBounds(445, 263, 41, 32);
		contentPane1.add(pause4);
		
		resume4 = new JButton("");
		resume4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resume();
			}
		});
		Image img13 = new ImageIcon(this.getClass().getResource("/resu.png")).getImage();
		resume4.setIcon(new ImageIcon(img13));
		resume4.setBounds(503, 263, 41, 32);
		contentPane1.add(resume4);
		
		play5 = new JButton("");
		play5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String audioFilePath = file[4].getAbsolutePath();
				player.play(audioFilePath);
			}
		});
		Image img14 = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		play5.setIcon(new ImageIcon(img14));
		play5.setBounds(389, 299, 41, 32);
		contentPane1.add(play5);
		
		pause5 = new JButton("");
		pause5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.pause(songNumber[4]);
			}
		});
		Image img15 = new ImageIcon(this.getClass().getResource("/a.png")).getImage();
		pause5.setIcon(new ImageIcon(img15));
		pause5.setBounds(445, 299, 41, 32);
		contentPane1.add(pause5);
		
		resume5 = new JButton("");
		resume5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resume();
			}
		});
		Image img16 = new ImageIcon(this.getClass().getResource("/resu.png")).getImage();
		resume5.setIcon(new ImageIcon(img16));
		resume5.setBounds(503, 299, 41, 32);
		contentPane1.add(resume5);
		
		btnNewButton_2 = new JButton("");
		Image imgPlayAll = new ImageIcon(this.getClass().getResource("/pall.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(imgPlayAll));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j;
				for(j=0;j<5;j++){
					//AudioPlayerExample1 player = new AudioPlayerExample1();
					songNumber[j] = file[j].getAbsolutePath();
					player.play(songNumber[j]);
				}
			}
		});
		btnNewButton_2.setBounds(251, 337, 71, 52);
		contentPane1.add(btnNewButton_2);
	}
}
