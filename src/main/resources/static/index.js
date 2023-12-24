console.log("hello world");

async function getPlants() {
	try {
		const response = await fetch("http://localhost:8080/showPlantList");
		const resJson = await response.json();

		if(response.ok) {
			console.log(resJson);
		} else {
			console.log(response.body);
		}
	}
	catch(err) {
		console.error(`fetching error : ${err}`);
	}
}

getPlants();
