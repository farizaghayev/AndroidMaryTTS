/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mf.org.apache.html.dom;

import mf.org.w3c.dom.html.HTMLAnchorElement;

/**
 * @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a>
 * @version $Revision: 1029415 $ $Date: 2010-10-31 13:02:22 -0400 (Sun, 31 Oct 2010) $
 * @xerces.internal
 * @see mf.org.w3c.dom.html.HTMLAnchorElement
 * @see mf.org.apache.xerces.dom.ElementImpl
 */
public class HTMLAnchorElementImpl
        extends HTMLElementImpl
        implements HTMLAnchorElement {
    private static final long serialVersionUID = -140558580924061847L;

    /**
     * Constructor requires owner document.
     *
     * @param owner The owner HTML document
     */
    public HTMLAnchorElementImpl(HTMLDocumentImpl owner, String name) {
        super(owner, name);
    }

    @Override
    public String getAccessKey() {
        String accessKey;

        // Make sure that the access key is a single character.
        accessKey = getAttribute("accesskey");
        if (accessKey != null && accessKey.length() > 1)
            accessKey = accessKey.substring(0, 1);
        return accessKey;
    }

    @Override
    public void setAccessKey(String accessKey) {
        // Make sure that the access key is a single character.
        if (accessKey != null && accessKey.length() > 1)
            accessKey = accessKey.substring(0, 1);
        setAttribute("accesskey", accessKey);
    }

    @Override
    public String getCharset() {
        return getAttribute("charset");
    }

    @Override
    public void setCharset(String charset) {
        setAttribute("charset", charset);
    }

    @Override
    public String getCoords() {
        return getAttribute("coords");
    }

    @Override
    public void setCoords(String coords) {
        setAttribute("coords", coords);
    }

    @Override
    public String getHref() {
        return getAttribute("href");
    }

    @Override
    public void setHref(String href) {
        setAttribute("href", href);
    }

    @Override
    public String getHreflang() {
        return getAttribute("hreflang");
    }

    @Override
    public void setHreflang(String hreflang) {
        setAttribute("hreflang", hreflang);
    }

    @Override
    public String getName() {
        return getAttribute("name");
    }

    @Override
    public void setName(String name) {
        setAttribute("name", name);
    }

    @Override
    public String getRel() {
        return getAttribute("rel");
    }

    @Override
    public void setRel(String rel) {
        setAttribute("rel", rel);
    }

    @Override
    public String getRev() {
        return getAttribute("rev");
    }

    @Override
    public void setRev(String rev) {
        setAttribute("rev", rev);
    }

    @Override
    public String getShape() {
        return capitalize(getAttribute("shape"));
    }

    @Override
    public void setShape(String shape) {
        setAttribute("shape", shape);
    }

    @Override
    public int getTabIndex() {
        return this.getInteger(getAttribute("tabindex"));
    }

    @Override
    public void setTabIndex(int tabIndex) {
        setAttribute("tabindex", String.valueOf(tabIndex));
    }

    @Override
    public String getTarget() {
        return getAttribute("target");
    }

    @Override
    public void setTarget(String target) {
        setAttribute("target", target);
    }

    @Override
    public String getType() {
        return getAttribute("type");
    }

    @Override
    public void setType(String type) {
        setAttribute("type", type);
    }

    @Override
    public void blur() {
        // No scripting in server-side DOM. This method is moot.
    }

    @Override
    public void focus() {
        // No scripting in server-side DOM. This method is moot.
    }


}

