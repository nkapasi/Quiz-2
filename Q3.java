import java.util.Scanner;

public class Q3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your message?");
        String input = scan.nextLine();

        System.out.println("How far do you want to shift it?");
        int shift = scan.nextInt();

        System.out.println("Encoded message is:");
        
        for(int i = 0; i < input.length(); i++){
            char chr = input.charAt(i);
            int asciiValue = (int) chr;

            int shiftletter = asciiValue + shift;

            if(shiftletter>122){
                shiftletter = shiftletter - 122 + 96;
                System.out.print((char)shiftletter);
            } else {
                System.out.print((char)shiftletter);
            }

        }
    }
}