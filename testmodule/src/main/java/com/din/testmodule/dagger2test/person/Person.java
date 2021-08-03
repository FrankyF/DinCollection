package com.din.testmodule.dagger2test.person;

import com.din.testmodule.dagger2test.person.idcard.Idcard;
import com.din.testmodule.dagger2test.person.personcomponent.DaggerPersonComponent;
import com.din.testmodule.dagger2test.person.personmodule.PersonModule;

import javax.inject.Inject;

public class Person {
   public String company ;

   @Inject
   Idcard idcard ;


   @Inject
   public Person(String company) {
      this.company =company;
      DaggerPersonComponent.builder().personModule(new PersonModule()).build().inject(this);
   }

   public String getCompany() {
      return company;
   }

   public Idcard getIdcard() {
      return idcard;
   }

   @Override
   public String toString() {
      return "Person{" +
              "company='" + company + '\'' +
              ", idcard=" + idcard.toString() +
              '}';
   }
}
