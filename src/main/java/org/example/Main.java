package org.example;

import org.example.builder.MovieBuilder;
import org.example.builder.Presentation;
import org.example.builder.Slide;
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


        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var builder = new MovieBuilder();
        presentation.export(builder);
        System.out.println(builder.getMovie());
    }
}