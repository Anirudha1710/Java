package Introduction;

import java.lang.String;
class Datatype {
    public static void datatype(String[] args){
        // Primitive Data type
        byte b =8;
        short s =78;
        int i =4816;
        long l =9526526526L;
        float f =5953.8f;
        double d =952.9852695;
        char c= 'R';
        boolean q= true;

        // Size and range of data type:
        System.out.println("Int Min value: "+Integer.MIN_VALUE);
        System.out.println("Int Max value: "+Integer.MAX_VALUE);
        System.out.println("Int BYTES: "+Integer.BYTES);

        System.out.println("Float Min value: "+Float.MIN_VALUE);
        System.out.println("Float Max value: "+Float.MAX_VALUE);
        System.out.println("Float BYTES: "+Float.BYTES);

        // Integer to binary
        System.out.println("Integer to binary is: "+Integer.toBinaryString(i));
    }
}
