import java.util.HashMap;

public class MyHashSet implements MySet<String> {

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

    public String[] mytoArray() {
        return map.keySet().toArray(new String[0]);
    }
}