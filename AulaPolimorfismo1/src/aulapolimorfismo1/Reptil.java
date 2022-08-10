/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo1;

/**
 *
 * @author luisg
 */
public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomovoer() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vejetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }  
    
    //getters and setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
