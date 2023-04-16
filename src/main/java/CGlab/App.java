package CGlab;

import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    String version = "0.02";

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Niepoprawne argumenty! Użyj: java App [ścieżka] [szerokość] [wysokość]");
            return;
        }

        String filePath = args[0];
        Integer width = Integer.parseInt(args[1]);
        Integer height = Integer.parseInt(args[2]);

        System.out.println(filePath);
        System.out.println(width);
        System.out.println(height);

        Renderer mainRenderer = new Renderer(filePath);
        mainRenderer.clear();
//        mainRenderer.drawPoint(width, height);
//        mainRenderer.drawLineNaive(10, 1,30,90);
        mainRenderer.drawTriangle(new Vec2f(10,40),new Vec2f(10,60),new Vec2f(90,10), new Color(255, 0, 0));

        try {
            mainRenderer.save();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getVersion() {
        return this.version;
    }
}