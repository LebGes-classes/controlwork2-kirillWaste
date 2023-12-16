public class ITISStudent extends Student {
    @Override
    public void makeProgramming() {
        balRating += generateRandomPoints(3, 4);
    }

    @Override
    public void makeElecEngering() {
        balRating += generateRandomPoints(4, 5);
    }

    private int generateRandomPoints(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}