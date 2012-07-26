/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.chain2.config;

import org.apache.commons.chain2.Catalog;
import org.apache.commons.chain2.ChainConfigurationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.URL;

/**
 * <p>Facade class to abstract the functionality of parsing an arbitrary
 * configuration file that defines and configures commands and command chains
 * to be registered in a {@link Catalog}. It is legal to call the
 * <code>parse()</code> method more than once, in order
 * to parse more than one configuration document.</p>
 *
 * @version $Id$
 */
public class ConfigParser {
    private Log logger = LogFactory.getLog(getClass());

    /**
     * Constructor for loading a configuration parser with the default settings.
     */
    public ConfigParser() {
        logger.info("ConfigParser() instantiated");
    }

    /**
     * Constructor for loading a configuration parser with a specified rule
     * set class.
     * @param ruleSet class name as string of the rule set
     * @param loader class loader to use to create instance of rule set class
     */
    public ConfigParser(String ruleSet, ClassLoader loader) {
        logger.info("ConfigParser(ruleSet, loader) instantiated");
    }

    // --------------------------------------------------------- Public Methods

    /**
     * <p>Parse the configuration at the specified URL using the configured
     * rule set, registering catalogs with nested chains and
     * commands as they are encountered.  Use this method <strong>only</strong>
     * if you have included one or more <code>factory</code> elements in your
     * configuration resource.</p>
     *
     * @param url <code>URL</code> of the configuration document to be parsed
     * @exception ChainConfigurationException if a parsing error occurs
     */
    public void parse(URL url) throws ChainConfigurationException {
        logger.info("Parsing configuration - doing nothing");
    }
}
