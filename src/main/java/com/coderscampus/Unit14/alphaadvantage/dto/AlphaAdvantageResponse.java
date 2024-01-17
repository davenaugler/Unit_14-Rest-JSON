package com.coderscampus.Unit14.alphaadvantage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

//@Data
public class AlphaAdvantageResponse {

    @JsonProperty("Meta Data")
    private MetaData metaData;

    @JsonProperty("Time Series (5min)")
    private TimeSeries timeSeries;

    public MetaData getMetaData() {
        return metaData;
    }
    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }
    public TimeSeries getTimeSeries() {
        return timeSeries;
    }
    public void setTimeSeries(TimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }

//    @JsonProperty("Meta Data")
//    private MetaData metaData;
//
//    @JsonProperty("Time Series (5min)")
//    private TimeSeries timeSeries;

}
