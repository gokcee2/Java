import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Choose a level (1, 2, 3): ");
        String level = scanner.nextLine();
        Levels levels = new Levels();

        if (level.equals("1")){
            levels.setDest("güneş");
            levels.setLife(5);
            levels.level(new Dest1());
        }
        if (level.equals("2")){
            levels.setDest("monitör");
            levels.setLife(8);
            levels.level(new Dest2());
        }
        if (level.equals("3")){
            levels.setDest("gökkuşağı");
            levels.setLife(10);
            levels.level(new Dest2());
        }

    }
}