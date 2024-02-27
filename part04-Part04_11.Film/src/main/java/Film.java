public class Film {
    private String name;
    private int ageRate;

    public Film(String filmName, int filmAgeRating){
        this.name = filmName;
        this.ageRate = filmAgeRating;
    }

    public String name(){
        return(name);
    }

    public int ageRating(){
        return(ageRate);
    }
}
