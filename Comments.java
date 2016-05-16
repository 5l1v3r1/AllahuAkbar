import java.util.ArrayList;
/**
 * Write a description of class Comments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comments extends Post
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<String> comments;
    /**
     * Constructor for objects of class Comments
     */
    public Comments(String author)
    {
        // initialise instance variables
        super(author);
        comments = new ArrayList<>();
    }

    /**
     * Metodo para añadir un comentario al post
     */
    public void addComment(String text){
        comments.add(text);
    }
}
