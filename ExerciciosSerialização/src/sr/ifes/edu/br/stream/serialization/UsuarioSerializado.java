/*
Exemplo de serializao de uma classe.
Classe de dominio de usuario    
 */
package sr.ifes.edu.br.stream.serialization;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author felipe
 */
public class UsuarioSerializado implements Serializable{

    private String nome;
    private String apelido;
    private String email;
    private String telefone;
    private boolean habilitado;
    private String estado_civil;
    private int idade;
    private Date dt_nascimento;
    private String identidade;
    private String senha;   
    private EnderecoSerializado endereco;
    private LinkedList<BlogSerializado> blog;
    private LinkedList<PostSerializado> posts_publicados;

    public UsuarioSerializado(String nome, String apelido, String email, String telefone, boolean habilitado, String estado_civil, int idade, Date dt_nascimento, String identidade, String senha, EnderecoSerializado endereco, LinkedList<BlogSerializado> blog) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.telefone = telefone;
        this.habilitado = habilitado;
        this.estado_civil = estado_civil;
        this.idade = idade;
        this.dt_nascimento = dt_nascimento;
        this.identidade = identidade;
        this.senha = senha;
        this.endereco = endereco;
        this.blog = blog;
    }

    public UsuarioSerializado() {
    
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public EnderecoSerializado getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoSerializado endereco) {
        this.endereco = endereco;
    }

    public LinkedList<BlogSerializado> getBlog() {
        return blog;
    }

    public void setBlog(LinkedList<BlogSerializado> blog) {
        this.blog = blog;
    }

    public LinkedList<PostSerializado> getPosts_publicados() {
        return posts_publicados;
    }

    public void setPosts_publicados(LinkedList<PostSerializado> posts_publicados) {
        this.posts_publicados = posts_publicados;
    }
    
    
    
}
