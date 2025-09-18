// Default constructor
class Movie{
    String movie_name;
    int duration;
    public void displayDetails(){
        System.out.println("movie name is " + movie_name + " and its duration is "+ duration + " minutes");
    }
}

class Movie2{
    String movie_name;
    int duration;
    // Custom default Constructor
    Movie2(){
        this.movie_name="fast & furious";
        this.duration=220;
    }
    public void displayDetails(){
        System.out.println("movie name is " + movie_name + " and its duration is "+ duration + " minutes");
    }
}
class Movie3{
    String movie_name;
    int duration;
    // Parameterized Constructor
    Movie3(String name,int duration){
        this.movie_name=name;
        this.duration=duration;
    }
    public void displayDetails(){
        System.out.println("movie name is " + movie_name + " and its duration is "+ duration + " minutes");
    }

}
class Movie4{
    private String title;
    private int duration;
    public Movie4(String title,int duration){
        this.title=title;
        this.duration=duration;
    }
    // copy constructors
    public Movie4(Movie4 other){
        this.title=other.title;
        this.duration=other.duration;
    }
    public void displayDetails(){
        System.out.println("movie name is " + title + " and its duration is "+ duration + " minutes");
    }
}
class Main {
    public static void main(String[] args) {
        // Movie f1=new Movie();
        // f1.displayDetails();
        // Movie2 f2=new Movie2();
        // f2.displayDetails();
        // Movie3 f3=new Movie3("fast & furious",240);
        // f3.displayDetails();
        // Movie4 f4=new Movie4();
        Movie4 original=new Movie4("Inception",240);
        Movie4 copy=new Movie4(original);
        copy.displayDetails();

    }
}