  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    var v7: [[Double]] = v0
    let v6: [Double] = v7[0]
    var v4: [[Double]] = v7
    let v9: [Double] = v0[0]
    v4[0] = v6
    let v8: [Double] = v7[0]
    v4[0] = v8
    let v3: [Double] = v4[0]
    let v11: Double = v3[0]
    v7[0] = v3
    v7[0] = v9
    let v17: Double = v11 - v11
    v4[0] = v6
    let v28: [Double] = v0[0]
    var v71: [Double] = v28
    v4[0] = v71
    return v17
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
