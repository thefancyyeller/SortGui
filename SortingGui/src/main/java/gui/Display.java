package gui;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
public class Display {
    JFrame myFrame = new JFrame("Sorting GUI");
    int vertOffset;
    static final int BOX_HEIGHT = 50;
    static final int BOX_WIDTH = 50;
    static final int PADDING = 5;
    int howMany;

    public Display(int howMany) {

        this.howMany = howMany;
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setPreferredSize(new Dimension(1440, 960));
        myFrame.pack();
        myFrame.setVisible(true);

    }
    public void drawLine(int y, int[] dataList){

        for(int i = 0; i < dataList.length; i++){
            myFrame.getContentPane().add(new Box((i*BOX_WIDTH*PADDING),0,dataList[i]));
            myFrame.update(this.myFrame.getGraphics());
        }

    }

    public static Color randomColor() {
        Color temp = new Color((int)(Math.random() * 0x1000000));
        return temp;
    }

}



class Box extends JPanel {

    public int y;
    public int x;
    private int squareW = Display.BOX_WIDTH;
    private int squareH = Display.BOX_HEIGHT;
    private String valString;
    Box(int x, int y, int val){
        valString = Integer.toString(val);
        this.x = x;
        this.y = y;
    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillRect(x,y,squareW,squareH);
        g.setColor(Color.WHITE);
        g.drawString(valString, x+25, y+25);
    }
}

