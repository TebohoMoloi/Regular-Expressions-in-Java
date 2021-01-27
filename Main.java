package com.company;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        String reg = "M";  // This is the regex value. The value you searching for inside the text.
        String text = "My name is Teboho";  // This is the text that contains the the regex value.
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(text);
        boolean result = matcher.find(); // This takes the regular expression value and compares it to the text using find(). the 2 strings may be different but reg must be present in text.
        boolean result1 = matcher.matches(); // This takes the regular expression value and compares it to the text using matches(). Both strings must be the same in order to get a true boolean.
        System.out.println(result);
        System.out.println(result1);
    }
}
