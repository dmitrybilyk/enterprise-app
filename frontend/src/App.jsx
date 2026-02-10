import { useState, useEffect } from 'react'
export default App;

function App() {
    const [message, setMessage] = useState("Waiting for backend...")

    useEffect(() => {
        fetch('/test') // No prefix needed!
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