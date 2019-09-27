/**
 * Producer
 */
public class Producer implements Runnable {

    ItemBuffer buffer;
    String name;
    Thread machine;
    static int itemCount = 0;
    Producer(String name, ItemBuffer buffer){
        this.name = name;
        this.buffer = buffer;
        this.machine = new Thread(this,"Producer Thread for "+this.name);
    }
    void startProducing(){
        this.machine.start();
    }
    @Override
    public void run() {
        int speed ;
       while(true){
        try {
            speed = (int) (Math.random() * 5000);
            Thread.sleep(speed);
        } catch (Exception e) {
            System.out.println("Producer thread for "+this.name+" is interrupted...");
        }
        Item newItem = new Item("Item "+itemCount++ + " produced by "+this.name);
        System.out.println(this.name +" is attempting to add " + newItem + "...");
        buffer.add(newItem);
        System.out.println("\n" + newItem + " is added successfully by " + this.name);
       }
    }
}