import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseEvent extends MouseAdapter {
    private MandelbrotSet instance;
    public MyMouseEvent(MandelbrotSet instance){
        super();
        this.instance = instance;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        instance.drawableComponent.posX = e.getX();
        instance.drawableComponent.posY = e.getY();

        instance.drawableComponent.repaint();
    }
}
