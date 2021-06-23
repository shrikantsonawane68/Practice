import java.util.Scanner;

public class Website {

    public static void main(String args[])
    {
        String websiteUrl, websiteType, websiteProtocol;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website URL : ");
        websiteUrl = sc.nextLine();

        //finding type of website

        int lastIndex = websiteUrl.lastIndexOf(".");
        websiteType = websiteUrl.substring(lastIndex+1);

        if(websiteType.equalsIgnoreCase("COM")){
            System.out.println("It's a commercial website!");
        }
        else if(websiteType.equalsIgnoreCase("GOV")) {
            System.out.println("It's a Government website!");
        }
        else{
            System.out.println("It's a unknown website type !");
        }

        //finding type of website protocol

        int indexOfColon = websiteUrl.indexOf(":");
        websiteProtocol = websiteUrl.substring(0,indexOfColon);

        if(websiteProtocol.equalsIgnoreCase("HTTP")){
            System.out.println("It's a Hypertext transfer protocol !");
        }
        else if(websiteProtocol.equalsIgnoreCase("FTP")){
            System.out.println("It's a File transfer protocol !");
        }
        else{
            System.out.println("It's a unknown website protocol type !");
        }

    }

    }
