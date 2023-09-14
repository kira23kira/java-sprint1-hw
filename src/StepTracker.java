import java.util.Scanner;
class StepTracker {
    int goalByStepsPerDay = 10000;
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    public void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month < 1) {
            System.out.println("Неверный ввод");
            return;
        } else if (month > 12) {
            System.out.println("Неверный ввод");
            return;
        }

        System.out.println("Введите день от 1 до 30 (включительно)");
        int day = scanner.nextInt();
        if (day < 1) {
            System.out.println("Неверный ввод");
            return;
        } else if (day > 30) {
            System.out.println("Неверный ввод");
            return;
        }

        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (steps < 0) {
            System.out.println("Неверный ввод");
            return;
        }
        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] = steps;
    }
    public void changeStepGoal() {
        System.out.println("Введите цель шагов на сегодня");
        goalByStepsPerDay = scanner.nextInt();
        if (goalByStepsPerDay <= 0) {
            System.out.println("Неверный ввод");
        }
        System.out.println("Цель на сегодня: " + goalByStepsPerDay);
    }

    void printStatistic() {
        System.out.println("Введите число месяца");
        int month = scanner.nextInt();// ввод и проверка номера месяца
        if (month <= 1 || month >= 12) {
            System.out.println("Неверный ввод");
            return;
        }
        MonthData monthData = monthToData[month - 1]; // получение соответствующего месяца
        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println();
        monthData.printDaysAndStepsFromMonth(); // вывод общей статистики по дням + суммы шагов за месяц
        System.out.println("Среднее кол-во шагов: " + (sumSteps / 30)); // ср за месяц
        System.out.println("Больше всего пройдено шагов: " + monthData.maxSteps()); // вывод максимального пройденного количества шагов за месяц
        System.out.println("Пройдено дистанции за месяц: " + Converter.convertToKm(sumSteps) + " км."); // вывод пройденной за месяц дистанции в км
        System.out.println("Сожжённых килокалорий за месяц: " + Converter.convertStepsToKilocalories(sumSteps)); // вывод количества сожжённых килокалорий за месяц
        System.out.println("Лучшая серия за месяц: " + monthData.bestSeries(goalByStepsPerDay)); // вывод лучшей серии ???
        System.out.println(); //дополнительный перенос строки
    }
}

