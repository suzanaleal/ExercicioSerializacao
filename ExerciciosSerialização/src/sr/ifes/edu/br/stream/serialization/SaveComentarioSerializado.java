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
public class SaveComentarioSerializado {
    
    public static void main(String[] args) throws IOException
    {
        String current = new java.io.File( "." ).getCanonicalPath();        
        
        ComentarioSerializado comentario = new ComentarioSerializado();
        comentario.setEmail("suzana@fdv.br");
        comentario.setTexto("Suzana Leal - Princesa");
        
        //gera o arquivo para armazenar o objeto
        FileOutputStream fileserializado = new FileOutputStream( current + "\\src\\comentario_serializado.txt");
        BufferedOutputStream bufferSerializado = new BufferedOutputStream(fileserializado);
        
        //classe responsável por inserir os objetos
        ObjectOutputStream outputSerializado = new ObjectOutputStream(bufferSerializado);        
        
        //grava o objeto blogserializado no arquivo
        outputSerializado.writeObject(comentario);
        outputSerializado.close();
        
        System.out.println("Comentário Salvo");
        
        System.out.println("Arquivo gerado em: " + current + "\\src\\comentario_serializado.txt");
        
    }
    
    
}
