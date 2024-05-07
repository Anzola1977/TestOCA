package example;

public record Variable() {
    static int numberOfRooms;
    static String custom;

    public Variable() {
    }

    public static int getNumberOfRooms() {
        return numberOfRooms;
    }

    public static void setNumberOfRooms(int numberOfRooms) {
        Variable.numberOfRooms = numberOfRooms;
    }

    public static String getCustom() {
        return custom;
    }

    public static void setCustom(String custom) {
        Variable.custom = custom;
    }
}
