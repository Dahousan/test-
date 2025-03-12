public class Vecteur {

    int n;
    double[]tab;

    Vecteur(int a){
        

        n=a;               
        tab=new double[a];
        System.out.println("I am constructor ");

    }

    Vecteur(int a ,double x){
         
        tab=new double [a];

        for (int i =0; i<tab.length;i++) {
            
            tab[i]=x;
            
        }      

    }
    
    Vecteur(double[]cp){for (int i =0; i<tab.length;i++) tab[i]=cp[i];}

    public double[] prod_scal(double[]v2){
         double[]pr=new double[tab.length];
        if (tab.length == v2.length) 
       for (int i = 0; i < tab.length; i++) pr[i]*=tab[i]*v2[i];
       return pr;
}
static public double[] sum(double[] v1 ,double[]v2){
    double[]tabi;
    if ( v1.length !=v2.length)tabi=null ;
    else{

        tabi=new double[v1.length];
   for (int i = 0; i < v1.length; i++) tabi[i]=v1[i]+v2[i];


}
return tabi ;
}

public void show (){

for (int i = 0; i < tab.length; i++) {
    
    System.out.println(tab[i]);
}

}









    
}