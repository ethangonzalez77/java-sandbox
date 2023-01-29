package compositionEx.bedroomChallenge;

public class BedEx {

    public static void main(String[] args) {

        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.


        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");

        Ceiling ceiling1 = new Ceiling(12, 44);

        Bed bed1 = new Bed("Fancy", 2, 4, 3, 2);

        Lamp lamp1 = new Lamp("Also Fancy", true, 88);

        Bedroom room1 = new Bedroom("Reggie", wall1, wall2, wall3, wall4, ceiling1, bed1, lamp1);


        room1.getLamp().turnOn();
        room1.make();






    }
}
