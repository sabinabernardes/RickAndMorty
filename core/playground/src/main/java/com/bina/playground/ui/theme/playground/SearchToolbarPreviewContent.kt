package com.bina.playground.ui.theme.playground

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bina.designsystem.components.CardCharacter
import com.bina.designsystem.components.SearchToolbar
import com.bina.designsystem.theme.RickAndMortyTheme
import com.bina.playground.R

@Composable
fun SearchToolbarPreviewContent(search: String, onSearchChange: (String) -> Unit) {
    SearchToolbar(
        title = "Rick and Morty",
        query = search,
        onQueryChange = onSearchChange
    )
}

@Composable
fun CardCharacterContent() {
    CardCharacter(
        name = "Rick Sanchez",
        status = "Alive",
        lastLocation = "Earth (Replacement Dimension)",
        onClick = {},
        painter = painterResource(
            id = R.drawable.ic_launcher_background
        )
    )
}

@Composable
fun ErrorDialogPreviewContent(showDialog: Boolean, onDismiss: () -> Unit) {
    if (showDialog) {
        AlertDialog(
            onDismissRequest = onDismiss,
            title = { Text("Erro") },
            text = { Text("Algo deu errado") },
            confirmButton = {
                Button(onClick = onDismiss) {
                    Text("OK")
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FullPreviewPlayground() {
    var search by remember { mutableStateOf("") }
    var showDialog by remember { mutableStateOf(true) }
    RickAndMortyTheme{
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            SearchToolbarPreviewContent(search) { search = it }
            CardCharacterContent()
            Button(onClick = { showDialog = true }) {
                Text("Mostrar Erro")
            }
        }
        ErrorDialogPreviewContent(showDialog = showDialog) {
            showDialog = false
        }
    }
}
