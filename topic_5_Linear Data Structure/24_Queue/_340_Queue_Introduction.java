/*
    Queue is a data structure which store data in FIFO principle 
    its has 2 point exit and entry in the queue.
    add O(1) - enque()
    remove O(1) - dequeue()
    front element O(1) - peek()

    It can be implemeneted using the array, linkedlist ,stack 
    using the array it has fixed size 

    */ 

class _340_Queue_Introduction {
    static class Queue{
        int arr[];
        int size ;
        int rear = -1 ; 

        Queue(int n){
            arr = new int[n];
            size = n ;
        }

        boolean isEmpty(){
            return rear == -1 ;
        }
        // add
        void add(int data){
                    if(rear == size -1 ){
                        System.out.println("Queue is full");
                        return;
                    }
                    rear = rear + 1 ;
                    arr[rear] = data;
                }
        // remove - time complexity -O(n)
        int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0 ; i < rear ; i++){
                arr[i] = arr[i+1];
            }
            rear --;
            return front;
        }

        // peek
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
        
            }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(2);
        q.add(342);
        q.add(233);

        while(!(q.isEmpty())){
            System.out.println(q.remove());
        }

    }
}