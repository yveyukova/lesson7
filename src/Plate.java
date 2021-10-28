class Plate {

    private int food;

    Plate(int food) {
        this.food = food;
    }

    int getFood() {
        return food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood(int food) {
        this.food += food;
        System.out.println("В миску добавили " + food );
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}




