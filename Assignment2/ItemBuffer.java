/**
 * ItemBuffer
 */
public class ItemBuffer {

    Item buffer[];
    Boolean isFull, isEmpty;
    int capacity, currentIndex;
    ItemBuffer(int capacity){
        buffer = new Item[capacity];
        this.capacity = capacity;
        isEmpty = true;
        isFull = false;
        currentIndex = 0;
    }
    synchronized void add(Item item){
        while (this.isFull) {
            try {
                System.out.println("Add Method: Buffer is full, waiting for a slot...");
                wait();
            } catch (InterruptedException e) {
                System.out.println("Add Method interrupted...");
            }
        }
        buffer[currentIndex++] = item;
        isFull = currentIndex == capacity;
        isEmpty = false;
        notifyAll();
    }
    synchronized Item extract(){
        while (this.isEmpty) {
            try {
                System.out.println("Extract Method: Buffer is empty, waiting for an item...");
                wait();
            } catch (InterruptedException e) {
                System.out.println("Extract Method interrupted...");
            }
        }
        Item it = buffer[--currentIndex];
        isEmpty = currentIndex == 0;
        isFull = false;
        notifyAll();
        return it;
    }
}