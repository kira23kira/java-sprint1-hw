class MonthData {
    static int[] days = new int[30];

    public static void printDaysAndStepsFromMonth() {
        System.out.println("Статистика шагов за месяц: ");

        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день: " + days[i]);
        }
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
        }
        System.out.println("Всего пройдено шагов:" + sumSteps);
    }

    public static int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

}
