
package org.mule.modules.deltaflight.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.deltaflight.DeltaFlightConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>DeltaFlightConnectorProcessAdapter</code> is a wrapper around {@link DeltaFlightConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-20T06:18:05-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class DeltaFlightConnectorProcessAdapter
    extends DeltaFlightConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<DeltaFlightConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, DeltaFlightConnectorCapabilitiesAdapter> getProcessTemplate() {
        final DeltaFlightConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,DeltaFlightConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, DeltaFlightConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, DeltaFlightConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
