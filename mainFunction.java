package musicPlayerMp3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class mainFunction {
	private JLabel shoePlayList;
	private JFrame frame;
	private File[] file = new File[1];
	private JLabel song;
	private JButton choose;
	private JButton play1;
	private JButton playAll;
	private String[] songNumber = new String[5];
	private AudioPlayerExample1 player = new AudioPlayerExample1();
	private JButton pause1;
	private JButton resume1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFunction window = new mainFunction();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainFunction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 379, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		choose = new JButton("");
		Image img21 = new ImageIcon(this.getClass().getResource("/c.png")).getImage();
		choose.setIcon(new ImageIcon(img21));
		choose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					//int i=0;
					//for(i=0;i<5;i++){
						JFileChooser chooser = new JFileChooser();
						chooser.showOpenDialog(null);
						file[0] = chooser.getSelectedFile();
					
					
						
							song.setText(file[0].getAbsolutePath());
						
									
				}
			
			});
		choose.setFont(new Font("Tahoma", Font.BOLD, 13));
		choose.setBounds(10, 186, 64, 51);
		frame.getContentPane().add(choose);
		
		shoePlayList = new JLabel("       Play Song");
		shoePlayList.setFont(new Font("Tahoma", Font.BOLD, 15));
		shoePlayList.setBounds(80, 145, 133, 27);
		frame.getContentPane().add(shoePlayList);
		
		song = new JLabel("set your fav songs");
		song.setBounds(102, 202, 211, 20);
		frame.getContentPane().add(song);
		
		play1 = new JButton("");
		Image img = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		play1.setIcon(new ImageIcon(img));
		play1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AudioPlayerExample1 player = new AudioPlayerExample1();
				String audioFilePath = file[0].getAbsolutePath();
				player.play(audioFilePath);
				
			}
		});
		play1.setBounds(80, 277, 44, 36);
		frame.getContentPane().add(play1);
		Image img1 = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		Image img4 = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		
		
		pause1 = new JButton("");
		Image img5 = new ImageIcon(this.getClass().getResource("/a.png")).getImage();
		pause1.setIcon(new ImageIcon(img5));
		pause1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.pause(songNumber[0]);
			}
		});
		pause1.setBounds(148, 277, 44, 36);
		frame.getContentPane().add(pause1);
		
		resume1 = new JButton("");
		Image img14 = new ImageIcon(this.getClass().getResource("/resu.png")).getImage();
		resume1.setIcon(new ImageIcon(img14));
		resume1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.resume();
			}
		});
		resume1.setBounds(219, 277, 44, 36);
		frame.getContentPane().add(resume1);
		Image img6 = new ImageIcon(this.getClass().getResource("/a.png")).getImage();
		Image img7 = new ImageIcon(this.getClass().getResource("/resu.png")).getImage();
		Image img8 = new ImageIcon(this.getClass().getResource("/resu.png")).getImage();
		Image img9 = new ImageIcon(this.getClass().getResource("/a.png")).getImage();
		Image img10 = new ImageIcon(this.getClass().getResource("/a.png")).getImage();
		Image img11 = new ImageIcon(this.getClass().getResource("/a.png")).getImage();
		Image img12 = new ImageIcon(this.getClass().getResource("/resu.png")).getImage();
		Image img13 = new ImageIcon(this.getClass().getResource("/resu.png")).getImage();
		
		JLabel lblNewLabel = new JLabel("                  Singini");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(36, 24, 280, 36);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		Image img16 = new ImageIcon(this.getClass().getResource("/firozVai.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img16));
		lblNewLabel_1.setBounds(57, 71, 256, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("    #code   #love  #programmer");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(102, 388, 211, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		Image playList = new ImageIcon(this.getClass().getResource("/playList.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(playList));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				anotherFrameAgain frameForPlaylist = new anotherFrameAgain();
				frameForPlaylist.setVisible(true);
			}
		});
		btnNewButton.setBounds(138, 334, 64, 43);
		frame.getContentPane().add(btnNewButton);
	}
}
