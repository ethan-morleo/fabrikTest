package com.esfabrick.esercizio.Entity;

public class Payload{
    private Object list;

    public Payload (){
        this.list=null;
    }

    public Payload(Object list) {
        this.list = list;
    }

    //getter-setter

    public Object getList() {
        return list;
    }

    public void setList(Object list) {
        this.list = list;
    }


}
