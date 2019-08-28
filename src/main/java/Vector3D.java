public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private double getX(){
        return x;
    }

    private double getY(){
        return y;
    }

    private double getZ(){
        return z;
    }

    public double lengthOfVector(){
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double scalarProduct(Vector3D v2){
        return x*v2.getX() + y*v2.getY() + z*v2.getZ();
    }

    public Vector3D vectorProduct(Vector3D v2) {
        double x2 = v2.getX();
        double y2 = v2.getY();
        double z2 = v2.getZ();
        return new Vector3D(y*z2-z*y2, z*x2-x*z2, x*y2-y*x2);
    }

    public double angle(Vector3D v2) {
        return (scalarProduct(v2)/(this.lengthOfVector()*v2.lengthOfVector()));
    }

    public Vector3D sum (Vector3D v2){
        double x2 = v2.getX();
        double y2 = v2.getY();
        double z2 = v2.getZ();
        return new Vector3D(x+x2, y+y2, z+  z2);
    }

    public Vector3D subtract (Vector3D v2){
        double x2 = v2.getX();
        double y2 = v2.getY();
        double z2 = v2.getZ();
        return new Vector3D(x-x2, y-y2, z-z2);
    }

    public static Vector3D[] arrayVectors(int n){
        Vector3D[] vector3DS = new Vector3D[n];
        for (int i = 0; i < n; i++) {
            vector3DS[i] = new Vector3D(random(), random(), random());
        }
        return vector3DS;
    }

    public static double random(){
        return Math.random()*10;
    }

    @Override
    public String toString(){
        return ("x = " + getX() +  "y = " + getY() + "z = " + getZ());
    }
}
