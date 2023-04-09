package LockerProblemSolver;

public class LockerProblemSolver {
    public static void main(String[] args){ 
        boolean[] locker = new boolean[100];//默认值为FALSE，当做关着的
        for(int i = 0;i < locker.length;i++){
            for (int j = i; j < locker.length; j += i + 1) {
                locker[j] = !locker[j];
            }
        }  
        System.out.println("打开的储物柜号：");
        for (int i = 0; i < locker.length; i++) {
            if (locker[i]) {
                System.out.print((i+1)+" ");
            }
            /* if (locker[i]) {
               System.out.print("□ ");
            }else{
                System.out.print("■ ");
            }*/
        }
    }

}
