package structures;

public class HelloTest {
    private static void echo(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        String[] array = {"Bonjour ", "Limoges", "!"};
        for (String word : array) {
            HelloTest.echo(word);
        }
    }
}