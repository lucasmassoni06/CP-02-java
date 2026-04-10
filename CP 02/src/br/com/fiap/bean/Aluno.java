package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
    // Atributos

    private int registroMatricula;
    private String nomeCompleto;
    private LocalDate dataDeNascimento;

    // Construtor vazio


    public Aluno() {
    }

    // Construtor com parametro

    public Aluno(int registroMatricula, String nomeCompleto, LocalDate dataDeNascimento) {
        this.registroMatricula = registroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
    }


    // Getters e Setters

    public int getRegistroMatricula() {
        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula) {
        try{
            if(registroMatricula >= 80000 && registroMatricula <= 599999){
                this.registroMatricula = registroMatricula;
            }else{
                throw new Exception("Número de registro de matrícula inválido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        try{
            LocalDate dataMinima = LocalDate.parse("1960-01-01");
            LocalDate hoje = LocalDate.now().plusDays(1);
            if(dataDeNascimento.isAfter(dataMinima) && dataDeNascimento.isBefore(hoje)){
                this.dataDeNascimento = dataDeNascimento;
            }else{
                throw new Exception("Data de nascimento inválida");
            }} catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Metodos

    public String calcularIdadeCompleta(LocalDate dataAtual){
        Period periodo = Period.between(dataDeNascimento, dataAtual);
        return String.format("%d anos, %d meses e %d anos",periodo.getYears(), periodo.getMonths(), periodo.getDays());
    };
}
