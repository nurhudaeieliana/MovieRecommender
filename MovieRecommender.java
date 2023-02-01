
public class MovieRecommender
{
   private String movieGenre;
   private String movieTitle;
   private String movieDirector;
   private int year;
   public String movieDescription;

   MovieRecommender(String movieGenre, String movieTitle, String movieDirector, int year)
   {  
      this.movieGenre = movieGenre;
      this.movieTitle = movieTitle;
      this.movieDirector = movieDirector;
      this.year = year;
   }
   
  


public void setGenre(String movieGenre)
   {
      this.movieGenre = movieGenre;
   }
   
   public void setTitle(String movieTitle)
   {
      this.movieTitle = movieTitle;
   }
   public void setDirector(String movieDirector)
   {
      this.movieDirector = movieDirector;
   }
   public void setYear(int year)
   {
      this.year = year;
   }
  
     
   public String getGenre()
   {
      return this.movieGenre;
   }
   public String getTitle()
   {
      return this.movieTitle;
   }
   public String getDirector()
   {
      return this.movieDirector;
   }
   public int getYear()
   {
      return this.year;
   }
   

    
   
   
   public String toString()
   {
      return ("\nMovie Genre: " + movieGenre + "\nTitle of the movie: " + movieTitle + "\nDirector is : " + movieDirector + "\nyear of produce is: " + year);
   }

    public static String showInputDialog(String string) {
      return null;
   }



}
         

