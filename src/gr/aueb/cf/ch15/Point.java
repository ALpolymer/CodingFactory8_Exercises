package gr.aueb.cf.ch15;

public class Point {
    private double x;

    public Point(){

    }

    public Point(double x){
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

     public void movePlus1(){
        x += 1;
     }

     protected void movePlus10(){
        x += 10;
     }

     private void reset(){
        x = 0;
     }


}
