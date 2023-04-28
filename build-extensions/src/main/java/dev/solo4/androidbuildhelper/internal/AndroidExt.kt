package dev.solo4.androidbuildhelper.internal

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware

val Project.android: BaseAppModuleExtension get() =
    (this as ExtensionAware).extensions.getByName("android") as BaseAppModuleExtension