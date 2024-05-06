package Review;

 class Mystatic {
    static class NestedStaticClass {
        public static void display() {
            System.out.println("Nested static class method");
        }
    }

     public static void main(String[] args) {
        Mystatic.NestedStaticClass.display();
     }
}

