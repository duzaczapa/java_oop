class Roadster {
    float topSpeed;
    float acceleration;
    float crazyTopSpeed;
    float crazyAcceleration;

    public Roadster(float topSpeed, float acceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }
    public Roadster(float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
    }
    public float getTopSpeed() {
        return this.topSpeed;
    }

    public float getAcceleration() {
        return this.acceleration;
    }
    public float getTopSpeed(boolean crazyMode) {
        return crazyMode ? this.crazyTopSpeed : this.topSpeed;
    }
    public float getAcceleration(boolean crazyMode) {
        return crazyMode ? crazyAcceleration : acceleration;
    }
}

public class Main {
    public static void main(String[] args) {
            Roadster classB = new Roadster(270.0f, 4f);
            Roadster classS = new Roadster(300.0f, 5f, 380.0f, 6f );

            System.out.println("Our Class B car top speed is: " + classB.getTopSpeed());
            System.out.println("Our Class S car top speed is: " + classS.getTopSpeed(true));
    }
}