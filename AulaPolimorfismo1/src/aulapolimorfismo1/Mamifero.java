/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo1;

/**
 *
 * @author luisg
 */
public class Mamifero extends Animal {
    private String corpelo;

    @Override
    public void locomovoer(){
        System.out.println("Andar");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamifero");
    }
    
    //getters and setters
    public String getCorpelo() {
        return corpelo;
    }

    public void setCorpelo(String corpelo) {
        this.corpelo = corpelo;
    }
    
}
