package CustomLinkList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
//        LL list = new LL();
//        list.insertFirst(11);
//        list.insertFirst(22);
//        list.insertFirst(33);
//        list.insertFirst(44);
//        list.insertFirst(55);
//        list.insertLast(99);
//        list.insert(100,3);
//        list.display();
//        System.out.println("Remove item : "+list.deleteFirst());
//        list.display();
//        System.out.println("Remove item : "+list.deleteLast());
//        list.display();
//        System.out.println("Remove item : "+list.delete(2));
//        list.display();

        DLL list = new DLL();
        list.insertFirst(11);
        list.insertFirst(22);
        list.insertFirst(33);
        list.insertFirst(44);
        list.insertFirst(55);
        list.display();
        list.indertLast(66);
        list.display();
        System.out.println("Node Added : ");
        list.insert(44,45);
        list.display();


    }

}
