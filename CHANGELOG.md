# Changelog

All notable changes to the iOS 17 Inspired Launcher – Ray Studio Edition will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Initial project scaffold with modular architecture
- 11 modules: app, core-ui, core-data, and 8 feature modules
- Jetpack Compose UI framework setup
- Hilt dependency injection configuration
- Android launcher intent filters and permissions
- GitHub Actions CI/CD workflows
- Comprehensive documentation (README, BUILD, CONTRIBUTING, PRIVACY_POLICY, ARCHITECTURE, ICONS)
- Code quality tools configuration (ktlint, detekt, editorconfig)
- Apache 2.0 License
- Code of Conduct
- Privacy Policy with opt-in telemetry

### Project Structure
- `app`: Main launcher application with HOME intent
- `core-ui`: Shared UI components and iOS-inspired theme
- `core-data`: Data layer with Room and DataStore
- `feature-home`: Home screen with icon grid
- `feature-dock`: Dock with blur effects
- `feature-applibrary`: App Library with categorization
- `feature-spotlight`: Spotlight search functionality
- `feature-widgets`: iOS 17 style widget system
- `feature-controlcenter`: Control Center with quick toggles
- `feature-notifications`: Notification Center
- `feature-settings`: App settings and preferences

### Technical Details
- **Minimum SDK**: API 31 (Android 12)
- **Target SDK**: API 34 (Android 14)
- **Language**: Kotlin 1.8.22
- **Build System**: Gradle 8.2 with Kotlin DSL
- **UI Framework**: Jetpack Compose with Material 3
- **DI Framework**: Hilt 2.47
- **Build Plugin**: Android Gradle Plugin 8.0.2

## [1.0.0] - TBD

### Planned Features
- [ ] Complete home screen implementation
- [ ] Dock with translucent blur
- [ ] App Library with smart categorization
- [ ] Spotlight search
- [ ] Widget support
- [ ] Control Center
- [ ] Notification Center
- [ ] Lock screen mimic
- [ ] Gesture support
- [ ] Haptic feedback
- [ ] Parallax wallpapers
- [ ] Accessibility features
- [ ] Settings and customization
- [ ] Play Store release

## Release Schedule

- **v0.1.0-alpha**: Core launcher functionality
- **v0.2.0-alpha**: Home screen and dock
- **v0.3.0-alpha**: App Library
- **v0.4.0-alpha**: Widgets and search
- **v0.5.0-beta**: Control Center and notifications
- **v0.9.0-rc**: Release candidate with all features
- **v1.0.0**: Public release on Play Store

---

[Unreleased]: https://github.com/ARKSTU/iOS-17-inspired-Dock-Widgets-experience-on-Win-11/compare/v1.0.0...HEAD
[1.0.0]: https://github.com/ARKSTU/iOS-17-inspired-Dock-Widgets-experience-on-Win-11/releases/tag/v1.0.0
