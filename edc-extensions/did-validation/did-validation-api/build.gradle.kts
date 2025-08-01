/********************************************************************************
 * Copyright (c) 2025 SAP SE
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ********************************************************************************/

plugins {
    `java-library`
    `maven-publish`
    id(libs.plugins.swagger.get().pluginId)
}

dependencies {
    implementation(project(":spi:core-spi"))
    api(libs.eclipse.tractusx.spi.bpn.validation)
    implementation(libs.eclipse.tractusx.spi.core)
    implementation(libs.edc.lib.validator)
    implementation(libs.jakarta.rsApi)
    implementation(libs.edc.spi.web)
    implementation(libs.edc.core.api)
    implementation(libs.swagger.annotations.jakarta)

    testImplementation(libs.edc.junit)
    testImplementation(libs.restAssured)
    testImplementation(testFixtures(libs.edc.core.jersey))
    testImplementation(libs.edc.core.runtime)

}
