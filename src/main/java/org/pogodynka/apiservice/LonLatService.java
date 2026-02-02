package org.pogodynka.apiservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LonLatService {
    private final RestTemplate restTemplate;

    public LonLatService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private static final String API_URL =
            "https://nominatim.openstreetmap.org/search?q=%s&limit=1&format=jsonv2";

    public LonLatData getLonLat(String city) {
        String url = String.format(API_URL, city);
        try {
            LonLatData[] res = restTemplate.getForObject(url, LonLatData[].class);
            if (res == null) return null;
            return res[0];
        } catch (Exception e) {
            return null;
        }
    }
}
