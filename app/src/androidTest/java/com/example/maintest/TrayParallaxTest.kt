package com.example.maintest

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.example.maintest.tests.TrayParallaxImageTest
import com.example.maintest.tests.TrayParallaxImageTest2
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TrayParallaxTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp(){
        composeTestRule.setContent {
            MaterialTheme {
                TrayParallaxImageTest2()

            }

        }
    }
    @Test
    fun testTrayParallaxImage2(){
        composeTestRule.onNodeWithTag("TrayParallaxImage").assertIsNotDisplayed()
    }




}

