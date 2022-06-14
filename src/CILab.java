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
        else if (myString.equals(myString.toLowerCase())) {
            check = false;
        } else {
            char firstLetter = myString.charAt(0);
            if (Character.isUpperCase(firstLetter)) {
                for (int i = 1; i < myString.length(); i++) {
                    char letter = myString.charAt(i);
                    if (Character.isLowerCase(letter)) {
                        check = true;
                    } else {
                        check = false;
                    }
                }
            } else {
                check = false;
            }
        }
        return check;
    }

}