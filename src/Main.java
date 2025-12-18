//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int studentCount = 150;
        System.out.println("Значение переменной studentCount с типом int равно " + studentCount);
        byte roomNumber = 12;
        System.out.println("Значение переменной roomNumber с типом byte равно " + roomNumber);
        short pageCount = 2048;
        System.out.println("Значение переменной pageCount с типом short равно " + pageCount);
        long bigNumber = 1234567890123L;
        System.out.println("Значение переменной bigNumber с типом long равно " + bigNumber);
        float temperature = 36.6f;
        System.out.println("Значение переменной temperature с типом float равно " + temperature);
        double piValue = 3.1415926535;
        System.out.println("Значение переменной piValue с типом double равно " + piValue);

        double value1 = 27.12;
        long value2 = 987678965549L;
        float value3 = 2.786f;
        short value4 = -159;
        short value5 = 569;
        byte value6 = 67;
        int value7 = 27897;


        int studentsLudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;
        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        int sheetsOfPaper = 480;
        int toEachStudent = sheetsOfPaper / totalStudents;
        System.out.println(" На каждого ученика рассчитано " +toEachStudent +" бумаги");

        int performanceMinutes2 = 16;
        System.out.println("За 2 минуты машина произвела 16штук бутылок" + performanceMinutes2);
        int performanceMinutes1 = performanceMinutes2 / 2;
        System.out.println("За 1 минуту машина произвела " + performanceMinutes1 + " штук бутылок");
        int performanceMinutes20 = performanceMinutes1*20;
        System.out.println("За 20 минут машина производит " + performanceMinutes20+ " штук бутылок ");
        int efficiency60 = performanceMinutes1 * 60;
        System.out.println(" За 60 минут машина произвела" + efficiency60 + " штук бутылок");
        int productivityPerDay = efficiency60 * 24;
        System.out.println(productivityPerDay);
        long performanceDays3=productivityPerDay*3;
        System.out.println(" За 3 дня машина производит " + performanceDays3+" штук бутылок");
        System.out.println ( " За 24 чсас машина произвела " + productivityPerDay + " штук бутылок");
        long productivityPerMonth = productivityPerDay * 30;
        System.out.println("За 1 месяц машина произвела " + productivityPerMonth + " штук бутылок");

        int totalCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int totalPerClass = whitePerClass + brownPerClass;
        System.out.println(totalPerClass+ " банок краски на класс ");
        int numberOfClasses = totalCans / totalPerClass;
        int whiteCans = whitePerClass * numberOfClasses;
        int brownCans = brownPerClass * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");

        int bananasWeight = 5 * 80;
        double milkWeight = (200.0 / 100) * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        double totalWeightGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double totalWeightKilograms = totalWeightGrams / 1000;
        System.out.println("Вес завтрака: " + totalWeightGrams +  " грамм");
        System.out.println("Вес завтрака: " + totalWeightKilograms  + " килограмм");

        int targetWeightLossKg = 7;
        int targetWeightLossGrams = targetWeightLossKg * 1000;
        int minDailyLoss = 250;
        int maxDailyLoss = 500;
        int daysWithMinLoss = targetWeightLossGrams / minDailyLoss;
        int daysWithMaxLoss = targetWeightLossGrams / maxDailyLoss;
        int averageDays = (daysWithMinLoss + daysWithMaxLoss) / 2;
        System.out.println("При потере 250 грамм в день: " + daysWithMinLoss + " дней");
        System.out.println("При потере 500 грамм в день: " + daysWithMaxLoss + " дней");
        System.out.println("В среднем: " + averageDays + " дней");

        double salaryMasha = 67760.0;
        double salaryDenis = 83690.0;
        double salaryKristina = 76230.0;

        double newSalaryMasha = salaryMasha * 1.1;
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristina = salaryKristina * 1.1;

        double annualIncreaseMasha = (newSalaryMasha - salaryMasha) * 12;
        double annualIncreaseDenis = (newSalaryDenis - salaryDenis) * 12;
        double annualIncreaseKristina = (newSalaryKristina - salaryKristina) * 12;

        System.out.println("Маша теперь получает " + (int)newSalaryMasha + " рублей. Годовой доход вырос на " + (int)annualIncreaseMasha + " рублей");
        System.out.println("Денис теперь получает " + (int)newSalaryDenis + " рублей. Годовой доход вырос на " + (int)annualIncreaseDenis + " рублей");
        System.out.println("Кристина теперь получает " + (int)newSalaryKristina + " рублей. Годовой доход вырос на " + (int)annualIncreaseKristina + " рублей");
    }
}