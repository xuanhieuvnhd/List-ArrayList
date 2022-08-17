import java.util.Arrays;

public class MyList <E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements = (Object []) new Object[DEFAULT_CAPACITY];
    }
    public MyList(int size){
        elements = (Object[]) new Object[size];
    }
    private void ensureCapa() {
        if (size > elements.length) {
            int biggerSize = size * 2 + 1;
            elements = Arrays.copyOf(elements, biggerSize);
        }
    }
    public void add(Object e) {
        size += 1;
        ensureCapa();
        elements[size - 1] = e;
    }
    public boolean add(Object e, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            return true;
        }
        return false;
    }
    public Object get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        return null;
    }
    @Override
    public MyList clone() {
        MyList<Object> clone = new MyList<>(elements.length);
        for (Object x : elements) {
            clone.add(x);
        }
        return clone;
    }
    public Object[] getData() {
        return this.elements;
    }

    public int size() {
        return size;
    }
    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }
    public void clear() {
        elements = (Object[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int indexOf(Object e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
    public boolean contains(Object e) {
        for (Object x : elements) {
            if (e.equals(x)) {
                return true;
            }
        }
        return false;
    }
}
