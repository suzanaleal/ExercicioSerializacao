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
public class RecuperarComentarioSerializado {
    
    public static void main(String[] args) throws Exception
    {
        ComentarioSerializado comentario = null;
        String current = new java.io.File(".").getCanonicalPath();
        
        //carrega o arquivo
        FileInputStream fileIn = new FileInputStream(current + "\\src\\comentario_serializado.txt");
        
        //Classe responsável por recuperar os objetos do arquivo
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        comentario = (ComentarioSerializado)in.readObject();
        
        System.out.println("Deserializando o Comentario...");
        
        System.out.println("Não coloquei todos os atributos do objeto aqui");
        System.out.println("E-mail: " + comentario.getEmail());
        System.out.println("Texto: " + comentario.getTexto());
          
    }
    
}
