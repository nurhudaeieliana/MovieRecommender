import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
public class MovieRecommenderApp
{  
    //bubblesort
     public static List<MovieRecommender> bubbleSort(List<MovieRecommender> MoviesAL) {
      for (int i = 0; i < MoviesAL.size() - 1; i++) {
         for (int j = 0; j < MoviesAL.size() - i - 1; j++) {
            if (MoviesAL.get(j).getTitle().compareTo(MoviesAL.get(j + 1).getTitle()) > 0) {
               // Swap movies[j] and movies[j+1]
               MovieRecommender temp = MoviesAL.get(j);
               MoviesAL.set(j, MoviesAL.get(j + 1));
               MoviesAL.set(j + 1, temp);
            }
         }
      }
      return MoviesAL;
   }    
  //binary search 
  public static void searchMovie(ArrayList MoviesAL, String search)
  {
      int low = 0;
      int high = MoviesAL.size() -1;
      int keyIndex = -1;
      int falseMid = -1;
      String movieTitle;
      
      while(high >= high)
      {
         int mid = (low + high)/2;
         MovieRecommender mv = (MovieRecommender)MoviesAL.get(mid);
         movieTitle = mv.getTitle();
         if(search.compareTo(movieTitle) < 0)
         {
            high = mid;
         }
         else if(search.compareTo(movieTitle) == 0)
         {
            keyIndex = mid;
            break;
         }
         else 
         {
            low = mid +1;
         }
      }
         if(keyIndex == -1)
         {
            System.out.println("\n\t\t--> The searched name " + search + " is not found ");
            System.out.println("\n------------------------------------------------------------------------------------------------");
         }
         else
         {
            System.out.println("\n\t\tThe searched name " + search + " is found at line " + keyIndex);
            System.out.println("\n------------------------------------------------------------------------------------------------");
         }
      
  }
       
           
    public static void main(String[] args)
   {
      
         Scanner input = new Scanner(System.in);
         ArrayList MoviesAL = new ArrayList();
         //String name, phoneNum;
         String movieGenre, movieTitle, movieDescription, movieDirector, MovieCategory;
         int year;


         /*JFrame frame = new JFrame();
         JPanel panel = new JPanel();
         JButton button = new JButton("Action Movies");
         JButton b1 = new JButton("Romance Movies");
         JButton b2 = new JButton("Fiction Movies");
         JButton b3 = new JButton("Horror Movies");
         JButton b4 = new JButton("Family Movies");

         panel.add(button);
         panel.add(b1);
         panel.add(b2);
         panel.add(b3);
         panel.add(b4);

         
         JTextField field1 = new JTextField("\nData 2");
            panel.add(field1);

         //JLabel label1 = new JLabel("Data1");
        // panel.add(label1);

         frame.add(panel);
         // frame.setVisible(true);
         frame.setSize(800, 600);


         int kala = JOptionPane.showConfirmDialog(null, "Press me to show frame");
         if(kala == JOptionPane.OK_OPTION)
            frame.setVisible(true);*/
            
         //Arraylist
         ArrayList<MovieRecommender> ActionMovies = new ArrayList <> ();
         ArrayList<MovieRecommender> RomanceMovies = new ArrayList <> ();
         ArrayList<MovieRecommender> FictionMovies = new ArrayList <> ();
         ArrayList <MovieRecommender> HorrorMovies = new ArrayList <>();
         ArrayList <MovieRecommender> FamilyMovies = new ArrayList <> ();

         MovieRecommender Skyscrapper = new MovieRecommender("Action Movie","Skyscrapper","Rawson Marshall Thurber" , 2018);
         MovieRecommender Venom = new MovieRecommender("Action Movie" , "Venom" , "Ruben Fleischer " , 2018);
         MovieRecommender TheHungerGame = new MovieRecommender("Action Movie", "The Hunger Game", "Gary Ross",2012);
         MovieRecommender Peninsula = new MovieRecommender("Action Movie", "Peninsula", "Yeon Sang-ho", 2020);
         MovieRecommender TopGunMaverick = new MovieRecommender("Action Movie", "Top Gun Maverick", "Joseph Kosinski",2020);
         MovieRecommender KungFuKiller = new MovieRecommender("Action Movie", "Kung Fu killer", "Teddy Chan", 2014);
         MovieRecommender TheMeg = new MovieRecommender("Action Movie" , "The Meg", "Jon Turteltaub", 2018);
         MovieRecommender ReadyPlayerOne = new MovieRecommender("Action Movie", "Ready Player One", "Stven Spielberg", 2018);
         
         ActionMovies.add(Skyscrapper);
         ActionMovies.add(Venom);
         ActionMovies.add(TheHungerGame);
         ActionMovies.add(Peninsula);
         ActionMovies.add(TopGunMaverick);
         ActionMovies.add(KungFuKiller);
         ActionMovies.add(TheMeg);
         ActionMovies.add(ReadyPlayerOne);

         //Romance Movie
         MovieRecommender Titanic = new MovieRecommender("Romance Movie", "Titanic", "James Cameron",1997);
         MovieRecommender CrazyRichAsians = new MovieRecommender("Romance Movie", "Crazy Rich Asians", "Jon M.chu", 2018);
         MovieRecommender LaLaLand = new MovieRecommender("Romance Movie", "La La Land", "Damien Chazelle",2016);
         MovieRecommender YourName = new MovieRecommender("Romance Movie", "Your Name", "Makoto Shinkai",2016);
         MovieRecommender TheFaultinOurStars = new MovieRecommender("Romance Movie", "The Fault in Our Stars", "Josh Boone", 2014);
         MovieRecommender BeforeSunrise = new MovieRecommender("Romance Movie", "Before Sunrise", "Richard Linklater",1995);
         

         RomanceMovies.add(Titanic);
         RomanceMovies.add(CrazyRichAsians);
         RomanceMovies.add(LaLaLand);
         RomanceMovies.add(YourName);
         RomanceMovies.add(TheFaultinOurStars);
         RomanceMovies.add(BeforeSunrise);
         
         
         //Fiction Movie
         MovieRecommender TheAdamProject = new MovieRecommender("Fiction Movie", "The Adam Project", "Shawn Levy",2022);
         MovieRecommender Lucy = new MovieRecommender("Fiction Movie", "Lucy" , "Luc Besson", 2014);
         MovieRecommender Transformers = new MovieRecommender("Fiction Movie" , "Transformers", "Michael Bay", 2007);
         MovieRecommender PacificRim = new MovieRecommender("Fiction Movie", "Pacifim Rim", "Guillermo del Toro", 2013);
         MovieRecommender Mute = new MovieRecommender("Fiction Movie", "Mute", " Duncan Jones", 2018);
         MovieRecommender TheTerminator = new MovieRecommender("Fiction Movie", "The Terminator", "James Cameron", 1984);
         MovieRecommender Pixels = new MovieRecommender("Fiction Movie", "Pixels", "Chris Columbus", 2015);
         MovieRecommender ManOfSteel = new MovieRecommender("Fiction Movie", "Man Of Steel", "Zack Snyder", 2013);
         
         FictionMovies.add(TheAdamProject);
         FictionMovies.add(Lucy);
         FictionMovies.add(Transformers);
         FictionMovies.add(PacificRim);
         FictionMovies.add(Mute);
         FictionMovies.add(TheTerminator);
         FictionMovies.add(Pixels);
         FictionMovies.add(ManOfSteel);
    
         //Horror Movie
         MovieRecommender TheConjuring = new MovieRecommender("Horror Movie", "The Conjuring", "James Wan", 2013);
         MovieRecommender TheVisit = new MovieRecommender("Horror Movie", "The Visit", "M.Night Shymalan", 2015);
         MovieRecommender AnnebelleComeHome = new MovieRecommender("Horror Movie", "Annbelle Come Home", "Gary Dauberman", 2019);
         MovieRecommender AQuietPlace = new MovieRecommender("Horror Movie", "A Quiet Place", "John Krasinski", 2018);
         MovieRecommender IT = new MovieRecommender("Horror Movie", "IT", "Andres Muschietti", 2017);
         MovieRecommender Sabrina = new MovieRecommender("Horror Movie", "Sabrina", "Rocky Soraya", 2018);
         MovieRecommender Us = new MovieRecommender("Horror Movie", "Us", "Jordan Peele ", 2019);
         MovieRecommender ChooseOrDie = new MovieRecommender("Horror Movie", "Choose Or Die", "Toby Meakins", 2022);
         
         
         HorrorMovies.add(TheConjuring);
         HorrorMovies.add(TheVisit);
         HorrorMovies.add(AnnebelleComeHome);
         HorrorMovies.add(AQuietPlace);
         HorrorMovies.add(IT);
         HorrorMovies.add(Sabrina);
         HorrorMovies.add(Us);
         HorrorMovies.add(ChooseOrDie);
         
         //Family Movie
         MovieRecommender TheBossBaby = new MovieRecommender("Family Movie", "The Boss Baby", "Tom McGrath ", 2017);
         MovieRecommender CorpseBride = new MovieRecommender("Family Movie", "Corpse Bride", "Tim Burton & Mike Johnson", 2005);
         MovieRecommender Cinderella = new MovieRecommender("Family Movie", "Cinderella", "Kenneth Branagh", 2015);
         MovieRecommender SonicTheHedgehog  = new MovieRecommender("Family Movie", "Sonic The Hedgehog", "Jeff Fowler", 2020);
         MovieRecommender HowToTrainYourDragonTheHiddenWorld = new MovieRecommender("Family Movie", "How To Train Your Dragon: The Hidden World" , "Dean DeBlois", 2019);
         MovieRecommender DoraandTheLostCityofGold = new MovieRecommender("Family Movie", "Dora and The Lost City of Gold", "James Bobin ", 2019);
         MovieRecommender Vivo = new MovieRecommender("Family Movie", "Vivo", "Kirk DeMicco", 2021);
              
         FamilyMovies.add(TheBossBaby);
         FamilyMovies.add(CorpseBride);
         FamilyMovies.add(Cinderella);
         FamilyMovies.add(SonicTheHedgehog);
         FamilyMovies.add(HowToTrainYourDragonTheHiddenWorld);
         FamilyMovies.add(DoraandTheLostCityofGold);
         FamilyMovies.add(Vivo);
         
         /*System.out.println("Please Enter your name: ");1
         Name = input.nextLine();
         
         System.out.println("Please enter your phone number: ");
         phoneNum = input.nextLine();*/

         /*Guis haiGuis = new Guis();
          haiGuis.showGuis();*/

         
         System.out.println("\n-------------WELCOME TO MOVIE RECOMMENDER------------");
         
          GUI helloGui  = new GUI();
          helloGui.showGui();

          System.out.println("\nPlease choose your Movie category (choose number): ");
         
          System.out.println("\t\t-----MOVIE CATEGORY -----");
          System.out.println("\t\t|   [1] ACTION MOVIE   |");
          System.out.println("\t\t|   [2] ROMANCE MOVIE  |");
          System.out.println("\t\t|   [3] FICTION MOVIE  |");
          System.out.println("\t\t|   [4] HORROR MOVIE   |");
          System.out.println("\t\t|   [5] FAMILY MOVIE   |");
          System.out.println("\t\t-----------END-------------");
   
          //get user input
          System.out.println("\nEnter Movie Category (Action,Romance,Fiction,Horror,Family): ");
          MovieCategory = input.nextLine();

         
          //using switch statement, pass selected movie into 'MoviesAL'
          //String movieCategory;

          switch (MovieCategory)
          {
            case "1":
               MoviesAL = ActionMovies ;
               break;
               
            case "2":
               MoviesAL = RomanceMovies;
               break;
               
            case "3":
               MoviesAL = FictionMovies;
               break;
               
            case "4":
               MoviesAL = HorrorMovies;
               break;
            
            case "5":
               MoviesAL = FamilyMovies;
               break;
               
               default:
                  System.out.println("NONE");
                  return;
           }
           
         
           for(int i=0; i<MoviesAL.size(); i++)
           {
               System.out.println(MoviesAL.get(i));
           }
           System.out.println("\n************************************************************************************************************");

           //Bubble Sort
           bubbleSort(MoviesAL);
           
           System.out.println("\n****Movies by alphabet****");

         for(int a=0; a<MoviesAL.size(); a++)
         {
            System.out.println(MoviesAL.get(a).toString());
         }
         
         //binary search
         System.out.println("\n------------------------------------------------------------------------------------------------");
         System.out.println("\n\t\tEnter the title you want to be search: ");
         String search = input.nextLine();
         
         searchMovie(MoviesAL, search);
         
         
         System.out.println("\n\nDo you want to know the details of any movie (Yes/No): ");
         movieDescription = input.nextLine();
         { 
         
          if(movieDescription.equalsIgnoreCase("yes"))
          {
            System.out.println("\nPlease insert the title: ");
            movieTitle = input.nextLine();
            
            System.out.println("\n\n**************************************************************=====**************************************************************");
           if(movieDescription.equalsIgnoreCase("Skyscrapper"))
          {
             System.out.println("\n\t\t\t\tRating view(Skyscrapper): ****(5.8/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult ");
          }
          else if(movieTitle.equalsIgnoreCase("Venom"))
          {
             System.out.println(" \n\t\t\t\tRating view(Venom): ****(6.6/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult ");
          }
          else if(movieTitle.equalsIgnoreCase("The Hunger Game"))
          {
             System.out.println(" \n\t\t\t\tRating view(The Hunger Game): ****(7.2/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult ");
          }
          else if(movieTitle.equalsIgnoreCase("Peninsula"))
          {
             System.out.println(" \n\t\t\t\tRating view(Peninsula): ****(5.5/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult ");
          }
          else if(movieTitle.equalsIgnoreCase("Top Gun:Maverick"))
          {
             System.out.println(" \n\t\t\t\tRating view(Top Gun:Maverick): ****(8.3/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult ");
          }
          else if(movieTitle.equalsIgnoreCase("Kung Fu killer"))
          {
             System.out.println("\n\t\t\t\tRating view(Kung Fu Killer): ****(6.4/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult ");
          }

          else if(movieTitle.equalsIgnoreCase("The Meg"))
          {
             System.out.println(" \n\t\t\t\tRating view(The Meg): ****(5.6/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult ");
          }
          else if(movieTitle.equalsIgnoreCase("Ready Player One"))
          {
             System.out.println("\n\t\t\t\tRating view(Ready Player One): ****(7.4/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult ");
          }
          
          else if(movieTitle.equalsIgnoreCase("Titanic"))
          {
             System.out.println("\n\t\t\t\tRating view(Titanic): **** (7.9/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult ");
          }
          else if(movieTitle.equalsIgnoreCase("Crazy Rich Asians"))
          {
             System.out.println("\n\t\t\t\tRating view(Crazy Rich Asians): ****(6.9/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult ");
          }
          else if(movieTitle.equalsIgnoreCase("La La Land"))
          {
             System.out.println("\n\t\t\t\tRating view(La La Land): ****(8/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("Your Name"))
          {
             System.out.println("\n\t\t\t\tRating view(Your Name): ****(8.4/10)****");
             System.out.println("\n\t\t\t\tPG - this movie can be watched by everyone ");
          }
          else if(movieTitle.equalsIgnoreCase("The Fault in Our Stars"))
          {
             System.out.println("\n\t\t\t\tRating view(The Fault in Our Stars): ****(7.7/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult ");
          }
          else if(movieTitle.equalsIgnoreCase("Before Sunrise"))
          {
             System.out.println("\n\t\t\t\tRating view(Before Sunrise): ****(8.5/10)***");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("The Adam Project"))
          {
             System.out.println("\n\t\t\t\tRating view(The Adam Project): ****(6.7/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("Lucy"))
          {
             System.out.println(" \n\t\t\t\tRating view(Lucy): ****(6.4/10)****");
             System.out.println("\n\t\t\t\tR Rated - this movie is not suitable for kids");
          }
          else if(movieTitle.equalsIgnoreCase("Transformers"))
          {
             System.out.println("\n\t\t\t\tRating view(Transformers): ****(7/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("Pacific Rim"))
          {
             System.out.println("\n\t\t\t\tRating view(Pacific Rim): ****(6.9/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("Mute"))
          {
             System.out.println("\n\t\t\t\tRating view(Mute): ****(6/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
           else if(movieTitle.equalsIgnoreCase("The Terminator"))
          {
             System.out.println("\n\t\t\t\tRating view(The Terminator): ****(8.1/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("Pixels"))
          {
             System.out.println("\n\t\t\t\tRating view(Pixels): ****(6.6/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("Man Of Steel"))
          {
             System.out.println("\n\t\t\t\tRating view(Man Of Steel): ****(7.1/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult"); 
          }
          
          else if(movieTitle.equalsIgnoreCase("The Conjuring"))
          {
             System.out.println("\n\t\t\t\tRating view(The Conjuring): ****(7.5/10)****");
             System.out.println("\n\t\t\t\tPG 15 - this movie contains a gore scenes ");
          }
          else if(movieTitle.equalsIgnoreCase("The Visit"))
          {
             System.out.println("\n\t\t\t\tRating view(The Visit): ****(6.2/10)****");
             System.out.println("\n\t\t\t\tPG 15 - this movie contains a gore scenes ");
          }
          else if(movieTitle.equalsIgnoreCase("Annebelle Come Home"))
          {
             System.out.println("\t\t\t\t\n\tRating view(Annebelle Come Home): ****(6/10)****");
             System.out.println("\n\t\t\t\tPG 15 - this movie contains a gore scenes ");
          }
          else if(movieTitle.equalsIgnoreCase("A Quiet Place"))
          {
             System.out.println("\n\t\t\t\tRating view(A Quiet Place): ****(7.5/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("IT"))
          {
             System.out.println("\n\t\t\t\tRating view(IT): ****(7.3/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("Sabrina"))
          {
             System.out.println("\n\t\t\t\tRating view(Sabrina): ****(6/10)****");
             System.out.println("\n\t\t\t\tPG 15 - this movie contains a gore scenes ");
          }
          else if(movieTitle.equalsIgnoreCase("Us"))
          {
             System.out.println("\n\t\t\t\tRating view(Us): ****(6.8/10)****");
             System.out.println("\n\t\t\t\tPG 15 - this movie contains a gore scenes ");
          }
          else if(movieTitle.equalsIgnoreCase("Choose or Die"))
          {
             System.out.println("\n\t\t\t\tRating view(Choose or Die): ****(7/10)****");
             System.out.println("\n\t\t\t\tPG 15 - this movie contains a gore scenes ");
          }
          
          else if(movieTitle.equalsIgnoreCase("The Boss Baby"))
          {
             System.out.println("\n\t\t\t\tRating view(The Boss Baby): ****(6.3/10)****");
             System.out.println("\n\t\t\t\tPG - this movie contains adult jokes ");
          }
          else if(movieTitle.equalsIgnoreCase("Corpse Bride"))
          {
             System.out.println("\n\t\t\t\tRating view(Corpse Bride): ****(7.3/10)****");
             System.out.println("\n\t\t\t\tPG 10 - this movie need to be accompaned by an adult ");
          }
          else if(movieTitle.equalsIgnoreCase("Cinderella"))
          {
             System.out.println("\n\t\t\t\tRating view(Cinderella): ****(7/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("Sonic The Hedgehog"))
          {
             System.out.println("\n\t\t\t\tRating view(Sonic The Hedgehog): ****(6.5/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("How To Train Your Dragon:The Hidden World "))
          {
             System.out.println("\n\t\t\t\tRating view(How To Train Your Dragon:The Hidden World): ****(7.4/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("Dora and The Lost City of Gold"))
          {
             System.out.println("\n\t\t\t\tRating view(Dora and The Lost City of Gold): ****(6.4/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          else if(movieTitle.equalsIgnoreCase("Vivo"))
          {
             System.out.println("\n\t\t\t\tRating view(Vivo): ****(6.7/10)****");
             System.out.println("\n\t\t\t\tPG 13 - this movie need to be accompanied by an adult");
          }
          
          else{   
            return ;
          }
         
          
            
          System.out.println("\n**************************************************************=====**************************************************************");

          }
          else if(movieDescription.equalsIgnoreCase("no"))
          {
            System.out.println("\n<< Your movie title is suit with you :) >>");
          }
         }
      
      System.out.println("\t\t\t\tThank you for using our System");
      System.out.println("\t\t\t\tPlease answer this review for us");
      
      
      Review review = new Review();
      review.showPopUp();
      
      
      System.out.println("End of our system");
      
      
      
            
             
   }     
      
}
   
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
     