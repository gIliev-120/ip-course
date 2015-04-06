package kontrolno.application;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("operations")
public class OperationsApplication extends ResourceConfig{
	public OperationsApplication(){
		packages("kontrolno.rest");
	}
}
