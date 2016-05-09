package joshua.chapter6.enums;

/**
 * Created by rtsypuk on 11.07.15.
 */
public enum Planet {

    MERCURY(3.3e+23, 2.45e6),
    VENUS(4.6e+24, 6.052e6);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;
    private static final double G = 6.677E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / (radius * radius);
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }
}
