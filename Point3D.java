package Point;

public class Point3D extends Point2D {
    public float z =0f;
    public Point3D(){
        super.getX();
        super.getY();
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {

        return z;
    }

    public void setZ(float z) {

        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.z=z;
    }
    public float[] getXYZ(){
        float[]array=new float[3];
        array[0]=x;
        array[1]=y;
        array[2]=z;
        return array;
    }
    public String toString(){
        return "x,y,z = ("+x+" , "+y+" , "+z+")";
    }

}
