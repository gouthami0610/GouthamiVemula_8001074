document.getElementById("registerBtn").onclick = function () {
    alert("Registered!");
};

document.getElementById("category").onchange = function () {
    console.log(this.value);
};

document.getElementById("search").addEventListener("keydown", e => {
    console.log(e.target.value);
});