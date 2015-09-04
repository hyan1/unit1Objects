import java.awt.Color;
import java.util.Random;

public class TurtleWorld
{
    public static void main(String[] args)
    throws InterruptedException
    {
        World turtleWorld = new World();
        Thread.sleep(1000);
        
        Turtle turtle = new Turtle( turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.setPenWidth(5);
        turtle.penDown();
        
        Turtle turtle2 = new Turtle(turtleWorld);       
        turtle2.setPenColor(Color.GREEN);
        turtle2.setPenWidth(5);
        turtle2.penDown();

        Turtle turtle3 = new Turtle(turtleWorld);
        turtle3.setPenColor(Color.BLUE);
        turtle3.setPenWidth(3);
        turtle3.penDown();
        
        Turtle turtle4 = new Turtle(turtleWorld);
        turtle4.setPenColor(Color.BLUE);
        turtle4.setPenWidth(3);
        turtle4.penDown();
        
        Turtle turtle5 = new Turtle(turtleWorld);
        turtle5.setPenColor(Color.BLUE);
        turtle5.setPenWidth(3);
        turtle5.penDown();
        
        Turtle turtle6 = new Turtle(turtleWorld);
        turtle6.setPenColor(Color.BLUE);
        turtle6.setPenWidth(3);
        turtle6.penDown();
        
        turtle5.turn(180);
        turtle6.turn(180);
        int ang = 10;
        int ang1 = -10;
        int k = 0;
        int i = 0;
        int j = 0;
        int u = 0;
        while (k <= 30)
        {
            turtle3.turn(ang);
            turtle3.forward(40);
            ang += 2;  
            k += 1;
        }
        while (i <=30)
        {
            turtle4.turn(ang1);
            turtle4.forward(40);
            ang1 -= 2;
            i += 1;
        }
        while (j <=30)
        {
            turtle5.turn(ang);
            turtle5.backward(40);
            ang += 2;
            j += 1;
        }
        while (u <=30)
        {
            turtle6.turn(ang1);
            turtle6.backward(40);
            ang1 -= 2;
            u += 1;
        }
        turtle3.hide();
        turtle4.hide();
        turtle5.hide();
        turtle6.hide();
        
        int x = 0;
        int y = 10;
        while (x < 100)
        {
            turtle.forward(y);
            turtle2.backward(y);
            turtle.turnLeft();
            turtle2.turnLeft();
            y +=2;
            turtle.backward(y);
            turtle.forward(y);
            y +=2;
            x +=1; 
        }

        int q = 30;
        int w = 60;
        while (y <400)
        {
            turtle.forward(q);
            turtle2.forward(q);
            turtle.turn(w);
            turtle2.turn(w);
            q += 3;
            w += 30;
            y += 4;
        }
        
        turtle.hide();
        turtle2.hide();
    }
}

        
    
