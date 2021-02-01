package collectionsmap;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogParser {

    public Map<String, List<Entry>> parseLog (String log){
        Map<String, List<Entry>> result = new HashMap<>();
        List<Entry> entries = new ArrayList<>();
        String cleared = log.replace('\n', ':');
        String[] line = cleared.split(":");

        if(!log.contains(":")){
            throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
        }

        try {
            for (int i = 0; i < line.length; i++) {
                entries.add(new Entry(line[i], LocalDate.parse(line[i + 1]), line[i + 2]));
                i = i + 2;
            }
        }

        catch (DateTimeException e){
            throw new IllegalArgumentException("Incorrect log: incorrect date", e);
        }

        result.put(line[0], entries);
        return result;
    }
 }
