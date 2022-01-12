  import Dispatch
  @inline(never)
  func f0(_ v0: [Double], _ v1: Double) -> Double {
    let v6: Double = v0[0]
    var v8: [Double] = v0
    let v9: Double = v0[0]
    let v3: Double = v0[0]
    let v4: Double = v0[0]
    let v27: Double = v0[0]
    var v11: Double = v4
    var v10: [Double] = v0
    v11 = v4
    v10[0] = v9
    v10[0] = v6
    v8[0] = v4
    v8[0] = v9
    v8[0] = v11
    let v12: Double = v8[0]
    var v14: [Double] = v8
    v11 = v27
    let v36: Double = v14[0]
    let v28: Double = v8[0]
    let v38: [Double] = [v3, v27, v36, v28, v27, v9, v4]
    var v29: [Double] = v38
    v10[0] = v36
    var v24: Double = v28
    var v55: [Double] = v29
    var v75: [Double] = v29
    v29[6] = v12
    v29[0] = v27
    let v100: Double = v10[0]
    var v37: [Double] = v55
    v29[5] = v27
    v55[2] = v100
    var v88: [Double] = v75
    let v96: Double = v37[0]
    let v127: Double = v37[1]
    var v69: [Double] = v88
    let v65: Double = v69[3]
    v8[0] = v24
    v69[5] = v127
    v88[5] = v127
    v75[6] = v96
    return v65
  }
  func benchmark() {
    let v0: [Double] = [0.0]
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
