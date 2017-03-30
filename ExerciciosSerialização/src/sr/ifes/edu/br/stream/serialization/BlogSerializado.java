/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization;

/**
 *
 * @author Suzana
 */
import java.io.Serializable;
import java.util.LinkedList;

public class BlogSerializado implements Serializable {
    
    private String url;
    private String descricao;
    private String categoria;
    private UsuarioSerializado dono;
    private LinkedList<AlbumSerializado> album;
    private LinkedList<PostSerializado> posts;
    
    
    
    public String getUrl()
    {
        return this.url;
    }

    public BlogSerializado() {
    }
    
    

    public BlogSerializado(String url, String descricao, String categoria, UsuarioSerializado dono, LinkedList<AlbumSerializado> album, LinkedList<PostSerializado> post) {
        this.url = url;
        this.descricao = descricao;
        this.categoria = categoria;
        this.dono = dono;
        this.album = album;
        this.posts = post;
    }
    
    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LinkedList<AlbumSerializado> getAlbum() {
        return album;
    }

    public void setAlbum(LinkedList<AlbumSerializado> album) {
        this.album = album;
    }

    public LinkedList<PostSerializado> getPost() {
        return posts;
    }

    public void setPost(LinkedList<PostSerializado> post) {
        this.posts = post;
    }

    public UsuarioSerializado getDono() {
        return dono;
    }

    public void setDono(UsuarioSerializado dono) {
        this.dono = dono;
    }
    
    
}
