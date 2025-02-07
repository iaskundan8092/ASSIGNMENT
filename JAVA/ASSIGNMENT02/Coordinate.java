class Coordinate {
    private int x, y;

    // Constructor to initialize the coordinates
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display the values of member variables
    public void display() {
        System.out.println("X: " + x + ", Y: " + y);
    }

    public static void main(String[] args) {
        // Creating an object using new
        Coordinate point = new Coordinate(10, 20);
        // Displaying the coordinate values
        point.display();
    }
}
