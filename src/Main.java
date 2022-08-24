import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        leapYear();
        String osName = "iOS";
        getClientOS(osName);
        delDis(95);
    }
    // Задание 1
    public static void leapYear(){
        int year = 2009;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    // Задание 2
    public static int getClientOS(String name) {

            int currentYear = LocalDate.now().getYear();
            int clientOs = 1;
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

            if (name.equals("iOS")) {
                return 0;
            } else {
                return 1;
            }

        }
         // Задание 3
      public static int delDis(int x){
          int deliveryDays = 1;

          if (x > 20){
              deliveryDays++;
          }
          if (x > 60){
              deliveryDays++;
          }
          System.out.println("потребуется дней  " + deliveryDays);
          return 1;
      }

    }
