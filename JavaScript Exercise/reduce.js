function customReduce(arr, callback, initialValue) {
    let accumulator = initialValue !== undefined ? initialValue : arr[0];
    const startIndex = initialValue !== undefined ? 0 : 1;
  
    for (let i = startIndex; i < arr.length; i++) {
      accumulator = callback(accumulator, arr[i], i, arr);
    }
  
    return accumulator;
  }

const arr = [1, 2, 3, 4, 5];
const sum = customReduce(arr, (acc, num) => acc + num, 0);
console.log(sum); 