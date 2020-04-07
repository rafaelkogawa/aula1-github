package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, qual seu nome ? ");
		String name = sc.nextLine();
		if (name ==  " monica " ) {
			System.out.println("Que nome lindo, Monica");
		} else {
			System.out.println("Tenha um bom dia " + name);
		}
sc.close();
	}

}
