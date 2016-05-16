
/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    // instance variables - replace the example below with your own
    private String grupo;

    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String author,String grupo)
    {
        super(author);
        this.grupo = grupo;
    }

    /**
     *Devuelve el nombre del grupo al  que se ha unido
     */
    public String getNombreGrupo()
    {
        return grupo;
    }
}
