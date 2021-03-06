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
package it.nextworks.nfvmano.timeo.catalogue.nsdmanagement.repositories;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import it.nextworks.nfvmano.timeo.catalogue.nsdmanagement.NsdManagementRestConsumer;



/**
 * Internal entity used to store the active subscriptions for
 * NSD management notifications
 * 
 * @author nextworks
 *
 */
@Entity
public class NsdManagementSubscription {

	@Id
    @GeneratedValue
    @JsonIgnore
    private Long id;
	
	@Embedded
	private NsdManagementRestConsumer consumer;
	
	//TODO: add filters
	
	public NsdManagementSubscription() {
		// JPA only
	}
	
	/**
	 * Constructor
	 * 
	 * @param consumer consumer that will manage the NSD management notifications
	 */
	public NsdManagementSubscription(NsdManagementRestConsumer consumer) {
		this.consumer = consumer;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the consumer
	 */
	public NsdManagementRestConsumer getConsumer() {
		return consumer;
	}
	
	

}
