import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MandelbrotSet extends JFrame{

    public MyCanvas drawableComponent = new MyCanvas();
    public MandelbrotSet(){
        this.setTitle("Mandelbrot Set");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(drawableComponent);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        this.addMouseMotionListener(new MyMouseEvent(this));

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                drawableComponent.julia = !drawableComponent.julia;

                drawableComponent.repaint();
            }
        });
    }

    public static void main(String[] args) {
        new MandelbrotSet();
    }
}
