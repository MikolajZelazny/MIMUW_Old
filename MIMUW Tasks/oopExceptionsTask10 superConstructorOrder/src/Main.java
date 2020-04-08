public class Main extends ParentClass {


    public Main() throws Exception {
        super();
    }



    public static void main(String[] args) {
        try {
            new Main();
        } catch (Exception e) {
            System.out.println("Catch");
        }
    }
}

/* TASK VALID EXPLANATIONS SUGGESTED BY "MIMUW"

#FIRST:
class Nadklasa1 {
  Nadklasa1() throws Exception {}
  Nadklasa1(int i) throws Exception {}
}

class Podklasa1 extends Nadklasa {
  Podklasa1() throws Exception {
    //nie wskazujemy konstruktora nadklasy, więc będzie użyty bezparametrowy
    //nie ma co otaczać instrukcją try-catch
  }

  Podklasa1(int i) throws Exception {
    //pierwszą instrukcją jest try-catch,
    //więc kompilator uzna, że nie wskazujemy konstruktora nadklasy
    //i użyje bezparametrowego
    try {
      //tu nie może być odowołania do konstruktora nadklasy, bo to nie jest pierwsza instrukcja
      //super(i);
      throw new Exception();
    } catch (Exception e) {}
  }
}

#SECOUND:

class Nadklasa1 {
  Nadklasa1() throws Exception {}
  Nadklasa1(int i) throws Exception {}
}

class Podklasa1 extends Nadklasa {
  Podklasa1() throws Exception {
    //nie wskazujemy konstruktora nadklasy, więc będzie użyty bezparametrowy
    //nie ma co otaczać instrukcją try-catch
  }

  Podklasa1(int i) throws Exception {
    //pierwszą instrukcją jest try-catch,
    //więc kompilator uzna, że nie wskazujemy konstruktora nadklasy
    //i użyje bezparametrowego
    try {
      //tu nie może być odowołania do konstruktora nadklasy, bo to nie jest pierwsza instrukcja
      //super(i);
      throw new Exception();
    } catch (Exception e) {}
  }
}

#SECOND:
class Nadklasa2 {
  int dajInt() {
    System.out.println("Nadklasa2.dajInt()");
    return 0;
  }
  int i = dajInt();

  {
    System.out.println("blok inicjalizacji w Nadklasa2");
  }

  Nadklasa2(int i) {
    System.out.println("konstruktor nadklasy");
  }
}

public class Podklasa2 extends Nadklasa2 {
  {
    System.out.println("blok inicjalizacji w Podklasa2");
  }

  int inneDajInt() {
    System.out.println("Podklasa2.inneDajInt()");
    return 0;
  }
  int i = inneDajInt();

  Podklasa2() {
    //musimy wskazać konstruktor, bo nie ma bezparametrowego
    super(0);
    System.out.println("konstruktor podklasy");
  }

  public static void main(String[] args) {
    Podklasa2 p = new Podklasa2();
  }
}


 */