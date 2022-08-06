package com.esfabrick.esercizio.Entity;

public class Res{
   private String status;
   private Object errors;
   private Payload payload;

   public Res(){}

   public Res(String status, Object errors, Payload payload) {
      this.status = status;
      this.errors = errors;
      this.payload = payload;
   }

   //getter-setter

   public String getStatus() {
      return status;
   }
   public void setStatus(String status) {
      this.status = status;
   }

   public Object getErrors() {
      return errors;
   }

   public void setErrors(Object errors) {
      this.errors = errors;
   }
   public Payload getPayload() {
      return payload;
   }
   public void setPayload(Payload payload) {
      this.payload = payload;
   }

}
