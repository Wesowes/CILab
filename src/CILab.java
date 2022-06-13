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
        for(int i = 0; i < myString.length(); i++) {
            char letter = myString.charAt(i);
            if (Character.isLowerCase(letter)) {
                check = false;
            }
            if(Character.isUpperCase(i)) {
                check = true;
                break;
            }
        }
        return check;

    }

}