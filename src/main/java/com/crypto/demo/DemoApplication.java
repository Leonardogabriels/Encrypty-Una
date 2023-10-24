package com.crypto.demo;

import java.util.Scanner;

import org.jasypt.util.text.BasicTextEncryptor;

public class DemoApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		BasicTextEncryptor encryptor = new BasicTextEncryptor();
		encryptor.setPassword("minhaChaveDeEncriptacao");
		
		System.out.print("Informe seu nome: ");
		String nome = scanner.nextLine();
		String textoCriptografado = encryptor.encrypt(nome);
		System.out.println("Nome Crptografado" + textoCriptografado);
		String textoDescriptografado = encryptor.decrypt(textoCriptografado);
		System.out.println("Nome Descriptografado: " + textoDescriptografado );

		System.out.println();
		System.out.print("Informe o seu curso: ");
		String curso = scanner.nextLine();
		textoCriptografado = encryptor.encrypt(curso);
		System.out.println("Nome Crptografado" + textoCriptografado);
		textoDescriptografado = encryptor.decrypt(textoCriptografado);
		System.out.println("Nome Descriptografado: " + textoDescriptografado );

		System.out.println();
		System.out.print("O que você deseja pro seu futuro: ");
		String futuro = scanner.nextLine();
		textoCriptografado = encryptor.encrypt(futuro);
		System.out.println("Nome Crptografado" + textoCriptografado);
		textoDescriptografado = encryptor.decrypt(textoCriptografado);
		System.out.println("Nome Descriptografado: " + textoDescriptografado );
		scanner.close();
		
	}

}
