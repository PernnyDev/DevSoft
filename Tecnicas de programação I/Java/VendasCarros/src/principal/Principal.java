package principal;

import java.util.Scanner;
import Carro.Carro;
import Carro.CarroDAO;
import Carro.Pneu;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarroDAO carroDAO = new CarroDAO();
        
        boolean executando = true;
        
        while (executando) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Listar Carros");
            System.out.println("3. Encerrar o programa");
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    Carro carro = new Carro();
                    System.out.println("Informe a marca do carro:");
                    String marca = scanner.next();
                    carro.setMarca(marca);
                    System.out.println("Informe o ano do carro:");
                    String ano = scanner.next();
                    carro.setAno(ano);
                    
                    Pneu pneu = new Pneu();
                    System.out.println("Informe o aro do pneu:");
                    int aro = scanner.nextInt();
                    pneu.setAro(aro);
                    System.out.println("Informe o ano de fabricação do pneu:");
                    String anoFabricacao = scanner.next();
                    pneu.setAnoFabricacao(anoFabricacao);
                    
                    carro.setRodas(pneu);
                    carroDAO.inserirCarro(carro);
                    System.out.println("Carro cadastrado com sucesso!");
                    break;
                    
                case 2:
                    carroDAO.imprimirCarros();
                    break;
                    
                case 3:
                    System.out.println("Encerrando o programa.");
                    executando = false;
                    scanner.close();
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
