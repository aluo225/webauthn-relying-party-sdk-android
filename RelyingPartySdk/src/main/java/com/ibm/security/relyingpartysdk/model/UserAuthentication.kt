/*
 * Copyright contributors to the IBM Security Verify Relying Party SDK for Android project
 */

package com.ibm.security.relyingpartysdk.model

import kotlinx.serialization.Serializable

@Suppress("unused")
@Serializable
data class UserAuthentication(val username: String, val password: String)