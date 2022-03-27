import java.util.Arrays;
class MyCircularQueue {
    private int[] array;
    private int front = -1;
    private int rear = -1;
    
    public MyCircularQueue(int k) {
        array = new int[k];
        Arrays.fill(array, -1);
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        
        if(this.front == -1) this.front = 0;
        
        if(this.rear + 1 == array.length) {
            this.rear = 0;
        }else {
            this.rear++;
        }
        
        array[this.rear] = value;
        
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        
        array[this.front] = -1;
        if(this.front + 1 == array.length) {
            this.front = 0;
        }else {
            this.front++;
        }
        
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return array[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return array[rear];
    }
    
    public boolean isEmpty() {
        for(int i = 0; i < array.length; i++) {
            if(array[i] != -1) return false;
        }
        
        return true;
    }
    
    public boolean isFull() {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == -1) return false;
        }
        
        return true;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
