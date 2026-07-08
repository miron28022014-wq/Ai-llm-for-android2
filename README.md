# Ai-llm-for-android2 - generated app module

This commit added a minimal Android app module that integrates existing layout resources into a buildable project.

How to build locally
1. Install Java 11 and Android SDK (Android Studio recommended).
2. From repo root:
   - gradle wrapper --gradle-version 8.4
   - ./gradlew :app:assembleDebug
3. APK will be in app/build/outputs/apk/debug/app-debug.apk

Notes
- The Activities included are placeholders to allow compilation. Replace with your actual logic if needed.
- If the build fails in CI, check the Actions logs and share errors here; I will help fix them.
