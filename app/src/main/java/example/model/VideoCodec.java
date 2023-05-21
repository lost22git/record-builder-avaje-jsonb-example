package example.model;

import io.avaje.jsonb.Json;

public enum VideoCodec {
    H264("H.264"),
    H265("H.265");

    final String value;

    VideoCodec(String value) {
        this.value = value;
    }

    @Json.Value
    public String getValue() {
        return this.value;
    }
}
