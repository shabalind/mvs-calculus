  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: s1
    var p2: [s0]
    var p3: [s0]
  }
  func f12(_ v0: [s0]) -> [s0] {
    var v1: [s0] = v0
    var v8: [s0] = v0
    let v5: s0 = v8[0]
    let v4: [[Double]] = v5.p0
    let v9: [[Double]] = v5.p0
    let v2: [Double] = v4[1]
    let v6: [[Double]] = v5.p1
    var v11: [[Double]] = v6
    let v13: [[Double]] = v5.p1
    let v17: s0 = s0(p0: v4, p1: v6)
    var v20: s0 = v5
    var v12: [s0] = v1
    v20.p0 = v9
    v20.p1 = v11
    let v14: [[Double]] = v17.p0
    v12[0] = v20
    var v22: s0 = v17
    var v15: [[Double]] = v13
    v22.p0 = v4
    let v35: s0 = s0(p0: v9, p1: v11)
    let v26: [[s0]] = [v8]
    var v16: [Double] = v2
    var v18: [s0] = v12
    v15[0] = v2
    v22.p1 = v13
    let v34: [Double] = v9[2]
    v20.p1 = v13
    let v19: [[Double]] = v17.p0
    let v21: [[Double]] = v22.p0
    var v68: [[Double]] = v11
    v12[1] = v17
    let v48: [s0] = v26[0]
    v22.p0 = v9
    let v45: [[Double]] = v5.p1
    v8[0] = v22
    let v32: [Double] = v14[0]
    v8 = v18
    v15[0] = v34
    v8 = v18
    v22.p1 = v13
    v22.p1 = v13
    v22.p0 = v21
    let v50: [[Double]] = v20.p1
    v22.p1 = v50
    v8[0] = v5
    var v78: [[Double]] = v9
    v68[0] = v16
    v20.p0 = v19
    v22.p0 = v78
    let v167: [Double] = v4[0]
    v22.p1 = v45
    let v65: s0 = v48[0]
    v12[0] = v65
    v68[0] = v32
    var v140: s0 = v35
    v78[1] = v167
    v22.p1 = v68
    let v97: [[Double]] = v140.p0
    v140.p1 = v15
    v20.p1 = v13
    v1[0] = v65
    v8[1] = v35
    v12[1] = v35
    v140.p1 = v13
    let v162: [[Double]] = v17.p1
    v140.p1 = v162
    v20.p0 = v97
    return v18
  }
  func f6(_ v0: s2) -> s2 {
    var v5: s2 = v0
    var v2: s2 = v5
    let v4: [s0] = v2.p2
    var v3: s2 = v5
    let v9: s0 = v4[1]
    let v6: [[Double]] = v9.p1
    var v7: s0 = v9
    let v8: s0 = v4[2]
    v5.p2 = v4
    var v15: [s0] = v4
    v5.p0 = v9
    v2.p2 = v15
    var v19: [[Double]] = v6
    v3.p0 = v9
    v15[0] = v8
    v15[1] = v9
    var v32: [[Double]] = v19
    let v36: [[Double]] = v7.p1
    v7.p1 = v36
    v3.p0 = v7
    v7.p1 = v32
    return v3
  }
  func f3(_ v0: s1) -> s1 {
    let v4: [s0] = v0.p0
    var v3: s1 = v0
    let v6: [[s0]] = v3.p1
    let v7: [s0] = v6[0]
    v3.p1 = v6
    v3.p1 = v6
    var v19: s1 = v3
    let v13: [[s0]] = v0.p1
    v19.p1 = v6
    v3.p1 = v6
    v3.p1 = v13
    var v24: [s0] = v4
    let v28: [s0] = v19.p0
    let v30: [[s0]] = v0.p1
    let v40: [s0] = v3.p0
    let v44: s0 = v4[0]
    v3.p0 = v40
    let v60: [s0] = v30[1]
    var v74: [s0] = v7
    v19.p0 = v60
    let v48: [[s0]] = v0.p1
    v19.p0 = v28
    v19.p0 = v60
    v24[0] = v44
    v24[0] = v44
    v3.p1 = v48
    v3.p0 = v28
    v3.p1 = v13
    v19.p0 = v24
    var v121: s1 = v19
    v3.p0 = v24
    v121.p0 = v74
    return v121
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s2, _ v2: Double) -> Double {
    let v6: s1 = f3(v0)
    var v4: s1 = v6
    var v8: s2 = v1
    let v3: [s0] = v6.p0
    v8.p1 = v4
    let v11: s2 = f6(v8)
    let v17: s2 = f6(v11)
    let v15: s0 = v8.p0
    let v5: s0 = v3[0]
    let v34: [[Double]] = v15.p0
    let v39: s2 = f6(v17)
    let v14: [Double] = v34[2]
    var v24: [s0] = v3
    let v19: s1 = f3(v4)
    v4.p0 = v24
    v24[0] = v5
    let v23: Double = v14[0]
    var v25: Double = v23
    v8.p1 = v19
    let v22: [s0] = v8.p3
    let v30: [s0] = f12(v22)
    let v64: [s0] = f12(v22)
    let v28: [s0] = v0.p0
    v8.p3 = v30
    v24[0] = v5
    let v67: s0 = v64[0]
    v24[0] = v67
    let v41: s0 = v39.p0
    let v57: s0 = v28[0]
    v8.p0 = v41
    v8.p0 = v57
    return v25
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], p1: [[s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])]])
    let v1: s2 = s2(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p1: s1(p0: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])], p1: [[s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])], [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])], [s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])]]), p2: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]), s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])], p3: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])])
    let v2: Double = 56.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 56.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
