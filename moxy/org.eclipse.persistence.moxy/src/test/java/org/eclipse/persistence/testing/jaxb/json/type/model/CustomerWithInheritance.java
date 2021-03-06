/*
 * Copyright (c) 2015, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Martin Vojtek - 2.6.0 - initial implementation
package org.eclipse.persistence.testing.jaxb.json.type.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerWithInheritance extends PersonWithType {
    public boolean equals(Object obj){
        if(obj instanceof CustomerWithInheritance){
            return super.equals(obj);
        }else{
            return false;
        }
    }

}
