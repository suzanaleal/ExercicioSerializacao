/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Suzana
 */
public class MensagemSerializada implements Serializable {
    
    private String texto;
    private Date dataPostagem;

    public MensagemSerializada(String texto, Date dataPostagem) {
        this.texto = texto;
        this.dataPostagem = dataPostagem;
    }

    public MensagemSerializada() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(Date dataPostagem) {
        this.dataPostagem = dataPostagem;
    }
    
}
