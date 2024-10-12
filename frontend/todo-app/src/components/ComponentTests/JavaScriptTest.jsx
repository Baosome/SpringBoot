const person = {
    name: 'Bao',
    age: 21,
    address: {
        Street: '123th Ave NE',
        City: 'Seattle'
    },
    profiles: ['Twitter', 'LinkedIn', "Facebook"],
    myFunction: () => console.log(person.profiles[0]),
    myFunction2: () => {
        person.profiles.map(
            (profile) => {
                console.log(profile)
            }
        )
        console.log(person.profiles[0])
    },
}



export default function JavaScriptTest() {
    return (
        <>
            <div>Person Name: {person.name},
                he is {person.age} years old
                and he is from {person.address.City}
            </div>
            <div>{person.profiles[1]}</div>
            {person.myFunction()}
            {person.myFunction2()}

        </>

    )
}