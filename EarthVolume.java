class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378; // Radius of Earth in km
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        
        System.out.println("The volume of the Earth is: " + volume + " cubic km");
    }
}
