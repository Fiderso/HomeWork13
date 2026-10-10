import java.time.LocalDate;

public class Main {
    public void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        var year = 1904;
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584.");
        } else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год является высокосным, ваш год: " + year);
        } else {
            System.out.println("Год не является высокосным, ваш год: " + year);
        }
    }

    public void task2() {
        int clientDeviceYear = LocalDate.now().getYear();
        byte clientOs = 1;
        if (clientOs == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void task3() {
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance >= 100) {
            System.out.println("Доставка недоступна");
        } else if (deliveryDistance > 60) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}