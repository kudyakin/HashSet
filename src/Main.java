import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

         MySet set = new MyHashSet();

        set.myadd("aaa");
        System.out.println(set.mysize());
        set.myadd("bbbb");
        System.out.println(set.mysize());
        set.myadd("ccccc");
        System.out.println(set.mysize());
        set.myadd("dddddd");
        System.out.println(set.mysize());

        set.myadd("aaa"); //adding element that already in collection - it is not added
        System.out.println(set.mysize());

        System.out.println(set.mytoString());

        System.out.println(set.myisEmpty());

        System.out.println(set.hashCode());

        System.out.println(set.mycontains("aaa"));

        System.out.println(set.myremove("aaa"));
        System.out.println(set.mysize());

        set.myclear();
        System.out.println(set.mysize());



    }
}
