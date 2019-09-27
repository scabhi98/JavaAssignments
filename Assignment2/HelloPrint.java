/**
 * HelloPrint
 */
public class HelloPrint implements Runnable {

    Thread th;
    static int count = 0;
    static int limit;
    int id;

    HelloPrint(){
        th = new Thread(this, "Thread id " + (id = ++count));
        System.out.println("Thread "+id+" created..");
        if(count < limit){
            HelloPrint hp = new HelloPrint();
            
            try{
                hp.th.join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        th.start();
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello by "+Thread.currentThread());
    }
    static void setLimit(int lim){
        HelloPrint.limit = lim;
    }
    public static void main(String[] args) {
        HelloPrint.setLimit(50);
        HelloPrint hPrint = new HelloPrint();
    }
}