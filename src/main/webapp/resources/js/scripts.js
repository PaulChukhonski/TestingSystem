/*!
* Start Bootstrap - Bare v5.0.1 (https://startbootstrap.com/template/bare)
* Copyright 2013-2021 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-bare/blob/master/LICENSE)
*/
// This file is intentionally blank
// Use this file to add JavaScript to your project

//createTest.jsp
function validateTest() {
    const x = document.forms["myForm"]["name"].value;
    if (x === "") {
        alert("Поле темы не может быть пустым!");
        document.getElementById('topic').focus();
        return false;
    }
    return true;
}

function validateUser() {
    const login = document.forms["myForm2"]["login"].value;
    const password = document.forms["myForm2"]["password"].value;
    const lastName = document.forms["myForm2"]["lastName"].value;
    const firstName = document.forms["myForm2"]["firstName"].value;
    if (login ===  '' || password === '' || lastName === '' || firstName === '') {
        alert("Все поля должны быть заполнены!");
        return false;
    }
    return true;
}

async function pullTests() {

    document.getElementById('insert').innerHTML = "";

    const headers = new Headers();

    headers.append("Access-Control-Allow-Origin", "*");
    headers.append("Access-Control-Allow-Methods", "GET,HEAD,OPTIONS,POST,PUT");
    headers.append("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type,Accept, x-client-key, x-client-token, x-client-secret, Authorization");
    headers.append('Accept', 'application/json');

    let promise = await fetch("http://localhost:8080" +
        "/admin/test/" + document.getElementById('topic')[0].value, {
        method: 'GET',
        headers: headers
    })
    if (promise.ok) {
        const json = await promise.json();

        for (let key in json) {
            let value = json[key];
            document.getElementById('insert').innerHTML += '<option value="' + value.name + '">'
        }
    } else {
        alert("Ошибка HTTP" + response.status)
    }
}