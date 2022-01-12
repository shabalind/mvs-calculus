  import Dispatch
  func f71(_ v0: [Double]) -> [Double] {
    let v6: Double = v0[0]
    var v2: Double = v6
    var v7: Double = v6
    var v8: Double = v7
    var v15: [Double] = v0
    var v9: [Double] = v15
    v9[0] = v2
    v9[0] = v8
    v15[0] = v6
    var v76: [Double] = v9
    return v76
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v3: [Double] = v0[0]
    let v11: [Double] = f71(v3)
    let v12: Double = v3[0]
    let v10: Double = v11[0]
    var v27: Double = v10
    var v23: Double = v12
    let v25: Double = v27 - v23
    v23 = v27
    var v220: Double = v25
    return v220
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
