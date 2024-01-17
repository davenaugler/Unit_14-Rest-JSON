package com.coderscampus.Unit14.alphaadvantage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class TimeSeries {

    // For TimeSeries.java to work successfully ensure that you
    // look at `lastRefreshed` within MetaData.java output and use that date/time as the assigned
    // @JsonProperty()'s and work backwords in 5 minute increments. This API only
    // goes as far back as 495 minutes or 8 hours and 15 minutes, at any given time
    // Not ideal, but it works

    @JsonProperty("2024-01-16 19:55:00")
    private StockData stockData1;
    @JsonProperty("2024-01-16 19:50:00")
    private StockData stockData2;
    @JsonProperty("2024-01-16 19:45:00")
    private StockData stockData3;
    @JsonProperty("2024-01-16 19:40:00")
    private StockData stockData4;
    @JsonProperty("2024-01-16 19:35:00")
    private StockData stockData5;
    @JsonProperty("2024-01-16 11:40:00")
    private StockData stockData6;

}
