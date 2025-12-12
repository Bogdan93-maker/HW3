//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte bananas = 7;
        System.out.println(bananas);
        short oranges = 500;
        System.out.println(oranges);
        int mandarins = 50000;
        System.out.println(mandarins);
        long grapefruits = 50000000000L;
        System.out.println(grapefruits);
        float apricots = 3.5F;
        System.out.println(apricots);
        double apples = 1.6E4;
        System.out.println(apples);

        double value1 = 27.12;
        long value2 = 987678965549L;
        float value3 = 2.786f;
        short value4 = -159;
        short value5 = 569;
        byte value6 = 67;
        int value7 = 27897;


        var studentsLudmila = 23;
        System.out.println(studentsLudmila);
        var studentsAnna = 27;
        System.out.println(studentsAnna);
        var studentsEkaterina = 30;
        System.out.println(studentsEkaterina);
        var totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        System.out.println(totalStudents);
        var SheetsOfPaper = 480;
        System.out.println(SheetsOfPaper);
        var toEachStudent = SheetsOfPaper / totalStudents;
        System.out.println(toEachStudent);

        var PerformanceMinutes2 = 16;
        System.out.println("За 2 минуты машина произвела 16штук бутылок" + PerformanceMinutes2);
        var PerformanceMinutes1 = PerformanceMinutes2 / 2;
        System.out.println("За 1 минутe машина произвела 8штук бутылок" + PerformanceMinutes1);
        var efficiency60 = PerformanceMinutes1 * 60;
        System.out.println("За 60 минут машина произвела" + efficiency60 + "штук бутылок");
        var ProductivityPerDay = efficiency60 * 24;
        System.out.println("За 24 чсас машина произвела" + ProductivityPerDay + "штук бутылок");
        var ProductivityPerMonth = ProductivityPerDay * 30;
        System.out.println("За 1 месяц машина произвела" + ProductivityPerMonth + "штук бутылок");

        var InTotal = 120;
        System.out.println("нужно" + InTotal + "банок краски");
        var white = 2;
        System.out.println("нужно белой краски" + white + "банки");
        var brown = 4;
        System.out.println("коричневой краски нужно" + brown + "банки");
        var office1 = white + brown;
        System.out.println("всего банок нужно на 1 кабинет " + office1);
        var office2 = InTotal / office1;
        System.out.println(office2 + " кабинетов в школе");
        var white2 = office2 * white;
        System.out.println(white2);
        var brown2 = office2 * brown;
        System.out.println(brown2);
        System.out.println("В школе, где " + office2 + " классов, нужно " + white2 + " банок белой краски и " + brown2 + " банок коричневой краски");


        var banana1 = 80;
        System.out.println(banana1 + "грамм");
        var banana5 = 80 * 5;
        System.out.println("Нужно на завтрак  " + banana5 + " грамм бананов");
        var milk1 = 105;
        System.out.println("Масса 100 мл. молока составляет " + milk1 + " грамм");
        var milk2 = milk1 * 2;
        System.out.println(" Нужно на завтрак " + milk2 + " грамм молока ");
        var IceCreamSundae1 = 100;
        System.out.println(IceCreamSundae1);
        var IceCreamSundae2 = IceCreamSundae1 * 2;
        System.out.println("Нуно на завтрак " + IceCreamSundae2 + " грамм мороженого-пломбир");
        var egg = 70;
        System.out.println(egg);
        var egg2 = egg * 4;
        System.out.println("нужно на завтрак " + egg2 + " грамм сырых яиц");
        var BreakfastMass1 = banana5 + milk2 + egg2 + IceCreamSundae2;
        System.out.println(BreakfastMass1 + " грамм составляет завтрак спортсмена ");
        var BreakfastMass2 = BreakfastMass1 / 1000;
        System.out.println(BreakfastMass2 + " килограмм составлят завтрак спортсмена");


        var weight1 = 7;
        System.out.println(" Нужно сбросить " + weight1 + "килограмм");
        var weight2 = weight1 * 1000;
        System.out.println("Нужно сбросить " + weight2 + "грамм");
        var lossPerDayMin = 250;
        System.out.println(lossPerDayMin + " грамм в день");
        var lossPerMonthMax = 500;
        System.out.println(lossPerMonthMax + " грамм в день");
        var lossPerWeekMin2 = weight2 / lossPerDayMin;
        System.out.println(lossPerWeekMin2 + " дней");
        var lossPerWeekMax2 = weight2 / lossPerMonthMax;
        var daysOnAverage = (lossPerWeekMax2 + lossPerWeekMin2) / 2;
        System.out.println(daysOnAverage + " дней в среднем понадобится для достижения результата.");

        var salaryMasha = 67760.0;
        System.out.println(salaryMasha + " рублей в месяц зарплата у Маши");
        var salaryDenis = 83690.0;
        System.out.println(salaryDenis + " рублей зарплата у Дениса");
        var salaryKristina = 76230.0;
        System.out.println(salaryKristina + " рублей зарплата у Кристины");
        var newSalaryMasha = salaryMasha * 1.1;
        System.out.println(newSalaryMasha + " рублей будет зарплата у Маши после увеличения на 10%");
        var newSalaryDenis = salaryDenis * 1.1;
        System.out.println(newSalaryDenis + " рублей будет зарплата у Дениса после увеличения на 10%");
        var newSalaryKristina = salaryKristina * 1.1;
        System.out.println(newSalaryKristina + " рублей будет зарплата у Кристины после увеличения на 10%");
        var annualIncreaseMasha = (newSalaryMasha - salaryMasha) * 12;
        System.out.println(annualIncreaseMasha + " рублей разница между годовым доходом с нынешней зарплатой и после повышения у Маши.");
        var annualIncreaseDenis = (newSalaryDenis - salaryDenis) * 12;
        System.out.println(annualIncreaseDenis + " рублей разница между годовым доходом с нынешней зарплатой и после повышения у Дениса");
        var annualIncreaseKristina = (newSalaryKristina - salaryKristina) * 12;
        System.out.println(annualIncreaseKristina + " рублей разница между годовым доходом с нынешней зарплатой и после повышения у Кристины");
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + annualIncreaseMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + annualIncreaseDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + annualIncreaseKristina + " рублей");

    }
}