import React from 'react';
import ReactDOM from 'react-dom';
import { useState } from 'react';

const App = () => {
    const [task, setTask] = useState('');
    const [data, setData] = useState([]);
    const handleChange = (e) => {
        setTask(e.target.value);
    };
    const onSubmit = (e) => {
        e.preventDefault();
        setData([...data,task])
        setTask('');
    };
   
    return(
        <>
            <div><h1>TO DO List</h1></div>
            <form onSubmit={onSubmit}>
                <label>Tasks</label>
                <input value={task} onChange={handleChange}placeholder='Enter the task...'/>
                <button>Add</button>
            </form>
            <div>
                {data.map(el =>{
                    return(<>
                        <div>{el + " "}
                        <button>Delete</button>
                        </div>
                    </>)
                })
                }
            </div>
            
                
            
        </>
        
    )
}
export default App;