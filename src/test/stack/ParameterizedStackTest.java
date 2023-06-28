package test.stack;

import main.java.com.okbraga.datastructures.models.Piece;
import main.java.com.okbraga.datastructures.stack.ParameterizedStack;

public class ParameterizedStackTest {
    public static void main(String[] args) {
        ParameterizedStack<Piece> pieceStack = new ParameterizedStack<>();

        Piece piece = new Piece();
        pieceStack.add(piece);

        Piece removedPiece = pieceStack.remove();

        if (piece != removedPiece) {
            System.out.println("Error: The removed piece is different from the inserted one");
        }

        if (!pieceStack.isEmpty()) {
            System.out.println("Error: The stack is not empty");
        }

        ParameterizedStack<String> stringStack = new ParameterizedStack<>();

        stringStack.add("Millena");
        stringStack.add("Filipe");

        System.out.println(stringStack.remove());
        System.out.println(stringStack.remove());
    }
}
