/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hello.com;

import java.util.ArrayList;
import java.util.Iterator;

class SystematicExpression extends Exception
{
    
}
public class CustomException extends SystematicExpression {

    public static void main(String args[]) throws SystematicExpression
    {
            int a = 12;
        ArrayList<Integer> ar =new ArrayList<Integer>();
        ar.add(12);
        ar.add(15);
        Iterator itr = ar.iterator();
        if(a == 123)
        {
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }
        else
        {
            throw new SystematicExpression();
        }
        
    }
}

