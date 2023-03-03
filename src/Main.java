public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void task1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }


    public static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int maxSpendingPerDay = 99999;
        int minSpendingPerDay = 200001;
        for (int spending : arr) {
            if (spending > maxSpendingPerDay) {
                maxSpendingPerDay = spending;
            }
        }
       for (int spending1 : arr){
           if (spending1 < minSpendingPerDay) {
               minSpendingPerDay = spending1;}
           }
        System.out.println( "Минимальная сумма трат за день составила " + minSpendingPerDay + " рублей. Максимальная сумма трат за день составила  " + maxSpendingPerDay +"  рублей");
       }


    public static void task3(){
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int day = arr.length;
        for (int element : arr) {
            sum += element;
        }
        double average = sum / day;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }



    public static void task4(){
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int index = reverseFullName.length - 1;
        for (int i = index; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}




