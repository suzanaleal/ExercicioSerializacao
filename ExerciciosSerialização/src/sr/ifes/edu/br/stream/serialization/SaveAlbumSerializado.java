/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sr.ifes.edu.br.stream.serialization;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

/**
 *
 * @author Suzana
 */
public class SaveAlbumSerializado {
    
    public static void main(String[] args) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath();        

        AlbumSerializado albumSerializado = new AlbumSerializado();
      
        albumSerializado.setCategoria("culinária");        
        albumSerializado.setDescricao("sobremesa");
        
        //gera o arquivo para armazenar o objeto
        FileOutputStream fileSerializado = new FileOutputStream( current + "\\src\\album_serializado.txt");        
        BufferedOutputStream bufferSerializado = new BufferedOutputStream(fileSerializado);
        
        ObjectOutputStream outputSerializado = new ObjectOutputStream(bufferSerializado);        
        outputSerializado.writeObject(albumSerializado);
        outputSerializado.close();
        
        System.out.println("Album Salvo");
        
        System.out.println("Arquivo gerado em: " + current + "\\src\\album_serializado.txt");
                
    }
    
}
