package io.github.xmacex.fourth_revol_bot;

import java.util.List;
import twitter4j.TwitterFactory;
import twitter4j.Twitter;
import twitter4j.Status;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
	try {
	    Twitter twitter = TwitterFactory.getSingleton();
	    List<Status> statuses = twitter.getHomeTimeline();
	    System.out.println("Showing home timeline.");
	    for (Status status : statuses) {
		System.out.println(status.getUser().getName() + ":" +
				   status.getText());
		System.out.println();
	    }
	} catch (Exception e) {
	    System.err.println(e);
	}
    }
}
