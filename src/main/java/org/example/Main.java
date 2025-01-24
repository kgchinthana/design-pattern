package org.example;

import org.example.prototype.Circle;
import org.example.prototype.Component;
import org.example.prototype.ContextMenu;
import org.example.singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        Component circle = new Circle();
        ContextMenu contextMenu = new ContextMenu();
        contextMenu.duplicate(circle);

        ConfigManager manager = ConfigManager.getInstance();
        manager.setSetting("name", "Kavindu");


        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.getSetting("name"));

    }
}