package DataStoredandOperators;

public class TypeConversion {

	public static void main(String[] args) {
		
		
		System.out.println(4 + 4);//int + int = int
		System.out.println(4 + 4.5); //int + double = double
		System.out.println(4.1 + 4.4);// double + double = double
		System.out.println(2/5);//it would be interger by default
		System.out.println((double)2/5);//explicit double then it woulld be in decimal
		System.out.println(2.0/5);//double / int = double
		
		//float f = 1.7f; //it could be treated to as float
		//float f = (float) 1.7; //it could also be done using explicit 
		//By default, all decimal number are treated as double data type, it created temp memory about 8 bytes and conversion from double 8bytes to float 4bytes isn't possible 
		
		
		int i =(int) 10.6;//it is a double value if you wants to store into int, do explicit then could be store into int
		
		
		//short s = 17;
		//int i = s; //it is possible conversion from short to int
		//s = i;//it isn't possible conversion from int to short
		//s =(short) i// it is possble by explicit conversion
		
		
		
		//char ch = 'a';
		//int i = ch;// char to int is possible conversion or this type of convrsion is implicitly 
		//ch = i ; // int to char conversion is not possible 
		//ch = (char) i;// explicitly conversion to convert from int large value to char small value
		//ch = ch + 1; // it also not possible to store char+int into Char
		//ch = (char)( ch + 1); //explicitly conversion to store char+int into char
		//i = ch + 1;//it is possible to store char+int into int
		//System.out.println(i);
	}
}
