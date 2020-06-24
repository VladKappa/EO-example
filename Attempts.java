class Attempts {
    private final VerboseDiff diff;
    private final int max;
    Attempts(VerboseDiff d, int t) {
        this.diff = d;
        this.max = t;
    }
    boolean matches() {
        int t = 0;
        while ( t <= this.max && this.diff.number() != 0) {
            ++t;
        }
        return t <= this.max;
    }
}
