interface A {
    public void Details();

 default void Address()
 {
 System.out.println("Address :-\n'bus Station pachhad',\n' nilkamal park',\'nmanavadar',\n'Junagadh' - '362630'.");
 }
}

public class p7 implements A {
    public void Details() {
        System.out.println("Details:-");
        System.out.println("Name : darsh garala");
        System.out.println("ID No. : 21CE033");
        System.out.println("Collage name : CSPIT");
        System.out.println("Branch : Computer Engineering");
        System.out.println("Current Sem. : 3");
    }

 public static void main(String []args)
 {
    p7 p1=new p7();
 p1.Details();
 p1.Address();
 }
}
