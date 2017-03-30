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
public class RecuperarEnderecoSerializado {
    
     public static void main(String[] args) throws Exception
    {
        EnderecoSerializado endereco = null;
        String current = new java.io.File(".").getCanonicalPath();
        
        //carrega o arquivo
        FileInputStream fileIn = new FileInputStream(current + "\\src\\endereco_serializado.txt");
        
        //Classe responsável por recuperar os objetos do arquivo
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        endereco = (EnderecoSerializado)in.readObject();
        
        System.out.println("Deserializando o Endereco...");
        
        System.out.println("Não coloquei todos os atributos do objeto aqui");
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getCidade());
        
        
    }
    
}
