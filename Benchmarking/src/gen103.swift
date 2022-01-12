  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s4 {
    var p0: s2
    var p1: [s1]
  }
  func f27(_ v0: s0) -> s0 {
    let v6: Double = v0.p1
    let v2: [[Double]] = v0.p0
    let v1: [Double] = v2[1]
    var v3: [[Double]] = v2
    var v8: s0 = v0
    let v4: [[Double]] = v8.p0
    let v11: Double = v1[0]
    var v7: s0 = v0
    var v16: [[Double]] = v2
    v7.p0 = v16
    var v13: [Double] = v1
    v7 = v8
    let v30: [Double] = v2[1]
    var v15: [Double] = v13
    v15 = v30
    var v23: Double = v11
    v13[0] = v23
    var v19: s0 = v8
    v13[0] = v23
    let v9: [Double] = v3[0]
    v15[0] = v23
    let v12: Double = v7.p1
    v3[1] = v1
    v7.p0 = v16
    v3[1] = v1
    let v21: [[Double]] = v0.p2
    let v14: [[Double]] = v7.p0
    var v33: Double = v23
    var v17: s0 = v8
    v8.p1 = v33
    var v18: [[Double]] = v14
    let v22: [Double] = v16[0]
    var v37: [[Double]] = v21
    var v20: [[Double]] = v16
    var v42: [[Double]] = v21
    v19.p2 = v37
    var v45: Double = v6
    v7.p2 = v21
    let v31: [Double] = v21[1]
    let v25: s0 = s0(p0: v18, p1: v12, p2: v42)
    v15[0] = v45
    v8.p0 = v4
    let v60: [[Double]] = v7.p0
    let v58: [[Double]] = v17.p2
    let v74: Double = v8.p1
    var v39: [[Double]] = v58
    let v72: [Double] = v39[2]
    v20[1] = v9
    var v57: [[Double]] = v16
    let v64: [Double] = v42[2]
    let v48: s1 = s1(p0: v19, p1: v25)
    v20[0] = v15
    v19.p1 = v33
    v19.p0 = v2
    v37[2] = v64
    var v55: s1 = v48
    v16[1] = v22
    v55 = v48
    var v56: [[Double]] = v57
    var v101: Double = v74
    v7.p2 = v39
    v13[0] = v6
    let v79: s0 = v55.p1
    v13[0] = v12
    v17.p0 = v60
    v55.p1 = v25
    let v89: s0 = v55.p1
    v18[1] = v22
    v39[0] = v15
    var v238: [Double] = v31
    v57[1] = v22
    v13[0] = v101
    v8.p1 = v23
    v39[0] = v72
    v7.p0 = v60
    v57 = v20
    v55.p0 = v89
    v18 = v56
    v20[0] = v30
    v42[2] = v238
    v18[0] = v1
    v238[0] = v74
    return v79
  }
  func f22(_ v0: s0) -> s0 {
    let v5: Double = v0.p1
    var v1: s0 = v0
    let v2: [[Double]] = v1.p0
    let v8: s0 = f27(v0)
    v1.p0 = v2
    let v6: s0 = f27(v1)
    var v7: [[Double]] = v2
    let v10: Double = v0.p1
    let v3: [[Double]] = v1.p2
    let v11: s0 = f27(v6)
    v1.p0 = v2
    let v14: [Double] = v7[1]
    v1.p2 = v3
    var v13: [[Double]] = v7
    let v18: s0 = f27(v1)
    v1.p2 = v3
    v1.p2 = v3
    let v21: [Double] = v2[0]
    let v15: [[Double]] = v11.p0
    let v20: s0 = f27(v11)
    v1 = v8
    v7[1] = v14
    v13[0] = v14
    v13[1] = v14
    let v36: [Double] = v3[0]
    let v26: s0 = f27(v8)
    let v23: Double = v10 * v5
    let v35: [[Double]] = v11.p2
    let v24: [[[Double]]] = [v15, v7, v13]
    let v29: Double = v21[0]
    let v60: [[Double]] = v26.p0
    let v70: [[Double]] = v24[0]
    v7[0] = v36
    v7[1] = v36
    let v50: s0 = f27(v18)
    v1.p0 = v60
    v1.p1 = v29
    v1.p0 = v60
    v1.p0 = v70
    v1.p1 = v23
    v1.p2 = v35
    let v51: Double = v50.p1
    let v96: [Double] = v15[1]
    v1.p0 = v60
    v13[0] = v96
    v1.p1 = v51
    return v20
  }
  func f4(_ v0: [s1], _ v1: s1) -> s1 {
    let v7: s1 = v0[1]
    var v3: [s1] = v0
    let v6: s1 = v3[0]
    var v14: s1 = v6
    let v9: s0 = v14.p0
    let v5: s1 = v0[0]
    let v10: s0 = v7.p1
    var v12: s0 = v10
    let v15: [[Double]] = v9.p0
    let v13: s0 = f27(v10)
    let v21: [[Double]] = v9.p0
    let v25: s1 = v3[0]
    let v20: s0 = v25.p1
    let v29: [[Double]] = v12.p2
    v14.p0 = v12
    v12.p2 = v29
    let v31: Double = v9.p1
    let v58: s0 = v7.p0
    let v64: [[Double]] = v12.p2
    let v39: Double = v31 + v31
    let v46: s0 = s0(p0: v21, p1: v31, p2: v64)
    v14.p1 = v13
    let v114: s1 = s1(p0: v46, p1: v20)
    v14.p0 = v58
    v12.p1 = v39
    v14 = v5
    v12.p0 = v15
    return v114
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v9: [s1] = v0.p1
    let v3: s1 = v9[1]
    let v2: s1 = f4(v9, v3)
    let v5: s1 = f4(v9, v2)
    var v10: Double = v1
    let v8: s0 = v5.p1
    var v14: s0 = v8
    v14.p1 = v1
    let v36: s0 = f22(v14)
    var v20: Double = v10
    let v45: [[Double]] = v36.p0
    var v47: [[Double]] = v45
    v14.p1 = v20
    let v90: [Double] = v47[1]
    v14.p1 = v20
    let v91: Double = v90[0]
    let v147: Double = v91 / v91
    return v147
  }
  func benchmark() {
    let v0: s4 = s4(p0: s2(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: 2.0, p2: [[3.0], [4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0]], p1: 8.0, p2: [[9.0], [10.0], [11.0]]))], p1: s0(p0: [[12.0], [13.0]], p1: 14.0, p2: [[15.0], [16.0], [17.0]])), p1: [s1(p0: s0(p0: [[18.0], [19.0]], p1: 20.0, p2: [[21.0], [22.0], [23.0]]), p1: s0(p0: [[24.0], [25.0]], p1: 26.0, p2: [[27.0], [28.0], [29.0]])), s1(p0: s0(p0: [[30.0], [31.0]], p1: 32.0, p2: [[33.0], [34.0], [35.0]]), p1: s0(p0: [[36.0], [37.0]], p1: 38.0, p2: [[39.0], [40.0], [41.0]]))])
    let v1: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
