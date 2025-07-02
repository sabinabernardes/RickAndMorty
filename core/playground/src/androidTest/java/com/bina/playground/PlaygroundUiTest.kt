package com.bina.playground

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PlaygroundUiTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<DesignSystemPlaygroundActivity>()

    @Test
    fun dialogPreview_showsAndDismissesDialog() {
        composeTestRule.onNodeWithText("Dialog").performClick()
        composeTestRule.onNodeWithText("Algo deu errado ao buscar os dados.").assertIsDisplayed()
        composeTestRule.onNodeWithText("OK").performClick()
        composeTestRule.onNodeWithText("Algo deu errado ao buscar os dados.").assertDoesNotExist()
    }

    @Test
    fun cardCharacter_showsCharacterInfo() {
        composeTestRule.onNodeWithText("Character Card").performClick()
        composeTestRule.onNodeWithText("Rick Sanchez").assertIsDisplayed()
        composeTestRule.onNodeWithText("Earth (Replacement Dimension)").assertIsDisplayed()
    }
}
