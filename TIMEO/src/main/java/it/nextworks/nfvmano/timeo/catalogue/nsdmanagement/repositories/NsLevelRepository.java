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

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.nextworks.nfvmano.libs.descriptors.nsd.NsLevel;




public interface NsLevelRepository extends JpaRepository<NsLevel, Long> {
	Optional<NsLevel> findByNsLevelIdAndNsDfNsDfIdAndNsDfNsdNsdIdentifierAndNsDfNsdVersion(String nsLevelId, String nsDfId, String nsdId, String nsdVersion);
	Optional<NsLevel> findByNsLevelIdAndNsScaleNsScalingAspectIdAndNsScaleNsDfNsDfIdAndNsScaleNsDfNsdNsdIdentifierAndNsScaleNsDfNsdVersion(String nsLevelId, String scalingAspectId, String nsDfId, String nsdId, String nsdVersion);
}
