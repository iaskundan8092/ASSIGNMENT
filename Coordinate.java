class Coordinate {
    private int x, y;

    
    public void setValues(int x, int y) {
        this.x = x;
        this.y = y;
    } 

    
    public void display() {
        System.out.println("X: " + x + ", Y: " + y);
    }

    
    public boolean isEqual(Coordinate other) {
        return this.x == other.x && this.y == other.y;
    }

    public static void main(String[] args) {
        
        Coordinate number1 = new Coordinate();
        Coordinate number2 = new Coordinate();

        
        number1.setValues(10, 20);
        number2.setValues(10, 20);

        
        System.out.println("Number 1:");
        number1.display();
        System.out.println("Number 2:");
        number2.display();

       
        if (number1.isEqual(number2)) {
            System.out.println("Both coordinates are equal.");
        } else {
            System.out.println("Coordinates are not equal.");
        }
    }
}
