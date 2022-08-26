import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        printLeapYear(2019);
        printClientOS(1, LocalDate.now().getYear());
        System.out.println("Потребуется дней: - " + printDelDis( 95));

    }
    // Задание 1
    private static void printLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    // Задание 2
    private static void printClientOS(int clientOs, int currentYear ) {
        if (clientOs == 1) {
            if (currentYear < 2015){
                System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
            } else {
                System.out.println("«Установите версию приложения для Android по ссылке».");
            }
        } else {
            if (clientOs == 0) {
                if (currentYear < 2015) {
                    System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
                } else {
                    System.out.println("«Установите версию приложения для iOS по ссылке».");
                }
            }
        }
        }
         // Задание 3
     private static int printDelDis(int deliveryDistance){
          int deliveryDays = 1;

          if (deliveryDistance > 20){
              deliveryDays++;
          }
          if (deliveryDistance > 60){
              deliveryDays++;
          }
          return deliveryDays;
      }

    }
