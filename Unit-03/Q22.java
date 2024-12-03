class Q22 {
    public static void main(String args[]){
        int a=100,b=0,c;
        try{
            c=a/b; //will throw exception as division by zero
            System.out.println("Your output: "+ c);
        } catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}