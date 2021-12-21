package com.calcrest.calcrest.Exceptioncalc;
import java.io.Serializable;
import java.util.Date;

public class ResponseException implements Serializable{
    
        private Date datetime;
        private String message;
        private String details;
        
        public ResponseException(Date datetime, String message, String details) {
            super();
            this.datetime = datetime;
            this.message = message;
            this.details = details;
        }
    
        public Date getDatetime() {
            return datetime;
        }
    
        public String getMessage() {
            return message;
        }
    
        public String getDetails() {
            return details;
        }
    
}
       

