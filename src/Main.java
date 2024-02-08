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
        list2.add(30);
        list2.add(51);
        list2.add(72);
        list2.add(33);
        list2.add(84);

        System.out.println(list2);
        list2.remove(4);
        System.out.println(list2);
        System.out.println(list2.size());
    }
}