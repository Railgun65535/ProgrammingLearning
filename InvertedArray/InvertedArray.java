package InvertedArray;
import java.util.Scanner;

public class InvertedArray {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.print("Enter 10 numbers: ");
        String numStr = input.nextLine();
        String[] numStrArr = numStr.split("\\s+"); 
        int[] numArr = new int[10];
        for (int i = 0; i < numStrArr.length; i++) {
            numArr[i] = Integer.parseInt(numStrArr[i]);//生成int数组
        }
        int invertArray[] = reverse(numArr);
        System.out.print("倒置的数组为：");
        for (int i = 0; i < invertArray.length; i++) {
            System.out.print(invertArray[i]+" ");
        }
        input.close();
    }

    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for (int i = 0,j = list.length - 1; i < result.length; i++,j--) {
            result[j] = list[i];
        }
        return result;
    }
}
