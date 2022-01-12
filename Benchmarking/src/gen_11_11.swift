  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v4: Double = v1 + v1
    var v3: Double = v4
    var v8: Double = v4
    let v13: [Double] = [v3, v3, v8, v1, v3, v3]
    var v17: Double = v1
    let v11: Double = v13[0]
    var v18: [Double] = v13
    let v22: Double = v13[1]
    var v21: [Double] = v13
    v21 = v18
    v18[5] = v11
    var v19: [Double] = v21
    let v55: Double = v19[0]
    v19[1] = v1
    v19[3] = v22
    v18[0] = v17
    v19 = v18
    return v55
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: Double = 1.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 1.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
