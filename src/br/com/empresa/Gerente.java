package br.com.empresa;
import Funcionário;


public class Gerente extends Funcionário {
		
		int senha;
		int numeroDeFuncionariosGerenciados;
		
		public Gerente(String nome, String cpf, double salario, int senha, int numeroFuncionario) {
			super(nome, cpf, salario);
			this.senha = senha;
			this.numeroFuncionario = numeroFuncionario;
		}

		public void ImprimeDados(){
			System.out.println("O nome é: " + this.nome);
			System.out.println("O CPF é: " + this.cpf);
			System.out.println("O seu salario é: " + this.salario);
			System.out.println("O sua senha é: " + this.senha);
			System.out.println("O número do funcionário é: "+ this.numeroFuncionario);
		}
	
		}





