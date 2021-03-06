/*
* Copyright 2018 Nextworks s.r.l.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package it.nextworks.nfvmano.timeo.ro.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import it.nextworks.nfvmano.libs.common.enums.OperationStatus;

public class SdnControllerOperationAckMessage extends AllocationMessage {

	@JsonProperty("operationId")
	private String operationId;
	
	@JsonProperty("operationStatus")
	private OperationStatus operationStatus;
	
	public SdnControllerOperationAckMessage() {	}
	
	@JsonCreator
	public SdnControllerOperationAckMessage(@JsonProperty("operationId") String operationId,
			@JsonProperty("operationStatus") OperationStatus operationStatus) {	
		this.type = AllocationMessageType.SDN_CONTROLLER_ACK;
		this.operationId = operationId;
		this.operationStatus = operationStatus;
	}

	/**
	 * @return the operationId
	 */
	public String getOperationId() {
		return operationId;
	}

	/**
	 * @return the operationStatus
	 */
	public OperationStatus getOperationStatus() {
		return operationStatus;
	}
	
	

}
