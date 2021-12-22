package by.htp.ramanouski.tack32;

public class Point {
    private int x;
    private int y;

    public double distance(){
        return findDistance(new Point(0,0));
    }
    public double distance(int x, int y){
        return findDistance(new Point(x,y));
    }
    public double distance(Point point){
        return findDistance(point);
    }

    private double findDistance(Point point){
        return Math.sqrt(Math.pow(this.x - point.getX(),2) + Math.pow(this.y - point.getY(),2));
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
