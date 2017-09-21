package org.mule.modules.deltaflight.config;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.WsdlProvider;
import org.mule.api.annotations.ws.WsdlServiceEndpoint;
import org.mule.api.annotations.ws.WsdlServiceRetriever;
import org.mule.devkit.api.ws.definition.DefaultServiceDefinition;
import org.mule.devkit.api.ws.definition.ServiceDefinition;
import org.mule.api.annotations.param.Default;

@WsdlProvider(friendlyName = "Configuration")
public class ConnectorConfig {

    @Configurable
    @Default("http://training.cloudhub.io/essentials/delta")
    private String endpoint;

    @WsdlServiceRetriever
    public ServiceDefinition getServiceDefinition() {
           return new DefaultServiceDefinition(
                "TicketServiceService_TicketServicePort",
                "delta",
                "http://ilt.mulesoft-training.com/essentials/delta?wsdl",
                "TicketServiceService",
                "TicketServicePort");
    }

    @WsdlServiceEndpoint
    public String getServiceEndpoint(ServiceDefinition definition) {
         return endpoint;
    }


    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

}