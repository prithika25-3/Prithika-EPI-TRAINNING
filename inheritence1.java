class A {
 int a=1,b=2,c=3;   
}
class B extends A{
    int a=10,b=20;
}
class C extends B{
    int d=30,e=40;
}
public class Main{
    public static void main(String [] args){
    C ref=new C();               
    System.out.println(ref.a);
}
}
