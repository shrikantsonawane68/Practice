public class StringDemo {
    public static void main(String args[])
    {
        //find user name & domain name from email ID
        String email = "shrikantsonawane68@gmail.com";
        int i = email.indexOf('@');
        String userName = email.substring(0,i);
        String domainName = email.substring(i+1);

        System.out.println("Email : "+email);
        System.out.println("User name :"+userName);
        System.out.println("Domain name : "+domainName);

        //remove special characters from string

        String strWithSpecialChar = "A%b@c$1&2*3";
        String strWithoutSpecialChar = strWithSpecialChar.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("String before removing special chars : "+strWithSpecialChar);
        System.out.println("String after removing special chars : "+strWithoutSpecialChar);


        //removing extra spaces from string

        String strWithExtraSpace = "  ABC      DEF      012        GHI      ijk     ";
        String strWithoutExtraSpaces = strWithExtraSpace.replaceAll("\\s+"," ");
        System.out.println("String before removing extra spaces : "+strWithExtraSpace);
        System.out.println("String after removing extra spaces : "+strWithoutExtraSpaces);


        //find the number of words in string

        String str = "     I        am        a          boy!     ";
        String word[]=str.replaceAll("\\s+"," ").trim().split("\\s");
        int lengthOfWord = word.length;
        System.out.println("String is : "+str);
        System.out.println("Number of words in given string is  : "+lengthOfWord);
    }
}
