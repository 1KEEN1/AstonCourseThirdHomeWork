package ru.aston.homework3.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        MessageSender messageChain = new LogReportMessageSender(PriorityLevel.LOW)
                .setNextMessageSender(new EmailMessageSender(PriorityLevel.MIDDLE))
                .setNextMessageSender(new SMSMessageSender(PriorityLevel.HIGH));

        messageChain.sendMassage("Something is happening!", PriorityLevel.LOW);

        System.out.println("-----");
        messageChain.sendMassage("Something went wrong!", PriorityLevel.MIDDLE);

        System.out.println("-----");
        messageChain.sendMassage("We have a problem!", PriorityLevel.HIGH);
    }
}
