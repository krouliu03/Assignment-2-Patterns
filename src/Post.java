public class Post {

    private String location;
    private String caption;
    private String url;

    public Post() {
    }

    public Post(String location, String caption, String url) {

        this.location = location;
        this.caption = caption;
        this.url = url;
    }

    public String getLocation() {

        return this.location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public String getCaption() {

        return this.caption;
    }

    public void setCaption(String caption) {

        this.caption = caption;
    }

    public String getUrl() {

        return this.url;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    @Override
    public String toString() {
        return "post[location: " + this.location + ", caption: " + this.caption + ", url: " + this.url + "]";
    }
}
