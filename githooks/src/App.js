import React, { useState, useEffect } from "react";

export default function App() {
  const [repositores, setRepositories] = useState([]);
  const [location, setLocation] = useState({});

  useEffect(async () => {
    const response = await fetch(
      "https://api.github.com/users/mateusamarall/repos"
    );
    const data = await response.json();
    setRepositories(data);
  }, []);
  useEffect(() => {
    const filtered = repositores.filter((repo) => repo.favorite);
    document.title = `Você tem ${filtered.length} favoritos`;
  }, [repositores]);

  useEffect(() => {
    const watchId = navigator.geolocation.watchPosition(handlePositionReceived);
    return () => navigator.geolocation.clearWatch(watchId);
  }, []);

  function handleFavorite(id) {
    const newRepositories = repositores.map((repo) => {
      return repo.id === id ? { ...repo, favorite: !repo.favorite } : repo;
    });
    setRepositories(newRepositories);
  }

  function handlePositionReceived({ coords }) {
    const { latitude, longitude } = coords;
    setLocation({ latitude, longitude });
  }
  return (
    <>
      <ul>
        {repositores.map((repo) => (
          <li key={repo.id}>
            {repo.name} {repo.favorite && <span>(Favorito)</span>}
            <button onClick={() => handleFavorite(repo.id)}>Favoritar</button>
          </li>
        ))}
      </ul>
      Latitude:{location.latitude}
      <br />
      Longitude:{location.longitude}
    </>
  );
}
