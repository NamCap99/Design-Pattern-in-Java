public class House {
    // attributes
    private String roof;
    private String walls;
    private boolean hasGarbage;
    private boolean hasSwimmingPool;

    // private constructor
    private House(HouseBuilder builder){

    }
    public static class HouseBuilder {
        private String roof;
        private String walls;
        private boolean hasGarbage;
        private boolean hasSwimmingPool;

        // constructor
        public HouseBuilder(String roof, String walls){
            this.roof = roof;
            this.walls = walls;
        }

        public HouseBuilder setHasGarbage(boolean hasGarbage){
            this.hasGarbage = hasGarbage;
            return this;
        }
        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool){
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        // method build for House object
        public House build(){
            return new House(this);
        }
    }
}
