/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package testing.test

import kotlin.script.experimental.api.ScriptCompilationConfiguration
import kotlin.script.experimental.api.ScriptEvaluationConfiguration
import kotlin.script.experimental.host.toScriptSource
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost

fun main() {
    println("Running a KTS file...")
    BasicJvmScriptingHost().eval("println(\"Hello from script!\")".toScriptSource(), ScriptCompilationConfiguration(), ScriptEvaluationConfiguration())
}