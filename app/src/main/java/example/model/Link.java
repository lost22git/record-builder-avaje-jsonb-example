package example.model;

import io.avaje.jsonb.Json;
import io.soabase.recordbuilder.core.RecordBuilderFull;

import java.net.URI;

@Json
@RecordBuilderFull
public record Link(
    URI uri,
    String token
) {
}
