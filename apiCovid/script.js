function ListCountries() {
  const Listcountry = document.querySelector(".Listcountry");
  fetch("https://covid19-brazil-api.now.sh/api/report/v1/brazil")
    .then((res) => {
      return res.json();
    })
    .then((countries) => {
      Listcountry.innerHTML += `<p>casos: ${countries.data.cases}</p> 
      <p>confirmados: ${countries.data.confirmed}</p> 
      <p>Mortes:${countries.data.deaths}</p>
       <p>Recuperados:${countries.data.recovered}</p>
       <p>Última Atualização:${countries.data.updated_at} </p>`;
    });
}

ListCountries();
