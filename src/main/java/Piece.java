package src.main.java;

import javax.swing.*;
import java.util.List;

public abstract class Piece {
    protected ImageIcon texture;
    protected String name;
    protected boolean hasMoved; // Needed for castle cases
    protected ChessColor color;
    protected Position position;

    public Piece(ImageIcon texture, String name, ChessColor color, Position startPos) {
        this.texture = texture;
        this.name = name;
        this.color = color;
        this.position = startPos;
        this.hasMoved = false;
    }

    public abstract List<Position> getValidPositions();


    //getters e setters utili per board (?) non so se bisogna crearne altri
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position newPos) {
        this.position = newPos;
    }

    public boolean hasMoved() {
        return hasMoved;
    }

    public void setHasMoved(boolean moved) {
        this.hasMoved = moved;
    }

    public ImageIcon getTexture() {
        return texture;
    }

    public ChessColor getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}