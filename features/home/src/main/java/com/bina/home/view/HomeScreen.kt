package com.bina.home.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bina.designsystem.components.SearchToolbar

@Composable
fun HomeScreen(
) {
    Column {
        SearchToolbar(
            title = "Personagens",
            modifier = Modifier.fillMaxWidth(),
            query = "",
            onQueryChange = { /* Handle query change */ },
        )
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
