  import Dispatch
  func f45(_ v0: Double) -> Double {
    var v8: Double = v0
    var v5: Double = v8
    var v2: Double = v0
    var v12: Double = v5
    var v9: Double = v12
    var v7: Double = v9
    let v38: [Double] = [v7, v2]
    var v31: [Double] = v38
    let v34: Double = v31[0]
    return v34
  }
  @inline(never)
  func f0(_ v0: [Double], _ v1: Double, _ v2: Double) -> Double {
    let v7: Double = v0[1]
    let v6: Double = f45(v1)
    var v8: [Double] = v0
    v8[1] = v6
    let v4: Double = f45(v7)
    v8 = v0
    var v10: [Double] = v0
    var v5: Double = v2
    v8[2] = v2
    let v3: Double = v0[1]
    v10[1] = v3
    let v16: Double = v10[2]
    var v12: [Double] = v10
    v10[1] = v7
    let v22: Double = v0[0]
    let v23: Double = v0[2]
    v8[0] = v16
    let v21: Double = f45(v4)
    let v41: Double = f45(v23)
    v12[0] = v23
    let v36: Double = f45(v22)
    let v31: Double = f45(v41)
    v8[0] = v21
    v8[2] = v4
    var v43: [Double] = v12
    let v28: Double = v10[0]
    var v19: Double = v31
    let v95: Double = f45(v5)
    let v60: Double = f45(v36)
    let v27: Double = f45(v41)
    v10[0] = v19
    var v83: Double = v28
    var v105: [Double] = v8
    let v44: Double = v105[1]
    let v58: Double = f45(v60)
    v105[0] = v83
    v105 = v43
    let v141: Double = f45(v58)
    v10[1] = v27
    v12[0] = v141
    v12[0] = v4
    v8[0] = v95
    let v176: Double = f45(v44)
    return v176
  }
  func benchmark() {
    let v0: [Double] = [0.0, 1.0, 2.0]
    let v1: Double = 3.0
    let v2: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
