package rockPaperScissors;

import java.util.Scanner;

public class rockPaperScissors {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int combo =0 ;
        int winer = 2;
        while (combo < 2) {
            //System.out.println("目前连击数"+combo);
            System.out.print("rock (0), paper (1), scissors (2):1 ");
            int thisWiner = play();
            //System.out.println("上一次胜者"+winer+"本次胜者"+thisWiner);
            if (winer == thisWiner && winer != 3) {
                combo++;
            }else{
                combo = 0;
            }
            winer = thisWiner; 
        }
        
        input.close(); 
    }
    public static int play(){
        
        int PC = (int)(Math.random()*3);//0:rock, 1:paper, 2:scissors
        int player = input.nextInt();
        int iswin = isWin(PC,player);
        //input.close();
        System.out.print("The computer is "+optionStr(PC)+". You are "+optionStr(player)+". ");
        switch (iswin) {
            case 0:
                System.out.println("You lost.");
                break;
            case 1:
                System.out.println("You won.");
                break;
            case 3:
                System.out.println("It is a draw.");
                break;
            default:
                break;
        }
        return iswin;
        
    }

    public static String optionStr(int option){
        String optionStr = "";
        switch (option) {
            case 0:
                optionStr = "rock";
                break;
            case 1:
                optionStr = "paper";
                break;
            case 2:
                optionStr = "scissors";
                break;
            default:
                break;
        }
        return optionStr;
    }


    public static int isWin(int PC,int player){ //if return 0,PC is Winer,return 1 player is Winer, return 3 draw
        int win = 2;
        switch (PC - player) {
            case -2:
                win = 0;
                break;
            case -1:
                win = 1;
                break;
            case 0:
                win = 3;
                break;
            case 1:
                win = 0;
                break;
            case 2:
                win = 1;
                break;
            default:
                break;
        
        
        }
        return win;
    }

}
