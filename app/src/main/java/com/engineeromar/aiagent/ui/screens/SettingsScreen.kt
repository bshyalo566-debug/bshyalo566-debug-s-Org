package com.engineeromar.aiagent.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    var isDarkMode by remember { mutableStateOf(true) }
    var isArabic by remember { mutableStateOf(false) }

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        item {
            Text("General Settings", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.primary, modifier = Modifier.padding(bottom = 16.dp))
        }
        item {
            SettingSwitch("Dark Mode (Luxury Black)", isDarkMode) { isDarkMode = it }
            SettingSwitch("Language: Arabic", isArabic) { isArabic = it }
        }
        item {
            Spacer(modifier = Modifier.height(24.dp))
            Text("AI Configuration", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.primary, modifier = Modifier.padding(bottom = 16.dp))
            SettingSwitch("Use Local AI Provider", true) {}
            SettingSwitch("Enable Voice Activation", false) {}
        }
        item {
            Spacer(modifier = Modifier.height(24.dp))
            Text("Security", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.primary, modifier = Modifier.padding(bottom = 16.dp))
            SettingSwitch("Biometric Authentication", true) {}
            SettingSwitch("Encrypted Backups", true) {}
        }
    }
}

@Composable
fun SettingSwitch(label: String, checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = label, color = MaterialTheme.colorScheme.onSurface)
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = SwitchDefaults.colors(checkedThumbColor = MaterialTheme.colorScheme.primary)
        )
    }
}
