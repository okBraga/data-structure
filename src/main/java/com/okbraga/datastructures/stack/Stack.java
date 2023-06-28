package main.java.com.okbraga.datastructures.stack;


import main.java.com.okbraga.datastructures.models.Piece;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    private final List<Piece> pieces = new LinkedList<Piece>();

    public void add(Piece piece) {
        this.pieces.add(piece);
    }

    public Piece remove() {
        return this.pieces.remove(this.pieces.size() - 1);
    }

    public boolean isEmpty() {
        return this.pieces.size() == 0;
    }
}