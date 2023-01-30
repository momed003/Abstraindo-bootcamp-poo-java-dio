/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.dominio;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        //criando o primeiro objecto da classe curso
       Curso curso1=new Curso();
        
        Conteudo conteudo=new Curso();
        curso1.setTitulo("Curso Dio");
        curso1.setDescricao("Aprendendo a abrair um bootcamp em java");
        curso1.setCargaHoraria(2);
        
        //criando o segundo objecto da classe curso
        Curso curso2=new Curso();
        
        curso2.setTitulo("curso Web");
        curso2.setDescricao("proximo curso a aprender");
        curso2.setCargaHoraria(15);
        
        //criando o primeiro objecto da classe Mentoria
        Mentoria mentoria1=new Mentoria();
        mentoria1.setTitulo("Mentoria CAMILA - Javva");
        mentoria1.setDescricao("curso ministrado por Camila Cavalcante na Dio");
        mentoria1.setData(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/
        
       Bootcamp bootcamp=new Bootcamp();
       bootcamp.setNome("Bootcamp java developer");
       bootcamp.setDescricao("neste curso voce ira aprender a desenvolver codigos com java");
       bootcamp.getConteudos();
      
       
       Dev devYassimin=new Dev();
       devYassimin.inscreverBootcam(bootcamp);
       devYassimin.setNome("yassimin");
        System.out.println("conteudos inscritos"+devYassimin.getNome()+devYassimin.getConteudosInscritos());
       devYassimin.progredir();
        System.out.println("************************");
        System.out.println("conteudos "+devYassimin.getConteudosInscritos());
        System.out.println("XP"+devYassimin.calcularTotalXP());
        
    }
    
}
