package activity;

import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity){
        activities.add(activity);

    }

    public int numberOfTrackActivities(){
        int sum=0;

        for(Activity act: activities){
            if(act instanceof ActivityWithTrack){
                sum++;
            }
        }
        return sum;
    }

    public int numberOfWithoutTrackActivities(){
        int sum=0;

        for(Activity act: activities){
            if(act instanceof ActivityWithoutTrack){
                sum++;
            }
        }
        return sum;
    }

}
