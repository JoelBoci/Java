public class PhotoPost extends Post {
    private String filename;
    private String caption;

    public PhotoPost(String uname, String timestamp, int likes, int comments, String filename, String caption) {
        super(uname, timestamp, likes, comments);
        this.filename = filename;
        this.caption = caption;
    }

    public String getImageFile() {
        return this.filename;
    }

    public String getCaption() {
        return this.caption;
    }
}
