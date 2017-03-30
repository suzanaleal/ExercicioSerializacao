/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Suzana
 */
public class AlbumSerializado implements Serializable{
    
    private LinkedList<String> fotos;
    private String categoria;
    private String descricao;

    public AlbumSerializado() {
    }
    

    public AlbumSerializado(LinkedList fotos, String categoria, String descricao) {
        this.fotos = fotos;
        this.categoria = categoria;
        this.descricao = descricao;
    }
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LinkedList<String> getFotos() {
        return fotos;
    }

    public void setFotos(LinkedList<String> fotos) {
        this.fotos = fotos;
    }

}
