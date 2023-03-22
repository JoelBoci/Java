public class Post {
    private String username;
    private String timestamp;
    private int likes;
    private int comments;

    public Post(String uname, String timestamp, int likes, int comments) {
        this.username = uname;
        this.timestamp = timestamp;
        this.likes = likes;
        this.comments = comments;
    }

    public void like() {
        this.likes++;
    }

    public void unlike() {
        this.likes--;
    }

    public void addComment() {
        this.comments++;
    }

    public void display() {
        System.out.println(this.username + "\n" + this.timestamp + " - " + this.likes + " people like this" +
                            "\n" + this.comments + " comments");
    }

    public String getUsername() {
        return username;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public int getLikes() {
        return likes;
    }

    public int getComments() {
        return comments;
    }
}