package com.engineeromar.aiagent.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.engineeromar.aiagent.data.local.dao.ProjectDao
import com.engineeromar.aiagent.data.local.entity.ProjectEntity

@Database(entities = [ProjectEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun projectDao(): ProjectDao
}
