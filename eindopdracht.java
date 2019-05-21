package DG2;

import java.util.Scanner;

public class eindopdracht {
    public static void main(String[] args){
        //Tim Bentum
        String[] woorden = {"op","bliksemafleider","ontbrekende","problematische","speciaal","paden","vluchtroutes","vanuit","verbindingen","ombouwde","mythen","studentes","toelichting","maatstaf","scheidslijn","democratische","ritselen","reikt","verklaarbaar","esthetisch","bijvoeglijk","begrenzing","hoe","debet","indicatoren","westerns","haast","knelpunten","klik","nam"};
        for(int x = 0; x < woorden.length; x++){
            System.out.println(woorden[x]);
        }
        System.out.println(vraag_letter());

    }
    static private String vraag_letter(){
        Scanner letter_vraag = new Scanner(System.in);
        System.out.println("Voor een letter in:");
        String letter = letter_vraag.nextLine();
        return letter;
    }
}
