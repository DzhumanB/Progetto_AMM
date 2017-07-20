/**
 * @author Dzhuman Bohdan
 */
package Classi.Nerdbook;

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
        post1.setpType(Post.postType.TEXT);
        post1.setContain("CIAO A TUTTI!");
        post1.setIdRecieverGruppo(null);
        post1.setIdReciever(utenteFactory.getUtenteRegById(1));
        post1.setIdPublisher(utenteFactory.getUtenteRegById(2));
        post1.setUrlImgPublisher("");
        
        Post post2 = new Post();
        post2.setIdPost(1);
        post2.setpType(Post.postType.TEXT);
        post2.setContain("CIAO A TUTTI!");
        post2.setIdRecieverGruppo(null);
        post2.setIdReciever(utenteFactory.getUtenteRegById(2));
        post2.setIdPublisher(utenteFactory.getUtenteRegById(1));
        post2.setUrlImgPublisher("");
        
        Post post3 = new Post();
        post3.setIdPost(2);
        post3.setpType(Post.postType.IMG);
        post3.setContain("CIAO A TUTTI!");
        post3.setIdRecieverGruppo(null);
        post3.setIdReciever(utenteFactory.getUtenteRegById(3));
        post3.setIdPublisher(utenteFactory.getUtenteRegById(2));
        post3.setUrlImgPublisher("");
        
        Post post4 = new Post();
        post4.setIdPost(3);
        post4.setpType(Post.postType.URL);
        post4.setContain("CIAO A TUTTI!");
        post4.setIdRecieverGruppo(null);
        post4.setIdReciever(utenteFactory.getUtenteRegById(4));
        post4.setIdPublisher(utenteFactory.getUtenteRegById(3));
        post4.setUrlImgPublisher("");
        
        listPost.add(post1);
        listPost.add(post2);
        listPost.add(post3);
        listPost.add(post4);    
    }

    public Post getPostById(int idPost){
        for (Post post : this.listPost){
            if (post.getIdPost() == idPost){
                return post;
            }
        }
        return null;
    }
    
    public List getPostByReciever(UtenteReg ut){
        List<Post> lst = getPostByUtenteReg(ut);
        if(lst == null){
            lst = new ArrayList<Post>();
        }
        
        for(Post elemento:listPost){
            if(elemento.getIdReciever() != null){
                if(elemento.getIdReciever().equals(ut)){
                    lst.add(elemento);
                }
            }
        }
        return lst;
    }

    public List getPostByUtenteReg(UtenteReg utente){
        List<Post> lst = new ArrayList<Post>();
        
        for(Post elemento : listPost){
            if(elemento.getIdRecieverGruppo() == null){
                if(elemento.getIdPublisher().equals(utente)){
                    lst.add(elemento);
                }
            }
        }
        return lst;
    }
    
    public List getPostByGruppo(Gruppo gruppo){
        List<Post> lst = new ArrayList<Post>();
        
        for(Post elemento:listPost){
            if(elemento.getIdRecieverGruppo() != null){
                if(elemento.getIdRecieverGruppo().equals(gruppo)){
                    lst.add(elemento);
                }
            }
        }
        return lst;
    }
}
