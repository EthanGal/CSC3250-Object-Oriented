import java.util.*;

class test {
    private int _x;

    public test() {

    }

    // adding a comment to test
    public test(int a) {
        _x = a;
    }

    public int getX() {
        return _x;
    }

    public void setX(int a) {
        _x = a;
    }

    public boolean equals(Object t){
        System.out.println("Called equals");
        if (this == t){
            return true;
        }
        if (t == null){
            return false;
        }
        if (t instanceof test){
            return _x == ((test)t)._x;
        } else {
            return false;
        }
    }

}

class test2 {
    private int _y;

    public test2() {
    }

    public test2(int a) {
        _y = a;
    }

    public int getY(int y) {
        return _y;
    }

    public void setY(int a) {
        _y = a;
    }
}

class Stuff<T> {
    private ArrayList<T> _thing;
    public Stuff() {
        _thing = new ArrayList<T>();
    }

    public Stuff(int size) {
        _thing = new ArrayList<T>(size);
    }

    public void addItem(T t) {
        _thing.add(t);
    }

    public T removeItem(int idx) {
        if (idx < _thing.size() && idx >= 0){
            T item = _thing.remove(idx);
            return item;
        }
        return null;
    }

    public boolean findItem(T item) {
        boolean found = false;
        int i = 0;
        while (i < _thing.size() && !found){
            if(_thing.get(i).equals(item)){
                found = true;
            } else {
                i++;
            }
        }
        return found;
    }

    public void printItems() {

    }
//    public T getThing() {
//        return _thing;
//    }
//
//    public void setThing(T t) {
//        _thing = t;
//    }

    public void print() {
        if (_thing != null) {
            System.out.println("Type: " + _thing.getClass().getName() + ", value: " + _thing);
        } else {
            System.out.println("null member variable");
        }
    }
}

//
public class friday {
    public static void main(String[] args) {
        Stuff<test> s = new Stuff<test>();
        Stuff<test> s2 = new Stuff<test>(5);
        s.addItem(new test(3));
        test t = new test(3);
        System.out.println(s.findItem(t));
    }
}
//b
//c
