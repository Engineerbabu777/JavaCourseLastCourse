public class Operations {
    
    public static void main(String[] args) {

// arithmatic operations
int a = 10;
int b = 20;
System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);

// assingment operations
int x = 10;
int y = 20;
x += y;
System.out.println(x);
x -= y;
System.out.println(x);
x *= y;
System.out.println(x);
x /= y;
System.out.println(x);
a %= b;
System.out.println(a);


// Bitwise operators
int p = 10;
int q = 20;
System.out.println(p & q); // and operation || both should be 1 then one else 0
System.out.println(p | q); // or operation || atleast one should be 1 then one else 0
System.out.println(p ^ q); // xor operation || different then one else 0
System.out.println(~p);  // ~ not operator || flip the bits

// left shift and right shift
System.out.println(p << 1); // left shift || multiply by 2
System.out.println(p >> 1); // right shift || divide by 2




    }
}
