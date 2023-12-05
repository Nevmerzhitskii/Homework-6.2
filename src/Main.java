public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача №1");

        int monthContribution = 15000;
        int total = 0;
        int i = 0;

        while (total < 2549000) {

            total = total + total / 100;
            total = total + monthContribution;

            i = i + 1;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total);

        }

        System.out.println(" Задача №2");

        int a = 0;
        while (a <= 10) {
            System.out.print(" " + a + " ");
            a = a + 1;
        }
        System.out.println("");

        for (int b = 10; b > 0; b--) {
            System.out.print(" " + b + " ");
        }

        System.out.println("");


        System.out.println(" Задача №3");


        int population = 12_000_000;
        int fertilityYear = 204_000;
        int mortalityYear = -96_000;
        int populationDifferent = (fertilityYear + mortalityYear) + population;
        int year = 0;

        while (year < 10) {
            populationDifferent = populationDifferent + 1;
            year++;

            System.out.println("Год " + year + " численость населения составляет " + populationDifferent );
        }


        System.out.println(" Задача №4 №5");

        int savingAmount = 0;
        int cash = 15_000;
        int month = 1;


        while (savingAmount < 12000000) {
            savingAmount = savingAmount + 1;
            savingAmount = savingAmount + cash / 100 * 7;
            month++;

            if (month % 6 == 0) {

                System.out.println("Месяц " + month + " сумма накоплений " + savingAmount);
            }
        }

        System.out.println(" Задача №6");

        int saving = 0;
        int startCash = 15_000;
        int monthQuality = 1;

        while (monthQuality < 108 ){
            saving = saving + startCash / 100 *7;
            monthQuality ++;

            if (monthQuality % 6 == 0){

                System.out.println("Месяц " + monthQuality + " сумма накоплений " + saving );}

        }

        System.out.println(" Задача №7");

        int friday = 6;
        int day = 0;
        while (day < 31){
            day++;
            if (day % 7 == friday ){
                System.out.println(" Сегодня пятница " + day + " число, необходимо подготовить отчет. " );
            }
        }

        System.out.println(" Задача №8");



        int thisYear = 2023;
        int beforeYear = thisYear - 200;
        int futureYear = thisYear + 100;

       for ( int cycleYear = beforeYear; cycleYear <=futureYear; cycleYear ++){
           if ( cycleYear % 79 == 0){
               System.out.println(cycleYear);
           }
       }








































    }
}