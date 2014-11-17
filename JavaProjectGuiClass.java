/**
 * @(#)JavaProjectGuiClass.java
 *
 *
 * @author 
 * @version 1.00 2014/11/14
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JavaProjectGuiClass extends JFrame implements ActionListener{
	
	
	String [] pic = {"Light.jpg"};
	
    private	JMenu player;
    private JMenu game;
    private JMenu level;
    private JMenu exit;
    private JPanel panel;
    private ImageIcon icon;
    private	JTextField jTfans;
    private	JButton btn1;
    private	JButton btn2;
    private	JLabel jlb1;
    private	JLabel jlb2;
    private	JLabel jlb3;
    private JProgressBar pgb;
    
    
    
    
	
	public static void main(String [] args){
	
	JavaProjectGuiClass Jproject = new JavaProjectGuiClass();
	Jproject.setVisible(true);	
		
	}

    public JavaProjectGuiClass() {
    	
    	setSize(400,400);
    	setResizable(true);
    	setLocation(250,250);
    	setTitle("Davids OOP2 Project");
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	Container cp = getContentPane();
    	cp.setLayout(new FlowLayout());
    	
    	newPlayer();
    	newGame();
    	newLevel();
    	
    	JMenuBar menubar = new JMenuBar();
    	
    	setJMenuBar(menubar);
    	menubar.add(player);
    	menubar.add(game);
    	menubar.add(level);
    	
    	pgb = new JProgressBar();
    	
        pgb.setIndeterminate(true);
        pgb.setVisible(false);
        pgb.setStringPainted(true);
        cp.add(pgb);
        
        panel=new JPanel();
        
        panel.setLayout(new BorderLayout());
        icon=new ImageIcon(pic[0]);
        jlb1=new JLabel();
        jlb1.setIcon(icon);
        panel.add(jlb1,BorderLayout.CENTER);
        
        jTfans = new JTextField();
        
        jTfans.setHorizontalAlignment(JTextField.CENTER);
        panel.add(jTfans,BorderLayout.SOUTH);
        
        btn1 = new JButton("CHECK ANSWER");
        panel.add(btn1,BorderLayout.SOUTH);
        panel.setSize(500,500);
        panel.setLocation(250,250);
        panel.setVisible(false);
        
        cp.add(panel);
        
        
        
        
         
         
         /////////////////////////////
         
         
         
   Timer timer = new Timer(1000, new MyTimerActionListener());

    
    
    
    
    
  }




         
         
         
         
         
         
         
         
         
      
 
    	
    
  
   
 




    
    
    
     private void newPlayer(){
    	
    	
    	JMenuItem drop;  // reusable object
    	
    	player = new JMenu("NewPlayer"); // a jmenu called new player
    	
    	drop = new JMenuItem("Create Player"); // add quit too the dropdown menu 
    	drop.addActionListener(this);
    	player.add(drop);
    	
    	
     }
     
      private void newGame(){
    	
    	
    	JMenuItem drop;  // reusable object
    	
    	game = new JMenu("NewGame"); // a jmenu called new game 
    	
    	drop = new JMenuItem("Start Game"); // add quit too the dropdown menu 
    	drop.addActionListener(this);
    	game.add(drop);
    	
    	
     }
     
     private void newLevel(){
    	
    	
    	JMenuItem drop;  // reusable object
    	
    	level = new JMenu("SelectLevel"); // a jmenu called selectLevel
    	
    	drop = new JMenuItem("Beginner"); // 
    	drop.addActionListener(this);
    	level.add(drop);
    	drop = new JMenuItem("Intermediate"); // 
    	drop.addActionListener(this);
    	level.add(drop);
    	drop = new JMenuItem("Advanced"); // 
    	drop.addActionListener(this);
    	level.add(drop);
    	
    	
     }
     
     
   
 

    
    public void actionPerformed(ActionEvent e){
    	
    if(e.getActionCommand()=="Start Game"){
    
     pgb.setValue(25);
     pgb.setVisible(true);
     	
    	
    	
    JOptionPane.showMessageDialog(null,"Loading Game Please select OK to continue");
    	
    	Timer timer = new Timer(1000, new MyTimerActionListener());
    
     timer.start();
     
    try {
    	
      Thread.sleep(10000);
    } catch (InterruptedException q) {
    	
    }
    
    
    
    timer.stop();
    pgb.setValue(100);
    pgb.setVisible(true);
    
    int choice=JOptionPane.showConfirmDialog(null,"Game Loaded do You wish to Proceed");

   if(choice==JOptionPane.YES_OPTION){
   	
   	pgb.setVisible(false);
   	
   	panel.setVisible(true);
   	
   }
    
    
    
  }
    		
    }////end if	
    	
    	
    ///end timer?
    
    
}
    
    
