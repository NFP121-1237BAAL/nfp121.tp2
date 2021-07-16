package question1;


/**
 * Write a description of class IHMPile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author techno
 */
public class IHMPile extends JFrame implements ActionListener{
 private JTextField entree = new JTextField("c", 7 );
 private JButton  empiler = new JButton( "empiler" );
 private JTextField sortie = new JTextField("c", 7 );
 private JButton  depiler = new JButton( "depiler" );
  Pile p1 = new Pile (10);
  public IHMPile(){
    super("IHMPile");
 
    setLayout(new FlowLayout());
    add( entree ); add( empiler ); add( depiler) ; add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.red );
    setLocation(100,100);
    pack();setVisible(true);
    
    empiler.addActionListener( this );
    depiler.addActionListener(this);

  }
  public void actionPerformed( ActionEvent e ){
if ( e.getSource()==empiler){
    try{
      String s = entree.getText();
Object obj = s ; 
    p1. empiler (obj);}

    catch(NumberFormatException nfe){
      entree.setText("erreur de conversion ! ");
    }
     catch (PilePleineException pe){
entree. setText(pe.getMessage());}}
else
if (e.getSource()==depiler){
    try{
   Object obj= p1. depiler ();
String resultat = obj.toString();
sortie.setText(resultat);}
    catch(NumberFormatException nfe){
      sortie.setText("erreur de conversion ! ");
    }
catch (PileVideException pv){
sortie.  setText(pv.getMessage());}}

  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         new IHMPile();
        // TODO code application logic here
    }
    
}

