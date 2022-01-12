  import Dispatch
  @inline(never)
  func f0(_ v0: Double) -> Double {
    let v3: [Double] = [v0]
    let v1: [[Double]] = [v3, v3, v3, v3, v3, v3, v3]
    var v12: [[Double]] = v1
    v12[4] = v3
    v12[6] = v3
    let v5: [[[Double]]] = [v12]
    v12[3] = v3
    let v11: [[[[Double]]]] = [v5, v5, v5, v5, v5]
    v12[4] = v3
    var v14: [[[[Double]]]] = v11
    let v17: [[[Double]]] = v11[3]
    let v16: [[[Double]]] = v14[0]
    let v21: [Double] = v12[6]
    v12[1] = v21
    var v30: [[Double]] = v12
    v12[0] = v21
    v14[4] = v17
    let v54: [[Double]] = v16[0]
    var v89: [Double] = v21
    let v46: [Double] = v54[5]
    let v50: [Double] = v30[5]
    v12[5] = v50
    let v96: Double = v46[0]
    var v104: [Double] = v89
    v30[5] = v46
    v30[2] = v104
    return v96
  }
  func benchmark() {
    let v0: Double = 0.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 0.0
    for _ in 1...1000 {
      result = f0(v0)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
