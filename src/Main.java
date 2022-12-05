public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " +sum+ " рублей");
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма затрат за день " +max+ " рублей");
        int min = 0;
        for (int i = 0; i < arr.length;i++){
            if ( min > arr[i])
                min = arr[i];
        }
        System.out.println("Минимальная сумма затрат за день " +min+ " рублей");
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i] / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц " +total+ " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}