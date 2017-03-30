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
public class RecuperarMensagemSerializada {
    
    public static void main(String[] args) throws Exception
    {
        MensagemSerializada mensagem = null;
        String current = new java.io.File(".").getCanonicalPath();
        
        //carrega o arquivo
        FileInputStream fileIn = new FileInputStream(current + "\\src\\mensagem_serializada.txt");
        
        //Classe responsável por recuperar os objetos do arquivo
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        mensagem = (MensagemSerializada)in.readObject();
        
        System.out.println("Deserializando a Mensagem...");
        
        System.out.println("Não coloquei todos os atributos do objeto aqui");
        System.out.println("Texto :" + mensagem.getTexto());
    
       
        
    }
    
}
