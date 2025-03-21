class CallByReferenceExample {
    int value;

    
    void modify(CallByReferenceExample obj) {
        obj.value += 10;
    }

    public static void main(String[] args) {
        CallByReferenceExample obj = new CallByReferenceExample();
        obj.value = 50;

        System.out.println("Before modification: " + obj.value);
        
        
        obj.modify(obj);
        
        System.out.println("After modification: " + obj.value);
    }
}

