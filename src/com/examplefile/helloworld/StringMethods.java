package com.examplefile.helloworld;

public class StringMethods {
    String word = "jeweLry";
    String sameWord = "jeweLry";
    String newWord = "jeWelry";
    String anotherWord = "   jewelry";
    String spaceWord = "jewelry   ";
    String separatedWord = "j e w e l r y";

    // Methods in the String class include: length(), charAt(), indexOf(), substring(), toLowerCase(), toUpperCase(), equals(),
    // equalsIgnoreCase(), startsWith(), endsWith(), replace(), contains(), trim(), strip(), stripLeading(), stripTrailing() and intern().

    public static void main(String[] args) {
        // Rather than iterate over the letters and creating 26 strings, we use StringBuilder to append each letter with each iteration.
        StringBuilder newString = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            if(current < 'z') {
                newString.append(current + ", ");
            } else {
                newString.append(current);
            }

//        System.out.println(newString);

        // StringBuilder updates and stores its own state.
        StringBuilder sample = new StringBuilder("beginning");
        sample.append("+middle");
        StringBuilder newSample = sample.append("+end");
        System.out.println(sample);
        System.out.println(newSample);

        StringMethods sampleWord = new StringMethods();

//        System.out.println(sampleWord.word.length());
//        System.out.println(sampleWord.word.charAt(3));
//        System.out.println(sampleWord.word.indexOf("w"));

        // substring() takes starting index number and will print all characters to just before the stated ending character.
//        System.out.println(sampleWord.word.substring(0,3));
//        System.out.println(sampleWord.word.toLowerCase());
//        System.out.println(sampleWord.word.toUpperCase());

        // equals() will confirm the two strings are exactly the same including case. If not, will return false.
//        System.out.println(sampleWord.word.equals(sampleWord.newWord));
//        System.out.println(sampleWord.word.equals(sampleWord.sameWord));

        // equalsIgnoreCase() will just compare the characters and ignore case and if all the characters are the same will return true.
//        System.out.println(sampleWord.word.equalsIgnoreCase(sampleWord.newWord));

        // startsWith() and endsWith() will confirm the beginning and ending characters and will not ignore case, has to be exactly the same.
//        System.out.println(sampleWord.word.startsWith("jew"));
//        System.out.println(sampleWord.word.startsWith("jEw"));

        // replace() will replace characters in a string creating a new String object. Second line confirms first string is unchanged.
//        System.out.println(sampleWord.word.replace('e', 'E'));
//        System.out.println(sampleWord.word);

        // contains() will show you if the string contains a character or set of characters.
//        System.out.println(sampleWord.word.contains("jew"));
//        System.out.println(sampleWord.word.contains("jEw"));

        // Remove spaces at the beginning and end of a string.
//        System.out.println(sampleWord.anotherWord.stripLeading());
//        System.out.println(sampleWord.spaceWord.stripTrailing());

        // trim() only removes leading and ending spaces, not spaces in between letters.
//        System.out.println(sampleWord.separatedWord.trim());  // Returns the original word "j e w e l r y".
//        System.out.println(sampleWord.separatedWord.replace(" ", ""));
    }
}
