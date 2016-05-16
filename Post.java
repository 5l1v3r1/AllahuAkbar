import java.util.ArrayList;
/**
 * Write a description of class Post here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Post
{
    // instance variables - replace the example below with your own
    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;
    /**
     * Constructor para objetos Post
     */
    public Post(String author)
    {
         this.username = author;
         this.timestamp = System.currentTimeMillis();
         likes = 0;
         comments = new ArrayList<>();
    }
    
    /**
     * Metodo para dar un like.
     */
    public void like(){
        likes++;
    }
    
    /**
     * Metodo para quitar un like en caso de que los haya.
     */
    public void unlike(){
        if(likes != 0){
           likes--; 
        }
    }
    
    
    /**
     * Metodo que devuelve la estampa de tiempo en el momento de crear el post
     */
    public long getTimeStamp(){
        return timestamp;
    }
    
       /**
     * Metodo para pasar el tiempo a minutos y segundos.
     */
    private String timeString(long time){
        String info = "";
        int sec =  (int)(time / 1000) % 60;
        int min =  (int)((time / (1000*60)) % 60);
        if(min > 0){
            info += min + " Minutes, ";
        }
        info += sec + " Seconds\n";
        return info;
    }
    
    public void display(){
        String info = "";
        long time = System.currentTimeMillis() - getTimeStamp();
        info += username + "\n=====================\n" + "Posted: ";
        info += timeString(time);
        info += "_____________________\nLikes: " + likes + "\n=====================\n\n";
        
        System.out.println(info);
    
    }
    
    public String getAuthor(){
        return username;
    }
}

   