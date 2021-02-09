package week15d02;

import week13d03.Teachers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Quiz {


    List<String> questions = new ArrayList<>();
    Map<String, String[]> question = new HashMap<>();


    public void readFile(){

        String line="";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Teachers.class.getResourceAsStream("/kerdesek.txt")))){

            while((line = reader.readLine()) != null) {
                questions.add(line);
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }

    }

    public void fillMap(){
        for(int i=0; i<questions.size()-1; i++){
            question.put(questions.get(i), questions.get(i+1).split(" "));
            i++;
        }

        }

    public List<String> topics (String object){

        List<String> result = new ArrayList<>();

        for(Map.Entry<String, String[]> map: question.entrySet()){
            String[] value = map.getValue();
            if(value[2].equals(object)){
                result.add(map.getKey());
            }

        }

    return result;
    }

    public String random (){
        Random rnd = new Random();
        int number = rnd.nextInt(questions.size());
        return questions.get(number)+": "+questions.get(number+1);
    }

    public Map<String, Integer> order(){
        Map<String, Integer> result = new HashMap<>();

        for(Map.Entry<String, String[]> map: question.entrySet()){
            String[] value = map.getValue();
            int point = Integer.parseInt(value[1]);
            if(result.keySet().contains(value[2])) {
                result.put(value[2], Integer.parseInt(value[1]) + point);
            }
            result.put(value[2], Integer.parseInt(value[1]));

        }


        return result;
    }

    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.readFile();
        q.fillMap();
        q.topics("tortenelem");
        System.out.println(q.random());
        q.order();

    }
}
