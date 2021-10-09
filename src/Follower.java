public class Follower implements Observer {

    private String username;
    private Account account;

    public Follower(String username, Account account) {

        this.username = username;
        this.account = account;
    }

    @Override
    public void update(Post post) {

        System.out.println("[" + username + "]: @" + account + " uploaded a new post");
        System.out.println("[" + username + "]: " + post);
    }

    @Override
    public String toString() {

        return this.username;
    }
}
