/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.dominio;

/**
 *
 * @author user
 */
public  class Curso extends Conteudo{
 
   private int cargaHoraria;

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + '}';
    }

  
      @Override
    public double calcularXp(){
        return XP_PADRAO*cargaHoraria;
    }

    
  //  public abstract double calcularXp();
    
    //criando construtor
    public Curso(){
        
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}
