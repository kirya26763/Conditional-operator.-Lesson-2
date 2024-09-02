public class Main {
    public static void main(String[] args) {
        {
            int clientOS = 0;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        {
            int clientDeviceYear = 2013;
            int clientOS = 0;
            if (clientOS == 0) {
            } else if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (clientOS == 1) {
            } else if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        {
            int year = 2000;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
        {
            int deliveryDistance = 95;
            if (deliveryDistance > 100) {
                System.out.println("Доставки нет.");
            } else if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: " + 1);
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: " + 2);
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + 3);
            }
        }
        {
            int monthNumber = 13;
            switch (monthNumber) {
                case 1, 2, 12:
                    System.out.println("зима");
                    break;
                case 3, 4, 5:
                    System.out.println("весна");
                    break;
                case 6, 7, 8:
                    System.out.println("лето");
                    break;
                case 9, 10, 11:
                    System.out.println("осень");
                    break;
                default:
                    System.out.println("неверно задан месяц!");
            }
        }
    }

}


