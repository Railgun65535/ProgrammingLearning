package SeletionSort;
import java.util.Scanner;

public class SeletionSort {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){ 
        double[] numArr = inputDouArr();
        SeletionSortMax(numArr);
        showDoubleArr(numArr);
    }
    public static void SeletionSortMax(double[] list){
        for (int i = list.length - 1; i >= 0; i--) {
            double currentMax = list[i];
            int currentMaxIndex = i;
            for (int j = 0; j <= i; j++) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }

            }
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }

    public static double[] inputDouArr(){
        System.out.print("Enter 10 numbers: ");
        String numStr = input.nextLine();
        input.close();
        String[] numStrArr = numStr.split("\\s+"); 
        double[] numArr = new double[10];
        for (int i = 0; i < numStrArr.length; i++) {
            numArr[i] = Double.parseDouble(numStrArr[i]);//生成double数组
        }
        return numArr;
    }

    public static void showDoubleArr(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
   
}
