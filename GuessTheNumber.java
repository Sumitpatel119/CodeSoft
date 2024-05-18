import java.util.Scanner;
public class GuessTheNumber{

    public static boolean guessNumber(){
        Scanner sc=new Scanner(System.in);
        int generatedNum =(int)((Math.random()*100)+1);
        int userNum=0;
        int score =100;
        boolean flag=false;
        for(int i=5;i>0;i--){
            userNum=sc.nextInt();
            if(userNum==generatedNum){
                System.out.println("Correct Answer!! \nScore = " + score);
                flag=true;
                return flag;
            }
            else if(userNum>generatedNum){
                System.out.println("Too high!!");
            }
            else{
                System.out.println("Too low!!");
            }
            score=score-20;
        }
        return flag;
    }

    public static void main(String[] args){
        System.out.println("Rules : \n You have 5 attempts to guess the correct answer.\n The number will be of range (1-100).\n Score will be given according to your attempts.");
        System.out.println();
        System.out.println(guessNumber() ? "~~~~~~~~You won~~~~~~~~~" : "----------You lost------------");
    }
}