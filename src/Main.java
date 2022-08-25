import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        getLeapYear(2021);
        getClientOS(1);
        getDelDis(95);
    }
    // Задание 1
    private static int getLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        return year;
    }

    // Задание 2
    private static int getClientOS(int clientOs) {

            int currentYear = LocalDate.now().getYear();
        if (clientOs == 1 && currentYear > 2015) {
                System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
            } else {
                System.out.println("«Установите версию приложения для Android по ссылке».");
            }

            if (clientOs == 0 && currentYear > 2015) {
                System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
                } else {
                    System.out.println("«Установите версию приложения для iOS по ссылке».");
                }
            return clientOs;
        }
         // Задание 3
     private static int getDelDis(int dayDel){
          int deliveryDays = 1;

          if (dayDel > 20){
              deliveryDays++;
          }
          if (dayDel > 60){
              deliveryDays++;
          }
          System.out.println("потребуется дней  " + deliveryDays);
          return dayDel;
      }

    }
