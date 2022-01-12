  import Dispatch
  @inline(never)
  func f0(_ v0: [Double], _ v1: Double) -> Double {
    var v5: [Double] = v0
    v5[1] = v1
    v5[0] = v1
    let v2: Double = v5[1]
    var v6: [Double] = v0
    let v9: Double = v0[0]
    let v7: Double = v0[0]
    v6[1] = v9
    v6[0] = v9
    v5[0] = v9
    let v10: [[Double]] = [v6]
    var v16: [[Double]] = v10
    v6[1] = v7
    var v11: [Double] = v6
    var v22: [[Double]] = v16
    v6[0] = v2
    let v14: [Double] = v16[0]
    v16[0] = v11
    let v25: [[[Double]]] = [v22]
    var v21: [[[Double]]] = v25
    v22[0] = v14
    v16[0] = v14
    var v35: [Double] = v0
    let v49: [[Double]] = v21[0]
    v21[0] = v22
    let v38: Double = v0[1]
    var v42: [Double] = v35
    let v46: [Double] = v49[0]
    v22[0] = v11
    var v71: Double = v2
    v22[0] = v42
    v6[1] = v38
    var v57: [Double] = v46
    v42[0] = v71
    v5[1] = v38
    v35[0] = v71
    let v64: Double = v57[1]
    return v64
  }
  func benchmark() {
    let v0: [Double] = [0.0, 1.0]
    let v1: Double = 2.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
