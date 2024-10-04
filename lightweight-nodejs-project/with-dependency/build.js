require('esbuild').build({
    entryPoints: ['app.js'],
    outfile: 'dist/bundle.js',
    bundle: true,
    minify: true,
    platform: 'node',
}).catch(() => process.exit(1));