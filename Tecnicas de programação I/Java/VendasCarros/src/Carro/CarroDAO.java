package Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
    private List<Carro> listaCarros;

    public CarroDAO() {
        listaCarros = new ArrayList<>();
    }

    // Método para inserir um carro na lista
    public void inserirCarro(Carro carro) {
        listaCarros.add(carro);
    }

    // Método para imprimir todos os carros da lista
    public void imprimirCarros() {
        if (listaCarros.isEmpty()) {
            System.out.println("A lista de carros está vazia.");
        } else {
            System.out.println("Lista de Carros:");
            for (Carro carro : listaCarros) {
                System.out.println("Marca: " + carro.getMarca());
                System.out.println("Ano: " + carro.getAno());
                if (carro.getRodas() != null) {
                    System.out.println("Dados do Pneu:");
                    System.out.println("Aro: " + carro.getRodas().getAro());
                    System.out.println("Ano de Fabricação: " + carro.getRodas().getAnoFabricacao());
                }
                System.out.println("-------------------------");
            }
        }
    }
}
