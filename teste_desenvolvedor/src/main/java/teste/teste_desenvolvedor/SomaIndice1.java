/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.teste_desenvolvedor;

/**
 *
 * @author alessandra
 */
public class SomaIndice1 {
     public static void main(String[] args) {
        int indice = 12, soma = 0, K = 1;

        while (K < indice) {
            K += 1;
            soma += K;
        }

        System.out.println("Valor final da soma: " + soma);
    }
}
