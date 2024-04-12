public class Main{
    //This is a comment
    /* 
    Data types : Strings are wrapped inside double quotes
    int : stores integers whole numbers without decimals
    float : stores foating point numbers with decimals
    char : stores single characters and is wrapped inside singlw quote
    boolean : stores value that iw weither true or false

    type variableName = value;
    All java variables must be identified with unique names and these unique names are called as identifiers.
    Primitive data types : identified by small letters and do not have any methods associated with it. Built default in java program
    Non primitive data types are created by programmer except fort String data type
    8 primitive data types are : 
    byte        1 byte   -128 to 127
    short       2 bytes  -32768 to 32767
    int         4 bytes 2147483648
    long        8 bytes -9,223,372,036,854,775,808        L
    float       4 bytes     Sufficient for 6 to 7 deecimal digits  f
    double      8 bytes     Sufficient fotr storing 15 decimal digits d
    boolean     1 bit       Stores true or false values
    char        2 bytes     Stores a single character
    Non primitive types are also called as reference types because they refer to objects.
    Primitive type alwasy has a value but non primitive type can be null as well
    */
    
    public static void main(String[] args){
        int x = 5, y=6, z= 7;
        final String cantbechanged= " Uprety";
        String name = "Prakrit";

        float floatNum = 1.234f;
        
        System.out.println(name + cantbechanged);
        System.out.println(x+y+z);
        System.out.println(floatNum);
    }
}