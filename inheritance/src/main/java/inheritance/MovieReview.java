package inheritance;

public class MovieReview {
    String title;
    String body;
    int stars;

    public MovieReview(String title, String review, int stars){
        this.title = title;
        this.body = body;
        this.stars = stars;
    }

    public String toString() {
        return String.format("Review of: %s \nReview: \n%s Stars: %d", title, body, stars);
    }
}
