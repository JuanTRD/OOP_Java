package Queue_Array.src;

public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head=0;
    public int tail=-1;
    public int currentSize=0;
    public MyQueue(int queueSize){
        this.capacity=queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity) {
            return status = true;
        } 
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if(currentSize == 0) {
            return status = true;
        }
        return status;
    }
    public int getTail(){
        return this.tail;
    }
    public int getHead(){
        return this.head;
    }
    public void displayQueue(){
        for(int i=0; i<queueArr.length;i++){
            System.out.print(queueArr[i] + " ");
        }
    }
    public void enQueue(int item){
        if (isQueueFull()) {
            System.out.println("Over");
        } else {
            tail++;
            queueArr[tail] = item;
            if(tail == capacity-1) {
                tail = 0;
            }
            
            currentSize++;
            System.out.println("Element " + item + " is pushed");
        }
    }
    public void deQueue(){
        if(isQueueEmpty()){
            System.out.println("Under");
        } else {
            head++;
            if(head==capacity-1){
                System.out.println("Done remove: " + queueArr[head-1]);
                head = 0;
            } else {
                System.out.println("Done remove: " + queueArr[head-1]);
            }
            currentSize--;
    }
}
}
