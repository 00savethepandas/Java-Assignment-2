import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestImageIcon extends JFrame {
   public TestImageIcon(){
      
      int mickeyVotes = 0;
      int mitchVotes = 0;
      int johnVotes = 0;

   /* *************************************************************   

   1. canPanel: Candidate Button Image Panel. North Panel

   **************************************************************** */      
      //MessagePanel pTitle = new MessagePanel("Vote for Student Body");
      //pTitle.setFont(new Font("Californian FB", Font.PLAIN, 20));
      JPanel canPanel = new JPanel();
      canPanel.setLayout(new GridLayout(1,3));
      ImageIcon voteIn = new ImageIcon("img/VOTE.jpg");
      ImageIcon mickey = new ImageIcon("img/mickey.jpg");
      ImageIcon mitchell = new ImageIcon("img/mitchell.jpg");     
      ImageIcon john = new ImageIcon("img/john.jpg");
      
      JButton mickeyButton = new JButton(mickey);
      JButton mitchButton = new JButton(mitchell);
      JButton johnButton = new JButton(john);
      //canPanel.add(pTitle);
      canPanel.add(mickeyButton);
      canPanel.add(mitchButton);
      canPanel.add(johnButton);
/*      
   // Listeners   
      voteMickeyClass listener1 = new voteMickeyClass();
      voteMitchClass listener2 = new voteMitchClass();
      voteJohnClass listener3 = new voteJohn();
*/    
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

   3. Results Panel: Specify 
   
   **************************************************************** */

      JPanel results = new JPanel(new FlowLayout());
      JLabel instruct = new JLabel("CLICK ON THE CANDIDATE TO PLACE YOUR VOTE"); // create
      instruct.setFont(new Font("Arial",Font.BOLD,18));
      instruct.setForeground(Color.RED);
      results.add(instruct); 
      results.setPreferredSize(new Dimension(800,150));
     
   
   /* *************************************************************   

   4. Panel 4: Pull together other panels. South Panel

   **************************************************************** */  
     
      JPanel panel4 = new JPanel(new BorderLayout());
      panel4.add(canPanel, BorderLayout.NORTH);
      panel4.add(namePanel, BorderLayout.CENTER);
      panel4.add(results, BorderLayout.SOUTH);
      add(panel4);
   }
   
   // Start program and render everything.
   
   public static void main(String[] args){
      TestImageIcon frame = new TestImageIcon();
      frame.setTitle("Vote for Student Body");
      frame.setSize(800,430);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

/* *************************************************************   

   5. Listener classes
   
**************************************************************** */

class voteMickeyClass implements ActionListener {
   @Override
   public void actionPerformed(ActionEvent e){
      System.out.println("Mickey");
   }
}
    /* 
   class voteMitchClass implements ActionListener {
   @Override
   public void actionPerformed(ActionEvent e){
      mitchVotes++;
   }
}
   
class voteJohnClass implements ActionListener {
   @Override
   public void actionPerformed(ActionEvent e){
      johnVotes++;
   }
}
   
*/


   