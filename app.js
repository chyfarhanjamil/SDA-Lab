const express = require('express');
const app = express()

app.get('/',(req,res)=> {
    res.send('Welcome Azure')
}) 

app.get('/about',(req,res)=> {
    res.send('Welcome Azure About')
}) 

app.listen(8080, ()=> {
    console.log('Server is listening on port 8080....')
})