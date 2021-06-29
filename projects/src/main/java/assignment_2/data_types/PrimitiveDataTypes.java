package assignment_2.data_types;

public class PrimitiveDataTypes {
    public static void main (String args[]) {
        /*
            Declare your code here!
         */

        int i = 0;
        boolean bVal = true;
        char cVal = 'A';
        short shortVal = 1;
        long lVal = 0L;
        float fVal = 5.3f;
        double dVal = 3.3d;

        double castDouble = (double)i;
        float mulVal = (float) (fVal * dVal);
        int mulValInt = (int) (fVal * dVal);

        char cNewVal = 'z';
        int iFromChar =  cNewVal;

        System.out.println(mulVal);
        System.out.println(mulValInt);
        System.out.println(iFromChar);


    }
}
