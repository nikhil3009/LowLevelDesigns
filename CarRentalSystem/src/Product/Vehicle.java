package Product;

import java.util.Date;

public class Vehicle {
    int id;
    int tagNo;
    String comapnyName;
    String modelname;
    int milesDriven;
    Date manufacturingDate;
    float avgMPG;
    int dailyRentalCost;
    int weeklyRentalCost;
    Status st;
    VechicleType type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTagNo() {
        return tagNo;
    }

    public void setTagNo(int tagNo) {
        this.tagNo = tagNo;
    }

    public String getComapnyName() {
        return comapnyName;
    }

    public void setComapnyName(String comapnyName) {
        this.comapnyName = comapnyName;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public float getAvgMPG() {
        return avgMPG;
    }

    public void setAvgMPG(float avgMPG) {
        this.avgMPG = avgMPG;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public void setDailyRentalCost(int dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public int getWeeklyRentalCost() {
        return weeklyRentalCost;
    }

    public void setWeeklyRentalCost(int weeklyRentalCost) {
        this.weeklyRentalCost = weeklyRentalCost;
    }

    public Status getSt() {
        return st;
    }

    public void setSt(Status st) {
        this.st = st;
    }

    public VechicleType getType() {
        return type;
    }

    public void setType(VechicleType type) {
        this.type = type;
    }
}
