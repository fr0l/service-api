/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.epam.ta.reportportal.core.events.activity;

import com.epam.ta.reportportal.commons.ReportPortalUser;
import com.epam.ta.reportportal.core.events.ActivityEvent;
import com.epam.ta.reportportal.entity.activity.Activity;
import com.epam.ta.reportportal.ws.converter.builders.ActivityBuilder;
import com.epam.ta.reportportal.ws.model.activity.LaunchActivityResource;

import static com.epam.ta.reportportal.entity.activity.Activity.ActivityEntityType.LAUNCH;
import static com.epam.ta.reportportal.entity.activity.ActivityAction.FINISH_LAUNCH;

/**
 * Lifecycle events.
 *
 * @author Andrei Varabyeu
 */
public class LaunchFinishedEvent extends AbstractEvent implements ActivityEvent {

	private LaunchActivityResource launchActivityResource;

	private ReportPortalUser user;

	private String baseUrl;

	public LaunchFinishedEvent() {
	}

	public LaunchFinishedEvent(LaunchActivityResource launchActivityResource, Long userId, String userLogin) {
		super(userId, userLogin);
		this.launchActivityResource = launchActivityResource;
	}

	public LaunchFinishedEvent(LaunchActivityResource launchActivityResource, ReportPortalUser user, String baseUrl) {
		super(user.getUserId(), user.getUsername());
		this.launchActivityResource = launchActivityResource;
		this.user = user;
		this.baseUrl = baseUrl;
	}

	public LaunchFinishedEvent(LaunchActivityResource launchActivityResource, String baseUrl, Long userId, String userLogin) {
		super(userId, userLogin);
		this.launchActivityResource = launchActivityResource;
		this.baseUrl = baseUrl;
	}

	public LaunchActivityResource getLaunchActivityResource() {
		return launchActivityResource;
	}

	public void setLaunchActivityResource(LaunchActivityResource launchActivityResource) {
		this.launchActivityResource = launchActivityResource;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public ReportPortalUser getUser() {
		return user;
	}

	public void setUser(ReportPortalUser user) {
		this.user = user;
	}

	@Override
	public Activity toActivity() {
		return new ActivityBuilder().addCreatedNow()
				.addAction(FINISH_LAUNCH)
				.addActivityEntityType(LAUNCH)
				.addUserId(getUserId())
				.addUserName(getUserLogin())
				.addObjectId(launchActivityResource.getId())
				.addObjectName(launchActivityResource.getName())
				.addProjectId(launchActivityResource.getProjectId())
				.get();
	}
}
