/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplinas;

import java.util.Date;

/**
 *
 * @author Fatec
 */
public class Disciplina {
    private String sigla, nome, ementa, diaDaSemana, horario;

    public Disciplina(String sigla, String nome, String ementa, String diaDaSemana, String horario) {
        this.sigla = sigla;
        this.nome = nome;
        this.ementa = ementa;
        this.diaDaSemana = diaDaSemana;
        this.horario = horario;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
