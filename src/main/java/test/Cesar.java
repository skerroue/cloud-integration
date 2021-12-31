package test;

public class Cesar {

    String alphabet = "abcdefghijklmnopqrstuvwxyz ";
    int decalage = 5;

    public String encode(String text){
        String messageEncode = "";
        String textToEncode = text.toLowerCase();
        char currentLetter = '_';
        for (int i=0; i< text.length();i++){
            currentLetter = text.charAt(i);
            if (!alphabet.contains(String.valueOf(currentLetter))){
                return "bad message, problem whith letter: " + currentLetter;
            }
            int currentLetterIndex = alphabet.indexOf(currentLetter);
            if(currentLetterIndex == 26){
                messageEncode += " ";
            }else {
                if(currentLetterIndex + decalage >= alphabet.length()-1){
                    messageEncode += alphabet.charAt((currentLetterIndex + decalage)-26);
                }
                else {
                    messageEncode += alphabet.charAt(currentLetterIndex+decalage);
                }
            }
        }
        return messageEncode;
    }


    public String decode(String texteCrypte){
        String messageDecode = "";
        char currentLetter = '_';
        for (int i=0; i< texteCrypte.length();i++){
            currentLetter = texteCrypte.charAt(i);
            if (!alphabet.contains(String.valueOf(currentLetter))){
                return "bad message, problem whith letter: " + currentLetter;
            }
            int currentLetterIndex = alphabet.indexOf(currentLetter);
            if(currentLetterIndex == 26){
                messageDecode += " ";
            }else {
                if(currentLetterIndex - decalage < 0){
                    messageDecode += alphabet.charAt((currentLetterIndex - decalage)+26);
                }
                else {
                    messageDecode += alphabet.charAt(currentLetterIndex-decalage);
                }
            }
        }
        return messageDecode;
    }
}
