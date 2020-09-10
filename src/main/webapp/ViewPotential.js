//fetch("http://localhost:8080/employees-app/display"
fetch("./display",{
	method:'GET',
	headers:{'Content-Type':'application/json'}
})

	.then((response) => response.json())
	.then((data) => {

        data.forEach(element => {
			const table = document.querySelector("#dashboard");
            const Name =element.name;
            const Age=element.age;
            const Location=element.location;
             const Gender=element.Gender;

  console.log(element);
            const row = `
            <tr>
			<td>${Name}</td>
			<td>${Age}</td>
			<td>${Location}</td>
			<td>${Gender}</td>
			<td></td>
			</tr> `;

			table.insertAdjacentHTML("beforeend",row)

		});


	}).catch((error)=>{
		console.log('There is an error')
	})
