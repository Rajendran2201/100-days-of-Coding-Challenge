import java.util.LinkedList;

public class recapLists{

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Intial Linked list: ");
        System.out.println(list);

        list.remove(3);

        System.out.println("The linkelist after removing list :");
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}