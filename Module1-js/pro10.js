const eventDetails = {
    name: "Music Fest",
    date: "10-Aug-2026"
};

function greet(user = "Guest") {
    console.log(`Welcome ${user}`);
}

const { name, date } = eventDetails;

console.log(name, date);

const events = ["Music", "Sports", "Dance"];

const clonedEvents = [...events];

console.log(clonedEvents);