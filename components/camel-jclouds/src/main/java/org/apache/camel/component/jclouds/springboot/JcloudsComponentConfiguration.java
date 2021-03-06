/**
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
package org.apache.camel.component.jclouds.springboot;

import java.util.List;
import org.jclouds.blobstore.BlobStore;
import org.jclouds.compute.ComputeService;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * For interacting with cloud compute & blobstore service via jclouds.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.jclouds")
public class JcloudsComponentConfiguration {

    /**
     * To use the given BlobStore which must be configured when using blobstore.
     */
    private List<org.jclouds.blobstore.BlobStore> blobStores;
    /**
     * To use the given ComputeService which must be configured when use
     * compute.
     */
    private List<org.jclouds.compute.ComputeService> computeServices;

    public List<BlobStore> getBlobStores() {
        return blobStores;
    }

    public void setBlobStores(List<BlobStore> blobStores) {
        this.blobStores = blobStores;
    }

    public List<ComputeService> getComputeServices() {
        return computeServices;
    }

    public void setComputeServices(List<ComputeService> computeServices) {
        this.computeServices = computeServices;
    }
}