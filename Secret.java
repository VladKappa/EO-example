class Secret {
    private final int num;
    Secret() {
        this((int) (Math.random() * 100));

    }
    Secret(int n) {
        this.num = n;
    }
    int number() {
        //System.out.println(num);
        return this.num;
    }
}

