package Review;

public class Local {
    public void  inner(){
        class  Inner{
            public void output(){
                System.out.println("Inner class.");
            }
        }
        Inner in=new Inner();
        in.output();
    }
}
class  Result{

    public static void main(String[] args) {
        Local local=new Local();
        local.inner();
    }
}
