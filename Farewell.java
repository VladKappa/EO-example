class Farewell {
    private final Attempts attempts;
    private final Secret secret;
    Farewell(Attempts a, Secret n) {
        this.attempts = a;
        this.secret = n;
    }
    void say() {
        if (!this.attempts.matches()) {
            System.out.println("You lost, it was " + this.secret.number());
        }
        System.out.println("Thanks for playing, bye!");
    }
}
