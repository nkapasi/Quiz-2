import java.util.Scanner;


public class Q0 {
    public static void main(String[]args) {
        int diceRoll1 = 0;
        int diceRoll2 = 1;
        int diceRoll3 = 2;
        int count = 0;
        int tally = 0;
        int N = 1;
        

        while(diceRoll1 != 100){
            diceRoll1 = (int)(Math.random()*6+1);
            diceRoll2 = (int)(Math.random()*6+1);
            diceRoll3 = (int)(Math.random()*6+1);
            System.out.println("Your rolls are " + diceRoll1 + diceRoll2 + diceRoll3);
            count = count +1;
            if(count == 3 * N) {
                N = N+1;
                tally = tally - (diceRoll1 + diceRoll2 + diceRoll3);
            } else if(diceRoll1 == diceRoll2 && diceRoll2 == diceRoll3){
                tally = tally + (diceRoll1 + diceRoll2 + diceRoll3);
                break;
            }
        }

        int tripletsWorth = diceRoll1;
        System.out.println("Tally after round 1:" + tally);

        for(int i = 0; i < tripletsWorth; i++) {
            diceRoll1 = (int)(Math.random()*6+1);
            diceRoll2 = (int)(Math.random()*6+1);
            diceRoll3 = (int)(Math.random()*6+1);
            System.out.println("Round two Rolls:" + diceRoll1 + diceRoll2 + diceRoll3);

            tally = tally + (diceRoll1*diceRoll2*diceRoll3);
        }
        
        System.out.println("Tally after round 2:" + tally);
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 0 to retire, or 1 to continue");
        int r3 = scan.nextInt();

        if( r3 == 0){
            System.out.println("You retired with " + tally + " points");
        } else {
            while
        }
    }





}
