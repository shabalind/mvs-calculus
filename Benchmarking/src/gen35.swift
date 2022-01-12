  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: Double) -> Double {
    var v8: [[Double]] = v1
    let v5: [Double] = v8[0]
    let v4: Double = v5[0]
    var v3: Double = v2
    let v13: [Double] = v8[0]
    var v26: Double = v2
    var v20: [Double] = v13
    let v36: Double = v20[0]
    var v46: Double = v26
    let v41: Double = v36 - v4
    var v28: [Double] = v5
    v28[0] = v41
    v28[0] = v46
    v8[0] = v28
    v20[0] = v3
    var v178: Double = v41
    return v178
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: [[Double]] = [[2.0]]
    let v2: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
