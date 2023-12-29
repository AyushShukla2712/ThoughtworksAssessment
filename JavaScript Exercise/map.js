function customMap(arr, callback) {
    const result = [];
    for (let i = 0; i < arr.length; i++) {
      result.push(callback(arr[i], i, arr));
    }
    return result;
  }

  const arr = [1, 2, 3, 4, 5];
  const mappedNumbers = customMap(arr, (num) => num * 2);
  console.log(mappedNumbers); 