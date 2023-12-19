package array;

import java.util.Scanner;

public class PairSum {

    public void pairSum() {

        int arr[] = {5, 7, 4, 3, 8, 9, 5, 2};

        Scanner scan = new Scanner(System.in);
        System.out.println("5,7,4,3,8,9,2" + "This is your number give target");
        int target = scan.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {


            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("pair found " + arr[i] + "," + arr[j]);
                } else {

                }
            }

        }
        System.out.println("not found");

    }

    public static void main(String[] args) {
        PairSum ps = new PairSum();
        ps.pairSum();
    }

}


