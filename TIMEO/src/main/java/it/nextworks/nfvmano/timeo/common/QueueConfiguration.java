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
package it.nextworks.nfvmano.timeo.common;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfiguration {

	@Bean(name=NfvoConstants.engineQueueExchange)
	TopicExchange exchange() {
		return new TopicExchange(NfvoConstants.engineQueueExchange, true, false);
	}
	
	@Bean(name=NfvoConstants.computationQueueExchange)
	TopicExchange computationExchange() {
		return new TopicExchange(NfvoConstants.computationQueueExchange, true, false);
	}
	
	@Bean(name=NfvoConstants.allocationQueueExchange)
	TopicExchange allocationExchange() {
		return new TopicExchange(NfvoConstants.allocationQueueExchange, true, false);
	}
	
	@Bean(name=NfvoConstants.vnfmQueueExchange)
	TopicExchange vnfmExchange() {
		return new TopicExchange(NfvoConstants.vnfmQueueExchange, true, false);
	}

}
