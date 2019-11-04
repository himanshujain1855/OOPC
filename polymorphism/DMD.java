/**Dmd=Dynamic method dispatch
 * here i have taken example of person, hence person can be Son, Husband, employee,
 * Customer, etc.
 */

interface Person
{
    void display();
    default void whoI(Person p)
    {
        p.display();
    }

}

class Son implements Person
{
    public  void display()
    {
        System.out.println("SON: Hello Mummy and Papa!!!!");
    }
}
class Employee implements Person
{
    public  void display()
    {
        System.out.println("EMPLOYEE: Hello Sir,Good Morning!!!!");
    }

}
class Husband implements Person
{
    public  void display()
    {
        System.out.println("HUSBAND: Hello My dear!!");
    }

}
class Customer implements Person
{
    public  void display()
    {
        System.out.println("CUSTOMER: At Shopping!!!");
    }

}

public class DMD {

    public static void main(String[] a)
    {
        Person WhoI=new Son();
        WhoI.display();

        //After Improvement
        WhoI.whoI(new Employee());

        WhoI.whoI(new Husband());

        WhoI.whoI(new Customer());
    }
}
