public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        boolean check = false;
        if (myString.equals(myString.toUpperCase())) {
            check = true;
        }
        // if all are upper case, check is true
        else if (myString.equals(myString.toLowerCase())) {
            check = false;
            // if all lower case, check is false
        } else {
            char firstLetter = myString.charAt(0);
            if (Character.isUpperCase(firstLetter)) {
                // checks for proper capitalization of first letter
                for (int i = 1; i < myString.length(); i++) {
                    char letter = myString.charAt(i);
                    // checks for proper capitalization of the rest of the letters
                    if (Character.isLowerCase(letter)) {
                        check = true;
                    } else {
                        check = false;
                        break;
                        // if it finds an uppercase, breaks the loop, calls for fail
                    }
                }
            } else {
                check = false;
            }
        }
        return check;
    }

}