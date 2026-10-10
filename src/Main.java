import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printLeapYearResult();
        printAppInstallation();

        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        if (deliveryDays == -1) {
            System.out.println("Доставка недоступна");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    public static void printLeapYearResult() {
        int year = 1904;

        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584.");
        } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год является високосным, ваш год: " + year);
        } else {
            System.out.println("Год не является високосным, ваш год: " + year);
        }
    }

    public static void printAppInstallation() {
        int clientDeviceYear = LocalDate.now().getYear();
        byte clientOs = 1;

        if (clientOs == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else if (clientOs == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        } else {
            System.out.println("Неизвестная операционная система.");
        }
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 0 || deliveryDistance >= 100) {
            return -1;
        } else if (deliveryDistance > 60) {
            return 3;
        } else if (deliveryDistance > 20) {
            return 2;
        } else {
            return 1;
        }
    }
}