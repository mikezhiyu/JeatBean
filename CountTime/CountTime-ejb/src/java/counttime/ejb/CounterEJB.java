/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counttime.ejb;

import javax.ejb.Singleton;

/**
 *
 * @author ipd
 */
@Singleton
public class CounterEJB implements CounterEJBRemote {

   public void registerVisit();
 public int getTotalVisitCount();
