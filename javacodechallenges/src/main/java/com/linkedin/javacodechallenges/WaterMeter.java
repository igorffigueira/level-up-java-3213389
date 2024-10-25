package com.linkedin.javacodechallenges;

public class WaterMeter {
  private static final long cCFGallons = 748;
  private static final double costPerCCF = 3.9;

  private int minimalCCFsCharged = 2;
  private double minimalCharge = 18.84;

  public double calculateWaterBill(double gallonsUsage) {
    var bill = minimalCharge;

    var amountOfCCFs = getAmountOfCCFs(gallonsUsage);

    if (amountOfCCFs > minimalCCFsCharged) {
      bill += (getExtraCCFsConsumed(amountOfCCFs) * costPerCCF);
    }

    return bill;
  }

  private double getAmountOfCCFs(double gallonsUsage) {
    return (gallonsUsage / cCFGallons);
  }

  private int getExtraCCFsConsumed(double amountOfCCFs) {
    return (int) Math.ceil(amountOfCCFs - (double) minimalCCFsCharged);
  }
}
