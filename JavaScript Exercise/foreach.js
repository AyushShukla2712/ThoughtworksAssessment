function customForEach(arr, callback) {
    for (let i = 0; i < arr.length; i++) {
      callback(arr[i], i, arr);
    }
  }

const arr = [1, 2, 3, 4, 5];
customForEach(arr, (num) => console.log(num * 2));