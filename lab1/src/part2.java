import java.util.ArrayList;

public class part2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            switchedNames.add(switchFirstAndLastLetter(name));
        }

        System.out.print("Names = {");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(" " + names.get(i));
            if (i < names.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" }\n");

        System.out.print("Names (switched) = {");
        for (int i = 0; i < switchedNames.size(); i++) {
            System.out.print(" " + switchedNames.get(i));
            if (i < switchedNames.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" }");
    }

    private static String switchFirstAndLastLetter(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        String middle = str.substring(1, str.length() - 1);
        return Character.toUpperCase(lastChar) + middle.toLowerCase() + Character.toLowerCase(firstChar);
    }
}
