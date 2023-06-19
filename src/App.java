
class App {
  public static void main(String[] args) {
    System.out.println("App");

    Aluno a21 = new Aluno("Marcio", 123);
    Aluno a22 = new Aluno("Marcio Torres", 123);
    System.out.println(a21 == a22); // false
    System.out.println(a21.equals(a21)); // true
    System.out.println(a21.equals(a22)); // true

    System.out.println(a21.equals(a22)); // true
    System.out.println(a22.equals(a21)); // true (SIMÉTRICO)
    // simétrico A=B ENTÃO B=A
    // reflexivo A=A
    System.out.println(a21.equals(a21)); // true (REFLEXIVO)
    // CONSISTENTE
    // a==b = true 
    // a==b = true

    System.out.println(a21.equals(null)); // false
    a22 = null; // false
    // a21= null; // NullPointerException
    System.out.println(a21.equals(a22));
    // TRANSITIVO
    // a == b = true
    // a == c = true
    // b == c = true

    Object o1 = "asdasdas";
    Object o2 = 21321321;
    Object o3 = new Aluno("");

    System.out.println(a21); // implícito
    // System.out.println(a21.toString()); // explícito
    // não usar para saída no front-end.
    // String html = "<div>" + a21 + "</div>";
    System.out.println("<a>" + a21 + "</a>");
  }
}