package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainAluno {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate hoje = LocalDate.now();

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setRegistroMatricula(Integer.parseInt(JOptionPane.showInputDialog("RM: ")));
        aluno1.setNomeCompleto(JOptionPane.showInputDialog("Nome Completo: "));
        aluno1.setDataDeNascimento(LocalDate.parse(JOptionPane.showInputDialog("Data (dd/MM/yyyy): "), dtf));

        aluno2.setRegistroMatricula(Integer.parseInt(JOptionPane.showInputDialog("RM: ")));
        aluno2.setNomeCompleto(JOptionPane.showInputDialog("Nome Completo: "));
        aluno2.setDataDeNascimento(LocalDate.parse(JOptionPane.showInputDialog("Data (dd/MM/yyyy): "), dtf));

        Aluno aluno3 = new Aluno(562347, "Felipe Balbino Murad", LocalDate.of(2006, 10, 21));
        Aluno aluno4 = new Aluno(561686, "Lucas Mesquita Massoni", LocalDate.of(2007, 03, 06));

        String mensagem = String.format(
                "ALUNOS:\n\n" +
                        "RM: %d | Nome: %s | Data: %s\n" +
                        "RM: %d | Nome: %s | Data: %s\n" +
                        "RM: %d | Nome: %s | Data: %s\n" +
                        "RM: %d | Nome: %s | Data: %s",

                aluno1.getRegistroMatricula(), aluno1.getNomeCompleto(), aluno1.getDataDeNascimento().format(dtf),
                aluno2.getRegistroMatricula(), aluno2.getNomeCompleto(), aluno2.getDataDeNascimento().format(dtf),
                aluno3.getRegistroMatricula(), aluno3.getNomeCompleto(), aluno3.getDataDeNascimento().format(dtf),
                aluno4.getRegistroMatricula(), aluno4.getNomeCompleto(), aluno4.getDataDeNascimento().format(dtf)
        );

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
