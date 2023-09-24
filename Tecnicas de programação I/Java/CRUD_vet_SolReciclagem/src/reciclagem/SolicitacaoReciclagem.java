package reciclagem;

public class SolicitacaoReciclagem {
    private static int contadorIds = 1;
    private int id;
    private String categoria;
    private String tipoLixo;
    private double quantidadeKg;
    private String modalidadeEntregaRetira;
    private String endereco;
    private String observacao;

    public SolicitacaoReciclagem(String categoria, String tipoLixo, double quantidadeKg,
                                 String modalidadeEntregaRetira, String endereco, String observacao) {
        this.id = contadorIds++;
        this.categoria = categoria;
        this.tipoLixo = tipoLixo;
        this.quantidadeKg = quantidadeKg;
        this.modalidadeEntregaRetira = modalidadeEntregaRetira;
        this.endereco = endereco;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoLixo() {
        return tipoLixo;
    }

    public void setTipoLixo(String tipoLixo) {
        this.tipoLixo = tipoLixo;
    }

    public double getQuantidadeKg() {
        return quantidadeKg;
    }

    public void setQuantidadeKg(double quantidadeKg) {
        this.quantidadeKg = quantidadeKg;
    }

    public String getModalidadeEntregaRetira() {
        return modalidadeEntregaRetira;
    }

    public void setModalidadeEntregaRetira(String modalidadeEntregaRetira) {
        this.modalidadeEntregaRetira = modalidadeEntregaRetira;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Solicitação #" + id + "\n" +
               "Categoria: " + categoria + "\n" +
               "Tipo de Lixo: " + tipoLixo + "\n" +
               "Quantidade em kg: " + quantidadeKg + "\n" +
               "Modalidade: " + modalidadeEntregaRetira + "\n" +
               "Endereço: " + endereco + "\n" +
               "Observação: " + observacao + "\n";
    }
}
