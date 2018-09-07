package fr.univlehavre.projet;

/**
 * Classe Point. Cartesian space. Finite real coordinates.
 * 
 */
public class Point {

    private double x;
    private double y;

    public Point(){
        this(0.0,0.0);
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        check(x);
        this.x = x;
    }

    public void setY(double y) {
        check(y);
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }    

    /**
     * the real 2-norm (euclidean) distance between this point and the other
     * @param other Point object to compute the distance between this point.
     * @return distance (double value)
     */
    public double euclideanDistance(Point other){
        return Math.sqrt(   Math.pow(other.getX() - getX(), 2) + 
                            Math.pow(other.getY() - getY(), 2));
    }

    private void check(double v) {
        if(Double.isInfinite(v) || Double.isNaN(v)) {
            throw new NumberFormatException("Points coordinates should be finite");
        }
    }

}