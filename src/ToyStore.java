public class ToyStore {
    public static void main(String[] args) {
        ToyShelf toyShelf = new ToyShelf();

        while (true) {
            Toy newToy = Toy.addNewToyFromConsole();
            toyShelf.addToy(newToy);

            Toy heaviestToy = toyShelf.getTheHeaviestToy();
            System.out.println("На текущий момент самая тяжёлая игрушка: " + heaviestToy);
        }
    }
}