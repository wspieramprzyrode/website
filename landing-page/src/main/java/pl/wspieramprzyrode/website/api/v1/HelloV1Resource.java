package pl.wspieramprzyrode.website.api.v1;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/api/v1/hello")
@Tag(name = "Hello Resource V1", description = "Basic Hello World Resource")
public class HelloV1Resource {
    @GET
    @Operation(summary = "Returns hello")
    public Uni<String> hello() {
        return Uni.createFrom().item("Hello");
    }
}
