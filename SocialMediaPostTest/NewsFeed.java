import java.util.ArrayList;

public class NewsFeed {
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    public NewsFeed() {
        this.messages = new ArrayList<>();
        this.photos = new ArrayList<>();
    }

    public void addMessagePost(MessagePost m) {
        messages.add(m);
    }

    public void addPhotoPost(PhotoPost p) {
        photos.add(p);
    }

    public void displayAll() {
        for(MessagePost m : messages) {
            m.display();
            System.out.println();
        }

        for(PhotoPost p : photos) {
            p.display();
            System.out.println();
        }
    }
}
