/* Copyright 2004-2005 Graeme Rocher
 *
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
 */
package org.codehaus.groovy.grails.webflow.engine.builder;

/**
 * Thrown when an error occurs duing Flow definition
 *
 * @author Graeme Rocher
 * @since 0.6
 */
public class FlowDefinitionException extends RuntimeException {
    private static final long serialVersionUID = 2424103440934183216L;

    public FlowDefinitionException(String message) {
        super(message);
    }
}
