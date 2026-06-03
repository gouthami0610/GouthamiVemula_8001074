function submitForm() {

    console.log("Step 1: Form submitted");

    const payload = {
        name: "John"
    };

    console.log("Payload:", payload);

    debugger; // breakpoint

    fetch("https://jsonplaceholder.typicode.com/posts", {
        method: "POST",
        body: JSON.stringify(payload)
    });
}

submitForm();