class Coordinate {
    private int x, y;

    // Method to set coordinate values
    public void setValues(int x, int y) {
        this.x = x;
        this.y = y;
    } 

    // Method to display coordinate values
    public void display() {
        System.out.println("X: " + x + ", Y: " + y);
    }

    // Method to check equality of two coordinates
    public boolean isEqual(Coordinate other) {
        return this.x == other.x && this.y == other.y;
    }

    public static void main(String[] args) {
        // Creating objects using reference variables
        Coordinate number1 = new Coordinate();
        Coordinate number2 = new Coordinate();

        // Assigning values to objects
        number1.setValues(10, 20);
        number2.setValues(10, 20);

        // Displaying the coordinate values
        System.out.println("Number 1:");
        number1.display();
        System.out.println("Number 2:");
        number2.display();

        // Comparing the two coordinates
        if (number1.isEqual(number2)) {
            System.out.println("Both coordinates are equal.");
        } else {
            System.out.println("Coordinates are not equal.");
        }
    }
}
