package reciclagem;

public class SolicitacaoReciclagem {
    private String categoria;
    private String tipoLixo;
    private double quantidadeKg;
    private String modalidadeEntregaRetira;
    private String endereco;
    private String observacao;

    public SolicitacaoReciclagem() {
        // Construtor vazio
    }

    public SolicitacaoReciclagem(String categoria, String tipoLixo, double quantidadeKg,
                                 String modalidadeEntregaRetira, String endereco, String observacao) {
        this.categoria = categoria;
        this.tipoLixo = tipoLixo;
        this.quantidadeKg = quantidadeKg;
        this.modalidadeEntregaRetira = modalidadeEntregaRetira;
        this.endereco = endereco;
        this.observacao = observacao;
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
}
