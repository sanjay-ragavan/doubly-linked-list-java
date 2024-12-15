public class DLL {
        Node head;

        public void insertFirst(int data){
            Node node = new Node(data);
            node.next = head;
            node.prev = null;
            if(head != null){
                head.prev = node;
            }
            head = node;  
        }

        public void insertLast(int data){

            Node node = new Node(data);
            Node last = head;
            node.next = null;

            if(head == null){
                insertFirst(data);
            }

            while(last.next != null){
                last = last.next;
            }

            last.next = node;
            node.prev = last;
        }

        public void insert(int data, int after){
            Node p = getValue(after);
            if(p == null){
                System.out.println("Does not exist");
                return;
            }

            Node node = new Node(data);
            node.next = p.next;
            p.next = node;
            node.prev = p;
            if(node.next != null){
                node.next.prev = node;
            }
            
        }

        public void display(){
            Node node = head, last = null;

            System.out.println("Normal Order");
            while(node != null){
                System.out.print(node.data + " -> ");
                last = node;
                node = node.next;
            }
            System.out.println("End");
            
            System.out.println("Reverse Order");
            while(last != null){
                System.out.print(last.data + " -> ");
                last = last.prev;
            }
            System.out.println("Start");
        }

        public Node getValue(int data){
            Node node = head;
        
            while (node != null) {
                if(node.data == data){
                    return node;
                }
                node = node.next;
            }
            return null;
        }

        private class Node{
            int data;
            Node next;
            Node prev;
            public Node(int data){
                this.data = data;
            }
            public Node(int data, Node next, Node prev){
                this.data = data;
                this.next = next;
                this.prev = prev;
            }
        }
}