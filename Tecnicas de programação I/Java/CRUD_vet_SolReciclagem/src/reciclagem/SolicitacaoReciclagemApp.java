package reciclagem;

import java.util.Scanner;

public class SolicitacaoReciclagemApp {
    private static SolicitacaoReciclagem[] solicitacoes = new SolicitacaoReciclagem[3]; // Tamanho máximo do vetor
    private static int numSolicitacoes = 0; // Para rastrear o número de solicitações no vetor
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione uma operação:");
            System.out.println("1. Criar Solicitação de Reciclagem");
            System.out.println("2. Listar Solicitações de Reciclagem");
            System.out.println("3. Atualizar Solicitação de Reciclagem");
            System.out.println("4. Deletar Solicitação de Reciclagem");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a entrada do número

            switch (escolha) {
                case 1:
                    criarSolicitacaoReciclagem();
                    break;
                case 2:
                    listarSolicitacoesReciclagem();
                    break;
                case 3:
                    atualizarSolicitacaoReciclagem();
                    break;
                case 4:
                    deletarSolicitacaoReciclagem();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }

        System.out.println("O programa foi encerrado.");
    }

    private static void criarSolicitacaoReciclagem() {

        if (numSolicitacoes < solicitacoes.length) { // Verifica se há espaço disponível no vetor
            System.out.println("Selecione a Categoria do lixo a reciclar:");
            System.out.println("1. Sólido");
            System.out.println("2. Líquido");
            System.out.println("3. Orgânico");
            System.out.println("4. Químico");
            int categoriaEscolhida = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a entrada do número

            String categoria;
            String[] tiposLixo;

            switch (categoriaEscolhida) {
                case 1:
                    categoria = "Sólido";
                    tiposLixo = new String[]{"Ferro", "Alumínio", "Papel", "Plástico", "Outros"};
                    break;
                case 2:
                    categoria = "Líquido";
                    tiposLixo = new String[]{"Óleo lubrificante", "Óleo alimentício", "Outros"};
                    break;
                case 3:
                    categoria = "Orgânico";
                    tiposLixo = new String[]{"Comida", "Frutas", "Fezes animal", "Outros"};
                    break;
                case 4:
                    categoria = "Químico";
                    tiposLixo = new String[]{"Ácidos", "Baterias", "Tintas", "Outros"};
                    break;
                default:
                    System.out.println("Opção de categoria inválida.");
                    return;
            }

            System.out.println("Selecione o Tipo de Lixo:");
            for (int i = 0; i < tiposLixo.length; i++) {
                System.out.println((i + 1) + ". " + tiposLixo[i]);
            }
            int tipoEscolhido = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a entrada do número

            if (tipoEscolhido < 1 || tipoEscolhido > tiposLixo.length) {
                System.out.println("Opção de tipo de lixo inválida.");
                return;
            }

            String tipoLixo = tiposLixo[tipoEscolhido - 1];

            System.out.print("Quantidade em kg: ");
            double quantidadeKg = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha após a entrada do número

            System.out.println("Selecione a Modalidade:");
            System.out.println("1. Entrega");
            System.out.println("2. Retirada");
            int modalidadeEscolhida = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a entrada do número

            String modalidade;
            if (modalidadeEscolhida == 1) {
                modalidade = "Entrega";
            } else if (modalidadeEscolhida == 2) {
                modalidade = "Retirada";
            } else {
                System.out.println("Opção de modalidade inválida.");
                return;
            }

            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();

            System.out.print("Observação: ");
            String observacao = scanner.nextLine();

            SolicitacaoReciclagem solicitacao = new SolicitacaoReciclagem(
                categoria, tipoLixo, quantidadeKg, modalidade, endereco, observacao
            );

            solicitacoes[numSolicitacoes] = solicitacao; // Adiciona a nova solicitação ao vetor
            numSolicitacoes++; // Atualiza o número de solicitações
            System.out.println("Solicitação de reciclagem criada com sucesso!");
        } else {
            System.out.println("Limite de solicitações atingido. Não é possível adicionar mais solicitações.");
        }
    }

    private static void listarSolicitacoesReciclagem() {
        System.out.println("Lista de Solicitações de Reciclagem:");
        for (int i = 0; i < numSolicitacoes; i++) {
            SolicitacaoReciclagem solicitacao = solicitacoes[i];
            System.out.println(solicitacao.toString());
           
        }
    }

    private static void atualizarSolicitacaoReciclagem() {
    	listarSolicitacoesReciclagem();
        System.out.print("Digite o número da solicitação que deseja atualizar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após a entrada do número

        if (indice >= 1 && indice <= numSolicitacoes) {
            SolicitacaoReciclagem solicitacao = solicitacoes[indice - 1];

            System.out.println("Atualize os campos (pressione Enter para manter o valor atual):");
            System.out.print("Nova Categoria: ");
            String novaCategoria = scanner.nextLine();
            if (!novaCategoria.isEmpty()) {
                solicitacao.setCategoria(novaCategoria);
            }

            System.out.print("Novo Tipo de Lixo: ");
            String novoTipoLixo = scanner.nextLine();
            if (!novoTipoLixo.isEmpty()) {
                solicitacao.setTipoLixo(novoTipoLixo);
            }

            System.out.print("Nova Quantidade em kg: ");
            String novaQuantidadeKgStr = scanner.nextLine();
            if (!novaQuantidadeKgStr.isEmpty()) {
                double novaQuantidadeKg = Double.parseDouble(novaQuantidadeKgStr);
                solicitacao.setQuantidadeKg(novaQuantidadeKg);
            }

            System.out.print("Nova Modalidade: ");
            String novaModalidade = scanner.nextLine();
            if (!novaModalidade.isEmpty()) {
                solicitacao.setModalidadeEntregaRetira(novaModalidade);
            }

            System.out.print("Novo Endereço: ");
            String novoEndereco = scanner.nextLine();
            if (!novoEndereco.isEmpty()) {
                solicitacao.setEndereco(novoEndereco);
            }

            System.out.print("Nova Observação: ");
            String novaObservacao = scanner.nextLine();
            if (!novaObservacao.isEmpty()) {
                solicitacao.setObservacao(novaObservacao);
            }

            System.out.println("Solicitação de reciclagem atualizada com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void deletarSolicitacaoReciclagem() {
        listarSolicitacoesReciclagem();
        System.out.print("Digite o número da solicitação que deseja deletar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após a entrada do número

        if (indice >= 1 && indice <= numSolicitacoes) {
            // Remova a solicitação e mova as restantes, se necessário
            for (int i = indice - 1; i < numSolicitacoes - 1; i++) {
                solicitacoes[i] = solicitacoes[i + 1];
            }
            solicitacoes[numSolicitacoes - 1] = null; // Define a última posição como nula
            numSolicitacoes--; // Atualiza o número de solicitações
            System.out.println("Solicitação de reciclagem deletada com sucesso!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
