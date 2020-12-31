package catalog;

public class SearchCriteria {

    private String contributor;
    private String title;

    public SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

     public static SearchCriteria createByBoth(String contributor, String title){
        if(contributor==null || title==null){
            throw new IllegalArgumentException();
        }

         SearchCriteria searchC = new SearchCriteria(title,contributor);

         return searchC;

     }
      public static SearchCriteria createByContributor(String contributor){
        if(contributor==null){
            throw new IllegalArgumentException();
        }

        SearchCriteria searchC = new SearchCriteria(contributor,null);

        return searchC;
      }

      public static SearchCriteria createByTitle(String title){
        if(title==null){
            throw new IllegalArgumentException();
        }

          SearchCriteria searchC = new SearchCriteria(null,title);

          return searchC;
      }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasContributor(){
        if(this.contributor!=null){
            return true;
        }
        return false;
    }

    public boolean hasTitle(){
        if(this.title!=null){
            return true;
        }
        return false;
    }
}
