
# react-native-haptics

Library for performing haptic feedback in React Native


## API
Library exports methods:
### impact
Use impact feedback to indicate that an impact has occurred. For example, you might trigger impact feedback when a user interface object collides with another object or snaps into place.

#### `impact("heavy")`
A collision between large, heavy user interface elements.

#### `impact("medium")` or `impact()` - default
A collision between moderately sized user interface elements.

#### `impact("light")`
A collision between small, light user interface elements.

### notification
Use notification feedback to communicate that a task or action has succeeded, failed, or produced a warning of some kind.

#### `notification("error")`
A notification feedback type, indicating that a task has failed.

#### `notification("success")` or `notification()` - default
A notification feedback type, indicating that a task has completed successfully.

#### `notification("warining")`
A notification feedback type, indicating that a task has produced a warning.


### `selection()`
Use selection feedback to communicate movement through a series of discrete values.


## Usage
```javascript
import RNHaptics from 'react-native-haptics';
const { notification, impact, selection } = RNHaptics;

notification("error")

```

## Getting started

`$ yarn add react-native-haptics`

### Mostly automatic installation

`$ react-native link react-native-haptics`


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-haptics` and add `RNHaptics.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNHaptics.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.osdnk.haptics.RNHapticsPackage;` to the imports at the top of the file
  - Add `new RNHapticsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-haptics'
  	project(':react-native-haptics').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-haptics/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-haptics')
  	```
    
## Development
In order to develop simply modify files by opening the `Example` app via Android Studio or Xcode. Generally, it means that modifications refer to `node_modules` files. If you wish for your changes to be placed in the main folder in order to commit them use: 
```bash
./copyFromNodeModules.sh
``` 
If you wish to copy files to `node_modules` without installing dependencies you're to use: 
```bash
./putIntoNodeModules.sh
``` 
