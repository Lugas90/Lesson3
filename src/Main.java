public class Main {
    public static void main(String[] args) {

        // Задание 1:
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println ("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1){
            System.out.println ("Установите версию приложения для Android по ссылке");
          }

        // Задание 2:
        int OS = 0;
        int clientDeviceYear = 2013;
        if (OS == 0 && clientDeviceYear < 2015){
            System.out.println ("Установите облегченную версию приложения для IOS по ссылке");
        } else if (OS == 0 && clientDeviceYear >= 2015){
            System.out.println ("Установите версию приложения для IOS по ссылке");
          }
        if (OS == 1 && clientDeviceYear < 2015){
            System.out.println ("Установите облегченную версию приложения для Android по ссылке");
        } else if (OS == 1 && clientDeviceYear >= 2015) {
            System.out.println ("Установите версию приложения для Android по ссылке");
          }

        // Задание 3:
        int year = 2014;
        if (year % 400 ==0 && year % 4 == 0){
            System.out.println (year + "год вляется високосным");
        } else if (year % 100 != 0){
            System.out.println(year + "год не является високосным");
        }

        // Задание 4:
        int deliveryDistance = 95;
        int day = 0;
        if (deliveryDistance <=20){
           day+= 1;
           System.out.println("потребуется дней: " + day);

        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            day+= 2;
            System.out.println("потребуется дней: " + day);
          } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day+= 3;
            System.out.println("потребуется дней: " + day);
            }

        // Задание 5:
        int monthNumber = 9;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println ("принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println ("принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println ("принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println ("принадлежит к сезону осень");
                break;
            default:
                System.out.println ("Нет такого месяца");


        }


    }
}