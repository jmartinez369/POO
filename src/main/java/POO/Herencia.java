/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

/**
 *
 * @author Jorge Martinez
 */
public class Herencia {

    public static void main(String[] args) {
        Animal p = new Perro("Negro", "SI", "SI", "SI", 4);
        p.Sonido();
        
        Animal g = new Gato("Blanco", "SI", "SI", "SI", 4);
        g.Sonido();
    }
}
