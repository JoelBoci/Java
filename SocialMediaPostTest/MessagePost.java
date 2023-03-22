public class MessagePost extends Post {
    private String message;

    public MessagePost(String uname, String timestamp, int likes, int comments, String message) {
        super(uname, timestamp, likes, comments);
        this.message = message;
    }

    public String getText() {
        return this.message;
    }
}
