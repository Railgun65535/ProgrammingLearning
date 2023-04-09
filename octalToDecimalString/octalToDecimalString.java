package octalToDecimalString;
import java.util.Scanner;
public class octalToDecimalString {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("请输入一个八进制数:");
        String valueOct ="";
        valueOct= input.next();
        System.out.print(toDec(valueOct));
        input.close();
    }

    public static int toDec(String valueOct) {
        String Oct = valueOct;
        int Dec = 0;
        int j = 0;
        for (int i = Oct.length() - 1; i >= 0; i--) {
            Dec += Math.pow(8, j)*((int)Oct.charAt(i)-48);//该位数字*8的j次方（j为从0开始数八进制数字的位数）
            j++;
        }
        return Dec;
    }

    
}
