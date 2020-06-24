class VerboseDiff {
    private final Diff diff;
    VerboseDiff(Diff d) {
        this.diff = d;
    }
    int number() {
        int x = this.diff.number();
        if (x < 0) {
            System.out.println("Too small.");
        } else if (x > 0) {
            System.out.println("Too big.");
        } else {
            System.out.println("Bingo!");
        }
        return x;
    }
}
