package ua.hillel.drenina.lessons.lesson6;

public class Main {
    public static void main(String[] args) {
        String firstTeem = "Leleki";
        int player1Teem1 = 5;
        int player2Teem1 = 7;
        int player3Teem1 = 7;
        int player4Teem1 = 3;
        int player5Teem1 = 8;

        String secondTeem = "Bobru";
        int player1Teem2 = 19;
        int player2Teem2 = 6;
        int player3Teem2 = 2;
        int player4Teem2 = 1;
        int player5Teem2 = 4;

        int serednBalFirstTeem = (player1Teem1 + player2Teem1 + player3Teem1
                + player4Teem1 + player5Teem1) / 5;
        int serednBalSecondTeem = (player1Teem2 + player2Teem2 + player3Teem2
                + player4Teem2 + player5Teem2) / 5;

        int balFirstTeem = player1Teem1 + player2Teem1 + player3Teem1
                + player4Teem1 + player5Teem1;
        int balSecondTeem = player1Teem2 + player2Teem2 + player3Teem2
                + player4Teem2 + player5Teem2;

        System.out.println("first teem ="+balFirstTeem + "   second teem ="+balSecondTeem);
//        System.out.println(balFirstTeem > balSecondTeem);

        if(balFirstTeem==balSecondTeem){
            System.out.println("Нічия!!!");
        }else {
            if (balFirstTeem > balSecondTeem) {
                System.out.println("Перемогла команда " + firstTeem  + " набрала " + balFirstTeem + " очків");
            } else {
                System.out.println("Перемогла команда " + secondTeem  + " набрала " + balSecondTeem + " очків");
            }
        }
    }
}
