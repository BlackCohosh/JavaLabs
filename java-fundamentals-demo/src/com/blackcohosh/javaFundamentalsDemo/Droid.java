package com.blackcohosh.javaFundamentalsDemo;

public class Droid {
    private String serialNumber;
    private String model;
    private String purpose;

    public Droid(String serialNumber, String model, String purpose) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.purpose = purpose;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void speak () { System.out.println("Beep Beep Be Deep Boop!");}

    public void bork () { System.out.println("BORK BORK BORK");}

    public String toString() {return "Serial Number: " + this.serialNumber + "Model Type: " + this.model + "Purpose: " + this.purpose;};
}
