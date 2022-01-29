package com.code708.ideapluginbase.services

import com.intellij.openapi.project.Project
import com.code708.ideapluginbase.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
