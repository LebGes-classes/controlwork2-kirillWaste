public abstract class Student {
    public int getBalRating() {
        return balRating;
    }

    protected int balRating;

    public Student() {
        this.balRating = 0;
    }

    public abstract void makeProgramming();

    public abstract void makeElecEngering();
}