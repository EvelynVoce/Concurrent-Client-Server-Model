package systemssoftwareproject.WeatherStation;

import systemssoftwareproject.DataStructures.SampleType;

// These functions are syncronus we assume that the data will be immidatly returned.
import java.time.LocalDateTime;

public class WeatherInstruments{

    public WeatherInstruments(String loc_in_radius) {
    }
    /**
     * 
     * @return sample
     */
    public SampleType getSample(){
        
        double Temprature = climate.getTemp();

        double Humidity = climate.getHumidity();

        double gpsLatitude = Location.getGpsLat(2.3, 2.2, 1);

        double gpsLongitude = Location.getGpsLong(2.3, 2.2, 1);

        double altitude = Location.getGpsAltitude();

        LocalDateTime sampleDateTime = LocalDateTime.now();

        
        SampleType sample;
        sample = new SampleType(Temprature,Humidity,gpsLatitude,gpsLongitude,altitude,sampleDateTime);
        return sample;
    }
}
