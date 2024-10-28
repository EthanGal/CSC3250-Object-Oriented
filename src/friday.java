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
    private T _thing;

    public Stuff() {
        _thing = null;
    }

    public Stuff(T t) {
        _thing = null;
    }

    public T getThing() {
        return _thing;
    }

    public void setThing(T t) {
        _thing = t;
    }

    public void print() {
        if(_thing != null){
            System.out.println("Type: " + _thing.getClass().getName() + ", value: " + _thing);
        } else {
            System.out.println("null member variable");
        }
    }
}

public class friday {
    public static void main(String[] args) {
        Stuff<test> s = new Stuff<test>();
        s.print();
        s.setThing(new test(5));
        System.out.println(s.getThing().getX());
    }
}
//b
