import javax.swing.*;
import java.awt.*;

public class MandelbrotSet{
    public MandelbrotSet(){
        JFrame frame = new JFrame("Mandelbrot set");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new MyCanvas());
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new MandelbrotSet();
    }
}
