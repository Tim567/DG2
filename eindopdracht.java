package DG2;

import java.util.Scanner;

public class eindopdracht {
    public static void main(String[] args){
        //Tim Bentum
        String[] woorden = {"op","bliksemafleider","ontbrekende","problematische","speciaal","paden","vluchtroutes","vanuit","verbindingen","ombouwde","mythen","studentes","toelichting","maatstaf","scheidslijn","democratische","ritselen","reikt","verklaarbaar","esthetisch","bijvoeglijk","begrenzing","hoe","debet","indicatoren","westerns","haast","knelpunten","klik","nam"};
        for(int x = 0; x < woorden.length; x++){
            System.out.println(woorden[x]);
        }

        Scanner letter_vraag = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Voor een letter in:");
        String letter = letter_vraag.nextLine();
        System.out.println(letter);
    }
}
