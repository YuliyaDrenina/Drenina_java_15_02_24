package ua.hillel.drenina.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Введвть назву першої команди  ");
        String firstTeem = scanner.next();
        System.out.println("Ведіть фраги команди "+firstTeem);

        int player1Teem1 = Integer.parseInt(scanner.next());
        int player2Teem1 = Integer.parseInt(scanner.next());
        int player3Teem1 = Integer.parseInt(scanner.next());
        int player4Teem1 = Integer.parseInt(scanner.next());
        int player5Teem1 = Integer.parseInt(scanner.next());

        System.out.print("Введвть назву другої команди  ");

        String secondTeem = scanner.next();
        System.out.println("Ведіть фраги команди "+secondTeem);
        int player1Teem2 = Integer.parseInt(scanner.next());
        int player2Teem2 = Integer.parseInt(scanner.next());
        int player3Teem2 = Integer.parseInt(scanner.next());
        int player4Teem2 = Integer.parseInt(scanner.next());
        int player5Teem2 = Integer.parseInt(scanner.next());

        int serednBalFirstTeem = (player1Teem1 + player2Teem1 + player3Teem1
                + player4Teem1 + player5Teem1) / 5;
        int serednBalSecondTeem = (player1Teem2 + player2Teem2 + player3Teem2
                + player4Teem2 + player5Teem2) / 5;

        int balFirstTeem = player1Teem1 + player2Teem1 + player3Teem1
                + player4Teem1 + player5Teem1;
        int balSecondTeem = player1Teem2 + player2Teem2 + player3Teem2
                + player4Teem2 + player5Teem2;

        System.out.println("first teem ="+serednBalFirstTeem + "   second teem ="+serednBalSecondTeem);

        if(serednBalFirstTeem==serednBalSecondTeem){
            System.out.println("Нічия!!!");
        }else {
            if (serednBalFirstTeem > serednBalSecondTeem) {
                System.out.println("Перемогла команда " + firstTeem  + " набрала " + serednBalFirstTeem + " очків");
            } else {
                System.out.println("Перемогла команда " + secondTeem  + " набрала " + serednBalSecondTeem + " очків");
            }
        }
    }
}
