/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoutBoardEJB;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 *
 * @author ipd
 */
@Singleton
public class ShoutBoardEJB implements ShoutBoardEJBRemote {

    private ArrayList<String> shoutList;
    
    @PostConstruct
    public void initializ(){
        shoutList= new ArrayList<>();
    }
    
    
    @Override
    public void addShout(String shout) {
        shoutList.add(shout);
       }

    @Override
    public String[] getAllShouts() {
          return shoutList.toArray(new String[0]);
    }


}
