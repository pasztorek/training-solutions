package methodvarargs;

public class ExamStats {

    int maxPoints;


    public int getNumberOfTopGrades(int limitInPercent, int... results){
        int statistic=0;

        if(results==null || results.length==0){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
            for(int result: results) {
                if(result>limitInPercent){
                    statistic++;
                }
            }
            return statistic;
    }
    public boolean hasAnyFailed(int limitInPercent, int... results){
        int statistic=0;

        if(results.length==0 || results==null){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        for(int result: results) {
            statistic = statistic + result;
        }
            if(statistic/results.length<=limitInPercent){
                    return true;
            }
            return false;
    }

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }
}
