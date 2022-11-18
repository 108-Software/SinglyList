public class MyList {

    public Node head = new Node();
    public class Node{
        public int data;
        public Node next = null;
        public Node(int data){
            this.data = data;
        }
        public Node(){}
    }

    public void ADDNode(int data){
        Node newNode = new Node(data);

        if (head.next != null){
            newNode.next = head.next;
        }
        head.next=newNode;

    }

    public void ADDLast(int data){
        Node newNode = new Node(data);
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void SUMMNode(){
        Node currentNode = head;
        int summ = 0;
        while (currentNode.next != null){
            currentNode = currentNode.next;
            summ++;
        }
        System.out.print("\n" + summ);
    }

    public void REMFirst(int data){

    }

    public void REMLast(int data){}

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

    public void REMAll(){
        Node currentNode = head;

        while (currentNode.next != null){
            currentNode = currentNode.next;
            currentNode.data = 0;
        }
        REMNode(0);
    }

    public void print(){
        Node currentNode = head;

        while (currentNode.next != null){
            currentNode = currentNode.next;
            System.out.print("{ ");
            System.out.print(currentNode.data + " ");
            System.out.print("}");
        }

    }

}
