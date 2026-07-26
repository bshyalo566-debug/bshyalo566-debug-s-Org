package com.engineeromar.aiagent.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.engineeromar.aiagent.data.local.entity.ProjectEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ProjectDao {
    @Query("SELECT * FROM projects")
    fun getAllProjects(): Flow<List<ProjectEntity>>

    @Insert
    suspend fun insertProject(project: ProjectEntity)
}
