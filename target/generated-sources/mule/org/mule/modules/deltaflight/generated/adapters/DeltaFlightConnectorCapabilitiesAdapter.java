
package org.mule.modules.deltaflight.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.deltaflight.DeltaFlightConnector;


/**
 * A <code>DeltaFlightConnectorCapabilitiesAdapter</code> is a wrapper around {@link DeltaFlightConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-20T06:18:05-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class DeltaFlightConnectorCapabilitiesAdapter
    extends DeltaFlightConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
