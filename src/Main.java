import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер группы: ");
        int n = scan.nextInt();
        System.out.print("Введите ограничение по весу: ");
        int limit = scan.nextInt();
        int[] arr = new int[n]; //кол-во чел-к в группе
        int qty = 0;
        inputWeight(arr, limit);     //ввод весов группы, с ограничением по весу
        System.out.println("Группа из " + n + " человек с весами: " + Arrays.toString(arr));
        //countBaidarki(arr, limit);
        System.out.println("Требуется " + countBaidarki(arr, qty, limit) + " лодок");
    }

    private static int countBaidarki(int[] arr, int qty, int limit) {
        int i = 0;                       //текущий элемент
        int qty2 = 0;

        while (i <= arr.length) {
            if ((arr[i] + arr[arr.length-1]) <= limit) {
                qty2++;
                i++;
                i++;
            } else {
                qty2++;
                i++;
            }
        }
        return qty2;
        //System.out.println("Требуется " + qty2 + " байдарки");
    }

    //private static void inputWeight(int[] arr) {    }

    public static void inputWeight(int[] arr, int limit) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите массу каждого чел-ка: ");
        //int arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            System.out.println("Количество участников:"+i);
            if (arr[i] > limit) {
                System.out.println("Превышение ограничения по весу");
                System.out.println("замените участника похода");
                i--;
            }
        }
        Arrays.sort(arr);
        countBaidarki(arr, limit);
        //return arr;
    }
}


/* Компания из N человек собирается пойти в байдарочный поход, i-ый человек характеризуется
своей массой Mi кг. На лодочной базе имеется в наличии неограниченное количество одинаковых
байдарок. Каждая байдарка может вмещать одного или двух людей. Байдарки имеют
грузоподъемность D кг. Какое наименьшее количество байдарок придется арендовать компании,
 чтобы всем отправиться в поход?

 Компания из N=4 человек весом M: 50 74 60 82
 D-ограничение =135кг.
 */