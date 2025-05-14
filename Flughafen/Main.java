public class Main{

public static void main(String[] args){
    FlugGast fgast = new FlugGast("Hans", "Dieter", FlugKlasse.Economy);
    
    System.out.println(fgast);

    
    System.out.println(Flugverwaltung.importFlugGaeste("C:/Test/fluggaeste.csv"));
    
}
}
