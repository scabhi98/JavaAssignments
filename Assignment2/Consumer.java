/**
 * Producer
 */
public class Consumer implements Runnable {

    ItemBuffer buffer;
    String name;
    Thread machine;
    Consumer(String name, ItemBuffer buffer){
        this.name = name;
        this.buffer = buffer;
        this.machine = new Thread(this,"Consumer Thread for "+this.name);
    }
    void startConsuming(){
        this.machine.start();
    }
    @Override
    public void run() {
        int speed;
        while(true){
            try {
                speed = (int) (Math.random() * 5000);
                Thread.sleep(speed);
            } catch (Exception e) {
                System.out.println("Consumer thread for "+this.name+" is interrupted...");
            }
            System.out.println(this.name +" is attempting to extract an item...");
            Item newItem = buffer.extract();
            System.out.println(newItem + " is consumed by " + this.name);
        }
    }
}