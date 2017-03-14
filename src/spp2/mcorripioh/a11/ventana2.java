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
public class ventana2 extends Frame  {
    //Atributos: 3 botones.
    private final Button btnNorte, btnSur, btnEste, btnOeste, btnCentro;
    
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana2 (){
        super("Border Layout");
        setLayout(new BorderLayout());
        
        btnNorte = new Button("North");
        add (btnNorte,BorderLayout.NORTH);
        
        btnSur = new Button ("South");
        add (btnSur,BorderLayout.SOUTH);
        
        btnEste = new Button ("East");
        add (btnEste,BorderLayout.EAST);
        
        btnOeste = new Button ("West");
        add (btnOeste,BorderLayout.WEST);
        
        btnCentro = new Button ("Center");
        add (btnCentro,BorderLayout.CENTER);
        
        setSize(800,600);
        setVisible(true);
    
    }

}
