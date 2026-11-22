import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер группы: ");
        int n = scan.nextInt();
        System.out.print("Введите ограничение по весу: ");
        int limit = scan.nextInt();
        int[] arr = new int[n]; //кол-во чел-к в группе
        int qty=0;
        inputWeight(arr);     //ввод весов группы, с ограничением по весу
        System.out.println("Группа из " + n + " человек с весами: " + Arrays.toString(arr));
        countBaidarki(qty);
        System.out.println("Требуется " + qty + " лодок");
    }

    private static int countBaidarki(int[] arr, int qty, int limit) {
        int i = 0;                       //текущий элемент

        while
        (i < arr.length);{
            if (arr[i] + arr[arr.length - i] <= limit) {
                qty++;
                i++;
                i++;
            } else {
                qty++;
                i++;
            }
        }
        return qty;
    }

    //private static void inputWeight(int[] arr) {    }

    public static int[] inputWeight(int[] arr, int limit) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите массу каждого чел-ка: ");
        //int arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > limit) {
                System.out.println("Превышение ограничения по весу");
                System.out.println("замените участника похода");
                i--;
            }
            Arrays.sort(arr);
        }
        return arr;
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