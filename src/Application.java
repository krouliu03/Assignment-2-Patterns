public class Application {
    public static void main(String[] args) throws Exception {

        Account account1 = new Account("alibishk");

        Follower follower1 = new Follower("time.to.my.insta.stories", account1);
        Follower follower2 = new Follower("zar1nok", account1);

        account1.addObserver(follower1);
        account1.addObserver(follower2);

        Post p1 = new Post("Nur-Sultan", "it`s me)))", "alibishk/Pictures/my/mybeautyfulface.png");

        account1.publishPost(p1);

        Account account2 = new Account("nndax");

        Follower follower3 = new Follower(account1.toString(), account2);
        Follower follower4 = new Follower(follower2.toString(), account2);

        account2.addObserver(follower3);
        account2.addObserver(follower4);

        Post p2 = new Post("UKA city", "nice view <3", "nndax/Pictures/my/friends.png");

        account2.publishPost(p2);
    }
}
