const { resolve } = require('path')

module.exports = {
    publicPath: './',
    devServer: {
        host: '0.0.0.0',
        port: 8081,
        proxy: {
            '/mbtiles': {
                target: 'http://localhost:8003/',
                changeOrigin: true,
                pathRewrite: {
                    "^/mbtiles": ""
                }
            },
        }
    },


    configureWebpack: {
        resolve: {
            alias: {
                '@': resolve('src'),
            }
        }
    }
}