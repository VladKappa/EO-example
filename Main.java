public class Main {
    public static void main(String... args) {
        Secret secret = new Secret();
        new Farewell(
                new Attempts(
                    new VerboseDiff(
                        new Diff(
                            secret,
                            new Guess()
                            )
                        ), 5
                    ),
                secret
                ).say();
    }
}
