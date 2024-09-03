const plantForm = document.getElementById('plant-form');
const plantList = document.getElementById('plant-list');
const growthTimeSelect = document.getElementById('growth-time-select');

plantForm.addEventListener('submit', function(event) {
  event.preventDefault();

  const plantName = document.getElementById('plant-name').value.trim();
  const plantType = document.getElementById('plant-type').value;
  const wateringFrequency = document.getElementById('watering-frequency').value;
  const growthTime = document.getElementById('growth-time-input').value;
  const growthTimeUnit = document.getElementById('growth-time-select').value;

  // Error Checking
  if (plantName === '') {
    alert('Please enter a plant name!');
    return;
  }

  if (plantType === '') {
    alert('Please select a plant type!');
    return;
  }

  if (growthTime === ''){
    alert('Please enter a valid time');
    return;
  }

  const newPlant = {
    plantName: plantName,
    plantType: plantType,
    wateringFrequency: wateringFrequency,
    growthTime: growthTime + ' ' + growthTimeSelect.options[growthTimeSelect.selectedIndex].text 
};

  // Save data to local storage
  let plants = JSON.parse(localStorage.getItem('plants')) || [];
  plants.push(newPlant);
  localStorage.setItem('plants', JSON.stringify(plants));

  // Clear form fields
  plantForm.reset();

  // Update plant list
  updatePlantList();
});

function updatePlantList() {
  plantList.innerHTML = ''; // Clear previous list

  const plants = JSON.parse(localStorage.getItem('plants')) || [];

  if (plants.length === 0) {
    plantList.textContent = 'No plants added yet!';
    return;
  }

  plants.forEach(plant => {
    const listItem = document.createElement('li');
    listItem.innerHTML = `<b>${plant.plantName}</b> (${plant.plantType}) - Water every ${plant.wateringFrequency} days and will fully grow in ${plant.growthTime}`;
    plantList.appendChild(listItem);
  });
}

// Check plant type on load and adjust watering frequency visibility
const plantTypeSelect = document.getElementById('plant-type');
const wateringFrequencyContainer = document.getElementById('watering-frequency-container');

plantTypeSelect.addEventListener('change', function() {
  if (this.value === '') {
    wateringFrequencyContainer.style.display = 'none';
  } else {
    wateringFrequencyContainer.style.display = 'block';
  }
});

function clearPlantList() {
  localStorage.removeItem('plants');
  updatePlantList(); // Update the displayed list to reflect the removal
}

updatePlantList(); // Load existing plants from local storage on app launch
