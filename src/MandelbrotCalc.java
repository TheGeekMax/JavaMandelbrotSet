import java.awt.*;

public class MandelbrotCalc {
    public static final int MAX_ITTERATION = 50;

    private static Color getColorFromItteration(int index){
        if(index == 50){
            return Color.BLACK;
        }
        return Color.getHSBColor((float)index/(float)MAX_ITTERATION,1f,1f);
    }

    private static Vector2 cameraToWorldPos(int x, int y){
        return new Vector2(((float)x/200f)-2,((float)y/200f)-2);
    }

    private static int getItterationFromCoors(Vector2 v){
        Vector2 c0 = new Vector2(0f,0f);
        int itt = -1;

        do{
            Vector2 newValues = new Vector2(c0.x*c0.x - c0.y*c0.y,2*c0.x*c0.y);
            c0.x = newValues.x + v.x;
            c0.y = newValues.y + v.y;
            itt++;
        }while(c0.moduleSqred() <= 4 && itt < 50);
        return itt;
    }

    public static Color getColorFromCameraCoors(int x, int y){
        return getColorFromItteration(getItterationFromCoors(cameraToWorldPos(x,y)));
    }
}
