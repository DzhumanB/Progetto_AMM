/**
 * @author Dzhuman Bohdan
 */
package amm.Nerdbook.Classi;

import java.util.List;
import java.util.ArrayList;

public class PostFactory {
    private static PostFactory singleton;
     
    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
    }
    
    private ArrayList<Post> listPost = new ArrayList<>();
    
    private PostFactory() {
        
        UtenteRegFactory utenteFactory = UtenteRegFactory.getInstance();
        
        Post post1 = new Post();
        post1.setIdPost(0);
        post1.setUser(utenteFactory.getUtenteRegById(0));
        post1.setContain("Ciao, miei schiavi. Datemi cibo! Adesso! Miaomiaomiaomiaomiao!");
        post1.setUrlFotoProfile("");
        post1.setPostTipo(Post.Tipo.TEXT);
        

        Post post2 = new Post();
        post2.setIdPost(1);
        post2.setUser(utenteFactory.getUtenteRegById(2));
        post2.setContain("Ciao, miei schiavi. Datemi cibo! Adesso! Miaomiaomiaomiaomiao!");
        post2.setUrlFotoProfile("");
        post2.setPostTipo(Post.Tipo.AUDIO);

        Post post3 = new Post();
        post3.setIdPost(2);
        post3.setUser(utenteFactory.getUtenteRegById(1));
        post3.setContain("Ciao, miei schiavi. Datemi cibo! Adesso! Miaomiaomiaomiaomiao!");
        post3.setUrlFotoProfile("");
        post3.setPostTipo(Post.Tipo.IMAGE);

        Post post4 = new Post();
        post4.setIdPost(3);
        post4.setUser(utenteFactory.getUtenteRegById(3));
        post4.setContain("Ciao, miei schiavi. Datemi cibo! Adesso! Miaomiaomiaomiaomiao!");
        post4.setUrlFotoProfile("");
        post4.setPostTipo(Post.Tipo.URL);

        listPost.add(post1);
        listPost.add(post2);
        listPost.add(post3);
        listPost.add(post4);    
    }

    public Post getPostById(int idPost) {
        for (Post post : this.listPost) {
            if (post.getIdPost() == idPost) {
                return post;
            }
        }
        return null;
    }

    public List getListPost(UtenteReg utente) {

        List<Post> listaPost = new ArrayList<>();

        for(Post post : this.listPost) {
            if (post.getUser().equals(utente)) {
                listaPost.add(post);
            }
        }
        return listaPost;
    }
    
    public List getPostByUser(UtenteReg utente)    {
        List<Post> l = new ArrayList<Post>();
        
        for(Post elemento : listPost){
            if(elemento.getGruppo() == null){
                if(elemento.getUser().equals(utente)){
                    l.add(elemento);
                }
            }
        }
        return l;
        //confrontare l'id dell'utente con quello del parametro
    }
    
    public List getPostByGruppo(Gruppo gruppo){
        List<Post> l = new ArrayList<Post>();
        
        for(Post elemento:listPost){
            if(elemento.getGruppo() != null){
                if(elemento.getGruppo().equals(gruppo)){
                    l.add(elemento);
                }
            }
        }
        return l;
    }
}
