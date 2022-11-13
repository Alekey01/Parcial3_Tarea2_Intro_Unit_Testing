import objetos.parcial3.intro.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRectangle {

    @Test
    public void testArea(){
        //Inicializacion
        Rectangle rectangle=new Rectangle(10,5);
        //Ejecucion
        double area =rectangle.getArea();
        //Validacion
        Assertions.assertEquals(50.0,area);
        Assertions.assertEquals(10.0,rectangle.getBase());
        Assertions.assertEquals(5.0,rectangle.getHeight());
    }
    @Test
    public void testPerimeter(){
        //Inicializacion
        Rectangle rectangle=new Rectangle(10,5);
        //Ejecucion
        double perimeter =rectangle.getPerimeter();
        //Validacion
        Assertions.assertEquals(30.0,perimeter);
    }
}