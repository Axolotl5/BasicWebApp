package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        }
        else if(query.contains(",")){
            String[] numbers = query.split(", ");
            int maxNumb = 0;
            for(int i = 0; i < numbers.length;i++){
                if(Integer.parseInt(numbers[i]) >= maxNumb){
                    maxNumb = Integer.parseInt(numbers[i]);
                }
            }
            return String.valueOf(maxNumb);
        }
        else if(query.contains("plus")){
            String[] numbers = query.split(" plus ");
            int result = 0;
            result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
            return String.valueOf(result);
        }
        else{
            return "";
        }
    }
}
