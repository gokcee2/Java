import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int life = 5;
        String dest = "fırça";
        System.out.println("Welcome to our game.");
        ArrayList<Character> src = new ArrayList<Character>();
        Scanner scanner = new Scanner(System.in);
        boolean answer = false;

        for (int j = 0; j < dest.length(); j++){
            src.add('_');
        }
        System.out.println(src);

        for (int i = 0; i < life; i++){
            System.out.println("your remaining lives : " + (life - i));
            System.out.print("Please enter the letter : ");
            char letter = scanner.next().charAt(0);
            int end = 0;
            for (int a = 0; a < dest.length(); a++){
                if (dest.charAt(a) == letter){
                    src.set(a, letter);
                    life++;
                }
                if (dest.charAt(a) == src.get(a)){
                    end++;
                    if (end == dest.length()){
                        answer = true;
                        break;
                    }
                }
            }
            System.out.println(src);
            if (answer){
                break;
            }
        }if (answer){
            System.out.println("You win!");
        }else{
            System.out.println("You lost!");
        }
    }
}