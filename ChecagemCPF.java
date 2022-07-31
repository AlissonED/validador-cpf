package br.com.javaguard.delta.validadorcpf;

import java.util.Scanner;

public class ChecagemCPF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int calculo1, calculo2,resto, resto2 , d1, d2;
		String cpf;
		
		System.out.print("Insira o CPF : ");
		cpf = teclado.next();
	
		String p1 = cpf.substring(0, 1);//comando para divisão da string em strings menores //(inicio da substring  ,  fim da substring)
		String p2 = cpf.substring(1, 2);
		String p3 = cpf.substring(2, 3);
		String p4 = cpf.substring(3, 4);
		String p5 = cpf.substring(4, 5);
		String p6 = cpf.substring(5, 6);
		String p7 = cpf.substring(6, 7);
		String p8 = cpf.substring(7, 8);
		String p9 = cpf.substring(8, 9);
		
		int n1 = Integer.parseInt(p1);//comando para transformar cada string em inteiro
		int n2 = Integer.parseInt(p2);
		int n3 = Integer.parseInt(p3);
		int n4 = Integer.parseInt(p4);
		int n5 = Integer.parseInt(p5);
		int n6 = Integer.parseInt(p6);
		int n7 = Integer.parseInt(p7);
		int n8 = Integer.parseInt(p8);
		int n9 = Integer.parseInt(p9);
		
		calculo1 = (n1*10)+(n2*9)+(n3*8)+(n4*7)+(n5*6)+(n6*5)+(n7*4)+(n8*3)+(n9*2);
		resto=calculo1%11;
		
		if(resto<2) {
		d1=0;
		}else {
			d1=11-resto;
			
		}
		
		calculo2 = (n1*11)+(n2*10)+(n3*9)+(n4*8)+(n5*7)+(n6*6)+(n7*5)+(n8*4)+(n9*3)+(d1*2);
		resto2=calculo2%11;
		
		if(resto2<2) {
		d2=0;
		}else {
			d2=11-resto2;
			
		}
		
		System.out.print("O CPF fornecido foi: "+ cpf);
		System.out.printf("\nO CPF correto seria :" + cpf.substring(0,9) + d1 + d2);//substring(0,9) para mostrar cpf
		
		
		teclado.close();
		
	}

}
