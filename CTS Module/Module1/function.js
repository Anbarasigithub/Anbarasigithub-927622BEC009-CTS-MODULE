document.getElementById('eventType').addEventListener('change', function () {
  const selectedOption = this.options[this.selectedIndex];
  const fee = selectedOption.getAttribute('data-fee') || 0;
  document.getElementById('eventFee').textContent = `Fee: $${fee}`;
});

const messageInput = document.getElementById('message');
const charCountDisplay = document.getElementById('charCount');
messageInput.addEventListener('input', function () {
  const remaining = 100 - this.value.length;
  charCountDisplay.textContent = remaining;
  if (remaining < 0) {
    this.value = this.value.slice(0, 100);
    charCountDisplay.textContent = 0;
  }
});

document.getElementById('eventRegistrationForm').addEventListener('submit', function (e) {
  e.preventDefault();
  const name = this.name.value;
  const eventType = this.eventType.value;
  const confirmation = `Thanks, ${name}! You're registered for the ${eventType} event.`;
  document.getElementById('confirmationMessage').textContent = confirmation;
  this.reset();
  document.getElementById('eventFee').textContent = 'Fee: $0';
  charCountDisplay.textContent = 100;
});

document.getElementById('clearPrefs').addEventListener('click', function () {
  localStorage.clear();
  alert("Preferences cleared.");
});

document.getElementById('findNearbyEvents').addEventListener('click', function () {
  const status = document.getElementById('geolocationStatus');

  if (!navigator.geolocation) {
    status.textContent = 'Geolocation is not supported by your browser.';
    return;
  }

  status.textContent = 'Locating…';

  navigator.geolocation.getCurrentPosition(
    position => {
      const lat = position.coords.latitude.toFixed(4);
      const lon = position.coords.longitude.toFixed(4);
      status.textContent = `You're at Latitude: ${lat}, Longitude: ${lon}`;
    },
    () => {
      status.textContent = 'Unable to retrieve your location.';
    }
  );
});
