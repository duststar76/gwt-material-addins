/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
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
package gwt.material.design.incubator.client.kanban;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * Client bundle for {@link Kanban}
 *
 * @author kevzlou7979@gmail.com
 */
public interface KanbanClientBundle extends ClientBundle {
    KanbanClientBundle INSTANCE = GWT.create(KanbanClientBundle.class);

    @Source("resources/js/jkanban.min.js")
    TextResource jkanbanJs();

    @Source("resources/css/jkanban.min.css")
    TextResource jskanbanCss();

    @Source("resources/js/long-press-event.min.js")
    TextResource longPressEventJs();
}
