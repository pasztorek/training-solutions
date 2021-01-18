package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public Coordinate findMinimumCoordinate(){

        if(trackPoints.isEmpty()) {
            throw new IllegalStateException("No points");
        }

        double minlat = trackPoints.get(0).getCoordinate().getLatitude();
        double minlon = trackPoints.get(0).getCoordinate().getLongitude();

        for(TrackPoint tp: trackPoints){
            if(tp.getCoordinate().getLatitude()<minlat){
                minlat= tp.getCoordinate().getLatitude();
            }

            if(tp.getCoordinate().getLongitude()<minlon){
                minlon = tp.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minlat, minlon);
    }

    public Coordinate findMaximumCoordinate(){

        if(trackPoints.isEmpty()) {
            throw new IllegalStateException("No points");
        }

        double maxlat = trackPoints.get(0).getCoordinate().getLatitude();
        double maxlon = trackPoints.get(0).getCoordinate().getLongitude();

        for(TrackPoint tp: trackPoints){
            if(tp.getCoordinate().getLatitude()>maxlat){
                maxlat= tp.getCoordinate().getLatitude();
            }

            if(tp.getCoordinate().getLongitude()>maxlon){
                maxlon = tp.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxlat, maxlon);
    }

    public double  getRectangleArea(){

         double lat = findMaximumCoordinate().getLatitude()-findMinimumCoordinate().getLatitude();
         double lon = findMaximumCoordinate().getLongitude()-findMinimumCoordinate().getLongitude();

         return lat*lon;
    }

    public double getFullElevation(){
        double sum= 0;

        for (int i=0; i<trackPoints.size()-1; i++){
            if(trackPoints.get(i+1).getElevation() > trackPoints.get(i).getElevation()){
                sum = sum + trackPoints.get(i+1).getElevation()-trackPoints.get(i).getElevation();
            }

        }
        return sum;
    }

    public double getFullDecrease(){
        double sum= 0;

        for (int i=0; i<trackPoints.size()-1; i++){
            if(trackPoints.get(i+1).getElevation() < trackPoints.get(i).getElevation()){
                sum = sum + trackPoints.get(i).getElevation()-trackPoints.get(i+1).getElevation();
            }

        }
        return sum;
    }

    public double getDistance(){
        double sum = 0;
        for(int i=0; i<trackPoints.size()-1; i++){
            sum = sum + trackPoints.get(i).getDistanceFrom(trackPoints.get(i+1));

        }
        return sum;
    }

    public void addTrackPoint(TrackPoint trackpoint){
        trackPoints.add(trackpoint);

    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}
