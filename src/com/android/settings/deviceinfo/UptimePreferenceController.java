/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.settings.deviceinfo;

import android.content.Context;

import com.android.settings.core.PreferenceControllerMixin;
import com.android.settings.fuelgauge.PowerUsageSummary;
import com.android.settingslib.core.lifecycle.Lifecycle;
import com.android.settingslib.deviceinfo.AbstractUptimePreferenceController;

/**
 * Concrete subclass of uptime preference controller
 *
 * Deprecated in About Phone V2
 * Information in this preference is available in {@link PowerUsageSummary}
 */
@Deprecated
public class UptimePreferenceController extends AbstractUptimePreferenceController
        implements PreferenceControllerMixin {
    public UptimePreferenceController(Context context, Lifecycle lifecycle) {
        super(context, lifecycle);
    }

    // This space intentionally left blank
}
