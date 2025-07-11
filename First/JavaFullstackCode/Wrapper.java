package sveri;
public class Wrapper
{
		public static void main(String[] args) {
			WrapperClassMethodsDemo.byteMethods();
			WrapperClassMethodsDemo.shortMethods();
			WrapperClassMethodsDemo.integerMethods();
			WrapperClassMethodsDemo.longMethods();
			WrapperClassMethodsDemo.floatMethods();
			WrapperClassMethodsDemo.doubleMethods();
			WrapperClassMethodsDemo.characterMethods();
			WrapperClassMethodsDemo.booleanMethods();

		}

	}
	class WrapperClassMethodsDemo 
	{
	  
	    public static void byteMethods() {
	      
	        Byte b = Byte.valueOf((byte) 120); 
	       
	        byte primitiveB = b; 

	        System.out.println("\n=== Byte Wrapper Methods ===");
	        System.out.println("Boxed Byte Value: " + b);
	        System.out.println("Unboxed Byte Value: " + primitiveB);
	        System.out.println("Parsed Byte from String '100': " + Byte.parseByte("100"));
	    }

	    // Short Wrapper Class Methods
	    public static void shortMethods() {
	        Short s = Short.valueOf((short) 32767); // Boxing
	        short primitiveS = s; // Unboxing

	        System.out.println("\n=== Short Wrapper Methods ===");
	        System.out.println("Boxed Short Value: " + s);
	        System.out.println("Unboxed Short Value: " + primitiveS);
	        System.out.println("Parsed Short from String '300': " + Short.parseShort("300"));
	    }

	    // Integer Wrapper Class Methods
	    public static void integerMethods() {
	        Integer i = Integer.valueOf(2147483647); // Boxing
	        int primitiveI = i; // Unboxing
	        Integer autoBoxedI = 50; // Autoboxing: Automatically converting primitive to Wrapper Object

	        System.out.println("\n=== Integer Wrapper Methods ===");
	        System.out.println("Boxed Integer Value: " + i);
	        System.out.println("Unboxed Integer Value: " + primitiveI);
	        System.out.println("Autoboxed Integer Value: " + autoBoxedI);
	        System.out.println("Binary Representation: " + Integer.toBinaryString(i));
	        System.out.println("Octal Representation: " + Integer.toOctalString(i));
	        System.out.println("Hexadecimal Representation: " + Integer.toHexString(i));
	        System.out.println("Parsed Integer from String '5000': " + Integer.parseInt("5000"));
	    }

	    // Long Wrapper Class Methods
	    public static void longMethods() {
	        Long l = Long.valueOf(9223372036854775807L); // Boxing
	        long primitiveL = l; // Unboxing

	        System.out.println("\n=== Long Wrapper Methods ===");
	        System.out.println("Boxed Long Value: " + l);
	        System.out.println("Unboxed Long Value: " + primitiveL);
	        System.out.println("Binary Representation: " + Long.toBinaryString(l));
	        System.out.println("Octal Representation: " + Long.toOctalString(l));
	        System.out.println("Hexadecimal Representation: " + Long.toHexString(l));
	        System.out.println("Parsed Long from String '123456789': " + Long.parseLong("123456789"));
	    }

	    // Float Wrapper Class Methods
	    public static void floatMethods() {
	        Float f = Float.valueOf(12.34f); // Boxing
	        float primitiveF = f; // Unboxing

	        System.out.println("\n=== Float Wrapper Methods ===");
	        System.out.println("Boxed Float Value: " + f);
	        System.out.println("Unboxed Float Value: " + primitiveF);
	        System.out.println("Parsed Float from String '3.14': " + Float.parseFloat("3.14"));
	    }

	    // Double Wrapper Class Methods
	    public static void doubleMethods() {
	        Double d = Double.valueOf(45.67); // Boxing
	        double primitiveD = d; // Unboxing

	        System.out.println("\n=== Double Wrapper Methods ===");
	        System.out.println("Boxed Double Value: " + d);
	        System.out.println("Unboxed Double Value: " + primitiveD);
	        System.out.println("Parsed Double from String '123.456': " + Double.parseDouble("123.456"));
	    }

	 // Character Wrapper Class Methods
	    public static void characterMethods() {
	        //Boxing: Converting primitive to Wrapper Object
	        Character c = Character.valueOf('A'); 
	        //Unboxing: Converting Wrapper Object to Primitive
	        char primitiveC = c; 

	        System.out.println("\n=== Character Wrapper Methods ===");
	        System.out.println("Boxed Character Value: " + c);
	        System.out.println("Unboxed Character Value: " + primitiveC);

	        // ✅ Character Classification Methods
	        System.out.println("Is 'A' a Letter? " + Character.isLetter(c));
	        System.out.println("Is 'A' a Digit? " + Character.isDigit(c));
	        System.out.println("Is 'A' a Whitespace? " + Character.isWhitespace(c));
	        System.out.println("Is 'A' an Uppercase Letter? " + Character.isUpperCase(c));
	        System.out.println("Is 'A' a Lowercase Letter? " + Character.isLowerCase(c));
	        System.out.println("Is 'A' a Letter or Digit? " + Character.isLetterOrDigit(c));
	        
	        // ✅ Case Conversion Methods
	        System.out.println("Lowercase of 'A': " + Character.toLowerCase(c));
	        System.out.println("Uppercase of 'a': " + Character.toUpperCase('a'));
	        System.out.println("Titlecase of 'i': " + Character.toTitleCase('i'));

	        // ✅ Unicode Properties
	        System.out.println("Unicode Code Point of 'A': " + Character.codePointAt(new char[]{c}, 0));
	        System.out.println("Character for Code Point 65: " + Character.toChars(65));

	        // ✅ Checking Char Type
	        System.out.println("Is 'A' a Defined Character? " + Character.isDefined(c));
	        System.out.println("Is 'A' a Java Identifier Start? " + Character.isJavaIdentifierStart(c));
	        System.out.println("Is 'A' a Java Identifier Part? " + Character.isJavaIdentifierPart(c));

	        // ✅ Additional Methods
	        System.out.println("Character Type of 'A': " + Character.getType(c));
	        System.out.println("Numeric Value of 'A': " + Character.getNumericValue(c));
	        System.out.println("Is 'A' a High Surrogate? " + Character.isHighSurrogate(c));
	        System.out.println("Is 'A' a Low Surrogate? " + Character.isLowSurrogate(c));

	        // ✅ Special Character Check
	        System.out.println("Is '©' a Letter? " + Character.isLetter('©'));
	        System.out.println("Is '$' a Letter or Digit? " + Character.isLetterOrDigit('$'));
	    }


	    // Boolean Wrapper Class Methods
	    public static void booleanMethods() {
	        Boolean bool = Boolean.valueOf(true); // Boxing
	        boolean primitiveBool = bool; // Unboxing

	        System.out.println("\n=== Boolean Wrapper Methods ===");
	        System.out.println("Boxed Boolean Value: " + bool);
	        System.out.println("Unboxed Boolean Value: " + primitiveBool);
	        System.out.println("Parsed Boolean from String 'true': " + Boolean.parseBoolean("true"));
	    }
	}


