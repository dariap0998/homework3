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
          System.out.println("Задача 1");
          int a = 5000000;
          System.out.println("Значение переменной a с типом int равно " + a);
          byte b = 1;
          System.out.println("Значение переменной b с типом byte равно " + b);
          short k = -22000;
          System.out.println("Значение переменной k с типом short равно " + k);
          long d = 1_456_738_909;
          System.out.println("Значение переменной d с типом long равно " + d);
          float f = 3.03f;
          System.out.println("Значение переменной f с типом float равно " + f);
          double g = 3.21213;
          System.out.println("Значение переменной g с типом double равно " + g);

      }
      public static void task2 () {
          System.out.println("Задача 2");
          float apples = 27.12f;
          long shrimps = 987678965549L;
          double temp = 2.786;
          short cats = 569;
          short hours = -159;
          int days = 27897;
          byte years = 67;
          System.out.println("Числа " + apples + ", " +  shrimps + ", " +  temp + ", " + cats+ ", "  + hours + ", " + days + ", " + years + " инициализированы");
      }
      public static void task3 () {
          System.out.println("Задача 3");
          int classLudmila = 23;
          int classAnna = 27;
          int classEkaterina = 30;
          int paper = 480;
          int allStudents = classAnna + classEkaterina + classLudmila;
          int papersForOne = paper / allStudents;
          System.out.println("На каждого ученика рассчитано " + papersForOne + " листов бумаги.");

      }
      public static void task4() {
          System.out.println("Задача 4");
          byte bottle = 16;
          byte min = 2;
          byte bottlePerMin = (byte) (bottle / min);
          short bottlePer20Min = (short) (bottlePerMin * 20);
          System.out.println("За 20 минут машина произвела " + bottlePer20Min + " штук бутылок.");
          short bottlePerHour = (short) (bottlePer20Min * 3);
          short bottlePerDay = (short) (bottlePerHour * 24);
          System.out.println("За сутки машина произвела " + bottlePerDay + " штук бутылок.");
          int bottlePer3Days = bottlePerDay * 3;
          System.out.println("За 3 дня машина произвела " + bottlePer3Days + " штук бутылок.");
          int bottlePerMonth = bottlePer3Days * 10;
          System.out.println("За месяц машина произвела " + bottlePerMonth + " штук бутылок.");

      }
      public static void task5() {
          System.out.println("Задача 5");
          byte allPainCan = 120;
          byte whiteCanPerClass = 2;
          byte brownCanPerClass = 4;
          byte CansPerClass = (byte) (whiteCanPerClass + brownCanPerClass);
          byte classes = (byte) (allPainCan / CansPerClass);
          byte whiteCans = (byte) (classes * whiteCanPerClass);
          byte brownCans = (byte) (classes * brownCanPerClass);
          System.out.println("В школе, где " + classes + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски.");

      }
      public static void task6() {
          System.out.println("Задача 6");
          byte bananas = 5;
          short bananasWeight = (short) (bananas * 80);
          short milk = 200;
          short milkWeight = (short) (milk / 100 * 105);
          byte iceCream = 2;
          short iceCreamWeight = (short) (iceCream * 100);
          byte eggs = 4;
          short eggsWeight = (short) (eggs * 70);
          short breakfastWeight = (short) (bananasWeight + milkWeight + iceCreamWeight + eggsWeight);
          System.out.println("Вес завтрака в граммах равен " + breakfastWeight + " гр.");
          float breakfastKilograms = breakfastWeight / 1000F;
          System.out.println("Вес завтрака в килограммах равен " + breakfastKilograms + " кг.");

      }
      public static void task7() {
          System.out.println("Задача 7");
          byte needToLose = 7;
          short losePerDay1 = 250;
          short losePerDay2 = 500;
          short kgToGrams = (short) (needToLose * 1000); //7000
          double daysNeeded1 = (double) kgToGrams / losePerDay1; //28
          double daysNeeded2 = (double) kgToGrams / losePerDay2; //14
          double loseWeightAvgPerDay = (losePerDay1 + losePerDay2) / 2D;
          double avrDays = kgToGrams / loseWeightAvgPerDay;
          System.out.println("Максимальное количество дней, чтобы спортсмен сбросил 7 кг "  + daysNeeded1 + " дней.");
          System.out.println("Минимальное количество дней, чтобы спортсмен сбросил 7 кг " + daysNeeded2 + " дней.");
          System.out.println("Чтобы сбросить 7 кг, спортсмену потребуется в среднем " + avrDays + " день.");

      }
      public static void task8() {
          System.out.println("Задача 8");
          int mashaSalary = 67760;
          int denisSalary = 83690;
          int kristinaSalary = 76230;
          double index = 1.1;
          double newMashaSalary = mashaSalary * index;
          int differenceMasha = (int) newMashaSalary - mashaSalary;
          int yearMashaSalary = differenceMasha * 12;
          System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + yearMashaSalary + " рублей.");
          double newDenisSalary = denisSalary * index;
          int differenceDenis = (int) newDenisSalary - denisSalary;
          int yearDenisSalary = differenceDenis * 12;
          System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + yearDenisSalary + " рубей.");
          double newKristinaSalary = kristinaSalary * index;
          int differenceKristina = (int) newKristinaSalary - kristinaSalary;
          int yearKristinaSalary = differenceKristina * 12;
          System.out.println("Кристина теперь получает " + newKristinaSalary + "рублей. Годовой доход вырос на " + yearKristinaSalary + " рублей.");

      }
}