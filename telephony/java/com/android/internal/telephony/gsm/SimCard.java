/*
 * Copyright (C) 2006 The Android Open Source Project
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

package com.android.internal.telephony.gsm;

import android.util.Log;

import com.android.internal.telephony.IccCard;
import com.android.internal.telephony.Phone;
import com.android.internal.telephony.PhoneBase;
import com.android.internal.telephony.TelephonyProperties;
import android.os.SystemProperties;

/**
 * {@hide}
 */
public final class SimCard extends IccCard {

    public SimCard(PhoneBase phone, String logTag, Boolean dbg) {
        super(phone, logTag, dbg);
        updateStateProperty();
    }

    @Override
    public String getServiceProviderName () {
        return mPhone.mIccRecords.getServiceProviderName();
    }

}
