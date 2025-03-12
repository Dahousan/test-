public class Poti {

    private double x;
    private double y;

    public Poti (double a , double b){

        x=a;
        y=b;

    }  
    public void deplace(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double abscisse() {
        return x;
    }

    public double ordonnee() {
        return y;
    }

    public void homothetie (double vl){
           
           x*=vl;
           y*=vl;

    }

    public void rotation (double ang){
 
        double rad = Math.toRadians(ang);
        double xpr = x*Math.cos(rad)-y*Math.sin(rad);
        double ypr = x*Math.cos(rad)+y*Math.sin(rad);
        x=xpr;
        y=ypr;

    }
    public double rho (){ return Math.sqrt((x*x+y*y));}
    public double theta (){ return Math.atan2(y, x);}

    public void showC (){ System.out.println("Les coordonnees cartesiennes sont : "+ x +" et "+ y);}
    public void showP (){System.out.println("Les coordonnes polaires sont "+rho()+" et "+theta());}



    
}
