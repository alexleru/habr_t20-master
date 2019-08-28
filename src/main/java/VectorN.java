public class VectorN {
    private double[] arg;

    public VectorN(double... arg){
        this.arg = arg;
    }

    public double[] getArg(){
        return arg;
    }

    public double lengthOfVector(){
        double sum = 0;
        for(double item: getArg()){
            sum += item*item;
        }
        return Math.sqrt(sum);
    }

    private boolean checkDimension(VectorN v2){
        return arg.length == v2.getArg().length;
    }

    public double scalarProduct(VectorN v2){
        double result = 0;
        if (checkDimension(v2)) {
            for (int i = 0; i < arg.length ; i++) {
                result += arg[i] * v2.getArg()[i];
            }
        } else {
            System.out.println("Wrong Dimensions between vectors");
        }
        return result;
    }

//    public Vector3D vectorProduct(Vector3D v2) {
//
//        return new VectorN(y*z2-z*y2, z*x2-x*z2, x*y2-y*x2);
//    }

    public double angle(VectorN v2) {
        return (scalarProduct(v2)/(this.lengthOfVector()*v2.lengthOfVector()));
    }

    public VectorN sum(VectorN v2){
        double[] result = new double[0];
        if (checkDimension(v2)) {
            result = new double[arg.length];
            for (int i = 0; i < arg.length ; i++) {
                result[i] = arg[i] + v2.getArg()[i];
            }
        } else {
            System.out.println("Wrong Dimensions between vectors");
        }
        return new VectorN(result);
    }

    public VectorN subtract(VectorN v2){
        double[] result = new double[0];
        if (checkDimension(v2)) {
            result = new double[arg.length];
            for (int i = 0; i < arg.length ; i++) {
                result[i] = arg[i] - v2.getArg()[i];
            }
        } else {
            System.out.println("Wrong Dimensions between vectors");
        }
        return new VectorN(result);
    }

    public static VectorN[] arrayVectors(int dimension, int count){
        VectorN[] vectorNS = new VectorN[count];
        for (int i = 0; i < count; i++) {
            double[] dimArray = new double[dimension];
            for (int j = 0; j < dimension; j++) {
                dimArray[j] = random();
            }
            vectorNS[i] = new VectorN(dimArray);
        }
        return vectorNS;
    }

    public static double random(){
        return Math.random()*10;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (double item: arg){
            stringBuilder.append(item + " ");
        }
        return stringBuilder.toString();
    }
}
