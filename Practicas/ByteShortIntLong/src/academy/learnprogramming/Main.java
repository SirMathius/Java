package academy.learnprogramming;

public class Main {

	public static void main(String[] args) {
		
		int myValue = 10000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value: " + myMinIntValue);
		System.out.println("Integer Maximun Value: " + myMaxIntValue);
		System.out.println("Busted MAX value = " +(myMaxIntValue + 1));
		System.out.println("Busted MIN value = " +(myMinIntValue - 1));

		int myMaxIntTest = 2_147_483_647;
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value: " + myMinByteValue);
		System.out.println("Byte Minimum Value: " + myMaxByteValue);
		
		short myMinshortValue = Short.MIN_VALUE;
		short myMaxshortValue = Short.MAX_VALUE;
		System.out.println("short Minimum Value: " + myMinshortValue);
		System.out.println("short Minimum Value: " + myMaxshortValue);

		long myLongValue = 100L;
		
		long myMinlongValue = Long.MIN_VALUE;
		long myMaxlongValue = Long.MAX_VALUE;
		System.out.println("long Minimum Value: " + myMinlongValue);
		System.out.println("long Minimum Value: " + myMaxlongValue);
		long bigLongLiteralValue = 2_147_483_647_234L;
		System.out.println(bigLongLiteralValue);
		
		short bigShortLiteralValue = 32767;
	}

}
