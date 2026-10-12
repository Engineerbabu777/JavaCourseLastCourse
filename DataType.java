

class DataType {

public static void main(String args[]) {

System.out.println("hello");

int a = 2147483647;
byte b = 10;
short s = 100;
long l = 1000000000000000000l;
float f = 10000.0f;
double d = 1000000000000000000000d;
char c = 'a';
boolean bool = true;

System.out.println("the value of a is:"+a);
System.out.println("the value of b is:"+b);
System.out.println("the value of s is:"+s);
System.out.println("the value of l is:"+l);
System.out.println("the value of f is:"+f);
System.out.println("the value of d is:"+d);
System.out.println(c);
System.out.println(bool);

// TYPE CAST!
char e = 'a';
System.out.println((int) e);


// String Class
String name = "Awais";
System.out.println(name);

// METHODS OF STRING!
String sss = "Awais";
System.out.println(sss.length());
System.out.println(sss.toLowerCase());
System.out.println(sss.toUpperCase());
System.out.println(sss.substring(0, 2));


}

}