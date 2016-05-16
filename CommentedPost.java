import java.util.ArrayList;
/**
 * Write a description of class CommentedPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommentedPost extends Post
{
    // instance variables - replace the example below with your own
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class CommentedPost
     */
    public CommentedPost(String author)
    {
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
