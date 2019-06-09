var initState = [
    {
        id: 1,
        name: 'pick',
        image: '09877763',
        price: 9000,
        descriptons: 'this is my phone',
        inventory: 10
    },
    {
        id: 2,
        name: 'gunny',
        image: '09877763',
        price: 800000,
        descriptons: 'this is my phone',
        inventory: 2
    },
    {
        id: 3,
        name: 'puck',
        image: '09877763',
        price: 39000,
        descriptons: 'this is my phone',
        inventory: 5
    },
];

const products = (state = initState, action) => {
    switch(action.type) {
        default:return [...state];
    }
}

// const products = initState.map(e => {
//     var product = {};
//     product[e.id] = e.name;
//     return product;
    
// });
console.log(products);
export default products;
