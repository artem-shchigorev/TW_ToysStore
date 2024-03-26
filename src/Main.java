//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Toy> toyList = new ArrayList<>();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добавить игрушку");
            System.out.println("2. Распечатать список игрушек");
            System.out.println("3. Начать розыгрыш");
            System.out.println("4. Завершить розыгрыш");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    Toy toy = Toy.addNewToyFromConsole();
                    for (int i = 0; i < toy.getWeight(); i++) {
                        toyList.add(toy);
                    }
                    break;
                case 4:
                    System.out.println("Розыгрыш завершен!");
                    System.exit(0);
                case 2:
                    for (Toy t : toyList)
                        System.out.println(t);
                    break;
                case 3:
                    try {
                        FileWriter writer = new FileWriter("output.txt");
                        for (int i = 0; i < 10; i++) {
                            Toy randomToy = Toy.getRandomToy(toyList, rand);
                            writer.write(randomToy + "\n");
                            System.out.println(randomToy);
                        }
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }
}