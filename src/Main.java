public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.println();
        System.out.println("Задание 1");

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

            System.out.println("Сумма трат за месяц составила " + sum + " рублей");



        System.out.println();
        System.out.println("Задание 2");

        int maxAmount = -1;
        int minAmount = 300_000;
        for (int k = 0; k < arr.length; k++)
            if (arr[k] > maxAmount) {
                maxAmount = arr[k];
            }


            System.out.println("Максимальная сумма трат за день составила " + maxAmount + " рублей");


        for (int j = 0; j < arr.length; j++)
            if (arr[j] < minAmount) {
                minAmount = arr[j];
            }

            System.out.println("Минимальная сумма трат за день составила " + minAmount + " рублей");


        System.out.println();
        System.out.println("Задание 3");

        double sumAver = 0;

        for (int n = 0; n < arr.length; n++) {
            sumAver += arr[n]/arr.length;
        }

            System.out.println("Средняя Сумма трат за месяц составила " + sumAver + " рублей");

        System.out.println();
        System.out.println("Задание 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

        System.out.println();
        System.out.println("Задание 5");

        int digits [][] = {{1, 0, 1},{0, 1, 0}, {1, 0, 1}};
            for (int i=0;i < digits.length;i++){
                for (int j=0; j < digits.length; j++){
        System.out.print(digits[i][j]);}
                System.out.println();}


        System.out.println();
        System.out.println("Задание 6");
    }
}







