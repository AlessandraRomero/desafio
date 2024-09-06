/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.teste_desenvolvedor;

/**
 *
 * @author alessandra
 */
public class Faturamento3 {
    public static void main(String[] args) {
        double[] faturamentos = {0, 200, 600, 0, 400, 500, 0, 800};  

        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasValidos = 0;

        // Calculando o menor, maior e soma dos faturamentos
        for (double faturamento : faturamentos) {
            if (faturamento > 0) {
                if (faturamento < menorValor) {
                    menorValor = faturamento;
                }
                if (faturamento > maiorValor) {
                    maiorValor = faturamento;
                }
                somaFaturamento += faturamento;
                diasValidos++;
            }
        }

        double mediaAnual = somaFaturamento / diasValidos;
        int diasAcimaMedia = 0;

        for (double faturamento : faturamentos) {
            if (faturamento > mediaAnual) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Dias acima da média: " + diasAcimaMedia);
    }
}
