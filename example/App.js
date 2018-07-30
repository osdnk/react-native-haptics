import React, {Component} from 'react';
import {Platform, StyleSheet, Text, View, Button} from 'react-native';
import RNH from 'react-native-haptics'

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' + 'Cmd+D or shake for dev menu',
  android:
    'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

export default class App extends Component {
  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>Welcome to React Native!</Text>
        <Text style={styles.instructions}>To get started, edit App.js</Text>
        <Text style={styles.instructions}>{instructions}</Text>
        <Button title="N S" onPress={() => RNH.notification("success")}/>
        <Button title="N W" onPress={() => RNH.notification("warning")}/>
        <Button title="N E" onPress={() => RNH.notification("error")}/>
        <Button title="I L" onPress={() => RNH.impact("light")}/>
        <Button title="I M" onPress={() => RNH.impact("medium")}/>
        <Button title="I H" onPress={() => RNH.impact("heavy")}/>
        <Button title="S" onPress={() => RNH.selection()}/>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});
