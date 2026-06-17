class ConversionTenth {
    public static void main(String args[]) {
        double heightFootPart = 5;
        double heightInchesPart = 7;
        
        double convertedInches = (heightFootPart * 12) + heightInchesPart;
        double convertedCentimeters = convertedInches * 2.54;
        double convertedFeet = heightFootPart + (heightInchesPart / 12.0);
        
        System.out.println("Your height in cm is " + convertedCentimeters + ", while in feet is " + convertedFeet + " and in inches is " + convertedInches);
    }
}
