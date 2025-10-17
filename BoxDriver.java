public class BoxDriver {

    public static void main(String[] args) {
        printSums(args);
        compareBoxes();
    }

    // Prints sums of all numbers up to the argument count
    public static void printSums(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number argument.");
            return;
        }

        int count = Integer.parseInt(args[0]);

        for (int i = 1; i <= count; i++) {
            int sum = i * (i + 1) / 2; // formula for sum of first i integers
            System.out.println("The sum of the first " + i + " numbers is " + sum + ".");
        }
    }

    // Demonstrates use of the Box class
    public static void compareBoxes() {

        Box[] array = new Box[5];
        array[0] = new Box(4, 5, 3, 2);
        array[1] = new Box(2, 3, 3, 1);
        array[2] = new Box(3, 10, 2, 2);
        array[3] = new Box(4, 4, 4, 1);
        array[4] = new Box(5, 7, 1, 1);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println("Box " + i + " is equivalent to Box " + j + ".");
                } else {
                    if (array[i].equals(array[i].larger(array[j]))) {
                        System.out.println("Box " + i + " is larger than Box " + j + ".");
                    } else {
                        System.out.println("Box " + i + " is smaller than Box " + j + ".");
                    }
                }
            }
        }
    }
}
