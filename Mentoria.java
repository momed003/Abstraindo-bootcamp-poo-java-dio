/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.dominio;

import java.time.LocalDate;

/**
 *
 * Yassimin Momed
 */
public class Mentoria extends Conteudo{
    //private String titulo;
    //private String descricao;
     @Override
    public double calcularXp(){
        return XP_PADRAO+20d;
    }
    
    public Mentoria(){
        
    }
    
    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + '}';
    }
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    LocalDate data; //serve para trabalhar com data
    
}
