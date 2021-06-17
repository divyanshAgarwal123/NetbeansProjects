package Hello.com;


import java.util.ArrayList;
import java.util.Iterator;
public class Collection {
    void show(){
    ArrayList<Integer> ar = new ArrayList<Integer>();
        ArrayList<Integer> ab = new ArrayList<Integer>();
    ar.add(12);
    ar.add(13);
    
    //System.out.println(ar);
    
//for each loop
//    for(Integer a:ar){
//        System.out.println(a);
//    }
//Iterator
    Iterator itr = ar.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
        
    }
    public static void main(String args[]){
        Collection aa = new Collection();
        aa.show();
    }
}
