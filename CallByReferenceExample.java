class CallByReferenceExample {
    int value;

    // Method to modify the value
    void modify(CallByReferenceExample obj) {
        obj.value += 10;
    }

    public static void main(String[] args) {
        CallByReferenceExample obj = new CallByReferenceExample();
        obj.value = 50;

        System.out.println("Before modification: " + obj.value);
        
        // Passing the object reference to modify method
        obj.modify(obj);
        
        System.out.println("After modification: " + obj.value);
    }
}

