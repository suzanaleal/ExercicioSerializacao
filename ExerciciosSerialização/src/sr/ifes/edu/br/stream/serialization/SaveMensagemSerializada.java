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
public class SaveMensagemSerializada {
    
    public static void main(String[] args) throws IOException {
        
        String current = new java.io.File( "." ).getCanonicalPath();        

        MensagemSerializada mensagem = new MensagemSerializada();
        mensagem.setTexto("kjfjfkjrekjrkgjrk");
        
        //gera o arquivo para armazenar o objeto
        FileOutputStream fileSerializado = new FileOutputStream( current + "\\src\\mensagem_serializada.txt");        
        BufferedOutputStream bufferSerializado = new BufferedOutputStream(fileSerializado);
        
        ObjectOutputStream outputSerializado = new ObjectOutputStream(bufferSerializado);        
        outputSerializado.writeObject(mensagem);
        outputSerializado.close();
        
        System.out.println("Mensagem Salva");
        
        System.out.println("Arquivo gerado em: " + current + "\\src\\mensagem_serializada.txt");
                
    }
   
}
