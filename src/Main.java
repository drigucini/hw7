public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Task 1");
        int total = 0;
        int save = 15_000; // roubles
        int months = 0;
        while (total < 2_459_000) {
            total += save;
            months ++;
            System.out.println("Month #" + months + ", the amount of savings is " + total + " roubles");
        }
    }

    public static void task2 () {
        System.out.println("\nTask 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        i = i - 1;
        for (; i > 0; i = i-1) {
            System.out.print(i + " ");
        }
    }

    public static void task3 () {
        System.out.println("\nTask 3");
        long population = 12_000_000L;
        int birth = 17; // per 1000 ppl
        int death = 8;
        int growth = birth - death;
        int years = 0;
        while (years < 10) {
            population += population/1000*growth;
            years++;
            System.out.println("Year #" + years + " , population is " + population);
        }
    }

    public static void task4 () {
        System.out.println("\nTask 4");
        double total = 15_000; // initial deposit
        int save = 15_000; // roubles
        int months = 0;
        float interest = 1.07f; //interest per month
        while (total < 12_000_000) {
            total = total * interest;
            total += save;
            months ++;
            System.out.printf("Month #%d the amount of savings is %.0f roubles\n", months, total);
        }
    }

    public static void task5 () {
        System.out.println("\nTask 5");
        double total = 15_000; // initial deposit
        int save = 15_000; // roubles
        int months = 0;
        float interest = 1.07f; //interest per month
        while (total < 12_000_000) {
            total = total * interest;
            total += save;
            months ++;
            if (months%6 == 0) {
                System.out.printf("Month #%d the amount of savings is %.0f roubles\n", months, total);
            }
        }
        System.out.printf("Month #%d the amount of savings is %.0f roubles\n", months, total);
    }

    public static void task6 () {
        System.out.println("\nTask 6");
        double total = 15_000; // initial deposit
        int save = 15_000; // roubles
        int months = 0;
        float interest = 1.07f; //interest per month
        while (months < 108) {
            total = total * interest;
            total += save;
            months ++;
            if (months%6 == 0) {
                System.out.printf("Month #%d the amount of savings is %.0f roubles\n", months, total);
            }
        }
    }

    public static void task7 () {
        System.out.println("\nTask 7");
        int firstFriday = 3; //day of hte month of the first Friday
        int dayOfMonth = firstFriday;
        while (dayOfMonth <= 31) {
            if (dayOfMonth == 1 || dayOfMonth == 21 || dayOfMonth == 31) {
                System.out.println("Today is Friday, the " + dayOfMonth + "st. Time to prepare a report");
            } else if (dayOfMonth == 2 || dayOfMonth == 22) {
                System.out.println("Today is Friday, the " + dayOfMonth + "nd. Time to prepare a report");
            } else if (dayOfMonth == 3 || dayOfMonth == 23){
                System.out.println("Today is Friday, the " + dayOfMonth + "rd. Time to prepare a report");
            } else {
                System.out.println("Today is Friday, the " + dayOfMonth + "th. Time to prepare a report");
            }
            dayOfMonth += 7;
        }

    }

    public static void task8 () {
        System.out.println("\nTask 8");
        int year = 0;
        int comet = 79; //years
        int currentYear = 2022;
        while (year < currentYear + 100) {
            year += comet;
            if (year > currentYear - 200 && year < currentYear + 100) {
                System.out.println(year);
            }

        }
    }
}