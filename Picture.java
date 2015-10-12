/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square suelo;
    private Person persona;
    private Circle copa1;
    private Circle copa2;
    private Square tronco;
    private Square tronco1;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        suelo = new Square();
        suelo.makeVisible();
        suelo.changeColor("green");
        suelo.moveVertical(130);
        suelo.moveHorizontal(-310);
        suelo.changeSize(500);
        
       
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    public void moveSun()
    {
        if (sun != null)
        {
            sun.slowMoveVertical(110);
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            suelo.changeColor("black");
        }
    }
    public void  newPerson()
    { persona = new Person();
      persona.makeVisible();
      persona.moveHorizontal(-250);
      persona.moveVertical(20);
      persona.slowMoveHorizontal(120);
      
    
    }   
   public void crearArbol()
   {  copa1 = new Circle();
      copa1.moveHorizontal(60);
      copa1.moveVertical(60);
      copa1.changeColor("green");
      copa1.makeVisible();
      
      copa2 = new Circle();
      copa2.moveHorizontal(75);
      copa2.moveVertical(60);
      copa2.changeColor("green");
      copa2.makeVisible();
      
      tronco = new Square();
      tronco.moveHorizontal(11);
      tronco.moveVertical(90);
      tronco.changeColor("black");
      tronco.changeSize(20);
      tronco.makeVisible();
      
      tronco1 = new Square();
      tronco1.moveHorizontal(11);
      tronco1.moveVertical(110);
      tronco1.changeSize(20);
      tronco1.changeColor("black");
      tronco1.makeVisible();
    
}   public void MoverArbol()
 {
     if (copa1 != null)
     {
       copa1.slowMoveHorizontal(100);
       copa2.slowMoveHorizontal(100);
       tronco.slowMoveHorizontal(100);
       tronco1.slowMoveHorizontal(100);
     }
 }
}
