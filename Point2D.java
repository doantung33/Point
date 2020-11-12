package Point;

public class Point2D {
    public float x=1f;
    public float y=2f;
    public Point2D(){

    }
    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float []arr=new float[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }
    public void setXY(float X,float Y ){
        this.x=x;
        this.y=y;

    }
    public String toString(){
        return ("x,y = ("+x+","+y+")");
    }

}
