public class Stopwatch implements Runnable{
    int hh,mm,ss;
    Thread tick;
    static int clockCount = 0;
    int id;
    Stopwatch(){
        hh = mm = ss = 0;
        tick = new Thread(this);
        id = ++clockCount;
    }
    void startWatch(){
        tick.start();
    }
    private void clockTick(){
        ss++;
        mm += ss / 60;
        hh += mm / 60;
        mm %= 60;
        ss %= 60;
    }
    @Override
    public void run() {
        
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Watch "+id+"=> \t %2d : %2d : %2d\n",hh,mm,ss );
            clockTick();
        }
    }
    public static void main(String[] args) {
        Stopwatch s1 = new Stopwatch();
        Stopwatch s2 = new Stopwatch();
        s1.startWatch();
        try {
            Thread.sleep(790);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s2.startWatch();
    }
}