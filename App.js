import React from 'react';
import { StyleSheet, Text, View } from 'react-native';

import CustomModule from './CustomModule';

const App = () => {


  // console.log(CustomModule.handleCustomText("red"))

  return (
    <View>
      <Text>App</Text>
      {/* <CustomModule
        style={{
          flex: 1,
          color: 'red',
        }}
        text="red"
      /> */}
      {CustomModule.setInfoText("CustomModule", "#ff0000")}
    </View>
  )
}

export default App

const styles = StyleSheet.create({})
