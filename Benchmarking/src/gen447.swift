  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
    var p2: Double
    var p3: [[Double]]
    var p4: [[Double]]
    var p5: [[Double]]
  }
  func f87(_ v0: [Double]) -> [Double] {
    var v4: [Double] = v0
    var v6: [Double] = v0
    let v2: Double = v4[0]
    var v3: [Double] = v4
    let v1: [[Double]] = [v3, v3, v6, v6]
    v3[1] = v2
    let v9: Double = v3[1]
    v4[1] = v9
    v4[1] = v2
    v4 = v0
    let v13: [Double] = v1[1]
    let v14: Double = v4[0]
    let v26: Double = v13[0]
    let v15: Double = v3[1]
    var v29: [[Double]] = v1
    v29[3] = v0
    var v18: [[Double]] = v29
    var v25: Double = v26
    var v23: [[Double]] = v1
    let v27: Double = v4[1]
    var v59: Double = v15
    var v22: Double = v25
    v4[0] = v22
    let v42: [Double] = v23[2]
    let v54: Double = v42[1]
    let v56: [Double] = v18[0]
    let v45: Double = v14 / v26
    v6[0] = v59
    var v50: [Double] = v56
    var v177: [Double] = v4
    var v53: [Double] = v177
    let v88: Double = v14 * v27
    v177[0] = v88
    v50[1] = v54
    v53[1] = v45
    v18[2] = v53
    return v50
  }
  func f24(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v7: s0 = v1
    var v4: s0 = v1
    var v6: s0 = v0
    var v2: s0 = v7
    var v3: s0 = v0
    let v9: Double = v3.p2
    var v10: Double = v9
    let v18: [[Double]] = v2.p5
    let v14: [[Double]] = v4.p3
    v4.p3 = v14
    let v21: [Double] = v6.p1
    let v15: Double = v21[1]
    var v24: [[Double]] = v14
    v6.p4 = v18
    let v17: [[Double]] = v6.p0
    let v16: [[Double]] = v7.p5
    var v13: [Double] = v21
    var v33: [[Double]] = v17
    let v27: [Double] = v17[0]
    v7.p3 = v24
    let v25: [[Double]] = v6.p4
    let v19: [[Double]] = v1.p0
    var v26: [[Double]] = v24
    v24[0] = v27
    v3.p0 = v19
    var v30: s0 = v6
    v7.p4 = v16
    v13 = v21
    let v35: [Double] = f87(v13)
    var v34: [[Double]] = v18
    v4.p2 = v10
    let v23: [Double] = v25[2]
    let v39: Double = v7.p2
    let v116: [Double] = f87(v35)
    v13[1] = v10
    let v32: Double = v23[0]
    var v22: [Double] = v21
    v34 = v18
    var v55: [[Double]] = v25
    let v72: s0 = s0(p0: v26, p1: v116, p2: v15, p3: v26, p4: v34, p5: v18)
    let v51: Double = v30.p2
    v3.p3 = v19
    let v50: [Double] = v24[0]
    let v20: [Double] = f87(v116)
    v30.p0 = v33
    v55[1] = v50
    let v36: Double = v39 + v32
    let v37: [Double] = v55[0]
    v7.p4 = v25
    let v79: [[Double]] = v1.p0
    v4.p3 = v33
    v1.p5 = v55
    v2.p0 = v24
    v1.p0 = v17
    let v137: [Double] = f87(v20)
    v30.p4 = v16
    v22[0] = v36
    var v78: Double = v51
    v6.p5 = v16
    var v102: s0 = v72
    let v198: Double = v20[1]
    v4.p1 = v22
    v1.p3 = v79
    v3.p2 = v198
    v33[0] = v37
    var v66: [Double] = v137
    v102.p1 = v66
    var v234: s0 = v102
    v13[0] = v78
    return v234
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v3: s0 = v0[2]
    let v4: s0 = f24(v3)
    let v9: [Double] = v3.p1
    var v7: s0 = v4
    v7.p2 = v1
    let v23: Double = v7.p2
    var v12: [Double] = v9
    let v14: [[Double]] = v4.p5
    let v13: [Double] = f87(v12)
    v12[0] = v23
    let v16: Double = v13[1]
    v7.p4 = v14
    v7.p2 = v16
    return v16
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [1.0, 2.0], p2: 3.0, p3: [[4.0]], p4: [[5.0], [6.0], [7.0]], p5: [[8.0], [9.0], [10.0]]), s0(p0: [[11.0]], p1: [12.0, 13.0], p2: 14.0, p3: [[15.0]], p4: [[16.0], [17.0], [18.0]], p5: [[19.0], [20.0], [21.0]]), s0(p0: [[22.0]], p1: [23.0, 24.0], p2: 25.0, p3: [[26.0]], p4: [[27.0], [28.0], [29.0]], p5: [[30.0], [31.0], [32.0]])]
    let v1: Double = 33.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 33.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
