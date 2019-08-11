import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];


    public MyList(int size) {

    }

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }


    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void remote(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + ", size" + size);
        } else {
            E temp = (E) elements[index];
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
            return;
        }
    }

    public int size() {
        return size;
    }

    public MyList clone() {
        return this;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public E get(int i) {
        return (E) elements;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
        System.out.println("danh sach da bi xoa");
    }

}
