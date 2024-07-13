public class QueueC {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        Queue(int n){
            arr = new int[n];
            this.size=n;
        }

        public static Boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static Boolean isFull(){
            return (rear+1)%size==front;
        }

        //enque
        public static void add(int data){
            if(isFull()){
                System.out.println("Full Queue");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }

        //dequeue

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int res=arr[front];
            //first element
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return res;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        System.out.println("Queue\n");
        while(!q.isEmpty()){
             System.out.println(q.peek());
             q.remove();
        }
    }
    
}
