package ru.aston.homework3.adapter;

public class CurrencyPaymentAdapter implements UsdPaymentProcessor {
    private final EuroPaymentService euroService;
    private static final double USD_TO_EUR_RATE = 0.89;

    public CurrencyPaymentAdapter(EuroPaymentService euroService) {
        this.euroService = euroService;
    }

    @Override
    public void payInUsd(double amountInUsd) {
        double amountInEur = amountInUsd * USD_TO_EUR_RATE;
        euroService.executeEuroTransaction(amountInEur);
    }
}
