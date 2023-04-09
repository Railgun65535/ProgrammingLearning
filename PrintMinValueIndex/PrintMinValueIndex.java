package PrintMinValueIndex;
import java.util.Scanner;

public class PrintMinValueIndex {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter 10 numbers: ");
        String numStr = input.nextLine();
        String[] numStrArr = numStr.split("\\s+"); 
        double[] numArr = new double[10];
        for (int i = 0; i < numStrArr.length; i++) {
            numArr[i] = Double.parseDouble(numStrArr[i]);//生成double数组
        }

        System.out.println("最小值的下标为："+indexOfSmallestElement(numArr));


        input.close();
    }
    public static int indexOfSmallestElement(double[] array){
        double min = Double.POSITIVE_INFINITY;//正无穷
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
