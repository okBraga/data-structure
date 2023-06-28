package main.java.com.okbraga.datastructures.vector;

public class Vector {

    private Object[] objects = new Object[10000];

    private int size = 0;

    private boolean isNotValid(int position) {
        return position < 0 || position >= this.size;
    }

    private boolean isPresent(int position) {
        return position < this.size && position >= 0;
    }

    private void dinamycGrowth() {
        if (this.size == this.objects.length) {
            Object[] newArray = new Object[this.objects.length * 2];
            for (int i = 0; i < this.objects.length; i++) {
                newArray[i] = this.objects[i];
            }
            this.objects = newArray;
        }
    }

    public void add(Object Object) {
        this.dinamycGrowth();
        this.objects[this.size] = Object;
        this.size++;
    }

    public void add(int position, Object Object) {
        this.dinamycGrowth();

        if (this.isNotValid(position)) throw new IllegalArgumentException("Invalid Position");

        for (int i = this.size - 1; i >= position; i -= 1) {
            this.objects[i + 1] = this.objects[i];
        }

        this.objects[position] = Object;
        this.size++;
    }


    public Object get(int position) {
        if (this.isNotValid(position)) throw new IllegalArgumentException("Invalid position");

        return this.objects[position];
    }

    public void remove(int position) {
        if (!this.isPresent(position)) throw new IllegalArgumentException("Invalid position");

        for (int i = position; i <= this.size - 1; i++) {
            objects[i] = objects[i + 1];
        }

        this.size--;
    }

    public boolean contains(Object Object) {
        for (int i = 0; i < this.size; i++) {

            if (Object.equals(this.objects[i])) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        if (this.size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < this.size - 1; i++) {
            builder.append(this.objects[i]);
            builder.append(", ");
        }

        builder.append(this.objects[this.size - 1]);
        builder.append("]");

        return builder.toString();
    }
}
