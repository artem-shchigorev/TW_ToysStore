import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Toy {
    private static int lastId = 0;
    private int id;
    private String name;
    private int weight;

    public Toy(String name, int weight) {
        this.id = ++lastId;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + name + ", Вес: " + weight;
    }

    public static Toy addNewToyFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название новой игрушки");
        String name = scanner.nextLine();

        System.out.println("Введите вес новой игрушки");
        int weight = scanner.nextInt();

        return new Toy(name, weight);
    }
    public static Toy getRandomToy(List<Toy> toyList, Random rand) {
        return toyList.get(rand.nextInt(toyList.size()));
    }
}

