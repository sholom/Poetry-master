package com.example.szopa.poetry;

/**
 * Created by Szopa on 22/03/2016.
 */
public class Poem {
    private Source1 aSource1 = new Source1();
    private String poem = "";

    public java.lang.String writePoem(int numberOfWords, int numberOfLines, int numberOfParagraphs) {
        //split the big source string into an array of word-length strings
        //(one or more space marks the splitting boundary)
        String source = aSource1.getSource();
        String[] sourceToWords = source.split("\\s+");

        //next step: delete all non-word characters (. - , etc.)
        for (int i = 0; i < sourceToWords.length; i++) {
            sourceToWords[i] = sourceToWords[i].replaceAll("[^\\w]", "");
        }

        //print a poem using random elements from the array sourceToWords[]
        for (int i = 0; i < numberOfParagraphs; i++) {
            for (int j = 0; j < numberOfLines; j++) {
                for (int k = 0; k < numberOfWords; k++) {
                    int randomWord = (int) (Math.random() * sourceToWords.length);
                    poem += sourceToWords[randomWord] + " ";
                }
                poem += "\n";
            }
            poem += "\n";
        }

        return poem;
    }

    }