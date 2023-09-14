class MonthData {
    static int[] days = new int[30];

    static void printDaysAndStepsFromMonth() {
        System.out.println("Статистика шагов за месяц: ");

        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день: " + days[i]);
        }
    }

    static int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
        }
        return sumSteps;

    }

    static int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }
    static int bestSeries() {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            //finalSeries = currentSeries < days[i];
        }
        return finalSeries;
    }
}
