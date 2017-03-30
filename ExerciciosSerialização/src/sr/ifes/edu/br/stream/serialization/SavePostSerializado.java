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

/**
 *
 * @author Suzana
 */
public class SavePostSerializado {
    
    public static void main(String[] args) throws IOException
    {
        String current = new java.io.File( "." ).getCanonicalPath();        
        
        PostSerializado post = new PostSerializado();
        post.setKeyWords("Su,Leal,Bibi,Amor");
        post.setTexto("Suziiiiiiiiii");
        
        //gera o arquivo para armazenar o objeto
        FileOutputStream fileserializado = new FileOutputStream( current + "\\src\\post_serializado.txt");
        BufferedOutputStream bufferSerializado = new BufferedOutputStream(fileserializado);
        
        //classe responsável por inserir os objetos
        ObjectOutputStream outputSerializado = new ObjectOutputStream(bufferSerializado);        
        
        //grava o objeto blogserializado no arquivo
        outputSerializado.writeObject(post);
        outputSerializado.close();
        
        System.out.println("Post Salvo");
        
        System.out.println("Arquivo gerado em: " + current + "\\src\\post_serializado.txt");
        
    }
    
}
