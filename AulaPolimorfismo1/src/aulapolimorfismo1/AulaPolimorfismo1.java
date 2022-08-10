/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapolimorfismo1;

/**
 *
 * @author luisg
 */
public class AulaPolimorfismo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Reptil r = new Reptil();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        k.abanarRabo();
        k.emitirSom();
        k.enterrarOsso();
        
        
        /*m.setCorpelo("Marrom");
        m.setIdade(10);
        m.setMembros(4);
        m.setPeso(7.4f);
        m.alimentar();
        m.locomovoer();
        m.emitirSom();*/
    }
    
}
