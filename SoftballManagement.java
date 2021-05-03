import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.util.Scanner;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;


	
	public class SoftballManagement{
		
	
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
	
		System.out.println("Create Your Softball Team Roster");
		System.out.println("HELP: There are 9 positions on the field (1-9), make sure each player has a position. You can have up to 12 players with the remaining as substitues. If a substitute is put in, you can give them a position as well.");
		System.out.println("");
		int players = 0;
		int x = 0;
		while(x==0) {
			x = 0;
		System.out.println("How many players do you have?");
		players = input.nextInt();
		if(players<9 || players>12) {
			System.out.println("Try Again! Only 9-12 players allowed!");
		} else {
			x = 1;
		}
		}

		String[] name = new String[players];
		int y = 0;
		int[] number = {0,0,0,0,0,0,0,0,0,0,0,0};
		int[] pos = {0,0,0,0,0,0,0,0,0,0,0,0};
	
		
		for(int j=0; j<players; j++) {
			
		System.out.println("What is your player's name?");
		name[y] = input2.nextLine();
		
		System.out.println("What is their team number?");
		number[y] = input.nextInt();
			
		System.out.println("What is their position number?");
		pos[y] = input.nextInt();
		
		y++;
	
		}
		y=0;
		
		System.out.println("Player Roster:");
		for(int j=0; j<players; j++){
		System.out.println(name[y] + " " + number[y] + " " + pos[y]);
		y++;
		}

		
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel[] player1 = new JLabel[players];

	int posX = 200;
	int posY = 75;
	int width = 300;
	int height = 50;

	    for(int i = 0; i<players; i++) {
	    	player1[i]= new JLabel(" ");
	    	player1[i].setBounds(posX, posY, width, height);
	    	player1[i].setText(name[i]);
	    	player1[i].setFont(panel.getFont().deriveFont(Font.BOLD, 30));
	    	posY = posY + 47;
	    	panel.add(player1[i]);
	    	
	    }
	    posX = 125;
	    posY= 75;
	    for(int i = 0; i<players; i++) {
	    	player1[i]= new JLabel(" ");
	    	player1[i].setBounds(posX, posY, width, height);
	    	String a = String.valueOf(number[i]);
	    	player1[i].setText(a);
	    	player1[i].setFont(panel.getFont().deriveFont(Font.BOLD, 30));
	    	posY = posY + 47;
	    	panel.add(player1[i]);
	    	
	    }
	    
	    posX = 495;
	    posY= 75;
	    for(int i = 0; i<players; i++) {
	    	player1[i]= new JLabel(" ");
	    	player1[i].setBounds(posX, posY, width, height);
	    	String a = String.valueOf(pos[i]);
	    	player1[i].setText(a);
	    	player1[i].setFont(panel.getFont().deriveFont(Font.BOLD, 30));
	    	posY = posY + 47;
	    	panel.add(player1[i]);
	    	
	    }

		BufferedImage image = ImageIO.read(new File("C:/Users/tjsho/Downloads/roster.png"));
		JLabel label = new JLabel(new ImageIcon(image));
		panel.setLayout(new BorderLayout());
		panel.add(label);

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Team Roster");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	
		BufferedImage image2 = ImageIO.read(new File("C:/Users/tjsho/Downloads/fieldc.png"));
		JLabel label2 = new JLabel(new ImageIcon(image2));
		panel2.setLayout(new BorderLayout());
		panel2.add(label2);

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame2 = new JFrame("Field");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame2.add(panel2);
		frame2.pack();
		frame2.setVisible(true);
		
		
		
		}
		
	}

	



