class Aluno {

  // chave? Universally Unique Identification
  private int matricula;
  private String nome;

  Aluno(String nome) {
    this.nome = nome;
  }
  // construtor sobrecarregado
  Aluno(String nome, int matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  int getMatricula() {
    return matricula;
  }

  void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  String getNome() {
    return nome;
  }

  void setNome(String nome) {
    this.nome = nome;
  }
  
  // igualdade, se dá pelo método equals
  // assinatura equals(Object):boolean
  public boolean equals(Object outro) { // equals("")
    // if (outro == null) {
    //   return false;
    // }
    if (this == outro) {
      return true;
    }
    if (outro instanceof Aluno) {
      Aluno outroAluno = (Aluno) outro;
      return (this.matricula == outroAluno.matricula);
    }

    return false;
  }

  // representação String do objeto Aluno
  @Override
  public String toString() {
    return "<span>" + matricula + "</span>" 
      + "<span>" + nome + "</span>";
  }

}
