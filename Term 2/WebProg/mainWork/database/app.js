"use strict";

const express = require("express");
const app = express();
const path = require("path"); 

app.set("port", process.env.PORT || 3000);

// set the template engine
app.set("view engine", "ejs");

// import mysql - could use other database drivers like mongodb
var mysql = require('mysql');

// parse any post data
app.use(express.urlencoded({ extended: false }));

// parse any JSON data
app.use(express.json());


// COULD USE CONTROLLERS FOR THE CODE INSIDE POSTS

// LOGIN
// You can make one database for all your apps 
// and make a table (or tables with prefixes) for each app
// then keep your user, pass and database in a login module
// that has the following code - this is all that is in login.js

// exports.user = "username";
// exports.pass = "password";
// exports.database = "database";

const login = require("./login");

app.post("/database", (req, res)=>{ 

    const connection = mysql.createConnection({
        host     : '127.0.0.1',
        user     : login.user,
        password : login.pass,
        database : login.database
    });

    connection.connect((error)=>{
        if (error) {res.send(error);}
    });

    // INSERT THE DATA
    connection.query(
        "INSERT INTO node(name, city, color) VALUES(?,?,?)", 
        [req.body.name, req.body.city, req.body.color],  
        (error, results, fields)=>{if (error) res.send(error);}
    );
    
    // SHOW THE DATA
    connection.query("SELECT * FROM node", (error, results, fields)=>{

        // // used this in testing
        // results.forEach((row)=>{
        //     output += row.name + " - " + row.color + " - " + row.city + "<br>";
        // });
        // res.send(output);

        if (error) {res.send(error);}

        res.render("results", { results: results }); // or in ES6 just { results }

    });

    // EDITING DATA 
    // We are not editing data in this app (aside from deleting below)
    // You would edit with an SQL UPDATE query: 
    // connection.query(
    //     "UPDATE node SET name=?, city=?, color=? WHERE id=?", 
    //     [req.body.name, req.body.city, req.body.color, req.body.id],
    //     (error, results, fields)=>{if (error) res.send(error);}
    // );

    connection.end();
   
}); // end get database


// DELETING 


app.post("/database/delete", (req, res)=>{ 
    
    const connection = mysql.createConnection({
        host     : '127.0.0.1',
        user     : login.user,
        password : login.pass,
        database : login.database
    });

    connection.connect((error)=>{
        if (error) res.json({"error":error});
    });

    // DELETE THE DATA
    connection.query(
        "DELETE FROM node WHERE id=?", [req.body.id], (error, results, fields)=>{
            if (error) res.json({"error":error});
            else res.json({"error":"none"});
        }
    );

    connection.end();

});

// this will load the index and css as if in database root
app.use("/database", express.static(path.join(__dirname, "public")));


app.listen(app.get("port"), ()=>{
    console.log("running on port " + app.get("port"));
});