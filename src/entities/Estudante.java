package entities;

public class Estudante {
	// Variaveis ==============================================================
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	
	// Construtores ===========================================================
	public Estudante() {
		
	}
	
	public Estudante(String nome, double n1, double n2, double n3) {
		this.nome=nome;
		this.nota1=n1;
		this.nota2=n2;
		this.nota3=n3;
	}

	// Getters & Setters ======================================================
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	// Metodos ================================================================
	public double notaFinal() {
		return nota1+nota2+nota3;
	}
	
	public String resultado() {
		if(notaFinal() >= 60) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}
	
	public double pontosFaltantes() {
		return 60 - notaFinal();
	}
}
