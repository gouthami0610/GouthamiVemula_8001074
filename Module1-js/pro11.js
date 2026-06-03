document.getElementById("regForm")
.addEventListener("submit", function(event) {

    event.preventDefault();

    const name = this.elements["name"].value;
    const email = this.elements["email"].value;

    if (!name || !email) {
        document.getElementById("error").textContent =
            "All fields are required";
        return;
    }

    console.log(name, email);
});