//interface is a blueprint of class that has static constant upstack method it is used to achieve abstraction.
package Hello.com;
interface J
{
    void show(int a,int b);
}
interface N
{
    void display();
}        
class K implements J,N
{
    @Override
    public void show(int a, int b)
    {
        System.out.println((a+b));
    }
    public void display(){
        System.out.println("hello");
    }
}
public class Interface {
    
    public static void main(String args[]){
        K nn = new K();
        nn.show(12,34);
        nn.display();
    }    
}
