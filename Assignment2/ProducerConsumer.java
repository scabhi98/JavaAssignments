/**
 * ProducerConsumer
 */
public class ProducerConsumer {

    public static void main(String[] args) {
        Producer p1,p2,p3;
        Consumer c1,c2,c3;
        ItemBuffer workingBuffer = new ItemBuffer(2);
        p1 = new Producer("Abhijit",workingBuffer);
        p2 = new Producer("Manish",workingBuffer);
        p3 = new Producer("Kunal",workingBuffer);

        c1 = new Consumer("Ravi",workingBuffer);
        c2 = new Consumer("Rahul",workingBuffer);
        c3 = new Consumer("Ankit",workingBuffer);

        p1.startProducing();
        // p2.startProducing();
        p3.startProducing();

        try {
            Thread.sleep(2499);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        c1.startConsuming();
        c2.startConsuming();
        c3.startConsuming();
    }
}