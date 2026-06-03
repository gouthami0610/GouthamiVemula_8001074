$("#registerBtn").click(function () {
    alert("Registered!");
});

$(".card").fadeOut(2000);

setTimeout(() => {
    $(".card").fadeIn(2000);
}, 3000);