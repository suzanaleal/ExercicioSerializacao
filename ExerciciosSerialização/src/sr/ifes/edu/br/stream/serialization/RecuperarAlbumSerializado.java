/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Suzana
 */
public class RecuperarAlbumSerializado {
    
    public static void main(String[] args) throws Exception
    {
        AlbumSerializado album = null;
        String current = new java.io.File(".").getCanonicalPath();
        
        //carrega o arquivo
        FileInputStream fileIn = new FileInputStream(current + "\\src\\album_serializado.txt");
        
        //Classe responsável por recuperar os objetos do arquivo
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        album = (AlbumSerializado)in.readObject();
        
        System.out.println("Deserializando o Album...");
        
        System.out.println("Não coloquei todos os atributos do objeto aqui");
        System.out.println("Categoria: " + album.getCategoria());
        System.out.println("Descrição: " + album.getDescricao());
        
    }
}



