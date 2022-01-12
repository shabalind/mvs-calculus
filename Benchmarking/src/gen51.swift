  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f110(_ v0: s0) -> s0 {
    var v7: s0 = v0
    var v3: s0 = v7
    var v4: s0 = v0
    var v1: s0 = v3
    var v6: s0 = v0
    let v2: [[Double]] = v0.p1
    let v16: [[Double]] = v0.p1
    let v10: [[Double]] = v6.p0
    var v14: s0 = v1
    let v12: s1 = s1(p0: v1, p1: v4)
    let v21: [[[Double]]] = [v10, v10, v10, v10, v10]
    let v43: [[Double]] = v21[4]
    let v18: [[[Double]]] = [v2, v2, v2, v2, v16, v16, v16]
    let v26: [[Double]] = v18[3]
    let v52: [[Double]] = v21[2]
    v1.p0 = v10
    var v51: s1 = v12
    var v29: s1 = v51
    v6.p0 = v43
    v1.p0 = v52
    v51.p1 = v14
    v29.p0 = v0
    let v85: s0 = v29.p1
    v4.p1 = v26
    return v85
  }
  func f87(_ v0: s1) -> s1 {
    var v5: s1 = v0
    var v7: s1 = v5
    let v4: s0 = v7.p1
    let v1: [s1] = [v5, v5]
    let v9: s1 = v1[0]
    v5.p0 = v4
    return v9
  }
  func f60(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v6: s0 = f110(v0)
    let v3: [[Double]] = v7.p0
    let v4: [[Double]] = v6.p1
    let v1: s0 = f110(v7)
    let v5: s0 = f110(v1)
    v7 = v6
    let v10: s0 = f110(v7)
    let v13: [[Double]] = v5.p0
    var v9: [[Double]] = v4
    let v12: s0 = f110(v10)
    let v11: s0 = f110(v1)
    var v18: [[Double]] = v4
    let v22: [Double] = v18[0]
    v7.p1 = v18
    let v14: s0 = f110(v7)
    v7.p0 = v3
    var v16: [Double] = v22
    v9 = v4
    v9[0] = v16
    let v20: [[Double]] = v10.p1
    let v21: s0 = f110(v0)
    let v30: [Double] = v9[0]
    let v23: [[Double]] = v14.p1
    let v71: s0 = f110(v21)
    var v54: [[Double]] = v13
    let v63: [Double] = v23[0]
    v7 = v10
    v7.p1 = v18
    v18[0] = v22
    v18[0] = v30
    let v33: s0 = f110(v10)
    v18[0] = v63
    let v50: s1 = s1(p0: v12, p1: v71)
    v7.p0 = v54
    var v94: s1 = v50
    let v78: s0 = v94.p0
    let v74: s1 = f87(v94)
    v94.p0 = v1
    let v103: s0 = v50.p1
    let v81: s0 = v74.p1
    let v56: [[Double]] = v78.p0
    v94.p0 = v33
    v94.p1 = v103
    v94.p0 = v11
    v7.p0 = v56
    var v180: s0 = v81
    v180.p1 = v20
    return v180
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v7: [s0] = v0[1]
    let v5: s0 = v7[0]
    let v4: s0 = v7[0]
    let v11: s0 = v7[0]
    let v10: s0 = f110(v5)
    let v15: [[Double]] = v11.p0
    var v30: [[Double]] = v15
    let v51: [[Double]] = v11.p1
    let v31: s0 = f60(v4)
    let v32: [[Double]] = v10.p0
    let v60: [Double] = v32[1]
    v30[0] = v60
    let v36: [Double] = v51[0]
    var v63: [Double] = v36
    let v62: Double = v60[0]
    let v87: Double = v63[0]
    let v252: [Double] = v30[0]
    let v75: [[Double]] = v31.p1
    var v72: [Double] = v252
    let v228: Double = v87 + v62
    let v145: [Double] = v75[0]
    let v83: Double = v72[0]
    v63[0] = v83
    v30[0] = v145
    return v228
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])], [s0(p0: [[3.0], [4.0]], p1: [[5.0]])]]
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
