package ru.aston.homework3.chainofresponsibility;

public class EmailMessageSender extends MessageSender {
    public EmailMessageSender(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("Email message sender: " + message);
    }
}
