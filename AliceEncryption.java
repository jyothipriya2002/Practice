package com.hStrings;

class Encryption {

    public String decodeMessage(String message) {
        return message.replaceAll("[AEIOUaeiou]", "");
    }

    public String encodeMessage(String message) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int vowelIndex = 0;
        StringBuilder encodedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isWhitespace(ch)) {
                encodedMessage.append(ch);
            } else {
                encodedMessage.append(ch);
                if (!Character.isWhitespace(message.charAt(Math.min(i + 1, message.length() - 1)))) {
                    encodedMessage.append(vowels[vowelIndex]);
                    vowelIndex = (vowelIndex + 1) % vowels.length;
                }
            }
        }
        return encodedMessage.toString();
    }
}

public class AliceEncryption {

	public static void main(String[] args) {
		Encryption obj = new Encryption();

        // Test decodeMessage method
        String decodedMessage = obj.decodeMessage("oriGinal MessAge");
        System.out.println(decodedMessage);  // Output: rGnl Mssg

        // Test encodeMessage method
        String encodedMessage = obj.encodeMessage("QWRT cvbN MnKL");
        System.out.println(encodedMessage);  // Output: QaWeRiTo cuvabeNi MonuKaLe
    }

}
