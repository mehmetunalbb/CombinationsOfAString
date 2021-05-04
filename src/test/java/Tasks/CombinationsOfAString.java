package Tasks;

import Utils.Dictionary;

import java.util.LinkedHashSet;
import java.util.Random;

public class CombinationsOfAString {

    public static void main(String[] args) {
        String str="WORKING";
        System.out.println(produceStrings(str).toString());

    }

    public static LinkedHashSet<String> produceStrings(String str){
        LinkedHashSet<String> collectionOfStrings=new LinkedHashSet<>();
        collectionOfStrings.add(str);
        Random random=new Random();

        int indexx=1;
        // generate  from 7 letter words to 2 letter words
        for (int sizeOfNewWord = str.length(); sizeOfNewWord >=2 ; sizeOfNewWord--) {

            int numberOfCombination=1;
            for (int i = 2; i <= str.length() ; i++) { // str,length()! (factorial)
                numberOfCombination*=i;
            }

            for (int j = 1; j <= numberOfCombination; j++) { // runs number of combination times
                String newWord="";

                // to generate index numbers as many as size of new word we need
                for (int k = 1; k <= sizeOfNewWord; k++) {
                    int index=random.nextInt(str.length()); //generates an index from 0 to size of our actual string
                    if(newWord.length()>0){
                        if (!newWord.contains(str.charAt(index)+"")){
                            newWord+=str.charAt(index);
                        }else{
                            k--;
                        }
                    }else{
                        newWord+=str.charAt(index);
                    }

                }
                // prints index starting 1 / prints the newWord / checks if the word is english or not
                collectionOfStrings.add(indexx+ " " +newWord + " " +Dictionary.isEnglish(newWord));
                indexx++;
            }
        }

        return collectionOfStrings;
    }
}
