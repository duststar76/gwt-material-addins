/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.incubator.client.chart.amcharts.events.gauge;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import gwt.material.design.incubator.client.chart.amcharts.events.object.GaugeAxisData;
//@formatter:off

/**
 * Event which is fired when user rolls-out gauge band.
 *
 * @author kevzlou7979
 */
public class RollOutBandEvent extends GwtEvent<RollOutBandEvent.RollOutBandHandler> {

    public static final Type<RollOutBandHandler> TYPE = new Type<>();
    private GaugeAxisData data;

    public RollOutBandEvent(GaugeAxisData data) {
        this.data = data;
    }

    public static Type<RollOutBandHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, GaugeAxisData data) {
        source.fireEvent(new RollOutBandEvent(data));
    }

    @Override
    public Type<RollOutBandHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(RollOutBandHandler handler) {
        handler.onClickLabel(this);
    }

    public GaugeAxisData getData() {
        return data;
    }

    public interface RollOutBandHandler extends EventHandler {
        void onClickLabel(RollOutBandEvent event);
    }
}