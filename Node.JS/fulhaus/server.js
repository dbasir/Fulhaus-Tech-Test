/**
 Author: Divya Basir
 Date: 14th September 2021
 Title: Fulhaus Tech Test
 version: 1.0.0 - 14th Sep 2021, Divya Basir
 */

 //Configure express
 var express = require('express');
 var app  = express();
 var HTTP_PORT = process.env.PORT||8080;

 function onHTTPStart(){
     console.log("Express is running on port : "+HTTP_PORT);

 }

 //Static folders for express
 app.use(express.static("views"));
 app.use(express.static("public"));

 //form processing
 var bodyparser = require("body-parser");
 var path = require("path");
 app.use(express.urlencoded({extended:false}));

 //handlebars
 const ehbs = require('express-handlebars');
 app.engine('.hbs',ehbs({
     extname:'.hbs'
 }));
 app.set('view engine','.hbs');

 //Routes
 app.get("/",(req,res)=>{
     res.render("home",{layout:false})
 })


 //Start Express Server
 app.listen(HTTP_PORT, onHTTPStart);