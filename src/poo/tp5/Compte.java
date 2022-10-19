
package poo.tp5;

public abstract class Compte {
 // declaration des Attributs
 public int num;
 public String proprietaire;
 public double solde;
 public boolean bloque ;
 Operation listeOp[];
 public int nbMax;
 public int nbOperation;
  // constructeur avec paramétre 
 public Compte(int n,boolean b,String prop ,double s,int nb){
    num=n;
    proprietaire= prop;
    solde=s;
    nbMax=nb;
    listeOp=new Operation[nb];
 }//End const

    //StringToString
    public String ToString(){
    return "la compte numero"+num+" a : Propritaire  "+proprietaire+" || Solde  "+"|| Liste Des Operations  "+super.toString();
             
}
    
    

    
    
    
    
    
}//End Class
