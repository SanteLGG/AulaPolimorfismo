/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo1;

/**
 *
 * @author luisg
 */
public class Cachorro extends Mamifero {
    public void enterrarOsso(){
        System.out.println("Enterrou o osso");
    }
    public void abanarRabo(){
        System.out.println("Abanou o rabo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latiu");
    }
    
    
}
