/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dio.dominio;

/**
 *
 * @author user
 */
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.DoubleStream;
public class Dev {
    
    private String nome;
    private Set<Conteudo> conteudosInscritos=new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos=new LinkedHashSet<>();
    
    public void inscreverBootcam(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudosConcluidos());
        bootcamp.getDevsIncritos().add(this);
    }
    
    public void progredir(){
        //pega o primeiro conteudo
        Optional<Conteudo> Conteudos= this.conteudosInscritos.stream().findFirst();
        if(Conteudos.isPresent()){
            this.conteudosConcluidos.add(Conteudos.get());
            this.conteudosInscritos.remove(Conteudos.get());
        }else{
            System.out.println("Usuario nao incrito em nenhum bootcamp");
        }
    }
    
    public DoubleStream calcularTotalXP(){
   return this.conteudosConcluidos.stream().mapToDouble((Conteudo) -> Conteudo.calcularXp());
   
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + Objects.hashCode(this.conteudosInscritos);
        hash = 13 * hash + Objects.hashCode(this.conteudosConcluidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev other = (Dev) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conteudosInscritos, other.conteudosInscritos)) {
            return false;
        }
        return Objects.equals(this.conteudosConcluidos, other.conteudosConcluidos);
    }
    
    
}
