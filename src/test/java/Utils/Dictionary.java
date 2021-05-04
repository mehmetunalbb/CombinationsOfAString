package Utils;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private static List<String> getEnglishWords(){
        List<String> englishWords=new ArrayList<>();
        englishWords.add("WORKING");
        englishWords.add("WORK");
        englishWords.add("RING");
        englishWords.add("KING");
        englishWords.add("WING");
        englishWords.add("WIG");
        englishWords.add("WIN");
        englishWords.add("WON");
        englishWords.add("OR");
        englishWords.add("IN");

        return englishWords;
    }

    public static boolean isEnglish(String word){
        boolean isEnglish=false;
        List<String> englishWordList=getEnglishWords();
        for (int i = 0; i < englishWordList.size(); i++) {
            if (word.equals(englishWordList.get(i))){
                isEnglish=true;
                break;
            }
        }
        return isEnglish;
    }

}
