import java.util.ArrayList;
public class MessagePost extends Post
{

    private String message;
    private ArrayList<String> comments;


    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
        comments = new ArrayList<>();

    }
    /**
     * Metodo para añadir un comentario al post
     */
    public void addComment(String text){
        comments.add(text);
    }
    

    /**
     * devuelve el mensaje
     */
    public String getText()
    {
        return message;
    }

    /**
     * devuelve quien crea el post
     */
    public void printShortSummary()
    {
        System.out.println("Este es un post de texto creado por: "+ getUsername());
    }
}

