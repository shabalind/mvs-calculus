  import Dispatch
  struct s0 {
    var p0: [Double]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: s0, _ v3: Double) -> Double {
    var v5: s0 = v2
    let v4: [Double] = v5.p0
    let v9: [Double] = v1.p0
    let v7: Double = v4[0]
    let v13: [Double] = v1.p0
    let v6: Double = v3 - v7
    let v11: Double = v13[0]
    var v12: [Double] = v4
    let v34: Double = v4[0]
    var v21: [Double] = v4
    var v15: Double = v6
    v12[0] = v34
    v21[0] = v11
    v5.p0 = v9
    v21[0] = v11
    let v28: Double = v12[0]
    v21[0] = v28
    v5.p0 = v12
    let v29: Double = v21[0]
    let v57: Double = v15 / v29
    v12[0] = v11
    v5.p0 = v12
    return v57
  }
  func benchmark() {
    let v0: s0 = s0(p0: [0.0])
    let v1: s0 = s0(p0: [1.0])
    let v2: s0 = s0(p0: [2.0])
    let v3: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
