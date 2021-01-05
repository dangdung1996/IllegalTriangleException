public class Triangle {
    private double a, b, c;


    public Triangle(){

    }
    public Triangle(double a, double b, double c) throws Exception {
        boolean check = true;
        if(a <= 0 || b <= 0 || c <= 0) check = false;
        if (a + b <= c || a + c <= b || b + c <= a) check = false;

        if (!check){
            System.out.println("Day k phai 3 canh 1 tam giac");
        }else{
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }
}
