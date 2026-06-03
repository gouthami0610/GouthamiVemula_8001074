let events = [];

function addEvent(event) {
    events.push(event);
}

function registerUser(eventName) {
    console.log(`Registered for ${eventName}`);
}

function filterEventsByCategory(category, callback) {
    const filtered = events.filter(e => e.category === category);
    callback(filtered);
}

function registrationCounter() {
    let count = 0;

    return function () {
        count++;
        return count;
    };
}

const counter = registrationCounter();

addEvent({ name: "Music Fest", category: "Music" });

filterEventsByCategory("Music", result => {
    console.log(result);
});

console.log(counter());
console.log(counter());