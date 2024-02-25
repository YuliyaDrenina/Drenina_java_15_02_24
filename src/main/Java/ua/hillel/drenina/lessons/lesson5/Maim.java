package ua.hillel.drenina.lessons.lesson5;

public class Maim {
    public static void main(String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int horsemanLi = 46;
        int warriorMin =9;
        int archerMin =35;
        int horsemanMin =12;
        int q =860;
        int a=37;
        boolean flag=true;




        long attackLi = q*(warriorLi+archerLi+horsemanLi);
        long attackMin = (long) (q*1.5*(warriorMin+archerMin+horsemanMin));
        System.out.println("attackLi="+attackLi);
        System.out.println("attackMin="+attackMin);








    }


}
