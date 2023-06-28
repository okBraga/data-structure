package test.stack;

import main.java.com.okbraga.datastructures.models.Piece;
import main.java.com.okbraga.datastructures.stack.GenericStack;

public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack genericStack = new GenericStack();

        Piece piece = new Piece();
        genericStack.add(piece);

        Object removedPiece = genericStack.remove();

        if (piece != removedPiece) {
            System.out.println("Error: The removed piece is different from the inserted one");
        }

        if (!genericStack.isEmpty()) {
            System.out.println("Error: The Stack is not empty");
        }
    }
}
