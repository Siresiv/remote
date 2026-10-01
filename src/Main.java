// TODO: musimy dodac brakujace klasy!

// OK, ja dodam ‘Adder‘, a s36580 doda ‘Subtractor‘.

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(111, 222));

        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(6, 3));
    }
}
