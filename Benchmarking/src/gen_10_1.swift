  import Dispatch
  func f8(_ v0: [[Double]]) -> [[Double]] {
    let v4: [Double] = v0[0]
    let v2: Double = v4[0]
    var v6: [[Double]] = v0
    var v3: Double = v2
    var v5: [[Double]] = v6
    var v1: [[Double]] = v5
    v1[0] = v4
    v6[0] = v4
    var v11: [[Double]] = v1
    v3 = v2
    v6[0] = v4
    v11[0] = v4
    let v21: [Double] = [v3, v3, v2]
    v11 = v6
    var v14: [[Double]] = v0
    v6 = v14
    v5 = v11
    let v29: [Double] = v14[0]
    var v34: [[Double]] = v11
    let v51: Double = v21[0]
    let v39: [[[Double]]] = [v11, v6, v0, v1, v11, v0, v34]
    var v48: [Double] = v29
    v5[0] = v48
    var v73: [[[Double]]] = v39
    let v98: [[Double]] = v73[4]
    v48[0] = v51
    return v98
  }
  func f6(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v4: [[Double]] = f8(v0)
    let v12: [[Double]] = f8(v4)
    return v12
  }
  func f3(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v15: [[Double]] = f8(v1)
    let v31: [[Double]] = f8(v15)
    return v31
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: Double) -> Double {
    let v3: [[Double]] = f8(v1)
    let v6: [[Double]] = f3(v3, v3)
    let v11: [Double] = v6[0]
    let v7: [Double] = v6[0]
    var v4: [[Double]] = v1
    v4[0] = v11
    v4[0] = v7
    var v30: [[Double]] = v4
    let v23: [Double] = v6[0]
    v30[0] = v7
    var v17: [[Double]] = v4
    let v18: [Double] = v0[0]
    var v13: [Double] = v18
    let v52: [[Double]] = f3(v3, v17)
    v4[0] = v13
    v17[0] = v23
    v30[0] = v13
    v30[0] = v23
    let v78: [[Double]] = f6(v52, v30)
    let v66: [Double] = v78[0]
    let v64: Double = v66[0]
    return v64
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
