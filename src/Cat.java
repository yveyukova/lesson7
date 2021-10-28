class Cat {

    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

    boolean getFullness() {
        return fullness;
    }

    void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    boolean eat(Plate p) {
        if ( p.getFood() < appetite ) {
            fullness = false;
        } else {
            p.decreaseFood(appetite);
            fullness = true;
        }
        return fullness;
    }
}