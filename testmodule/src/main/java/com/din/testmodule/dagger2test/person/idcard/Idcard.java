package com.din.testmodule.dagger2test.person.idcard;

import javax.inject.Inject;

public class Idcard {
    public String idcardnumber;
    public String name ;
    @Inject
    public Idcard(String idcardnumber, String name) {
        this.idcardnumber = idcardnumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Idcard{" +
                "idcardnumber='" + idcardnumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getIdcardnumber() {
        return idcardnumber;
    }

    public void setIdcardnumber(String idcardnumber) {
        this.idcardnumber = idcardnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
