class Pens {
    public static void main(String args[]) {
        int pens = 14;
        int students = 3;
        int distributed = pens / students;
        int leftover = pens % students;

        System.out.println("The pens per student is " + distributed + 
                           " and the remaining pen not distributed is " + leftover);
    }
}
