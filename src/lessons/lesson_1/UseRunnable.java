package lessons.lesson_1;

public class UseRunnable {
    public static void main(String[] args) throws InterruptedException {
        Thread thred1 = new Thread(new MyRunnableTask()); // new lessons.lesson_1.MyThreadTask();
        Thread thred2 = new Thread(new MyRunnableTask()); // new lessons.lesson_1.MyThreadTask();
        thred1.setName("T1");
        thred2.setName("T2");
        thred1.start();
        thred1.join();
        //thred2.start();
        System.out.println(Thread.currentThread().getName() + ": END.");
    }
}