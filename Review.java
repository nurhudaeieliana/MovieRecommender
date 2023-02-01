
/*import javax.swing.JOptionPane;
public class Review {
    public void showPopUp() {

        //String commentReview = "";
        //int buttonClicked = 0;
        int buttonClicked = JOptionPane.showConfirmDialog(null, "Do you like the movie recommender we provide?",
                "Confirmation", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (buttonClicked == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Thank you for your cooperation !");
        } else if (buttonClicked == JOptionPane.NO_OPTION) {
            JOptionPane.showInputDialog("State why and what we need to improvise : ");
        } else {
            JOptionPane.showMessageDialog(null, "Have a nice day <3 ");
            JOptionPane.showMessageDialog(null, "Thank you for your review !");
        }

        // TO DO: commentReview
    }

}*/

import javax.swing.JOptionPane;
public class Review {
    public void showPopUp() {

        //String commentReview = "";
        //int buttonClicked = 0;
        int buttonClicked = JOptionPane.showConfirmDialog(null, "Do you like the movie recommender we provide?",
                "Confirmation", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (buttonClicked == JOptionPane.YES_OPTION) 
        {
            JOptionPane.showMessageDialog(null, "Thank you for your cooperation !");
        } 
        else if (buttonClicked == JOptionPane.NO_OPTION) 
        {
            String comment = JOptionPane.showInputDialog("State why and what we need to improvise : ");
            JOptionPane.showConfirmDialog(null, "Your comment is " + comment );
            JOptionPane.showMessageDialog(null, "Thank you for your review !");
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Thank you and have a nice day <3 ");
        }

        // TO DO: commentReview
    }

}