package com.company;

import java.time.LocalDateTime;

public class EmailNotification extends Notification {
    private String recipeint;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipent, String smtpProvider) {
        super(subject, body);
        this.recipeint = recipent;
        this.smtpProvider = smtpProvider;

    }
    public void setStatus(){
        this.status = "great";
    }

    @Override
    public void printMessage() {
        super.printMessage();
        System.out.println("You've changed the protected method");
    }

    public String getRecipient() {
        return recipeint;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println(getRecipient()+ " " + getSmtpProvider()+ " " + super.getBody()+ " " + super.getSubject()+ " " + super.getCreatedAt());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipeint != null ? !recipeint.equals(that.recipeint) : that.recipeint != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipeint != null ? recipeint.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() {
        EmailNotification newEmailNotification = new EmailNotification(this.getSubject(), this.getBody(), this.recipeint, this.getSmtpProvider());
        return newEmailNotification;
    }
}
