package com.github.felixcolombo.dataporextenso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataPorExtenso {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	private String dataDigitada;
	String[] dataSplit; 
	private String mesExtenso;
	private int mes;
	private int dia;
	private int ano;
	private boolean erro;
	
		
	public void dataExtenso() {
		
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		do {
			erro = false;
			
			System.out.println("Digite uma data: (DD/MM/AAAA)");
			dataDigitada = keyboard.nextLine();
			
			dataSplit = dataDigitada.split("/");
			
			dia = Integer.parseInt(dataSplit[0]);
			mes = Integer.parseInt(dataSplit[1]);
			ano = Integer.parseInt(dataSplit[2]);
			
			if((dia<1)||(dia>31)) {
				System.out.println("Dia inválido!");
				erro = true;
			}else {
				if((mes<1) || (mes>12)) {
					System.out.println("Mês inválido! Digite novamente!");
					erro = true;
				}else {
					if(mes==2) {
						if(((ano%4!=0) && (dia>28)) || ((ano%4==0) && (dia>29))) {
							System.out.println("Dia do mês de fevereiro inválido!");
							erro = true;
						}
					}
				}
			}
		}while(erro);
		
		try {
			Date data = formatoData.parse(dataDigitada);
			
			switch(dataSplit[1]) {
			case "01": 
				mesExtenso = ("janeiro");
				break;
			case "02": 
				mesExtenso = ("fevereiro");
				break;
			case "03": 
				mesExtenso = ("março");
				break;
			case "04": 
				mesExtenso = ("abril");
				break;
			case "05": 
				mesExtenso = ("maio");
				break;
			case "06": 
				mesExtenso = ("junho");
				break;
			case "07": 
				mesExtenso = ("julho");
				break;
			case "08": 
				mesExtenso = ("agosto");
				break;
			case "09": 
				mesExtenso = ("setembro");
				break;
			case "10": 
				mesExtenso = ("outubro");
				break;
			case "11": 
				mesExtenso = ("novembro");
				break;
			case "12": 
				mesExtenso = ("dezembro");
				break;
				
			case "1": 
				mesExtenso = ("janeiro");
				break;
			case "2": 
				mesExtenso = ("fevereiro");
				break;
			case "3": 
				mesExtenso = ("março");
				break;
			case "4": 
				mesExtenso = ("abril");
				break;
			case "5": 
				mesExtenso = ("maio");
				break;
			case "6": 
				mesExtenso = ("junho");
				break;
			case "7": 
				mesExtenso = ("julho");
				break;
			case "8": 
				mesExtenso = ("agosto");
				break;
			case "9": 
				mesExtenso = ("setembro");
				break;
			
			}
		
		System.out.printf("A data %s por extenso é: %s de %s de %s!", dataDigitada, dataSplit[0], mesExtenso, dataSplit[2]);
				
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Data Inválida!!");
			System.out.println(dataSplit);
		}
		

	}
}
