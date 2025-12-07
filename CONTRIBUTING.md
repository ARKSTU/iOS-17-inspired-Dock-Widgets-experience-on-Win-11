# Contributing to iOS 17 Inspired Launcher

Thank you for your interest in contributing! We welcome contributions from the community.

## Getting Started

1. Fork the repository
2. Clone your fork: `git clone https://github.com/YOUR_USERNAME/iOS-17-inspired-Dock-Widgets-experience-on-Win-11.git`
3. Create a feature branch: `git checkout -b feature/your-feature-name`
4. Make your changes
5. Test your changes thoroughly
6. Commit your changes: `git commit -m "Add your feature"`
7. Push to your fork: `git push origin feature/your-feature-name`
8. Open a Pull Request

## Development Setup

### Prerequisites
- Android Studio Hedgehog (2023.1.1) or later
- JDK 17 or later
- Android SDK with API 31+
- Gradle 8.2+

### Building the Project
```bash
./gradlew build
```

### Running Tests
```bash
./gradlew test
./gradlew connectedAndroidTest
```

### Code Style
We follow the Kotlin coding conventions. Please ensure your code:
- Uses meaningful variable and function names
- Includes documentation for public APIs
- Follows the existing code structure
- Passes lint checks: `./gradlew lint`

## Pull Request Guidelines

### Before Submitting
- [ ] Code builds successfully
- [ ] All tests pass
- [ ] New features include tests
- [ ] Documentation is updated
- [ ] Lint checks pass
- [ ] Commit messages are clear and descriptive

### PR Description
Please include:
- Summary of changes
- Related issue number (if applicable)
- Screenshots/videos for UI changes
- Testing performed

## Code of Conduct
Please be respectful and professional in all interactions. See [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for details.

## Feature Requests and Bug Reports
- Use GitHub Issues to report bugs or request features
- Search existing issues before creating a new one
- Provide detailed information and steps to reproduce for bugs
- For feature requests, explain the use case and expected behavior

## Module Structure
The project is organized into modules:
- `app`: Main launcher application
- `core-ui`: Design system and shared UI components
- `core-data`: Data layer (Room, DataStore, repositories)
- `feature-*`: Feature-specific modules

When adding new features, consider creating a new feature module if the functionality is self-contained.

## Questions?
Feel free to open an issue for questions or join discussions in the Issues tab.

Thank you for contributing! 🚀
