const path = require('path');

module.exports = {
  entry: './src/index.js',  // Caminho de entrada do seu app
  output: {
    filename: 'bundle.js',  // Nome do arquivo de saída
    path: path.resolve(__dirname, 'dist'),  // Diretório de saída
    hashFunction: 'sha256',  // Corrigindo o problema de hash
  },
  mode: 'development',
};
