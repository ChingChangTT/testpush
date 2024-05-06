package Review;

 class OuterClass {
    class InnerClass {
        public void innerMethod() {
            System.out.println("Inner Class");

        }
    }
    static class StaticNestedClass {
        public static void staticNestedMethod() {
            System.out.println("Static Class" );

        }
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj =outerObj. new InnerClass();
        innerObj.innerMethod();
        OuterClass.StaticNestedClass.staticNestedMethod();
    }
}
