public class habr_t20 {
    public static void main(String[] args) {
        VectorN[] arrayVectors = VectorN.arrayVectors(2, 5);

        double len = arrayVectors[0].lengthOfVector();
        double scalarProduct = arrayVectors[1].scalarProduct(arrayVectors[2]);
        VectorN vector3D = arrayVectors[3].subtract(arrayVectors[0]);

        System.out.println(arrayVectors[0].toString());
        System.out.println(arrayVectors[3].toString());
        System.out.println(vector3D.toString());
        System.out.println(len);
        System.out.println(scalarProduct);
    }
}
