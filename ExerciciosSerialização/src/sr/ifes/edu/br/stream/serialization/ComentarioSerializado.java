/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization;

import java.util.Date;

/**
 *
 * @author Suzana
 */
public class ComentarioSerializado extends MensagemSerializada{
    
    private String author;
    private String email;

    public ComentarioSerializado() {
    }
    
    public ComentarioSerializado(String author, String email, String texto, Date dataPostagem) {
        super(texto, dataPostagem);
        this.author = author;
        this.email = email;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
