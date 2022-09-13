import React from "react";
import ReactDOM from "react-dom";
import {useState} from "react";

const App = () => {
    const [count, setCount] = useState(0);

    const handleIncrement = () => {
        setCount(count + 1)
    }

    const handleDecrement = () => {
        setCount(count - 1)
    }

    return (
        <div>
        <div>Counter App</div>
            {count}
            <button onClick={handleIncrement}>Increment</button>
            <button onClick={handleDecrement}>Decrement</button>
        </div>
    );

}

export default App;