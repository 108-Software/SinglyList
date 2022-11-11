

public class MyList {

    public Node head = new Node();

   /* public MyList(){
        head = null;
    }*/
    public class Node{
        public int data;
        public Node next = null;

        public Node(int data){
            this.data = data;
           // next = null;
        }
        public Node(){}
    }

    public void ADDNode(int data){
        Node newNode = new Node(data);
        //Node currentNode = head;

        if (head.next != null){
            newNode.next = head.next;
        }
        head.next=newNode;
        /*else {
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next=newNode;
        }*/

    }

    public void REMNode(int data) {
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode.next != null) {
            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }

            }
            previousNode = currentNode;
            currentNode = currentNode.next;

        }
    }

    public void print(){
        Node currentNode = head;

       /*if (head != null){
            System.out.println(head.data);
        }*/

        while (currentNode.next != null){
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }

    }

}
