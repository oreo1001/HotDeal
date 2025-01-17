const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({

  devServer:{
    port: 8081,
    proxy: {
      '/api':{
        target: 'http://localhost:8080', // 로컬에서 개발할 경우
        // target: 'http://43.200.252.191/'
      }
    }
  },

  transpileDependencies: true,

  pluginOptions: {
    vuetify: {
			// https://github.com/vuetifyjs/vuetify-loader/tree/next/packages/vuetify-loader
		}
  }
})
