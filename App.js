import React from 'react';
import { StyleSheet, Text, View } from 'react-native';

import CustomModule from './CustomModule';

const App = () => {

  CustomModule.show();

  // console.log(CustomModule.handleCustomText("red"))

  return (
    <View>
      <Text>App</Text>
    </View>
  )
}

export default App

const styles = StyleSheet.create({})
