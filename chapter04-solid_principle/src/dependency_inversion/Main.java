package dependency_inversion;

public class Main {
    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.flip(true);  // Output: LightBulb is turned on
        lightSwitch.flip(false); // Output: LightBulb is turned off
    }
}


