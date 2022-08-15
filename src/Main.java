public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задание 1");

        int[] arr = new int[] {2, 4, 8, 12, 22, 54, 91};
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum +=arr[i]; {
            if (sum >= arr.length) {
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");}

    }

        System.out.println();
        System.out.println("Задание 2");


            int maxAmount = -1;
            int minAmount = 100;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] > maxAmount) {
                maxAmount = arr[k];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxAmount + " рублей");

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < minAmount) {
                minAmount = arr[j];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minAmount + " рублей");

    }
}





