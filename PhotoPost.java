

/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost extends CommentedPost
{

    private String filename;
    private String caption;
    
    /**
     * Constructor for objects of class MessagePost
     */
    public PhotoPost( String filename, String caption,String author)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
        
    }

    /**
     * devuelve el nombre del archivo
     */
    public String getFileName()
    {
        return filename;
    }

    /**
     * devuelve la cabecera
     */
    public String getCaption()
    {
        return caption;
    }

}
