public class Complex {
    private float real;
    private float imaginary;

    Complex(){
        real = 0.0f;
        imaginary = 0.0f;
    }
    Complex(float real, float imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex add(Complex x){
        Complex res = new Complex();
        res.real = this.real + x.real;
        res.imaginary = this.imaginary + x.imaginary;
        return res;
    }
    Complex scale(float x){
        real *= x;
        imaginary *= x;
        return this;
    }
    Complex subtract(Complex x){
        real = real - x.real;
        imaginary = imaginary - x.imaginary;
        return this;
    }
    @Override
    public String toString() {
        return real + " + i" + imaginary;
    }
}