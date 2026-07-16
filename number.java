class number {
    public int Evensum(int[] array) {
        int x = 0;
        for (int i = 0; i <= 7; i++) {
            if (array[i] % 2 == 0) {
                x += array[i];
            }
        }
        System.out.println("The sum of even numbers is " + x);
        return x;
    }
    public int Oddsum(int[] array) {
        int y = 0;
        for (int i = 0; i <= 7; i++) {
            if (array[i] % 2 != 0) {
                y += array[i];
            }
        }
        System.out.println("The sum of odd numbers is " + y);
        return y;
    }
    public int Primesum(int[] array) {
        int z = 0;
        for (int i = 0; i <= 7; i++) {
            int rem = 0;
            for (int j = 1; j <= array[i]; j++) {
                if (array[i] % j == 0) {
                    rem += 1;
                }
            }
            if (rem == 2) {
                z += array[i];
            }
        }
        System.out.println("Sum of prime numbers is " + z);
        return z;
    }
    public int Highest(int[] array) {
        int high = array[0]; 
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (array[i] > array[j]) {
                    if (array[i] > high) {
                        high = array[i];
                    }
                } else {
                    if (array[j] > high) {
                        high = array[j];
                    }
                }
            }
        }
        System.out.println("The highest number in the array is " + high);
        return high;
    }
    public int Lowest(int[] array) {
        int low = array[0];
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (array[i] < array[j]) {
                    low = array[i];
                } else if (array[i] > array[j]) {
                    low = array[j];
                    break;
                } else {
                    continue;
                }
            }
        }
        System.out.println("The lowest number in the array is " + low);
        return low;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 7, 4, 6, 5, 3};
        number obj = new number();
        obj.Evensum(arr1);
        obj.Oddsum(arr1);
        obj.Primesum(arr1);
        obj.Highest(arr1);
        obj.Lowest(arr1);
    }
}
