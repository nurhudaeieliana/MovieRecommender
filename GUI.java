import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class GUI 
{

   public void showGui()
   { 
      //public static void main(String[] args)
      
         JOptionPane.showConfirmDialog(null, "*****WELCOME TO MOVIE RECOMMENDER*****" + "\nPlease fill in your data ");
         
   
         String name = JOptionPane.showInputDialog("Enter your name: ");
         JOptionPane.showConfirmDialog(null, " Hello " + name);
   
         String phoneNum = JOptionPane.showInputDialog("Enter your phone number: ");
         JOptionPane.showConfirmDialog(null, " phone number: " + phoneNum);
   
         String genre = JOptionPane.showInputDialog("Enter genre you desired(Action, Romance, Fiction, Horror, Family): ");
         JOptionPane.showConfirmDialog(null, " genre: " + genre);
   
   
         /*double phoneNum = Double.parseDouble(JOptionPane.showInputDialog("Enter your phone number"));
         JOptionPane.showMessageDialog(null, "Your "  + phoneNum);*/
         JOptionPane.showConfirmDialog(null, "Name: " + name + "\nphone number: " + phoneNum + "\nGenre: " + genre);

         JOptionPane.showConfirmDialog(null, "HOPE YOU ENJOY OUR SYSTEM <3");
         
        
      
   }
   


      
}