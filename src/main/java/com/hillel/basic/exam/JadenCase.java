package com.hillel.basic.exam;
//  import org.apache.xpath.operations.String;

/**
 *" Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
 * Jaden is also known for some of his philosophy that he delivers via Twitter.
 * When writing on Twitter, he is known for almost always capitalizing every word.
 * <p>
 * Your task is to convert strings to how they would be written by Jaden Smith.
 * The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
 * <p>
 * Example:
 * <p>
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 * <p>
 * Note that the Java version expects a return value of null for an empty string or null."
 */
public class JadenCase {

    String phrase = "How can mirrors be real if our eyes aren't real";
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase == "") {
            return null;
        }
        String words[] = phrase.replaceAll("\\s+", " ").trim().split(" ");
        String newPhrase = "";
        for (String word : words) {
            for (int i = 0; i < word.length(); i++)
                newPhrase = newPhrase + ((i == 0) ? word.substring(i, i + 1).toUpperCase():
                        (i != word.length() - 1) ? word.substring(i, i + 1).toLowerCase() : word.substring(i, i + 1).toLowerCase().toLowerCase() + " ");
        }

        return newPhrase.trim();
    }
}
