package com.dsn.javarolesdice;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    Dice dice = new Dice();
	    Scanner scanner = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Digite \"Start\" para iniciar o jogo e os dados rolarem:");
        String resposta = scanner.nextLine();
        System.out.println("===============================================================");
        boolean isStarted = resposta.toLowerCase().equals("start");
        if( isStarted ){
            System.out.println("O primeiro dado resultou em: "+dice.showRandomNumber());
            System.out.println("O segundo dado resultou em: "+dice.showRandomNumber());
            System.out.println("===============================================================");
            System.out.println("Game Over!");
        }else{
            System.out.println("Volte quando desejar jogar.");
        }
    }
}
