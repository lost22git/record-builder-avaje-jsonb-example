package example.model;

import io.avaje.jsonb.Json;
import io.soabase.recordbuilder.core.RecordBuilderFull;

import java.util.List;

@Json
@RecordBuilderFull
public record Video(
    String name,
    int width,
    int height,
    VideoCodec videoCodec,
    List<Link> links
) {

}
