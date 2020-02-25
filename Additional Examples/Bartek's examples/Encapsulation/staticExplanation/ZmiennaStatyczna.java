public class ZmiennaStatyczna{
	public static String nazwaLekcji="Matma"; //sprawdz w ktorym miejscu musi byc static napisane przy definicji zmiennej

	public StaticLesson(){
	}
	
}



class Main{

	public static void main (String[] args) {
		ZmiennaStatyczna matma= new ZmiennaStatyczna();	
		ZmiennaStatyczna gegra= new ZmiennaStatyczna();	


		syso(gegra); //matma			

syso(ZmiennaStatyczna.nazwaLekcji); //matma

gegra.nazwaLekcji="gegra";

syso(matma); //gegra -zmienna zmienila sie globalnie
syso(gegra); //gegra

	}

}

