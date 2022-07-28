/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaobjetos;

/**
 *
 * @author vidag
 */
public class Carro extends Veiculo{
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro() {
        
    }
    
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    
    
}
