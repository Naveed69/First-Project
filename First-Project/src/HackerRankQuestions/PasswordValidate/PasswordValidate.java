package HackerRankQuestions.PasswordValidate;

public class PasswordValidate {
    public static void main(String arg[]){
        System.out.println(validatePassword("Naveed@0001"));
    }

    public static String validatePassword(String pass){
        int result=0;
        boolean has_number=false,has_upper=false,has_lower=false,has_special=false;
        for(int i=0;i<pass.length();i++){
            char ch=pass.charAt(i);
            if(Character.isDigit(ch)) has_number=true;
            else if(Character.isUpperCase(ch)) has_upper=true;
            else if(Character.isLowerCase(ch)) has_lower=true;
            else has_special=true;
        }
        if(has_lower && has_number && has_special && has_upper)
            return "satisfy the criteria password has been set";
        return "Do not satisfy the criteria please re-enter password";
    }
}
