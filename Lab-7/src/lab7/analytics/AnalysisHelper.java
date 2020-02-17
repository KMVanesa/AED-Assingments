/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.print.Collation;
import lab7.entities.Comment;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    private Object Collations;
    
    // find user with Most Likes
    // TODO
    public void getUserWithMostLikes(){
        Map <Integer , Integer> userLikes = new HashMap<>();
        Map<Integer,User> userMap = DataStore.getInstance().getUsers();
        for(User u: userMap.values()){
            for(Comment comment: u.getComments()){
                if(userLikes.containsKey(u.getId())){
                    int commentLikes = userLikes.get(u.getId());
                    userLikes.put(u.getId(), commentLikes);
                
            }
                else{
                    userLikes.put(u.getId(),comment.getLikes());
                }
                
            }
        }
        
        
        int winner= 0;
        int maxLikes= 0;
        for(Integer i: userLikes.keySet()){
            if(maxLikes<userLikes.get(i)){
                winner = i;
                maxLikes = userLikes.get(i);
                
            }
        }
        
        System.out.println("The user with max likes is "+ winner+"the max number of likes is "+maxLikes);
    }
    
    
    // find 5 comments which have the most likes
    // TODO
    
    public void getFiveCommentsWithMostLikes(){
        Map<Integer, Comment> commentMap =  DataStore.getInstance().getComments();
        List <Comment> comments = new ArrayList<>(commentMap.values());
        Collections.sort(comments , new Comparator<Comment>() {
            @Override
            public int compare(Comment c1, Comment c2) {
                 return c2.getLikes()- c1.getLikes();
            }
        });
            
        
        for(int i= 0; i<5 ; i++)
        {
            System.out.println(comments.get(i));
        }
          
       
        }
        
    }
        
    
        
        
        
        
    

