package com.aksoyhasan.unittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

    private lateinit var rComparer: ResourceComparer

    @Before
    fun setup() {
        rComparer = ResourceComparer()
    }

//    @After
//    fun teardown() {
//
//    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = rComparer.isEqual(context, R.string.app_name, "UnitTest")
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = rComparer.isEqual(context, R.string.app_name, "Hello")
        Truth.assertThat(result).isFalse()
    }
}