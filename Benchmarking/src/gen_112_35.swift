  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  func f38(_ v0: Double) -> Double {
    var v6: Double = v0
    v6 = v0
    var v4: Double = v6
    var v3: Double = v4
    var v7: Double = v6
    var v1: Double = v3
    var v10: Double = v1
    let v8: Double = v6 * v10
    var v13: Double = v4
    v7 = v0
    var v18: Double = v8
    var v15: Double = v4
    var v2: Double = v1
    var v22: Double = v15
    var v12: Double = v1
    var v27: Double = v1
    var v30: Double = v8
    var v17: Double = v27
    var v31: Double = v13
    let v19: Double = v7 - v7
    v27 = v15
    var v40: Double = v12
    let v25: [Double] = [v40, v6, v10, v2, v30, v15]
    var v120: [Double] = v25
    v120[2] = v18
    v120[1] = v1
    var v52: [Double] = v25
    v15 = v3
    var v70: [Double] = v52
    v70[4] = v31
    v52[5] = v17
    var v77: [Double] = v70
    v52[0] = v17
    v77 = v120
    v70[2] = v18
    v70[4] = v18
    v70[1] = v19
    let v145: Double = v77[4]
    v70[5] = v22
    return v145
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v19: Double = f38(v1)
    let v33: Double = v19 * v1
    let v51: Double = f38(v33)
    return v51
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]))
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
