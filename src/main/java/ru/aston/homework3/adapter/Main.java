package ru.aston.homework3.adapter;

public class Main {
    public static void main(String[] args) {
        EuroPaymentService service = new EuroPaymentService();

        UsdPaymentProcessor processor = new CurrencyPaymentAdapter(service);

        processor.payInUsd(100.00);
    }
}
