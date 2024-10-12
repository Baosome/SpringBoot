// Create Context

import {createContext, useContext, useState} from "react";

export const AuthContext = createContext(undefined)

export const useAuth = ()=> useContext(AuthContext)

// share context with other component

export default function AuthProvider({children}) {
    // Put some state in the context
    const [number, setNumber] = useState(10);
    // setInterval(
    //     ()=> setNumber(number+1),
    //     10000
    // )

    const [isAuthenticated, setAuthenticated] = useState(false)

    return (
        <AuthContext.Provider value ={{number, isAuthenticated, setAuthenticated}}>
            {children}
        </AuthContext.Provider>
    )
}