  import Dispatch
  @inline(never)
  func f0(_ v0: [Double], _ v1: Double) -> Double {
    var v2: [Double] = v0
    let v6: [Double] = [v1, v1, v1, v1, v1, v1]
    let v13: Double = v6[5]
    let v5: Double = v2[0]
    var v9: Double = v13
    var v8: [Double] = v6
    var v18: [Double] = v8
    var v12: [Double] = v8
    let v17: Double = v8[1]
    v12[0] = v5
    var v21: Double = v17
    var v16: [Double] = v12
    let v42: Double = v0[1]
    let v26: Double = v16[0]
    var v27: [Double] = v12
    let v29: Double = v26 / v21
    var v47: [Double] = v27
    var v30: Double = v5
    v12[3] = v9
    var v39: [Double] = v18
    let v31: Double = v27[4]
    v8[4] = v31
    var v41: Double = v9
    v16[2] = v41
    var v150: [Double] = v6
    v16 = v150
    v12[2] = v5
    v150[3] = v42
    v12[1] = v30
    let v192: Double = v47[2]
    let v134: Double = v39[5]
    v30 = v134
    v12[2] = v192
    v8[5] = v41
    return v29
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
