package FirstPackage;

public class pwr {
    int base;
    int exp;
    int val;
    pwr(int b,int e){
        base = b;
        exp= e;
    }
    void calResult()
    {
        val = 1;
        if (exp == 0) return;
        int i = exp;
        for (; i> 0; i-- ) val= val*base;
    }
    int getResult()
    {
        return val;
    }
}

class DemoPwr
{
    public static void main(String args[])
    {
        pwr t1 = new pwr(7,8);
        pwr t2 = new pwr(2,3);
        pwr t3 = new pwr(21,3);
        t1.calResult();
        t2.calResult();
        t3.calResult();
        System.out.println(t1.base + " raised to the power of " + t1.exp + " is " + t1.getResult());
        System.out.println(t2.base + " raised to the power of " + t2.exp + " is " + t2.getResult());
        System.out.println(t3.base + " raised to the power of " + t3.exp + " is " + t3.getResult());
    }
}
