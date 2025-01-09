import java.util.Vector;

public class Vector3D {
    double x;
    double y;
    double z;

    public static void main(String[] args) {
        Vector3D jit = new Vector3D(2, 3, 4);
        System.out.println(jit);
        System.out.println(jit.getMagnitude());
        System.out.println(jit.normalize(jit));
        System.out.println(jit.getX());
        System.out.println(jit.add(jit, new Vector3D(4, 5, 6)));


    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double getMagnitude() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public Vector3D normalize(Vector3D vector) {
        double magnitude = vector.getMagnitude();
        if (magnitude == 0) {
            throw new IllegalStateException();
        } else {
            double newX = vector.x / magnitude;
            double newY = vector.y / magnitude;
            double newZ = vector.z / magnitude;
            return new Vector3D(newX, newY, newZ);
        }
    }

    public Vector3D add(Vector3D firstVector, Vector3D secondVector) {
        double newX = firstVector.x + secondVector.x;
        double newY = firstVector.y + secondVector.y;
        double newZ = firstVector.z + secondVector.z;
        return new Vector3D(newX, newY, newZ);
    }

}
