public class IVMITStudent extends Student {
    @Override
    public void makeProgramming() {
        balRating += generateRandomPoints(4, 5);
    }

    @Override
    public void makeElecEngering() {
        balRating += generateRandomPoints(3, 4);
    }

    private int generateRandomPoints(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}