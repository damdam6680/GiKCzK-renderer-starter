package CGlab;

public class Vec3f {
    public float x;
    public float y;
    public float z;
    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }

    public Vec3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
