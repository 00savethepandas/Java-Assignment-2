import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class voteStudentBody extends JFrame {
   voteMickClass vMickey = new voteMickClass();
   voteMitchClass vMitch = new voteMitchClass();   
   voteJohnClass vJohn = new voteJohnClass();   
   public voteStudentBody(){ 
   /* *************************************************************   

   1. canPanel: Candidate Button Image Panel. North Panel

   **************************************************************** */      
      // Create candidate panel, set it to GridLayout
      JPanel canPanel = new JPanel();
      canPanel.setLayout(new GridLayout(1,3));
      
      // Create Image Icons
      ImageIcon voteIn = new ImageIcon("img/VOTE.jpg");
      ImageIcon mickey = new ImageIcon("img/mickey.jpg");
      ImageIcon mitchell = new ImageIcon("img/mitchell.jpg");     
      ImageIcon john = new ImageIcon("img/john.jpg");
      
      // Turn image icons into buttons
      JButton mickeyButton = new JButton(mickey);
      JButton mitchButton = new JButton(mitchell);
      JButton johnButton = new JButton(john);
      
      // Add Buttons to panels:
      canPanel.add(mickeyButton);
      canPanel.add(mitchButton);
      canPanel.add(johnButton);
      
      // Attach action listeners to buttons:
      mickeyButton.addActionListener(new voteMickListener());
      mitchButton.addActionListener(new voteMitchListener());      
      johnButton.addActionListener(new voteJohnListener());      
      
   /* *************************************************************   

   2. namePanel: Holds Candidate Names. Center Panel

   **************************************************************** */
      JPanel namePanel = new JPanel();
      namePanel.setLayout(new GridLayout(1,3));
            
      // Candidate Names: Labels for each image:
      JLabel mLabel = new JLabel("Mickey McCormick");
      JLabel mitchLabel = new JLabel("Mitchell Chen");   
      JLabel johnLabel = new JLabel("John Fisher");   
      
      // Set Alignment and font size for Mickey's Label:
      mLabel.setHorizontalAlignment(JLabel.CENTER);
      mLabel.setFont(mLabel.getFont().deriveFont(18.0f));      
      
      // Set alignment and font for Mitch's label:
      mitchLabel.setHorizontalAlignment(JLabel.CENTER);
      mitchLabel.setFont(mitchLabel.getFont().deriveFont(18.0f));      
      
      // Set alignment and font for John's lable:
      johnLabel.setHorizontalAlignment(JLabel.CENTER);
      johnLabel.setFont(johnLabel.getFont().deriveFont(18.0f));      
      
      // Add all candidate labels to the namePanel
      namePanel.add(mLabel);
      namePanel.add(mitchLabel);
      namePanel.add(johnLabel);

   /* *************************************************************   

   3. Results Panel: counters
   
   **************************************************************** */

      JPanel counters = new JPanel(new GridLayout(2,3));
      JLabel showMickey = new JLabel("Mickey's Total Votes: "); // create
      showMickey.setFont(new Font("Arial",Font.BOLD,18));      
      JLabel showMitchell = new JLabel("Mitchell's Total Votes: "); // create
      showMitchell.setFont(new Font("Arial",Font.BOLD,18));   
      JLabel showJohn = new JLabel("John's Total Votes: "); // create
      showJohn.setFont(new Font("Arial",Font.BOLD,18));
      counters.add(showMickey);
      counters.add(showMitchell);
      counters.add(showJohn);               
      counters.add(vMickey);
      counters.add(vMitch);      
      counters.add(vJohn);      
      counters.setPreferredSize(new Dimension(800,100));

   /* *************************************************************   

   4. South Panel: Holds Results and Instructions 
   
   **************************************************************** */

      JPanel results = new JPanel(new FlowLayout());
      JLabel instruct = new JLabel("CLICK ON THE CANDIDATE TO PLACE YOUR VOTE"); // create
      instruct.setFont(new Font("Arial",Font.BOLD,18));
      instruct.setForeground(Color.RED);
      results.add(instruct); 
      results.add(counters);
      results.setPreferredSize(new Dimension(800,150));

     
   
   /* *************************************************************   

   5. Panel 4: Pull together other panels. South Panel

   **************************************************************** */  
     
      JPanel panel4 = new JPanel(new BorderLayout());
      panel4.add(canPanel, BorderLayout.NORTH);
      panel4.add(namePanel, BorderLayout.CENTER);
      panel4.add(results, BorderLayout.SOUTH);
      add(panel4);
   }
   
   // Start program and render everything.
   
   public static void main(String[] args){
      voteStudentBody frame = new voteStudentBody();
      frame.setTitle("Vote for Student Body");
      frame.setSize(900,500);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
   /* *************************************************************   

   6. Listener classes
   
   **************************************************************** */
   class voteMickListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e){
         vMickey.totalMickVotes();
      }
   }
   
   class voteMitchListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e){
         vMitch.totalMitchVotes();
      }
   }
   class voteJohnListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e){
         vJohn.totalJohnVotes();
      }
   }   
   /* *************************************************************   

   7. Functions to perform:
   
   **************************************************************** */

   class voteMickClass extends JPanel {
      private int mickVotes = 0;
      public void totalMickVotes(){   
         mickVotes++;  
         repaint();
      }
      @Override
      public void paintComponent(Graphics g){
         super.paintComponent(g);
         g.setFont(new Font("Arial", Font.PLAIN, 25));
         g.drawString(String.valueOf(mickVotes),80,20);
      }
   }      

   class voteMitchClass extends JPanel {
      private int mitchVotes = 0;
      public void totalMitchVotes(){   
         mitchVotes++;  
         repaint();      
      }
      @Override
      public void paintComponent(Graphics g){
         super.paintComponent(g);
         g.setFont(new Font("Arial", Font.PLAIN, 25));                  
         g.drawString(String.valueOf(mitchVotes),85,20);
      }
   }      
   
      class voteJohnClass extends JPanel {
      private int johnVotes = 0;
      public void totalJohnVotes(){   
         johnVotes++;  
         repaint();      
      }
      @Override
      public void paintComponent(Graphics g){
         super.paintComponent(g);
         g.setFont(new Font("Arial", Font.PLAIN, 25));               
         g.drawString(String.valueOf(johnVotes),80,20);
      }
   }
}