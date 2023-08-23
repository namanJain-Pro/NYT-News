package com.example.nytnews.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BookScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        SelectBookCategory(modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun SelectBookCategory(modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    Column(modifier = modifier) {
        Text(
            text = "Category",
            style = MaterialTheme.typography.titleLarge
        )
        Column(
            modifier = Modifier
                .padding(0.dp, 8.dp)
                .border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(
                    text = "HardCovered Book",
                    style = MaterialTheme.typography.labelLarge
                )
                Icon(Icons.Filled.ArrowDropDown, contentDescription = null)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BookScreenPreview() {
    BookScreen(modifier = Modifier.fillMaxSize())
}