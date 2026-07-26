package com.engineeromar.aiagent.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Dashboard : Screen("dashboard", "Dashboard", Icons.Default.Dashboard)
    object Projects : Screen("projects", "Projects", Icons.Default.Folder)
    object AiAgent : Screen("ai_agent", "AI Agent", Icons.Default.SmartToy)
    object Knowledge : Screen("knowledge", "Knowledge Base", Icons.Default.MenuBook)
    object CodeEditor : Screen("code_editor", "Code Editor", Icons.Default.Code)
    object Git : Screen("git", "Git / GitHub", Icons.Default.AccountTree)
    object Settings : Screen("settings", "Settings", Icons.Default.Settings)
}

val drawerScreens = listOf(
    Screen.Dashboard,
    Screen.Projects,
    Screen.AiAgent,
    Screen.Knowledge,
    Screen.CodeEditor,
    Screen.Git,
    Screen.Settings
)
