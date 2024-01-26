package interviews;

public class Pacman {
    private Orientation orientation;

    public Pacman(Orientation orientation) {
        this.orientation = orientation;
    }

    public void turn(String direction) {
        if(direction.equals("R")) {
            orientation = Orientation.values()[(orientation.ordinal() + 1) % Orientation.values().length];
        } else {
            if(orientation.ordinal() == 0) {
                orientation = Orientation.values()[Orientation.values().length - 1];
            } else {
                orientation = Orientation.values()[(orientation.ordinal() - 1) % Orientation.values().length];
            }
        }

    }

    public static void main(String[] args) {
        Pacman pacman = new Pacman(Orientation.N);
        pacman.turn("R");
        System.out.println(pacman);
        pacman.turn("R");
        System.out.println(pacman);
        pacman.turn("R");
        System.out.println(pacman);
        pacman.turn("R");
        System.out.println(pacman);

        pacman.turn("L");
        System.out.println(pacman);
        pacman.turn("L");
        System.out.println(pacman);
        pacman.turn("L");
        System.out.println(pacman);
        pacman.turn("L");
        System.out.println(pacman);
    }

    @Override
    public String toString() {
        return "Pacman{" +
                "orientation=" + orientation +
                '}';
    }
}

enum Orientation {
    N, E, S, W
}