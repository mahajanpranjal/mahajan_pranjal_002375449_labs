/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author macbookair
 */
public class VitalSigns {

    String Date;
    double Temperature;
    double BloodPressure;
    int Pulse;
    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }

    public double getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(double BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public int getPulse() {
        return Pulse;
    }

    public void setPulse(int Pulse) {
        this.Pulse = Pulse;
    }
    
    @Override
    public String toString(){
        return getDate();
    }
    
    
}
