public class ZmiennaKlasowa{
	public String nazwaLekcji="Matma";

	public StaticLesson(){
	}
	
}



class Main{

	public static void main (String[] args) {
		StaticLesson matma= new StaticLesson();	
		StaticLesson gegra= new StaticLesson();	

		syso(gegra); //matma			

syso(matma); //matma

gegra.nazwaLekcji="gegra";

syso(matma); //matma
syso(gegra); //gegra

	}

}

