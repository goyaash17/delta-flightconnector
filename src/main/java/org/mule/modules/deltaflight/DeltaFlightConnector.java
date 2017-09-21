package org.mule.modules.deltaflight;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.modules.deltaflight.config.ConnectorConfig;

@Connector(name="delta-flight", friendlyName="DeltaFlight", minMuleVersion = "3.7")
public class DeltaFlightConnector {

    @Config
    ConnectorConfig config;

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}