import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("asrdtdyu");

        Season arg = Season.SUMMER;
        metod(arg);
        for(Season season : Season.values()){
            if(season.hasSeason()){
                System.out.println("ecть куреснсити");
            }
            else {
                System.out.println("Нету Ничего");
            }
        }
            
    }


    public static void metod(Season arg){
        switch(arg){
            case WINTER:
                System.out.println("Наступила зима");
                break;
            case SUMMER:
                System.out.println("Лето");
                break;
            case SPRING:
                System.out.println("Весна");
                break;
            case BIBI:
                System.out.println("bibi");
                break;
    }
    }
}