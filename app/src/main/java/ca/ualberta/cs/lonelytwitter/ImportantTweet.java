/*
 * Class Name:ImportantTweet
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



public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
