package it.html.tutorial.library.api;

import java.io.IOException;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
//per url
@ApplicationPath("/api")
public class Application<E> extends ResourceConfig {
    public Application() {
        packages("it.html.tutorial.library.api");
    }
    public void filter(ContainerRequestContext requestContext)
    		throws IOException {
	}
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
    		throws IOException {
	}
    Response toResponse(E exception) {
		return null;
	}
}