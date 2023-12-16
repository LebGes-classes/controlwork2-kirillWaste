
public class Main {
    public static void main(String[] args) {
                QueueManager queueManager = new QueueManager();
                queueManager.generateQueue(10, 10);
                queueManager.conductWorks();
                queueManager.distributeMacbooks();
            }
        }