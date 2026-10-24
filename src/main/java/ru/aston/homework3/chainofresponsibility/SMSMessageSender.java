package ru.aston.homework3.chainofresponsibility;

public class SMSMessageSender extends MessageSender {
    public SMSMessageSender(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("SMS message sender: " + message);
    }
}
