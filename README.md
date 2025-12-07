# iOS 17 Inspired Launcher – Ray Studio Edition

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](LICENSE.txt)
[![Android](https://img.shields.io/badge/Android-12%2B-green.svg)](https://developer.android.com)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9+-purple.svg)](https://kotlinlang.org)

An advanced Android launcher that brings the complete iOS 17 experience to Android, featuring pixel-perfect design, fluid animations, and feature parity with iOS. Built with modern Android architecture using Jetpack Compose, Kotlin Coroutines, and Hilt.

## ✨ Features

### 🏠 Home Screen & Dock
- **iOS-style Icon Grid** with authentic spacing and sizing
- **Edit Mode** with wiggling animations and reorganization
- **Folders** with blur effects and smooth transitions
- **App Badges** for notifications
- **Dock** with blur/transparency effects and up to 4 apps
- **Exact Icon Styles** matching iOS 17 aesthetics

### 📚 App Library
- **Categorized View** with automatic app organization
- **Alphabetical Listing** for quick browsing
- **Smart Search** with instant results
- **Suggested Apps** based on usage patterns

### 🔍 Spotlight Search
- **System-wide Search** across apps, contacts, and web
- **Quick Actions** for common tasks
- **Pluggable Architecture** for third-party integrations

### 🎨 Widgets
- **iOS 17 Widget Styles** with pixel-perfect design
- **Resizable Widgets** in multiple sizes
- **Smart Stacks** with automatic rotation
- **Widget Gallery** for easy discovery

### 🎛️ Control Center
- **Quick Toggles** for WiFi, Bluetooth, flashlight, and more
- **Media Controls** with album art and playback
- **Brightness & Volume** sliders with haptic feedback
- **Swipe-in Gesture** from top-right corner
- **Blur Effects** matching iOS design

### 🔔 Notification Center
- **Grouped Notifications** by app
- **Clear All** functionality
- **Per-app Controls** for notification management
- **Swipe Actions** for quick dismiss

### 🔒 Lock Screen Mimic
- **Themed Overlay** with iOS-style design
- **Glance Notifications** with quick preview
- **Music Player** with controls

### 🎭 Gestures & Animations
- **Swipe Up** for recent apps
- **Long Press** for edit mode
- **Smooth Parallax** wallpaper effects
- **Bouncy Animations** matching iOS dynamics
- **120Hz Support** for ultra-smooth experience

### ♿ Accessibility
- **TalkBack** compatibility
- **High Contrast** mode
- **Font Scaling** support
- **Screen Reader** optimizations

### ⚡ Performance
- **Smooth 120Hz** animations
- **Battery-friendly** background processing
- **Low Latency** touch response
- **Optimized Memory** usage

## 🏗️ Architecture

The launcher follows a modular architecture with clean separation of concerns:

```
ios17launcher/
├── app/                          # Main launcher app
├── core-ui/                      # Design system & shared UI
├── core-data/                    # Data layer (Room, DataStore)
├── feature-home/                 # Home screen implementation
├── feature-dock/                 # Dock with blur effects
├── feature-applibrary/           # App Library
├── feature-spotlight/            # Spotlight search
├── feature-widgets/              # Widget system
├── feature-controlcenter/        # Control Center
├── feature-notifications/        # Notification Center
└── feature-settings/             # Settings
```

### Tech Stack
- **Language:** Kotlin 1.9+
- **UI:** Jetpack Compose
- **DI:** Hilt
- **Async:** Coroutines + Flow
- **Database:** Room
- **Preferences:** DataStore
- **Background Work:** WorkManager
- **Testing:** JUnit, Mockito, Compose UI Tests

## 🚀 Getting Started

### Prerequisites
- Android Studio Hedgehog (2023.1.1) or later
- JDK 17 or later
- Android SDK with API 31+
- Gradle 8.2+

### Building
```bash
# Clone the repository
git clone https://github.com/ARKSTU/iOS-17-inspired-Dock-Widgets-experience-on-Win-11.git
cd iOS-17-inspired-Dock-Widgets-experience-on-Win-11

# Build the project
./gradlew build

# Install on device
./gradlew installDebug
```

### Setting as Default Launcher
1. Build and install the app
2. Press the Home button
3. Select "iOS 17 Launcher – Ray Studio Edition"
4. Tap "Always" to set as default

## 🧪 Testing
```bash
# Run unit tests
./gradlew test

# Run instrumented tests
./gradlew connectedAndroidTest

# Run lint checks
./gradlew lint
```

## 📱 Minimum Requirements
- **Android Version:** 12 (API 31) or higher
- **RAM:** 2GB minimum, 4GB recommended
- **Storage:** 100MB for app + space for caching

## 🤝 Contributing
We welcome contributions! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

## 📄 License
This project is licensed under the Apache License 2.0 - see the [LICENSE.txt](LICENSE.txt) file for details.

## 🔒 Privacy
Your privacy is important. See our [PRIVACY_POLICY.md](PRIVACY_POLICY.md) for details on data collection and usage.

## 🙏 Acknowledgments
- Inspired by iOS 17 design language
- Built with modern Android best practices
- Community feedback and contributions

## 📬 Contact
- **Lead:** ARKSTU
- **Project:** iOS 17 Inspired Launcher – Ray Studio Edition
- **Package:** com.raystudio.ios17launcher

## 🗺️ Roadmap
- [x] Project scaffold and CI/CD
- [ ] Core home screen implementation
- [ ] Dock with blur effects
- [ ] App Library
- [ ] Widgets system
- [ ] Control Center
- [ ] Notification Center
- [ ] Play Store release

---

**Made with ❤️ by Ray Studio**