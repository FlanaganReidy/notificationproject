package com.company;

import java.time.LocalDateTime;

public class Notification extends Exception {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "good";
    }

    public String getSubject() {
        return subject;
    }
    public void showStatus(){
        System.out.println(status);
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getBody() {
        return body;
    }
    public void transport(){
        throw new NoTransportException();
    }
    protected void printMessage(){
        System.out.println("You found the protected method");
    }
}
