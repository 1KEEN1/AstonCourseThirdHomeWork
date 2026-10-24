package ru.aston.homework3.chainofresponsibility;

public abstract class MessageSender {
    private final PriorityLevel priorityLevel;
    private MessageSender nextMessageSender;

    public MessageSender(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public MessageSender setNextMessageSender(MessageSender nextMessageSender) {
        this.nextMessageSender = nextMessageSender;
        return this;
    }

    public void sendMassage(String message, PriorityLevel level) {
        if (level.getWeight() >= priorityLevel.getWeight()) {
            write(message);
            return;
        }
        if (nextMessageSender != null) {
            nextMessageSender.sendMassage(message, level);
        }
    }

    protected abstract void write(String message);
}
