  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f50(_ v0: Double) -> Double {
    var v1: Double = v0
    var v5: Double = v0
    var v6: Double = v1
    var v8: Double = v6
    var v11: Double = v8
    var v12: Double = v5
    v5 = v11
    let v17: [Double] = [v11, v12]
    var v20: [Double] = v17
    let v22: [[Double]] = [v20, v17, v20]
    let v51: [Double] = v22[0]
    v20[0] = v12
    let v26: Double = v51[1]
    return v26
  }
  func f47(_ v0: Double) -> Double {
    let v1: Double = f50(v0)
    let v2: Double = f50(v1)
    let v4: Double = f50(v1)
    var v9: Double = v1
    var v7: Double = v0
    let v8: Double = f50(v4)
    let v5: Double = f50(v4)
    let v6: Double = f50(v5)
    var v10: Double = v0
    let v15: Double = f50(v6)
    let v20: Double = v2 / v2
    let v19: Double = f50(v9)
    let v25: Double = f50(v8)
    let v23: [Double] = [v7, v20, v25]
    var v29: [Double] = v23
    var v40: [Double] = v29
    var v28: [Double] = v40
    v29[1] = v2
    let v46: Double = f50(v19)
    var v26: [Double] = v28
    let v39: Double = v26[2]
    var v32: Double = v39
    let v41: Double = f50(v10)
    v29 = v28
    v40[1] = v46
    v40 = v23
    v40[0] = v41
    v28[1] = v15
    return v32
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v3: [[Double]] = v0.p1
    let v7: [Double] = v3[0]
    let v9: Double = v7[0]
    var v12: [Double] = v7
    let v11: [[Double]] = v0.p0
    let v16: Double = v1 / v9
    let v19: [Double] = v11[0]
    let v21: Double = v12[0]
    let v52: Double = v19[0]
    let v59: Double = f47(v9)
    let v53: Double = v12[0]
    var v142: Double = v16
    var v39: Double = v142
    let v31: Double = f50(v21)
    v12[0] = v31
    var v180: Double = v53
    v12[0] = v39
    let v97: Double = v12[0]
    var v297: Double = v180
    var v192: Double = v16
    let v102: [Double] = [v59, v52, v53, v142, v97, v297, v192]
    let v194: Double = v102[4]
    return v194
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]])
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
