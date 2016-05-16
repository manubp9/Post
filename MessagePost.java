
public class MessagePost extends CommentedPost
{

    private String message;
    


    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
        

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

