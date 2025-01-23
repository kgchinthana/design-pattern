package org.example;

import org.example.prototype.Circle;
import org.example.prototype.Component;
import org.example.prototype.ContextMenu;

public class Main {
    public static void main(String[] args) {
        Component circle = new Circle();
        ContextMenu contextMenu = new ContextMenu();
        contextMenu.duplicate(circle);
    }
}