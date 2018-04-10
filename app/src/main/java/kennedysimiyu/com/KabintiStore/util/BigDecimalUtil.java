package kennedysimiyu.com.KabintiStore.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;


/**
 *
 */

public class BigDecimalUtil {
    // method converting a Big decimal to a string
    public static String getValue(BigDecimal value){
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        return String.valueOf(df.format(value));
    }
    /*
        For rating bar (actual rating)
        method coverting a big decimal to a float
     */
    public static float getFloat(BigDecimal value){
        return value.floatValue();
    }


}
