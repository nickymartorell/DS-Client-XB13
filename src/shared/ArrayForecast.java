package shared;

import java.util.ArrayList;


public class ArrayForecast {
	
	
		@SuppressWarnings("unused")
		private String overallID = "getForecast";
		public ArrayList<WeatherForecast> forecastlist = new ArrayList<WeatherForecast>();
		
		public ArrayList<WeatherForecast> getForecasts() {
			return forecastlist;
		}
	}

