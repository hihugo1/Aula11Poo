/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import static java.util.Calendar.YEAR;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Fatec
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private Pessoa pai;
    private Pessoa mae;
    private Date nascimento;
    
    public Integer getIdade(){
        if(nascimento == null) return null;
        Calendar hoje = Calendar.getInstance();
        Calendar nasc = Calendar.getInstance();
        nasc.setTime(nascimento);
        int anoAtual = hoje.get(Calendar.YEAR);
        int anoDeNascimento = nasc.get(Calendar.YEAR);
        return anoAtual - anoDeNascimento;
    }

    public Pessoa getAvôPaterno(){
        if(pai == null) return null;
        
        return pai.getPai();
    }
    
    public Pessoa getAvôMaterno(){
        if(mae == null) return null;
        
        return mae.getMae();
    }
    
    public Pessoa getAvóPaterna(){
        if(pai == null) return null;
        
        return pai.getPai();
    }
    
    public Pessoa getAvóMaterna(){
        if(mae == null) return null;
        
        return mae.getMae();
    }
    

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    
    
}



