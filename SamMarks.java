class SamMarks {
    public static void main(String[] args) {
        System.out.println("Sam's Marks");
        
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        
        int sum = maths + physics + chemistry;
        double average = sum / 3.0; // Use 3.0 to ensure floating-point division
        
        System.out.println("Average Marks: " + average);
    }
}
