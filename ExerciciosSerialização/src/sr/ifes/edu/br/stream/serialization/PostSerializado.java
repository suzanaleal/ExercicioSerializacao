/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Suzana
 */
public class PostSerializado extends MensagemSerializada{
    
    private String keyWords;
    LinkedList<ComentarioSerializado> comentarios;

    public PostSerializado() {
    }
    

    public PostSerializado(String keyWords, String texto, Date dataPostagem) {
        super(texto, dataPostagem);
        this.keyWords = keyWords;
    }


    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }
    
    
    
}
