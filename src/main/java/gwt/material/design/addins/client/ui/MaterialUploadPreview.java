package gwt.material.design.addins.client.ui;

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


import com.google.gwt.dom.client.Document;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.MaterialCollection;

/**
 * Created by Mark Kevin on 3/26/2016.
 */
public class MaterialUploadPreview extends MaterialWidget {

    private MaterialCollection collection = new MaterialCollection();

    public MaterialUploadPreview() {
        super(Document.get().createDivElement());
        setStyleName("preview-container");
        collection.setId("previews");
        add(new MaterialUploadHeader());
        add(new MaterialUploadCollection());
    }
}
