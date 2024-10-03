public class Builder {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Tiled Roof", "Brick Walls")
                .setHasGarbage(true)
                .setHasSwimmingPool(true)
                .build();

        System.out.println("House built successfully!");
    }
}