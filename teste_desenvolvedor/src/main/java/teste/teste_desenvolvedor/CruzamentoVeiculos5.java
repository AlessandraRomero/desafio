/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.teste_desenvolvedor;

/**
 *
 * @author alessandra
 */
public class CruzamentoVeiculos5 {
    public static void main(String[] args) {
        // Dados iniciais
        double distanciaTotal = 125.0; // Distância entre Ribeirão Preto e Barretos em km
        double velocidadeCarro = 90.0; // Velocidade do carro em km/h
        double velocidadeCaminhao = 80.0; // Velocidade do caminhão em km/h

        // Calcular o tempo para se cruzarem (em horas)
        double velocidadeRelativa = velocidadeCarro + velocidadeCaminhao;
        double tempoParaCruzar = distanciaTotal / velocidadeRelativa; // em horas

        // Calcular a distância percorrida por cada veículo
        double distanciaPercorridaCarro = velocidadeCarro * tempoParaCruzar;
        double distanciaPercorridaCaminhao = velocidadeCaminhao * tempoParaCruzar;

        // Pedágios
        int numeroPedagios = 3;
        double tempoAdicionalCarro = numeroPedagios * 5.0 / 60.0; // Tempo adicional devido aos pedágios 

        // Tempo total do carro incluindo pedágios
        double tempoTotalCarro = tempoParaCruzar + tempoAdicionalCarro;

        // Distância dos veículos ao cruzar
        double distanciaDoCarroAteRibeiraoPreto = distanciaPercorridaCarro;
        double distanciaDoCaminhaoAteRibeiraoPreto = distanciaTotal - distanciaPercorridaCaminhao;

        System.out.println("Distância do carro a Ribeirão Preto quando se cruzam: " + distanciaDoCarroAteRibeiraoPreto + " km");
        System.out.println("Distância do caminhão a Ribeirão Preto quando se cruzam: " + distanciaDoCaminhaoAteRibeiraoPreto + " km");

        // Comparar distâncias
        if (Math.abs(distanciaDoCarroAteRibeiraoPreto - distanciaDoCaminhaoAteRibeiraoPreto) < 1e-6) {
            System.out.println("Ambos os veículos estão igualmente distantes de Ribeirão Preto no momento do cruzamento.");
        } else {
            System.out.println("O veículo que estiver mais próximo de Ribeirão Preto pode ser identificado com base nas distâncias calculadas.");
        }
    }
}
//no momento do cruzamento, ambos os veículos estarão igualmente distantes de Ribeirão Preto, a 66 km. 
//o impacto dos pedágios no tempo do carro não altera a distância percorrida quando eles se cruzam,
//portanto, a distância de ambos os veículos em relação a Ribeirão Preto é a mesma.







