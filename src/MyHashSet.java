import java.sql.Array;
import java.util.HashMap;

public class MyHashSet implements MySet {

    private HashMap<String, Object> map = new HashMap<>();

    private static final Object PRESENT = new Object();

    int size = 0;

    @Override
    public boolean myadd(String e) {
        if (e==null);
        size++;
        return map.put(e, PRESENT)==null;
    }

    @Override
    public void myclear() {
        map.clear();
    }

    @Override
    public boolean mycontains(String e){
    if (map.containsKey(e)) {
        return true;
    }
    else
        return true;
    }

    @Override
    public boolean myisEmpty(){
        if (map.size() == 0) {
            return true;
        }
        else return false;
    }

    @Override
    public int mysize(){
        return map.size();
    }

    @Override
    public boolean myremove(String e) {
        if (map.remove(e) == PRESENT) {
        }
        size--;
        return true;
    }

    @Override
    public String mytoString() {
        return "MyHashSet " + map.keySet();
    }


//        public String[] mytoArray(){
//            return keysToArray(new Object[map.size()]);
//    }


//    public String[] toArray() {
//        String[] returnArr = new String[size];
//        for (int i = 0; i < size; i++) {
//            returnArr[i] = arr[i].string;
//        }
//        return returnArr;


//    public String[] toArray() {
//        String[] result = new String[map.size()];
//        int index = 0;
//        for (String tmp : map) {
//            while (tmp != null) {
//                result[index] = tmp;
//                tmp = tmp.next;
//                index++;
//            }
//        }
//        return result;
//    }

}