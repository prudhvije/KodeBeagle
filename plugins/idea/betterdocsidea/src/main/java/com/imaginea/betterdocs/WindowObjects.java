/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.imaginea.betterdocs;

import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import javax.swing.JTree;

public final class WindowObjects {
    private static WindowObjects windowObjects = new WindowObjects();

    private Project project;
    private JTree jTree;
    private Editor windowEditor;
    private int distance;
    private int size;
    private String esURL;

    private WindowObjects() {

    }

    public void setProject(final Project pproject) {
        this.project = pproject;
    }

    public Project getProject() {
        return project;
    }

    public void setTree(final JTree pjTree) {
        this.jTree = pjTree;
    }

    public JTree getjTree() {
        return jTree;
    }

    public void setWindowEditor(final Editor pwindowEditor) {
        this.windowEditor = pwindowEditor;
    }

    public Editor getWindowEditor() {
        return windowEditor;
    }

    public void setDistance(final int pdistance) {
        this.distance = pdistance;
    }

    public int getDistance() {
        return distance;
    }

    public void setSize(final int psize) {
        this.size = psize;
    }

    public int getSize() {
        return size;
    }

    public void setEsURL(final String pesURL) {
        this.esURL = pesURL;
    }

    public String getEsURL() {
        return esURL;
    }

    public static WindowObjects getInstance() {
        return windowObjects;
    }

}
