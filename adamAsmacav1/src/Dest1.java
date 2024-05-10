import java.util.ArrayList;
import java.util.Scanner;

public class Dest1 extends Base{
    public void Oyun(int life, String dest) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> src = new ArrayList<>();
        boolean answer = false;

        for (int j = 0; j < dest.length(); j++){
            src.add('_');
        }
        System.out.println(src);

        for (int i = 0; i < life; i++){
            int end = 0;
            System.out.println("your lifes : " + (life - i));
            System.out.print("Please enter letter : ");
            char letter = scanner.next().charAt(0);
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
        }
        if (answer){
            System.out.println("Kazandın");
        }else{
            System.out.println("Kaybettin");
        }
    }
}
