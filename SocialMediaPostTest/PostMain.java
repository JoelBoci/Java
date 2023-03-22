import java.util.ArrayList;

public class PostMain {
    public static void main(String[] args) {
        MessagePost message1 = new MessagePost("Joel Boci", "33 seconds ago", 1, 1, 
                    "Just went outside and I get absolutely soaked by a passing car. Not happy!");

        PhotoPost photo1 = new PhotoPost("Dave Smith", "2 minutes ago", 7, 3, "[car.jpg]", "My new car");

        NewsFeed nf = new NewsFeed();

        nf.addMessagePost(message1);
        nf.addPhotoPost(photo1);

        nf.displayAll();
    }
}
