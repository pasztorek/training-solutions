package week14d05;


import week13d01.getTown;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Hachiko {


        public Map<String, Integer> countWords(String file, String ... words){

                    Map<String, Integer> result = new HashMap<>();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(getTown.class.getResourceAsStream("/"+file)))){

                String line;

                while((line = reader.readLine()) != null) {


                    for(int i=0; i<words.length; i++){
                        if(line.toLowerCase().contains(words[i])) {
                            if(!result.containsKey(words[i])) {
                                result.put(words[i], 1);
                            }
                            else{
                                int actualCount = result.get(words[i]);
                                result.put(words[i], actualCount + 1);
                            }
                        }
                    }
                }
            }
            catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }
            return result;
        }

        public static void main(String[] args) {
            Hachiko hc = new Hachiko();
            System.out.println(hc.countWords("hachiko.srt", "haza","pályaudvar","jó").toString());


        }
    }

