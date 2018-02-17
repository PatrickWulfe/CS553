public class Driver {
    public static void main (String [] ignore) {

        Position position1 = new Position(3, 4);
        PositionIF position2 = new Position(6, 7);

        position1.setX(position1.getX() + 3);
        position1.setY(position1.getY() + 3);

        position2.setX(position2.getX() + 4);
        position2.setY(position2.getY() + 4);

    }
}
