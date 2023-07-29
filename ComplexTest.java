public class ComplexTest {
    public static void main(String[] args) {
        //Complex Test
        System.out.println("Tesing Complex.java");
        Complex c1, c2 ,c3;
        c1 = new Complex(3.2f,7.0f);
        c2 = new Complex(2.4f,1.0f);
        c3 = new Complex(7.8f,4.2f);

        Complex cadd = c1.add(c2); 
        Complex cscale = c3.scale(6.2f);
        Complex csub = c2.subtract(c3);
        System.out.println(cadd);
        System.out.println(cscale);
        System.out.println(csub);        
    }
}
