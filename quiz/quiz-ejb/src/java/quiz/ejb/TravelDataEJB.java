/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.ejb;

import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import static javax.ejb.ConcurrencyManagementType.CONTAINER;
import javax.ejb.Lock;
import static javax.ejb.LockType.READ;
import static javax.ejb.LockType.WRITE;
import javax.ejb.Singleton;
import quiz.entities.Travel;

/**
 *
 * @author ipd
 */
@Singleton
@ConcurrencyManagement(CONTAINER)
@AccessTimeout(value = 120000)
public class TravelDataEJB implements TravelDataEJBRemote {

    private ArrayList<Travel> travelList;
      
    @PostConstruct
    public void initialize() {
        System.out.println("TravelDataEJB.initalize()");
        travelList = new ArrayList<>();
    }

    @Override
    @Lock(READ)
    public Travel[] getAllTravels() {
        System.out.println("TravelDateEJB.getAllTravelItems()");
        return travelList.toArray(new Travel[0]);
    }

    @Override
    @Lock(WRITE)
    public void addTravel(Travel item) {
        System.out.println("TravelDateEJB.addTravelItem()");
        travelList.add(item);
    }

    @Override
    @Lock(READ)
    public String[] whoIsTravellingOnDate(Date date) {
       String [] results = new String[100] ;
        System.out.println("TravelDateEJB.getAllTodoItems()");
      return results;
    }
}
