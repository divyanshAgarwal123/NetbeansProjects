
package Hello.com;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class CollectionPrac2 {
    int a;
    int b;
    int c;
    CollectionPrac2(int a,int b,int c){   
        this.a=a;   //<-    inserting local variable to global variable.
        this.b=b;   //<-    inserting local variable to global variable.
        this.c=c;   //<-    inserting local variable to global variable.
    }
    public static void main(String args[]){
        CollectionPrac2 aa = new CollectionPrac2(12, 14, 42);//<-  assigning varibals in form of calling the object

        ArrayList<CollectionPrac2> ar =new ArrayList<CollectionPrac2>();
        ar.add(aa);
//for each method
        ar.forEach(e->{
            System.out.println(e.a+""+e.b);
        });
    }
}

