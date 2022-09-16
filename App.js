import React from 'react';
import { StyleSheet, Text, View, requireNativeComponent } from 'react-native';


const App = () => {

  let TextCustomModules = requireNativeComponent('CustomTextExample');

  return (
    <View>
      <TextCustomModules
        color="#ff0000"
        context="context test"
        style={styles.custom}
      />
      <TextCustomModules
        color="#ccffff"
        context="context test"
        style={styles.custom}
      />
    </View>
  )
}

export default App

const styles = StyleSheet.create({
  custom: {
    width: 400,
    height: 50,
  }
})
