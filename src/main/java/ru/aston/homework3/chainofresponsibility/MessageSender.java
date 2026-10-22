package ru.aston.homework3.chainofresponsibility;

public abstract class MessageSender {
    private final PriorityLevel priorityLevel;
    private MessageSender nextMessageSender;

    public MessageSender(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public void setNextMessageSender(MessageSender nextMessageSender) {
        this.nextMessageSender = nextMessageSender;
    }

    public void messageSenderManager(String message, PriorityLevel level) {
        if (level.getWeight() >= priorityLevel.getWeight()) {
            write(message);
            return;
        }
        if (nextMessageSender != null) {
            nextMessageSender.messageSenderManager(message, level);
        }
    }

    public abstract void write(String message);
}
