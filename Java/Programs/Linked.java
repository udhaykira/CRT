public class Linked {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data)
        {
        this.data = data;
        this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void Print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.print("Null");
    }

    void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
        }
        Node Last = head.next;
        Node secLast = head;
        while(Last.next!=null){
            Last = Last.next;
            secLast = secLast.next;
        }
        secLast.next=null;
    }

    public void iterateReverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr!=null) {
            Node next=curr.next;
            curr.next = prev;
            //update
            prev = curr;
            curr = next;
            
        }
        head.next=null;
        head=prev;
    }
   public static void main(String[] args) {
      Linked list = new Linked();
      list.addFirst("uday");
      list.addLast("Tarun");
      list.addLast("Prasad");
      list.addLast("vamsi");
      list.Print();
      list.iterateReverse();
      System.out.println();
      list.Print();


   }
    
    
}
