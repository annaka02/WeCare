package com.infosys.wecaree.Exception;

public enum ExceptionConstant {
    SERVER_ERROR("server.error"),
       		USER_NOT_FOUND("user.not.found"),

        		BOOKING_ALREADY_EXISTS("booking.already.exists"),

        		COACH_NOT_FOUND("coach.not.found");

       	private final String type;
    ExceptionConstant(String s) {
                   this.type = s;
    }

    @Override
       public String toString() {
            return this.type;
               }
}


