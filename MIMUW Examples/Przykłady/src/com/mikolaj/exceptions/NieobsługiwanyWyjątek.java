package com.mikolaj.exceptions;

public class NieobsługiwanyWyjątek {
    public void głębiej(String s) throws Exception {
        System.out.println("początek głębiej");
        if (s == null) throw new Exception();
        System.out.println("koniec głębiej");
    }

    public void głeboko(String s) throws Exception {
        System.out.println("początek głęboko");
        głębiej(s);
        System.out.println("koniec głęboko");
    }

}
















/*
*
Kontrolowanie obsługi wyjątków przez kompilator
Warto zwrócić uwagę, że w deklaracjach wszystkich metod klasy NieobsługiwanyWyjątek występuje klauzula throws,
 która informuje, jakich wyjątków można się spodziewać w wyniku wywołania danej metody.
 W tym wypadku klauzula ta jest wymuszona przez kompilator, gdyż z metody mogą wydostać sie nieobsłużone wyjątki.
  Dzięki temu programista nie przeoczy żadnego wyjątku i jeżeli nie chce wszystkich obsłużyć musi
   świadomie wymienić je (bądź ich nadklasy) w deklaracji metody. Jeżeli wymienianych jest kilka klas,
    ich nazwy oddziela się przecinkiem.

W klauzuli throws można również wymienić wyjątki, które w aktualnej wersji metody nie mogą wystąpić.
W ten sposób można zawczasu wymusić na innych programistach, aby ich kod używający naszej metody był na
te wyjątki przygotowany. Gdy w przyszłej wersji będą już się mogły pojawić, nie spowoduje to żadnych problemów.

Obsługa wyjątków
try {
  //kod który może zgłosić wyjątki
} catch (Typ1 w) {
  //obsługa wyjątków Typ1
} catch (Typ2 w) {
  //obsługa wyjątków Typ2
} catch (Typ3 w) {
  //obsługa wyjątków Typ3
}
Do obsługi wyjątków służy instrukcja try-catch. Po try podaje się blok instrukcji,
których wyjątki chcemy obsługiwać. Następnie podawana jest lista bloków catch, które przypominają
deklaracje metod. Każda z nich obsługuje wyjątki określonego typu. Typ wyjątku wraz z nazwą zmiennej,
 na którą zostanie przypisany złapany egzemplarz, podaje się między nawiasami bezpośrednio po
 słowie kluczowym catch. Do tej zmiennej można się odwoływać w kodzie obsługi wyjątku. Do obsługi wyjątku
  wybierany jest zawsze pierwszy pasujący blok catch. Ponieważ wyjątki są obiektami "pasowanie"
  oznacza tu po prostu możliwość przypisania wyjątku na zmienną zadeklarowaną po słowie kluczowym catch.
   Wszystkie dalsze bloki catch są pomijane, nawet jeżeli pasowały. Jeżeli wyjątek nie pasuje
    do żadnego bloku catch, nie zostaje obsłużony i stos wywołań jest nadal rozwijany.
     W pokazanej poniżej klasie ObsługiwanyWyjątek, która jest modyfikacją poprzedniego przykładu,
      wyjątek Exception jest już obsługiwany i nie powoduje przerwania programu.

public class ObsługiwanyWyjątek {
  void głębiej(String s) throws Exception {
    System.out.println("początek głębiej");
    if (s == null) throw new Exception();
    System.out.println("koniec głębiej");
  }

  void głęboko(String s) {
    try {
      System.out.println("początek głęboko");
      głębiej(s);
      System.out.println("koniec głęboko");
    } catch (Exception e) {
      System.out.println("obsługa wyjątku");
      e.printStackTrace(System.out);
    }
    System.out.println("po obsłużeniu wyjątku");
  }

  public static void main(String[] args) {
    ObsługiwanyWyjątek ep = new ObsługiwanyWyjątek();
    System.out.println("przed głęboko");
    ep.głęboko(null);
    System.out.println("po głęboko");
  }
}
Warto zwrócić uwagę, że metody głęboko() i main() nie muszą już posiadać klauzuli throws.

Na konsolę nadal wypisywane są informacje o wyjątku, ale jest to spowodowane użyciem w kodzie obsługi
 wyjątku metody printStackTrace() z parametrem System.out. Metoda ta jest odziedziczona z klasy Throwable,
  po której muszą dziedziczyć wszystkie wyjątki.

przed głęboko
początek głęboko
początek głębiej
obsługa wyjątku
java.lang.Exception
  at test.ObsługiwanyWyjątek.głębiej(ObsługiwanyWyjątek.java:4)
  at test.ObsługiwanyWyjątek.głęboko(ObsługiwanyWyjątek.java:11)
  at test.ObsługiwanyWyjątek.main(ObsługiwanyWyjątek.java:23)
po obsłużeniu wyjątku
po głęboko
Rozwijanie stosu
Poniższa prezentacja pokazuje jak rozwijany jest stos podczas zgłaszania wyjątku.
*
*
* */
