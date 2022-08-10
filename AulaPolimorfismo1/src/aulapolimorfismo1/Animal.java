/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo1;

/**
 *
 * @author luisg
 */
public abstract class Animal {
    //atributos
    protected float peso;
    protected int idade;
    protected int membros;
    
    //metodos
    public abstract void locomovoer();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    //getters and setters

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
    
    
}
