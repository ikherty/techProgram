/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package variant6;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author oam
 */
public class VCaller6 {

    private HashMap<String,Double> hd;

    public VCaller6() {
    }

    /**
     * Метод должен умножить значения в hd на числа из ah для совпадающих ключей
     * @param ah
     * @return false если ни одно значение в hd не изменилось
     */
    public boolean multHash(HashMap<String,Double> ah)
    {
        Set<String> ks=ah.keySet();
        for(String s:ks)
        {
            double x=hd.get(s);
            double y=ah.get(s);
            x*=y;
            hd.put(s, x);
        }
        return false;
    }

    /**
     * Метод должен разделить значения в hd на числа из ah для совпадающих ключей
     * @param ah
     * @return false если ни одно значение в hd не изменилось
     */
    public boolean divHash(HashMap<String,Double> ah)
    {
        Set<String> ks=hd.keySet();
        for(String s:ks)
        {
            double x=hd.get(s);
            double y=ah.get(s);
            x/=y;
            hd.put(s, x);
        }
        return false;
    }

}
