import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyCanvas extends JPanel {
    public int posX = 0;
    public int posY = 0;

    public boolean julia;

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 800);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        for(int i = 0; i < 800; i++){
            for(int j = 0; j < 800; j++){
                if(julia)
                    g2d.setColor(MandelbrotCalc.getColorFromCameraCoorsJulia(i,j,posX,posY));
                else
                    g2d.setColor(MandelbrotCalc.getColorFromCameraCoors(i,j));
                g2d.drawRect(i,j,1,1);
            }
        }
    }
}
