function customFilter(arr, callback) {
    const result = [];
    for (let i = 0; i < arr.length; i++) {
      if (callback(arr[i], i, arr)) {
        result.push(arr[i]);
      }
    }
    return result;
  }

  
  const arr = [1, 2, 3, 4, 5];
  const filterdNumbers = customFilter(arr, (num) => num % 2===0);
  console.log(filterdNumbers); 