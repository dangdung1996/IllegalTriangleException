public class Main {
    public static void main(String[] args) throws Exception {

        try{
            Triangle triangle = new Triangle(3,-4,5);
        }catch(IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }

}
