public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();


        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);


        for (int i = 0; i < myList.size(); i++) {
            System.out.println("element" + i + " la" + myList.get(i));
        }
        boolean contains = myList.contains(5);
        System.out.println(contains);


        System.out.println(myList.indexOf(3));


        MyList<Integer> myList1 = myList.clone();
        System.out.println("danh sach list 1");
        for (int i = 0; i < myList1.size(); i++) {
            System.out.println(myList1.get(i));
        }

        myList.clear();
    }
}
