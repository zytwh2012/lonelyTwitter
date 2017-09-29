/*
 * Class Name:NormalTweet
 *
 * Version:1.4
 *
 * Date: Sep 28 2017
 * Copyright (c) Team X Cmput 301.University of Alberta. All Rights Reserved. you may
 * use,distribute or modify this code under term and conditions of Code of Students Behavior
 * at University of Alberta.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *  Normal tweet class
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
