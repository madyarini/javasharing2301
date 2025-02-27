import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("java sharing 23-01-2025");
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        // 1. Find all transactions in the year 2011 and sort them by value (small to high).
        // 2. What are all the unique cities where the traders work?
        // 3. Find all traders from Cambridge and sort them by name.
        // 4. Return a string of all traders’ names sorted alphabetically.
        // 5. Are any traders based in Milan?
        // 6. Print the values of all transactions from the traders living in Cambridge.
        // 7. What’s the highest value of all the transactions?
        // 8. Find the transaction with the smallest value.
    }

    private static <T> void print(Stream<T> obj) {
        System.out.println(obj.toList());
    }
}