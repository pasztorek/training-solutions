package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public void addMail(Mail mail) {

        mails.add(mail);

    }

    public List<Mail> getMails() {
        return mails;
    }

    public List<Mail> findByCriteria(String s) {
        List<Mail> result = new ArrayList<>();
        String[] split;

        if(s.contains("from:")){
            split = s.split(":");
            for(Mail ml: mails){
                if(ml.getFrom().getEmail().equals(split[1]) || ml.getFrom().getName().equals(split[1])){
                    result.add(ml);
                }

            }

        }
        else if(s.contains("to:")){
            split = s.split(":");
            for(Mail ml: mails){
                for(Contact cnt :ml.getTo())
                    if(cnt.getName().equals(split[1]) || cnt.getEmail().equals(split[1])){
                        result.add(ml);
                }
            }
        }
        else{
            for(Mail ml: mails){
                    if(ml.getMessage().contains(s) || ml.getSubject().contains(s)){
                        result.add(ml);
                    }
            }
        }

        return result;
    }
}
