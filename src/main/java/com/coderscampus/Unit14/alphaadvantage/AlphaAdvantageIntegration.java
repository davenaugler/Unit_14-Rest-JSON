package com.coderscampus.Unit14.alphaadvantage;

import com.coderscampus.Unit14.alphaadvantage.dto.AlphaAdvantageResponse;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class AlphaAdvantageIntegration {

    @Test
    public void callApiExample() {
        // Allows you to make RESTFUL calls (fetch or send data)
        RestTemplate rt = new RestTemplate();
        // getForEntity and postForEntity are convenience methods, which pre-fill one of the Parameters for the exchange method
        // https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=IBM&apikey=demo
        URI uri = UriComponentsBuilder.fromHttpUrl("https://www.alphavantage.co/query")
                .queryParam("function", "TIME_SERIES_INTRADAY")
                .queryParam("symbol", "TSLA")
                .queryParam("interval", "5min")
                // apiKey SCMMYCK6DCXLS47B
                .queryParam("apikey", "SCMMYCK6DCXLS47B")
                .build()
                .toUri();

        ResponseEntity<AlphaAdvantageResponse> response = rt.getForEntity(uri, AlphaAdvantageResponse.class);
        System.out.println(response.getBody());
    }
}
