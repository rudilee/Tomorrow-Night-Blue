package com.github.rudilee.tomorrownightblue.services

import com.intellij.openapi.project.Project
import com.github.rudilee.tomorrownightblue.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
