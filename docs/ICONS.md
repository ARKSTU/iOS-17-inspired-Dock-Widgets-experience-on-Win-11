# App Icons and Branding

## Icon Requirements

The iOS 17 Inspired Launcher requires app icons in various sizes for different screen densities.

### Required Icon Sizes

#### Launcher Icons
- **mdpi (160dpi)**: 48x48 px
- **hdpi (240dpi)**: 72x72 px
- **xhdpi (320dpi)**: 96x96 px
- **xxhdpi (480dpi)**: 144x144 px
- **xxxhdpi (640dpi)**: 192x192 px

#### Adaptive Icons (Android 8.0+)
- **Foreground**: 108x108 dp canvas with 72x72 dp safe zone
- **Background**: 108x108 dp canvas

### Design Guidelines

The app icon should:
1. **Reflect iOS 17 Aesthetics**
   - Clean, minimalist design
   - Subtle gradients
   - Rounded corners (iOS style)
   - Modern and professional appearance

2. **Be Distinctive**
   - Unique and recognizable
   - Stand out among other launchers
   - Represent the brand "Ray Studio"

3. **Work at All Sizes**
   - Clear at 48x48 px
   - Detailed at 192x192 px
   - No text in icon (text doesn't scale well)

### Design Concept

**Suggested Design Elements:**
- iOS-style rounded square background
- Gradient from blue (#007AFF) to light blue (#5AC8FA)
- Simple icon representing home/launcher (e.g., app grid, iOS widget shape)
- "Ray Studio" branding without text in icon

### Color Palette

Primary Colors (matching iOS 17):
- **Primary Blue**: #007AFF
- **Light Blue**: #5AC8FA
- **Orange**: #FF9500
- **White**: #FFFFFF
- **Black**: #000000

### File Locations

Icons should be placed in:
```
app/src/main/res/
├── mipmap-mdpi/
│   ├── ic_launcher.png
│   └── ic_launcher_round.png
├── mipmap-hdpi/
│   ├── ic_launcher.png
│   └── ic_launcher_round.png
├── mipmap-xhdpi/
│   ├── ic_launcher.png
│   └── ic_launcher_round.png
├── mipmap-xxhdpi/
│   ├── ic_launcher.png
│   └── ic_launcher_round.png
├── mipmap-xxxhdpi/
│   ├── ic_launcher.png
│   └── ic_launcher_round.png
└── mipmap-anydpi-v26/
    ├── ic_launcher.xml
    └── ic_launcher_round.xml
```

### Adaptive Icon XML

Create `app/src/main/res/mipmap-anydpi-v26/ic_launcher.xml`:
```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@drawable/ic_launcher_background"/>
    <foreground android:drawable="@drawable/ic_launcher_foreground"/>
</adaptive-icon>
```

### Tools for Icon Creation

1. **Android Studio Image Asset Studio**
   - Right-click `res` folder
   - Select New > Image Asset
   - Configure launcher icon
   - Generate all sizes automatically

2. **Online Tools**
   - [Android Asset Studio](https://romannurik.github.io/AndroidAssetStudio/)
   - [App Icon Generator](https://appicon.co/)

3. **Design Software**
   - Figma (recommended for vector design)
   - Adobe Illustrator
   - Sketch
   - Inkscape (free)

### Branding Assets

Additional branding assets needed:
- **Splash Screen**: For app launch (optional in Android 12+)
- **Play Store Graphic**: 1024x500 px feature graphic
- **Play Store Icon**: 512x512 px
- **Screenshots**: For Play Store listing
- **Promotional Images**: Various sizes for marketing

### Play Store Requirements

For Google Play Store submission:
- **High-res icon**: 512x512 px, PNG, 32-bit
- **Feature graphic**: 1024x500 px, PNG or JPEG
- **Screenshots**: At least 2, up to 8 per device type
- **Phone screenshots**: 16:9 or 9:16 aspect ratio
- **Tablet screenshots**: 16:10 or 10:16 aspect ratio (optional)

### Next Steps

1. Design the launcher icon using the guidelines above
2. Generate all required sizes
3. Place icons in appropriate mipmap directories
4. Test icon appearance on various devices
5. Create Play Store assets for release

### Icon Testing

Test your icon:
- On light and dark home screens
- At different sizes
- On different Android versions
- In the app drawer
- In recent apps
- In settings

The icon should be clear, recognizable, and visually appealing in all contexts.
