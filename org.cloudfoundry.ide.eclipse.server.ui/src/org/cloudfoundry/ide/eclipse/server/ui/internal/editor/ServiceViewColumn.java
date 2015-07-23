/*******************************************************************************
 * Copyright (c) 2012, 2014 Pivotal Software, Inc. 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, 
 * Version 2.0 (the "License�); you may not use this file except in compliance 
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  
 *  Contributors:
 *     Pivotal Software, Inc. - initial API and implementation
 ********************************************************************************/
package org.cloudfoundry.ide.eclipse.server.ui.internal.editor;

import org.cloudfoundry.ide.eclipse.server.ui.internal.Messages;

public enum ServiceViewColumn {
	Name(150, Messages.COMMONTXT_NAME)
	, Version(100, Messages.COMMONTXT_VERSION)
	, Vendor(100, Messages.COMMONTXT_VENDOR)
	, Tunnel(80, Messages.COMMONTXT_TUNNEL)
	, Plan(50, Messages.CloudFoundryServicePlanWizardPage_LABEL_PLAN)
	, Provider(100, Messages.COMMONTXT_PROVIDER);
	
	private int width;
	private String text;

	private ServiceViewColumn(int width, String text) {
		this.width = width;
		this.text = text;
	}

	public int getWidth() {
		return width;
	}
	public String getText(){
		return text;
	}

	public static ServiceViewColumnDescriptor getServiceViewColumnDescriptor() {
		return new ServiceViewColumnDescriptor();
	}

	public static class ServiceViewColumnDescriptor {

		public ServiceViewColumnDescriptor() {
		}

		public ServiceViewColumn[] getServiceViewColumn() {
			return new ServiceViewColumn[] { Name, Vendor, Provider, Version, Plan };
		}

	}

}
