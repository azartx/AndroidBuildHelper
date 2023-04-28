package dev.solo4.androidbuildhelper

import org.gradle.api.Plugin
import org.gradle.api.Project
import com.android.build.gradle.BaseExtension
import dev.solo4.androidbuildhelper.internal.android
import dev.solo4.androidbuildhelper.internal.configureOutputFileName

class BuildHelper : Plugin<Project> {
    var outputFileName: String? = null

    override fun apply(target: Project) {
        target.extensions.getByType(BaseExtension::class.java).run {
            target.android.configureOutputFileName(outputFileName)
        }
    }
}
