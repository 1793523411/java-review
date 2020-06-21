package four.other;

public class StringEditor {
    public static String removeNonLetters(String original) {
        StringBuffer aBuffer = new StringBuffer(original.length());
        char aCharacter;
        for (int i=0; i<original.length(); i++) {
            aCharacter = original.charAt(i);
            if (Character.isLetter(aCharacter))
                aBuffer.append(new Character(aCharacter));
        }
        return new String(aBuffer);
    }
}
