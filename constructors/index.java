// Default constructor
class Movie{
    String movie_name;
    int duration;
    public void displayDetails(){
        System.out.println("movie name is " + movie_name + " and its duration is "+ duration + " minutes");
    }
}
class Main {
    public static void main(String[] args) {
        Movie f=new Movie();
        f.displayDetails();
    }
}