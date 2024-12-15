
public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertLast(0);
        list.insert(80, 20);
        list.display();
    }
}