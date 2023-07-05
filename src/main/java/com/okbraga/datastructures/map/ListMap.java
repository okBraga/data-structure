package main.java.com.okbraga.datastructures.map;

import main.java.com.okbraga.datastructures.models.Car;

import java.util.ArrayList;
import java.util.List;

public class ListMap {

    private final List<Association> associations = new ArrayList<>();

    public void add(String plate, Car car) {
        if (!containsKey(plate)) {
            Association association = new Association(plate, car);
            this.associations.add(association);
        }
    }

    public Object get(String plate) {
        for (Association association : this.associations) {
            if (plate.equals(association.getKey())) {
                return association.getValue();
            }
        }
        throw new IllegalArgumentException("Key does not exist");
    }

    public void remove(String plate) {
        if (this.containsKey(plate)) {

            for (int i = 0; i < this.associations.size(); i++) {
                Association association = this.associations.get(i);

                if (plate.equals(association.getKey())) {
                    this.associations.remove(i);
                    break;
                }
            }

        } else {
            throw new IllegalArgumentException("Key does not exist");
        }
    }

    public boolean containsKey(String plate) {
        for (Association association : this.associations) {
            if (plate.equals(association.getKey())) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.associations.size();
    }
}
