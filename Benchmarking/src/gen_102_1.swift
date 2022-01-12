  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: [[Double]], _ v4: Double) -> Double {
    let v12: [Double] = v3[2]
    var v6: Double = v4
    let v8: Double = v6 - v6
    let v15: Double = v12[0]
    let v50: [Double] = v3[1]
    let v14: [Double] = [v15, v4, v8]
    let v29: Double = v50[0]
    var v41: [Double] = v14
    var v54: [Double] = v41
    v54[2] = v29
    let v84: Double = v54[1]
    return v84
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: [[Double]] = [[2.0], [3.0]]
    let v2: [[Double]] = [[4.0]]
    let v3: [[Double]] = [[5.0], [6.0], [7.0]]
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
