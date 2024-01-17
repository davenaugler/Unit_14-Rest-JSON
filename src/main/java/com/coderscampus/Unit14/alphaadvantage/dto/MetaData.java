package com.coderscampus.Unit14.alphaadvantage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MetaData {

    @JsonProperty("1. Information")
    private String information;
    @JsonProperty("2. Symbol")
    private String symbol;

    // For TimeSeries.java to work successfully ensure that you
    // look at `lastRefreshed` output and use that date/time as the assigned
    // @JsonProperty()'s and work backwords in 5 minute increments. This API only
    // goes as far back as 495 minutes or 8 hours and 15 minutes, at any given time
    // Not ideal, but it works

    @JsonProperty("3. Last Refreshed")
    private String lastRefreshed;
    @JsonProperty("4. Interval")
    private String interval;
    @JsonProperty("5. Output Size")
    private String outputSize;
    @JsonProperty("6. Time Zone")
    private String timeZone;

}
