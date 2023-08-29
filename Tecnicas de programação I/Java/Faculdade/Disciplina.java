public class Disciplina {

  private String nome;
  private double notaP1;
  private double notaP2;
  private double notaA1;
  private double notaA2;
  private double media;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setnotaP1(double notaP1) {
    this.notaP1 = notaP1;
  }

  public void setnotaP2(double notaP2) {
    this.notaP2 = notaP2;
  }

  public void setnotaA1(double notaA1) {
    this.notaA1 = notaA1;
  }

  public void setnotaA2(double notaA2) {
    this.notaA2 = notaA2;
  }

  public void setMedia() {
    this.media =
      (this.notaP1 + (2 * this.notaP2) + this.notaA1 + this.notaA2) / 5;
    if (this.media >= 6) {
      System.out.println("A media final é " + this.media + " aluno APROVADO");
    } else {
      System.out.println("A media final é " + this.media + " aluno REPROVADO");
    }
  }

  public String getNome() {
    return this.nome;
  }

  public double getnotaP1() {
    return this.notaP1;
  }

  public double getnotaP2() {
    return this.notaP2;
  }

  public double getnotaA1() {
    return this.notaA1;
  }

  public double getnotaA2() {
    return this.notaA2;
  }

  public double getMedia() {
    return this.media;
  }
}
