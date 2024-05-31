package com.examplefile.helloworld;

public class StringBuilderMethods {
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

        // StringBuilder updates and stores its own state and returns a reference to itself.
        StringBuilder sample = new StringBuilder("beginning");
        sample.append("+middle");
        StringBuilder newSample = sample.append("+end");
//        System.out.println(sample);
//        System.out.println(newSample);

        // StringBuilder methods: charAt(), indexOf(), length() and substring() all work the same as in String class and can be chained.
        StringBuilder newTest = new StringBuilder("kingdom");
        String test = newTest.substring(newTest.indexOf("k"), newTest.indexOf("do"));
        int len = newTest.length();
        char ch = newTest.charAt(1);
//        System.out.println(test);
//        System.out.println(len + " " + ch);

        // append(),
        newTest.append("-come");
//        System.out.println(newTest);

        // insert(),
        newTest.insert(0, "thy ");
//        System.out.println(newTest);

        // delete(), deleteCharAt()
        newTest.delete(0,4).deleteCharAt(7).delete(7,11);
//        System.out.println(newTest);

        // replace(),
        newTest.replace(0, 1, "K");
//        System.out.println(newTest);

        // reverse(),
        newTest.reverse();
//        System.out.println(newTest);

        // toString.
        newTest.reverse();
        String s = newTest.toString();
        System.out.println(s);
    }
}
