package com.miron.aiassistant

import android.app.Application
import android.util.Log
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter

/**
 * Temporary Application that logs uncaught exceptions to a file in external files dir.
 * Install this by setting android:name in AndroidManifest to the fully-qualified name.
 * Remove or adjust logging when not needed.
 */
class CrashLoggerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Thread.setDefaultUncaughtExceptionHandler { thread, throwable ->
            try {
                val sw = StringWriter()
                throwable.printStackTrace(PrintWriter(sw))
                val trace = sw.toString()
                Log.e("CrashLogger", "Uncaught:", throwable)
                val dir = getExternalFilesDir(null) ?: filesDir
                val out = File(dir, "last_crash.txt")
                out.writeText("Thread: ${'$'}{thread.name}\n\n" + trace)
            } catch (t: Throwable) {
                // ignore
            }
            // Re-throw to let system handle it (crash)
            android.os.Process.killProcess(android.os.Process.myPid())
            System.exit(10)
        }
    }
}
