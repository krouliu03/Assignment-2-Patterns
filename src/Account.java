import java.util.*;

public class Account implements Subject {

    private String username;
    
    private List<Observer> observers = new ArrayList<>();
    public List<Post> posts = new ArrayList<>();

    public Account(String username) {

        this.username = username;
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {

        this.observers.add(observer);
        
        System.out.println(observer + " followed @" + username);
    }

    @Override
    public void removeObserver(Observer observer) {

        int index = observers.indexOf(observer);

        if (index >= 0) {

            this.observers.remove(index);
        }
    }

    @Override
    public void notifyObservers(Post post) {

        // System.out.println("successfully: notified your followers about your post\n");

        for (Observer observer : observers) {

            observer.update(post);
        }
    }

    public void publishPost(Post post) {

        // System.out.println("\nattempt: trying to publish your new post\n");

        this.posts.add(post);

        notifyObservers(post);
    }

    public void getPosts() {

        System.out.println("\nList of" + this.username + "'s posts: ");

        for (Post post : this.posts) {

            System.out.println(post);
        } 
    }

    @Override
    public String toString() {

        return this.username;
    }
}
