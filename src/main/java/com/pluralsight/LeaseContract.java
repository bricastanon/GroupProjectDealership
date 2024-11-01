package com.pluralsight;

public class LeaseContract extends Contract{
    public LeaseContract(String _date, String _customerName, String _customerEmail, int _vin) {
        super(_date, _customerName, _customerEmail, _vin);
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }
}
