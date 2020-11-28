package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;


/*
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
   (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
   ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
   para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
   resolver este problema.
 * 
 */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Estudante e = new Estudante();
		
		System.out.print("Nome: ");
		e.setNome(sc.nextLine());
		
		System.out.print("Primeira nota (0-30): ");
		e.setNota1(sc.nextDouble());
		
		System.out.print("Segunda nota (0-35): ");
		e.setNota2(sc.nextDouble());
		
		System.out.print("Terceira nota (0-35): ");
		e.setNota3(sc.nextDouble());
		
		System.out.println();
		System.out.printf("Nota Final: %.2f%n", e.notaFinal());
		System.out.println(e.resultado());
		
		if(e.resultado() == "Reprovado") {
			System.out.printf("Faltaram %.2f pontos", e.pontosFaltantes());
		}
		sc.close();
	}

}
