/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientacaobjetos;

/**
 *
 * @author vidag
 */
public class OrientacaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.setCor("Branco");
        carro.setModelo("Celta");
        carro.setCapacidadeTanque(45);
        
        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getCapacidadeTanque());
        
        
    }
    
}
