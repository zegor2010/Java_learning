import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
    }

    public static int[][] getNumber(){
        Scanner sc = new Scanner(System.in);
        int [][] plan = new int[9][9];
        System.out.println("Введіть дані");
        for (int i = 0; i < plan.length; i++){
            for (int j = 0; j < plan[i].length; j++){
                plan[i][j] = sc.nextInt();
            }
        }
        return plan;
    }

    public static boolean isCorrect(int[][] plan){

        return false;
    }

    
}
