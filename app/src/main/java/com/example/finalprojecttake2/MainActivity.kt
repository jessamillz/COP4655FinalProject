package com.example.finalprojecttake2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.finalprojecttake2.ui.theme.FinalProjectTake2Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinalProjectTake2Theme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FinalProjectApp()
                }

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FinalProjectApp() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("Distrackt App")
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Outlined.Menu,
                            contentDescription = "Hamburger Menu")
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            Icons.Outlined.AccountCircle,
                            contentDescription = "Account Circle"
                        )
                    }
                },
            )
        },
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Outlined.Home,
                            contentDescription = "Home"
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Outlined.AddCircle,
                            contentDescription = "Add Session"
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Outlined.Build,
                            contentDescription = "Reports"
                        )
                    }
                }
            )
        }
        ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(8.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                text =
                """
                    Welcome to the Distrackt App!
                    
                """.trimIndent(),
            )
            Row(Modifier.weight(1f)) {
                ComposableInfoCard(
                    title = "Total Sessions:",
                    backgroundColor = MaterialTheme.colorScheme.background,
                    modifier = Modifier.weight(1f)
                )
                ComposableInfoCard(
                    title = "3",
                    backgroundColor = MaterialTheme.colorScheme.background,
                    modifier = Modifier.weight(1f)
                )
            }
            Row(Modifier.weight(1f), ) {
                ComposableInfoCard(
                    title = "Distraction Free Sessions:",
                    backgroundColor = MaterialTheme.colorScheme.background,
                    modifier = Modifier.weight(1f)
                )
                ComposableInfoCard(
                    title = "1",
                    backgroundColor = MaterialTheme.colorScheme.background,
                    modifier = Modifier.weight(1f),
                )
            }
            Row(Modifier.weight(1f)) {
                Text(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text =
                    """
                    Click below to start a new session or view reports!
                    
                """.trimIndent(),
                )
            }
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FinalProjectPreview() {
    FinalProjectTake2Theme {
        FinalProjectApp()
    }
}