$(document).ready(function() {
    $.ajax({
        url: "http://localhost:80/token/odamic13@gmail.com"
    }).then(function(data, status, jqxhr) {
       $('.accessToken').append(data.id);
       console.log(jqxhr);
    });
});