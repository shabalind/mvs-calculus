  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [Double], _ v2: Double) -> Double {
    let v9: [Double] = v0[1]
    var v4: [Double] = v1
    let v3: Double = v9[0]
    let v11: Double = v2 * v3
    let v8: [Double] = v0[0]
    var v13: Double = v2
    let v18: Double = v3 - v11
    var v20: [Double] = v1
    v4[0] = v3
    v20[2] = v11
    var v23: Double = v18
    let v45: Double = v20[0]
    let v24: Double = v1[2]
    v20[0] = v24
    let v46: Double = v8[0]
    let v34: [[Double]] = [v1, v20, v20, v20, v4]
    var v72: [[Double]] = v34
    var v43: Double = v23
    let v44: Double = v13 - v45
    v72[3] = v1
    v20[2] = v13
    v20[0] = v46
    let v57: [Double] = v72[0]
    var v48: Double = v11
    var v81: Double = v48
    v4[2] = v11
    v20[0] = v81
    v4[1] = v44
    v20[1] = v43
    let v161: Double = v57[2]
    return v161
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [Double] = [3.0, 4.0, 5.0]
    let v2: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
