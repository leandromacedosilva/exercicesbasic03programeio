/*Exercicio 03: programa pede e informa alguns dados simples de uma agenda*/

package com.exercicesbasic03programeio.view;

import java.io.PrintStream;
import java.util.Scanner;

import com.exercicesbasic03programeio.model.Agenda;

public class MainAgenda {
	public static void main(String[] args) {
		
		PrintStream pst = System.out;
		Scanner input = new Scanner(System.in);
		
		pst.println("INFORMACOES DA AGENDA");
		
		pst.print("DESCRICAO: ");
		String descricao = input.nextLine();
		
		pst.print("NOME: ");
		String nome = input.nextLine();
		
		pst.print("TELEFONE: ");
		String telefone = input.nextLine();
		
		pst.print("ENDERECO: ");
		String endereco = input.nextLine();
		
		pst.print("CEP: ");
		String cep = input.nextLine();
		
		Agenda agenda = new Agenda(descricao, nome, telefone, endereco, cep);
		agenda.agendaPrinter();
		
		input.close();
	}

}
