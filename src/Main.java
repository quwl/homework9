public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] waste = {12, 31, 12, 32, 24};
        int sum = 0;
        for (int i : waste) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Task 2");
        int[] waste1 = {32, 12, 76, 54, 30};
        int max = waste1[0];
        int min = waste1[0];
        for (int j : waste1) {
            if (j > max) {
                max = j;
                System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
            }
        }
        for (int i : waste1) {
            if (i < min) {
                min = i;
                System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
            }
        }
        System.out.println("Task 3");
        int[] waste2 = {92, 32, 54, 23, 12};
        double averageWaste = 0;
        double sumM = 0;
        for (int i : waste2) {
            sumM += i;
            averageWaste = sumM / waste2.length;
        }
        System.out.println("Срудняя сумма трат за месяц составила " + averageWaste + " рублей");
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int h = reverseFullName.length - 1; h >= 0; h--) {
            System.out.print(reverseFullName[h]);
        }
    }
}
