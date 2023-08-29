public class Aluno {

  private String nome;
  private String ra;
  private Disciplina disciplina;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setRa(String ra) {
    this.ra = ra;
  }

  public String getNome() {
    return this.nome;
  }

  public String getRa() {
    return this.ra;
  }

  public void setDisciplina(Disciplina disciplina) {
    this.disciplina = disciplina;
  }

  public void gerarHistorico() {
    System.out.println("As médias do aluno " + this.nome + "São");
    System.out.println(disciplina.getNome());
    System.out.println(disciplina.getMedia());
  }
}
