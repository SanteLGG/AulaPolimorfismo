/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo1;

/**
 *
 * @author luisg
 */
public class Peixe extends Animal {
    //atributos
    private String corEscama;

    @Override
    public  void emitirSom(){
        System.out.println("Não emite som");
    }
    
    @Override
    public  void alimentar(){
        System.out.println("Come substâncias");
    }

    @Override
    public void locomovoer(){
        System.out.println("Nadando");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    //getters and setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
