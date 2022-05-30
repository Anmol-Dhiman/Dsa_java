package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Intro {

    // when we have the large amount of text and we want to find some of the pattern
    // in that then the technique is called the regular expression finding
    // through a package called java.util.regex

    // the same thign happens with the strings but the String is limited to find the
    // patterns but in regex we can find any pattern any sign anything in that big
    // text file

    // for finding the pattern first we have to write that pattern then we have to
    // compile that pattern using the static compile method from this we will get
    // the pattern object and on that pattern object we call the matcher method and
    // supply the text file and it will return the matcher object on which we apply
    // the find() which will return boolean weather the pattern found or not

    // it has an exception which is patternSyntaxException

    // Regular_Expression has it's own language own rule using those rule we have to
    // write the pattern

    // in regex . means any character
    // eg: - cat.
    // means after seraching cat, it can be any character

    public static void main(String[] args) {
        String sample = "[abc]";
        Pattern pattern = Pattern.compile(sample);
        Matcher matcher = pattern.matcher("123456abc098098");
        boolean found = matcher.find();
        if (found)
            System.out.println("match found ");
        else
            System.out.println("match does not found");
    }
}
