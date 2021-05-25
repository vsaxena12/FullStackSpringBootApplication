fetch("http://yourapi.com").then(function (data) {
    return data.json();
}).then(function (obj) {
    console.log(obj);
});