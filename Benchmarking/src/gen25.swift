  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: Double) -> Double {
    var v5: Double = v2
    let v8: Double = v2 + v5
    let v14: [Double] = [v5, v8, v8, v5, v5, v5, v5]
    let v12: Double = v14[4]
    var v32: [Double] = v14
    var v36: [Double] = v32
    var v58: Double = v12
    let v73: Double = v36[5]
    v36[6] = v58
    v36[6] = v5
    return v73
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0], [2.0], [3.0]]
    let v2: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
