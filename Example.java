class Example {
    int defaultVar; // Default access modifier
    public int publicVar; // Public access modifier

    public static void main(String[] args) {
        Example obj = new Example();

        // Setting values
        obj.defaultVar = 10;
        obj.publicVar = 20;

        // Displaying values
        System.out.println("Default Variable: " + obj.defaultVar);
        System.out.println("Public Variable: " + obj.publicVar);
    }
}
