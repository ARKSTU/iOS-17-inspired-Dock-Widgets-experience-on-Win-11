# Build Instructions

## Prerequisites

1. **Android Studio** Hedgehog (2023.1.1) or later
2. **JDK 17** or later
3. **Android SDK** with the following components:
   - SDK Platform: API 31 (Android 12) or higher  
   - SDK Platform: API 34 (Android 14) - Recommended
   - Build Tools: 34.0.0 or higher
4. **Gradle 8.2** (included via wrapper)

## Initial Setup

### 1. Clone the Repository
```bash
git clone https://github.com/ARKSTU/iOS-17-inspired-Dock-Widgets-experience-on-Win-11.git
cd iOS-17-inspired-Dock-Widgets-experience-on-Win-11
```

### 2. Set Android SDK Path
Create or update `local.properties` in the project root:
```properties
sdk.dir=/path/to/your/Android/Sdk
```

On Linux/Mac:
```bash
echo "sdk.dir=$ANDROID_HOME" > local.properties
```

On Windows:
```properties
sdk.dir=C\:\\Users\\YourUsername\\AppData\\Local\\Android\\Sdk
```

## Building the Project

### From Android Studio

1. Open Android Studio
2. Select **File > Open** and choose the project directory
3. Wait for Gradle sync to complete
4. Select **Build > Make Project** or press `Ctrl+F9` (Windows/Linux) or `Cmd+F9` (Mac)

### From Command Line

#### Build All Modules
```bash
./gradlew build
```

#### Build Debug APK
```bash
./gradlew assembleDebug
```

The APK will be located at:
```
app/build/outputs/apk/debug/app-debug.apk
```

#### Build Release APK (Unsigned)
```bash
./gradlew assembleRelease
```

The APK will be located at:
```
app/build/outputs/apk/release/app-release-unsigned.apk
```

## Running Tests

### Unit Tests
```bash
./gradlew test
```

### Instrumented Tests (Requires Connected Device/Emulator)
```bash
./gradlew connectedAndroidTest
```

### Run Specific Module Tests
```bash
./gradlew :feature-home:test
./gradlew :core-ui:test
```

## Code Quality

### Lint Checks
```bash
./gradlew lint
```

Lint reports will be generated at:
```
app/build/reports/lint-results.html
```

### Static Analysis (Detekt) - Coming Soon
```bash
./gradlew detekt
```

## Installing on Device

### Via Android Studio
1. Connect your Android device or start an emulator
2. Select **Run > Run 'app'** or press `Shift+F10` (Windows/Linux) or `Ctrl+R` (Mac)

### Via Command Line
```bash
# Install debug build
./gradlew installDebug

# Install release build
./gradlew installRelease
```

## Setting as Default Launcher

After installation:
1. Press the **Home** button on your device
2. Select **iOS 17 Launcher**
3. Choose **Always** to set it as the default launcher

## Troubleshooting

### Gradle Sync Fails
- Ensure you have an active internet connection for initial dependency download
- Check that `local.properties` points to a valid Android SDK
- Try **File > Invalidate Caches / Restart** in Android Studio

### Build Fails with "SDK Not Found"
- Verify `local.properties` exists and has the correct `sdk.dir` path
- Ensure Android SDK is installed and updated

### Module Not Found Errors
- Run `./gradlew clean` to clean build artifacts
- Re-sync Gradle in Android Studio

### OutOfMemoryError
- Increase Gradle memory in `gradle.properties`:
  ```properties
  org.gradle.jvmargs=-Xmx4096m -Dfile.encoding=UTF-8
  ```

## Clean Build

To perform a clean build:
```bash
./gradlew clean build
```

## Build Variants

The project supports the following build variants:
- **debug**: Development build with debugging enabled
- **release**: Production build with minification and optimizations

## Module Structure

The project consists of the following modules:
- `app`: Main launcher application
- `core-ui`: Shared UI components and theme
- `core-data`: Data layer (Room, DataStore)
- `feature-home`: Home screen implementation
- `feature-dock`: Dock with blur effects
- `feature-applibrary`: App Library
- `feature-spotlight`: Spotlight search
- `feature-widgets`: Widget system
- `feature-controlcenter`: Control Center
- `feature-notifications`: Notification Center
- `feature-settings`: Settings

Each module can be built independently:
```bash
./gradlew :module-name:build
```

## Continuous Integration

The project includes GitHub Actions workflows for:
- **android-build.yml**: Automated builds and tests on push/PR
- **android-release.yml**: Release builds and Play Store deployment on tags

## Release Signing

For release builds, configure signing in `app/build.gradle.kts`:

```kotlin
android {
    signingConfigs {
        create("release") {
            storeFile = file("path/to/keystore.jks")
            storePassword = System.getenv("SIGNING_STORE_PASSWORD")
            keyAlias = System.getenv("SIGNING_KEY_ALIAS")
            keyPassword = System.getenv("SIGNING_KEY_PASSWORD")
        }
    }
    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("release")
        }
    }
}
```

## Need Help?

- Check [CONTRIBUTING.md](CONTRIBUTING.md) for development guidelines
- Open an issue on GitHub for build problems
- Review [docs/ARCHITECTURE.md](docs/ARCHITECTURE.md) for technical details
