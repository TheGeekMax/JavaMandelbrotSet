import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyCanvas extends JPanel {
    private BufferedImage pic;
    public MyCanvas(){
        pic = new BufferedImage(800,800,BufferedImage.TYPE_INT_RGB);
        for(int i = 0; i < 800; i++){
            for(int j = 0; j < 800; j++){
                pic.setRGB(i,j,MandelbrotCalc.getColorFromCameraCoors(i,j).getRGB());
            }
        }

        Graphics2D g2d = pic.createGraphics();
        //g2d.setColor(Color.red);
        //g2d.fillRect(0,0,800, 800);
        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 800);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.drawImage(pic, 0, 0, this);
        g2d.dispose();
    }
}
