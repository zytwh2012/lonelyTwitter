package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;



/**
 * Created by yuntian1 on 10/12/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){
    }

    public void add(Tweet tweet){
        tweets.add(tweet);
    }
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }
    public Tweet getTweet(int index){
        return tweets.get(index);
    }
}


