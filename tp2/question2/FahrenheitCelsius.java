package question2;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
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
        System.out.println(f + "�F --> " + c + "�C");}
       catch(NumberFormatException nfe){
        System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       } 
      }
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
        float cels =(float)((f-32)/1.8);
        return cels;
                        // � compl�ter    en rempla�ant la valeur retourn�e par la fonction de conversion
       // ...
     }

}
