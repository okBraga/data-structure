package test.stack;

import main.java.com.okbraga.datastructures.models.Piece;
import main.java.com.okbraga.datastructures.stack.Stack;


public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();

        Piece piece = new Piece();
        stack.add(piece);

        Piece removedPiece = stack.remove();

        if (piece != removedPiece) {
            System.out.println("Error: The removed piece is different from the inserted one");
        }

        if (!stack.isEmpty()) {
            System.out.println("Error: The Stack is not empty");
        }
    }
}
