/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.teste_desenvolvedor;

/**
 *
 * @author alessandra
 */
public class Sequencias2 {
     public static void main(String[] args) {
        // Sequência a: 1, 3, 5, 7, ___(incremento de 2)
        int[] seqA = {1, 3, 5, 7};
        System.out.println("Próximo número da sequência A: " + (seqA[seqA.length - 1] + 2));

        // Sequência b: 2, 4, 8, 16, 32, 64, ___(multiplica por 2)
        int[] seqB = {2, 4, 8, 16, 32, 64};
        System.out.println("Próximo número da sequência B: " + (seqB[seqB.length - 1] * 2));

        // Sequência c: 0, 1, 4, 9, 16, 25, 36, ___(quadrado)
        int[] seqC = {0, 1, 4, 9, 16, 25, 36};
        int proximoC = seqC.length * seqC.length;
        System.out.println("Próximo número da sequência C: " + proximoC);

        // Sequência d: 4, 16, 36, 64, ___(quadrado de numeros pares)
        int[] seqD = {4, 16, 36, 64};
        int proximoD = (seqD.length * 2 + 2) * (seqD.length * 2 + 2);
        System.out.println("Próximo número da sequência D: " + proximoD);

        // Sequência e: 1, 1, 2, 3, 5, 8,___(fibonacci)
        int[] seqE = {1, 1, 2, 3, 5, 8};
        int proximoE = seqE[seqE.length - 1] + seqE[seqE.length - 2];
        System.out.println("Próximo número da sequência E: " + proximoE);

        // Sequência f: 2, 10, 12, 16, 17, 18, 19, ___(exclui multiplos de 5)
        int[] seqF = {2, 10, 12, 16, 17, 18, 19};
        int ultimoNumero = seqF[seqF.length - 1];
        int proximoNumero = ultimoNumero + 1;

        // Encontrar o próximo número que não seja múltiplo de 5
        while (proximoNumero % 5 == 0) {
            proximoNumero++;
        }

        System.out.println("Próximo número da sequência F: " + proximoNumero);
    }
}
