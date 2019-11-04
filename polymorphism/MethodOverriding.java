/**Method Overriding:-Reimplementing the method of parent class in sub classes.!
 * Need:- Let us understand through one example
 *Note:-Strongest access modifier method will be overridden by weakest access modifier but reverse is-
 * - Not possible Ex:- protected int fun() will replace by public but not be replaced by private.
 * private>default>protected>public
 */
 
class Music
{ void play()
    {
        System.out.println("Playing");
    }
}
class Wynk extends Music
{   @Override
    void play()
    {
        System.out.println("Playing on Wynk");
    }
}
class Saavan extends Music
{

}
public class MethodOverriding {
    public static void main(String []a)
    {
        Wynk w1=new Wynk();
        Saavan s1=new Saavan();
        w1.play();
        s1.play();
    }
}
