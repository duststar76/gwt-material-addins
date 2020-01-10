/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2020 GwtMaterialDesign
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
package gwt.material.design.incubator.client.dark;

import gwt.material.design.addins.client.dark.AddinsWidgetDarkTheme;
import gwt.material.design.client.theme.dark.DarkThemeLoader;
import gwt.material.design.client.theme.dark.DarkThemeManager;

public class IncubatorDarkThemeReloader {

    static IncubatorDarkThemeReloader instance;

    public void reload(Class<? extends DarkThemeLoader> widgetLoader) {
        DarkThemeLoader incubatorLoader = DarkThemeManager.get().getLoader(IncubatorDarkThemeLoader.class);
        if (incubatorLoader != null) {
            DarkThemeLoader child = incubatorLoader.getChild(widgetLoader);
            if (child != null && child instanceof AddinsWidgetDarkTheme) {
                ((AddinsWidgetDarkTheme) child).suppressReload();
            }
        }
    }

    public static IncubatorDarkThemeReloader get() {
        if (instance == null) {
            instance = new IncubatorDarkThemeReloader();
        }
        return instance;
    }
}