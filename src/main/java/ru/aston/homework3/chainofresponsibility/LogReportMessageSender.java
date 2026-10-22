package ru.aston.homework3.chainofresponsibility;

public class LogReportMessageSender extends MessageSender {
    public LogReportMessageSender(PriorityLevel priorityLevel) {
        super(priorityLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Log report message sender: " + message);
    }
}
