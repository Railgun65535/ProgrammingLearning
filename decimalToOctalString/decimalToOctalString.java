package decimalToOctalString;
import java.util.Scanner;
public class decimalToOctalString {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("请输入一个十进制数:");
        int valueDec = input.nextInt();
        System.out.print(toOct(valueDec));
    }

    public static String toOct(int valueDec) {
        int Dec = valueDec;
        String Oct = "";
        while(Dec > 0){
            Oct = Dec%8+ Oct;
            Dec = Dec/8;
        }
        return Oct;
    }

    //input.close();
}
