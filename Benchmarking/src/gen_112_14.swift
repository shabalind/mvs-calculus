  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    var v3: [[Double]] = v0
    var v4: [[Double]] = v3
    var v6: [[Double]] = v3
    let v13: [Double] = v4[1]
    v3[2] = v13
    var v14: [Double] = v13
    v6[2] = v13
    let v11: [[[Double]]] = [v3]
    v6[2] = v14
    let v16: [[Double]] = v11[0]
    var v24: [[Double]] = v6
    let v19: [Double] = v16[0]
    var v26: Double = v1
    v4[2] = v19
    let v81: [Double] = v24[1]
    v3[2] = v19
    v6[2] = v81
    v3[2] = v13
    let v85: Double = v81[0]
    v14[0] = v26
    return v85
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
