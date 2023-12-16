import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QueueManager {
    private final List<Student> queue;

    public QueueManager() {
        queue = new ArrayList<>();
    }

    public void generateQueue(int itisCount, int ivmitCount) {
        for (int i = 0; i < itisCount; i++) {
            queue.add(new ITISStudent());
        }
        for (int i = 0; i < ivmitCount; i++) {
            queue.add(new IVMITStudent());
        }
        Collections.shuffle(queue);
    }

    public void conductWorks() {
        for (Student student : queue) {
            if (Math.random() < 0.5) {
                student.makeProgramming();
            } else {
                student.makeElecEngering();
            }
        }
    }

    public void distributeMacbooks() {
        int macbookCount = (int) (queue.size() * 0.25);
        for (int i = 0; i < macbookCount; i++) {
            System.out.println("Челик  " + (i + 1) + " С баллом " + queue.get(i).getBalRating() + " получил китайский мак");
        }
    }
}