package stack.and.queue;

public class BracketsValidator {
    public static boolean validateBrackets(String string) {

        Stack<Character> stackBracket = new Stack<Character>();

        char[] blockOfChars = string.toCharArray();

        for (Character bracketChar : blockOfChars) {

            if (bracketChar.equals('(') || bracketChar.equals('[') || bracketChar.equals('{')) {

                stackBracket.push(bracketChar);

            } else if (bracketChar.equals(')') || bracketChar.equals(']') || bracketChar.equals('}')) {

                char checkChar = stackBracket.pop();

                if (bracketChar.equals(')') && checkChar != '(') {
                    return false;
                } else if (bracketChar.equals(']') && checkChar != '[') {
                    return false;
                } else if (bracketChar.equals('}') && checkChar != '{') {
                    return false;
                }

            }

        }

        return stackBracket.isEmpty();
    }
}
