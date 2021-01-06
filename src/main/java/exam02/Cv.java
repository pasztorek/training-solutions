package exam02;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    String name;
    List<Skill> skills = new ArrayList<>();


    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public Cv(String name) {
        this.name = name;
    }

    public void addSkills(String ... skills){
        int level;
        String skill;

        for(String string: skills){
           level = Integer.parseInt(string.substring(string.length()-2,string.length()-1));
           skill = string.substring(0,string.indexOf(" "));

           this.skills.add(new Skill(skill,level));
        }

    }

    public int findSkillLevelByName(String skillFind){

        int result=0;

        for(Skill skill : skills){
            if(skill.getName().equals(skillFind)){
                result=skill.getLevel();
            }
        }

        if(result==0){
            throw new SkillNotFoundException();
        }

        return result;
    }
}
