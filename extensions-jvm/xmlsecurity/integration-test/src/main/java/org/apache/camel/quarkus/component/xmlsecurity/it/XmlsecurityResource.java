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
package org.apache.camel.quarkus.component.xmlsecurity.it;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.CamelContext;
import org.jboss.logging.Logger;

@Path("/xmlsecurity")
@ApplicationScoped
public class XmlsecurityResource {

    private static final Logger LOG = Logger.getLogger(XmlsecurityResource.class);

    private static final String COMPONENT_XMLSECURITY_SIGN = "xmlsecurity-sign";
    private static final String COMPONENT_XMLSECURITY_VERIFY = "xmlsecurity-verify";
    private static final String DATAFORMAT_SECUREXML = "secureXML";
    @Inject
    CamelContext context;

    @Path("/load/component/xmlsecurity-sign")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response loadComponentXmlsecuritySign() throws Exception {
        /* This is an autogenerated test */
        if (context.getComponent(COMPONENT_XMLSECURITY_SIGN) != null) {
            return Response.ok().build();
        }
        LOG.warnf("Could not load [%s] from the Camel context", COMPONENT_XMLSECURITY_SIGN);
        return Response.status(500, COMPONENT_XMLSECURITY_SIGN + " could not be loaded from the Camel context").build();
    }

    @Path("/load/component/xmlsecurity-verify")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response loadComponentXmlsecurityVerify() throws Exception {
        /* This is an autogenerated test */
        if (context.getComponent(COMPONENT_XMLSECURITY_VERIFY) != null) {
            return Response.ok().build();
        }
        LOG.warnf("Could not load [%s] from the Camel context", COMPONENT_XMLSECURITY_VERIFY);
        return Response.status(500, COMPONENT_XMLSECURITY_VERIFY + " could not be loaded from the Camel context").build();
    }

    @Path("/load/dataformat/securexml")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response loadDataformatSecureXML() throws Exception {
        /* This is an autogenerated test */
        if (context.resolveDataFormat(DATAFORMAT_SECUREXML) != null) {
            return Response.ok().build();
        }
        LOG.warnf("Could not load [%s] from the Camel context", DATAFORMAT_SECUREXML);
        return Response.status(500, DATAFORMAT_SECUREXML + " could not be loaded from the Camel context").build();
    }
}