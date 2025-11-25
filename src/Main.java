import java.time.LocalDate;

class LeapYearChecker {
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName;

        if (osType == 0) {
            osName = "iOS";
        } else if (osType == 1) {
            osName = "Android";
        } else {
            System.out.println("Некорректный тип ОС");
            return;
        }

        if (deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + ".");
        } else {
            System.out.println("Установите полную версию приложения для " + osName + ".");
        }
    }
    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1; // Доставка в пределах 20 км занимает сутки
        } else if (distance <= 60) {
            return 2; // Доставка в пределах от 20 км до 60 км занимает 2 дня
        } else if (distance <= 100) {
            return 3; // Доставка в пределах от 60 км до 100 км занимает 3 дня
        } else {
            return 0;  // Свыше 100 км доставки нет
        }
    }


    public static void main(String[] args) {
        System.out.println("Задание №1");
        int year = 2021;
        checkLeapYear(year);
        System.out.println("Задание №2");
        int osType = 1;
        int deviceYear = 2025;
        suggestAppVersion(osType, deviceYear);
        System.out.println("Задание №3");
        int deliveryDistance = 95;
        int daysNeeded = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + daysNeeded);
    }
}