import java.util.*;

public class ToyShelf {
    private Map<Toy, Integer> toys;
    private PriorityQueue<Toy> toyPriorityQueue;

    public ToyShelf() {
        this.toys = new HashMap<>();
        this.toyPriorityQueue = new PriorityQueue<>((a, b) -> b.getWeight() - a.getWeight());
    }

    public void addToy(Toy toy) {
        toys.put(toy, 0);
        toyPriorityQueue.add(toy);
    }

    // Вернуть игрушку верхушку игрушки из очереди
    public Toy getTheHeaviestToy() {
        return toyPriorityQueue.peek();
    }
}