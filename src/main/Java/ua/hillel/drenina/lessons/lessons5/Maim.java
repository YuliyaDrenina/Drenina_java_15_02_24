package ua.hillel.drenina.lessons.lessons5;

public class Maim {
    public static void main(String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int horsemanLi = 46;
        int warriorMin =9;
        int archerMin =35;
        int horsemanMin =12;
        int q =860;


        long attackLi = q*(warriorLi+archerLi+horsemanLi);
        double attackMin = q*1.5*(warriorMin+archerMin+horsemanMin);
        System.out.println("attackLi="+attackLi);
        System.out.println("attackMin="+attackMin);








    }


}
