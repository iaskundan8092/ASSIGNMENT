class Student {
    String name;
    int roll;
    double marks;

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        // Creating an object of Student class
        Student student1 = new Student();
        
        // Assigning values to member variables
        student1.name = "Kundan Kumar";
        student1.roll = 67;
        student1.marks = 95.5;
        
        // Displaying student details
        student1.display();
    }
}
