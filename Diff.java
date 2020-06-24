class Diff {
    private final Secret secret;
    private final Guess guess;
    Diff(Secret n, Guess x) {
        this.secret = n;
        this.guess = x;
    }
    int number() {
        return this.guess.number() - this.secret.number();
    }
}
