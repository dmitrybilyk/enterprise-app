import { useState, useEffect } from 'react'
export default App;

function App() {
    const [message, setMessage] = useState("Waiting for backend...")

    useEffect(() => {
        // Replace 8085 with your actual Spring Boot port
        fetch('http://localhost:8085/test')
            .then(res => res.text())
            .then(data => setMessage(data))
            .catch(err => setMessage("Backend is offline ❌"));
    }, [])

    return (
        <div>
            <h1>Fullstack App</h1>
            <p>Backend says: {message}</p>
        </div>
    )
}