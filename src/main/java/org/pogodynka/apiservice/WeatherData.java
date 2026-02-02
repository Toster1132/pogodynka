package org.pogodynka.apiservice;

public class WeatherData {
    private current current;
    private daily daily;

    public WeatherData() {}

    public current getCurrent() {
        return current;
    }

    public void setCurrent(current current) {
        this.current = current;
    }

    public daily getDaily() {
        return daily;
    }

    public void setDaily(daily daily) {
        this.daily = daily;
    }

    public static class current {
        private int apparent_temperature;
        private int relative_humidity_2m;
        private double temperature_2m;
        private double snowfall;
        private double rain;
        private double surface_pressure;
        private int cloud_cover;
        private double wind_speed_10m;

        public current() {}

        public int getApparent_temperature() {
            return apparent_temperature;
        }

        public void setApparent_temperature(int apparent_temperature) {
            this.apparent_temperature = apparent_temperature;
        }

        public int getRelative_humidity_2m() {
            return relative_humidity_2m;
        }

        public void setRelative_humidity_2m(int relative_humidity_2m) {
            this.relative_humidity_2m = relative_humidity_2m;
        }

        public double getTemperature_2m() {
            return temperature_2m;
        }

        public void setTemperature_2m(double temperature_2m) {
            this.temperature_2m = temperature_2m;
        }

        public double getSnowfall() {
            return snowfall;
        }

        public void setSnowfall(double snowfall) {
            this.snowfall = snowfall;
        }

        public double getRain() {
            return rain;
        }

        public void setRain(double rain) {
            this.rain = rain;
        }

        public double getSurface_pressure() {
            return surface_pressure;
        }

        public void setSurface_pressure(double surface_pressure) {
            this.surface_pressure = surface_pressure;
        }

        public int getCloud_cover() {
            return cloud_cover;
        }

        public void setCloud_cover(int cloud_cover) {
            this.cloud_cover = cloud_cover;
        }

        public double getWind_speed_10m() {
            return wind_speed_10m;
        }

        public void setWind_speed_10m(double wind_speed_10m) {
            this.wind_speed_10m = wind_speed_10m;
        }
    }

    public static class daily {
        private double[] temperature_2m_mean;
        private int[] cloud_cover_mean;

        public daily() {}

        public double[] getTemperature_2m_mean() {
            return temperature_2m_mean;
        }

        public void setTemperature_2m_mean(double[] temperature_2m_mean) {
            this.temperature_2m_mean = temperature_2m_mean;
        }

        public int[] getCloud_cover_mean() {
            return cloud_cover_mean;
        }

        public void setCloud_cover_mean(int[] cloud_cover_mean) {
            this.cloud_cover_mean = cloud_cover_mean;
        }
    }
}
