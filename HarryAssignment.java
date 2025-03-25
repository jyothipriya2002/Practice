package com.hStrings;
class StringPlay {
    int convert;
    int max;

    public StringPlay() { }
}

class StringMethods {

	public int convertToInt(StringPlay sp, String str) {
        int value = Integer.parseInt(str);  
        sp.convert = value;  
        return value; 
    }

    public int getMax(StringPlay sp, String str, char ch) {
        int count = 0;  
        for (int i = 0; i < str.length(); i++) {  
            if (str.charAt(i) == ch) {  
                count++;  
            }
        }
        sp.max = count;  
        return count;  
    }
}

public class HarryAssignment {
	public static void main(String[] args) {
		StringMethods sm = new StringMethods();
        StringPlay sp = new StringPlay();

        int count = sm.getMax(sp, "fgfgfgf", 'g');
        System.out.println(count);  // Output: 3

        int intValue = sm.convertToInt(sp, "123");
        System.out.println(intValue);  // Output: 123
	}

}
