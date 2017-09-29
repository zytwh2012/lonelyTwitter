/*
 * Class Name:Tweet
 *
 * Version:1.4
 *
 * Date: Sep 28 2017
 *
 * Copyright (c) Team X Cmput 301.University of Alberta. All Rights Reserved. you may
 * use,distribute or modify this code under term and conditions of Code of Students Behavior
 * at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *  Represent a Tweet
 *
 * @author yuntian1
 * @Version 1.4
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.4
 */
public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a Tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Set date of a message
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     *  Check if a tweet is too long
     *
     * @param message
     * @throws TweetTooLongException
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * return the date of the tweet
     *
     * @return date
     */

    public Date getDate(){
        return date;
    }

    /**
     * return the message of the tweet
     *
     * @return message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Check if the tweet is important
     * @return
     */
    public abstract Boolean isImportant();

}
