package org.example.assignment;

import java.util.ArrayList;
import java.util.List;

public class TestTaker {

    public static String winners( String[] participantsList ) {

        java.util.Map<String, Integer> averages = new java.util.LinkedHashMap<String, Integer>();
        for(int i = 0; i< participantsList.length; i++) {
            String participant = participantsList[i];
            String[] words = participant.trim().split("\\W+");
            int sumOfScores = 0;
            int numberOfScores = 0;
            StringBuffer participantName = new StringBuffer();
            for(String word: words) {
                try{
                    sumOfScores += Integer.parseInt(word);
                    numberOfScores++;
                } catch (NumberFormatException ex) {
                    participantName.append(word).append(" ");
                }
            }
            averages.put(participantName.toString().trim(),sumOfScores/numberOfScores);
        }
        java.util.Map<String, Integer> sortedAverages = averages.entrySet().stream()
                .sorted(java.util.Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(java.util.stream.Collectors.toMap((e) -> e.getKey(), java.util.Map.Entry::getValue, (x, y) -> x, java.util.LinkedHashMap::new));


        java.util.Iterator<java.util.Map.Entry<String, Integer>> it = sortedAverages.entrySet().iterator();
        int i = 0;
        String[] winners = new String[3];
        while(it.hasNext()) {
            java.util.Map.Entry<String, Integer> entry = it.next();
            winners[i] =  entry.getKey().toString();
            i++;
        }

        StringBuilder sbWinners = new StringBuilder();
        sbWinners.append("In 1st place:").append(winners[0]).
                append(";In 2nd place:").append(winners[1]).
                append(";In 3rd place:").append(winners[2]).
                append(";");

        return sbWinners.toString();

    }


}