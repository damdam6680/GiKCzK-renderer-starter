package CGlab;

public class Vec2f {
    public float x;
    public float y;

    @Override
    public String toString() {
        return x + " " + y;
    }

    public Vec2f(float x, float y) {
        this.x = x;
        this.y = y;
    }
}