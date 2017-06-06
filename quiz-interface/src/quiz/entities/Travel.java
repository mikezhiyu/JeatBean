/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.entities;

import java.io.Serializable;
import java.util.Date;

public class Travel implements Serializable {

    private static final long serialVersionUID = 1L;
    private static int counter;

    int id;
    String fullName, destination;
    Date departDate, returnDate;
    int id1=0;
    int id2=0;

    public Travel(String fullName, String destination, Date departDate, Date returnDate) {
        if (id1 == 0 && id2 == 0) {
            id = 1;
            id1 = 1;
        } else if (id1 == 1 && id2 == 0) {
            id = 1;
            id2 = 1;
        } else {
            id = id1 + id2;
            id1 = id2;
            id2=id;
        } 
        
        setFullName(fullName);
        setDestination(destination);
        setDepartDate(departDate);
        setReturnDate(returnDate);
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDepartDate() {
        return departDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setFullName(String fullName) {
        if (fullName.isEmpty()) {
            throw new IllegalArgumentException("fullName must not be emtpy");
        }

        this.fullName = fullName;
    }

    public void setDestination(String destination) {
        if (destination.isEmpty()) {
            throw new IllegalArgumentException("destination must not be emtpy");
        }

        this.destination = destination;
    }

    public void setDepartDate(Date departDate) {
        this.departDate = departDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

}
