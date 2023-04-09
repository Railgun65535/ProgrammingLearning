package UppercaseCount;
import java.util.Scanner;

public class UppercaseCount {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){ 
        System.out.print("输入一个字符串：");
        String inputStr= input.nextLine();
        int uppercaseCount = 0;
        for (int i = 0; i <inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
                System.out.print(ch);
            }
        }
        System.out.println("大写字母数量为："+uppercaseCount);
    }
}
