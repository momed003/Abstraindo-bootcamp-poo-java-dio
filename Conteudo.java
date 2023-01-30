/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.dominio;

/**
 *
 * Yassimin Momed
 * todo bootcamp tem conteudo e mentoria e cuso sao conteudo
 */
public abstract class Conteudo {
 
    protected static final double XP_PADRAO=10d;
    
    private String titulo;
    private String descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //significa que as classes filhas sao obrigadas a implementar uma logica no metodo
    //abstract quer dizer: eu nao consigo instanciar o conteudo
    public abstract double calcularXp();
    
 
    
}
