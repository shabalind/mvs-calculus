  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: [[Double]], _ v4: Double) -> Double {
    var v9: Double = v4
    v9 = v4
    var v28: Double = v4
    let v22: [Double] = [v9, v4, v28, v28, v9, v9]
    var v16: [Double] = v22
    let v35: [Double] = v1[1]
    v16[2] = v9
    let v33: Double = v35[0]
    v16 = v22
    v28 = v33
    let v95: [[Double]] = [v22, v16, v22, v16, v22, v16]
    var v219: [[Double]] = v95
    let v62: [Double] = v219[1]
    let v105: Double = v62[5]
    return v105
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0], [2.0], [3.0]]
    let v2: [[Double]] = [[4.0], [5.0], [6.0]]
    let v3: [[Double]] = [[7.0]]
    let v4: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
