package question2;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
        int f=0;
        float c=0;
        for(int i=0;i<args.length;i++){
        try{
        f=java.lang.Integer.parseInt(args[i]);
        c =fahrenheitEnCelsius(f);
        System.out.println(f + "ºF --> " + c + "ºC");}
       catch(NumberFormatException nfe){
        System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       } 
      }
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
        float cels =(float)((f-32)/1.8);
        return cels;
                        // à compléter    en remplaçant la valeur retournée par la fonction de conversion
       // ...
     }

}
