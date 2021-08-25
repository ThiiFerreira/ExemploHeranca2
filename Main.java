class Main {
  public static void main(String[] args) {
    
    Aluno a1 = new Aluno();
    a1.setNome("Claudio");
    a1.setMatricula(1111);
    a1.setCurso("Informatica");
    a1.setIdade(16);
    a1.pagarMensalidade();

    Bolsista b1 = new Bolsista();
    b1.setMatricula(1112);
    b1.setNome("Jubileu");
    b1.setBolsa(12.5f);
    b1.setSexo("M");
    b1.pagarMensalidade();
  }
}