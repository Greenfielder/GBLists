import list.core.GBList;
import list.core.lists.GBArrayList;
import list.core.lists.LinkList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GBList<Integer> list = new GBArrayList<>();

        list.add(3);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(1);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

        GBList<Integer> list2 = new LinkList<>();
        list2.add(36);
        list2.add(56);
        list2.add(76);
        list2.add(34);
        list2.add(88);
        System.out.println(list2);


        System.out.println("Index[0]=" + list2.get(0) + " Index[1]=" + list2.get(1) + " Index[2]=" + list2.get(2) +
                " Index[3]=" + list2.get(3) + " Index[4]=" + list2.get(4));

        list2.remove(3);

        System.out.println(list2);
        System.out.println(list2.size());
    }
}