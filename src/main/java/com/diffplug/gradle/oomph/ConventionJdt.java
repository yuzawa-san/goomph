/*
 * Copyright 2016 DiffPlug
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
package com.diffplug.gradle.oomph;

import org.gradle.api.Action;

public class ConventionJdt extends OomphConvention {
	ConventionJdt(OomphIdeExtension extension) {
		super(extension);
		requireIUs(IUs.IDE, IUs.JDT, IUs.ERROR_LOG);
		setPerspectiveOver(Perspectives.JAVA, Perspectives.RESOURCES);
	}

	/** Adds an installed JRE with the given content. */
	void installedJre(Action<InstalledJre> action) {
		InstalledJre instance = new InstalledJre();
		action.execute(instance);
		extension.installedJres.add(instance);
	}
}
