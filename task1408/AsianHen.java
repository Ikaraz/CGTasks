package com.codegym.task.task14.task1408;

public class AsianHen extends Hen{
    @Override
    public int getMonthlyEggCount() {
        return 45;
    }

    @Override
    public String getDescription() {

        return String.format("%s I come from %s. I lay %s eggs a month.",
                super.getDescription(), Continent.ASIA, getMonthlyEggCount());
    }
}
