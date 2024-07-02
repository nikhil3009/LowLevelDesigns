package Adapter;

import Adaptee.Weight;

public class ConvertedWeightImpl implements ConvertedWeight{
    Weight w;

    public ConvertedWeightImpl(Weight w){
        this.w = w;
    }

    @Override
    public int getWeightInKgs() {
        int pounds = w.getWeightInPounds();
        double kgs = pounds * 0.45;
        return (int)kgs;
    }
}
