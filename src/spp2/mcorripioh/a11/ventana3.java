/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.a11;
import java.awt.*;

/**
 *
 * @author MayteCorripio
 */
public class ventana3 extends Frame  {
    //Atributos: 3 botones.
    private final Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana3 (){
        super("Grid Layout");
        setLayout(new GridLayout());
        
        btn1 = new Button("Botón 1");
        add (btn1);
        
        btn2 = new Button ("Botón 2");
        add (btn2);
        
        btn3 = new Button ("Botón 3");
        add (btn3);
        
        btn4 = new Button ("Botón 4");
        add (btn4);
        
        btn5 = new Button ("Botón 5");
        add (btn5);
        
        btn6 = new Button ("Botón 6");
        add (btn6);
        
        btn7 = new Button ("Botón 7");
        add (btn7);
        
        btn8 = new Button ("Botón 8");
        add (btn8);
        
        btn9 = new Button ("Botón 9");
        add (btn9);
        
        setSize(500,500);
        setVisible(true);
    
    }

}
