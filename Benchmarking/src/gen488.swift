  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f22(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    var v6: s0 = v0
    v6.p0 = v5
    let v4: [[Double]] = v0.p0
    v6 = v0
    let v7: [[Double]] = v6.p0
    let v1: [[Double]] = v0.p0
    v6.p0 = v4
    let v3: [Double] = v7[0]
    let v10: [[Double]] = v6.p1
    let v9: [[Double]] = v0.p0
    var v18: s0 = v0
    let v13: [[Double]] = v6.p0
    v6.p0 = v1
    var v8: [[Double]] = v10
    var v11: s0 = v0
    v6.p1 = v10
    let v25: [Double] = v8[1]
    var v23: [Double] = v25
    v8[1] = v3
    var v12: [[Double]] = v10
    v6.p0 = v13
    let v31: [Double] = v12[0]
    v12[0] = v3
    v12[0] = v23
    var v20: s0 = v6
    let v17: [[Double]] = v0.p0
    var v44: [Double] = v3
    v20.p0 = v17
    let v26: [[Double]] = v0.p1
    v11.p1 = v8
    v20.p0 = v9
    let v36: [[Double]] = v0.p0
    v20 = v0
    let v27: s0 = s0(p0: v1, p1: v12)
    let v24: [[Double]] = v18.p0
    let v21: Double = v31[0]
    v11.p0 = v24
    v20 = v11
    let v60: [[Double]] = v18.p1
    v11 = v0
    var v38: [Double] = v3
    v12[0] = v44
    var v54: Double = v21
    let v98: [[Double]] = v0.p0
    v44[0] = v54
    v44[0] = v54
    v11.p1 = v26
    v23[0] = v21
    v6.p0 = v98
    var v65: [Double] = v44
    var v58: Double = v54
    v65[0] = v58
    v12[1] = v31
    v12[1] = v65
    let v50: [s0] = [v11]
    var v78: s0 = v27
    v12[0] = v25
    var v99: s0 = v78
    let v101: s0 = v50[0]
    let v86: [[Double]] = v20.p0
    let v105: [[Double]] = v18.p1
    var v118: [s0] = v50
    v11.p0 = v24
    v11.p0 = v36
    v18.p0 = v86
    v20.p0 = v1
    let v144: Double = v38[0]
    var v69: s0 = v20
    let v100: [[Double]] = v20.p1
    v99 = v101
    v20.p1 = v60
    v11.p1 = v105
    let v87: s0 = v118[0]
    let v67: s0 = v50[0]
    v18.p1 = v60
    v6.p1 = v26
    let v113: [[Double]] = v99.p0
    v20.p1 = v26
    let v103: [s0] = [v87, v11, v69]
    v118[0] = v6
    v65[0] = v144
    v118[0] = v67
    v69.p1 = v100
    v6.p0 = v113
    var v194: [s0] = v103
    var v110: [s0] = v194
    let v135: s0 = v110[2]
    return v135
  }
  func f19(_ v0: s0) -> s0 {
    let v18: s0 = f22(v0)
    let v9: s0 = f22(v18)
    let v22: s0 = f22(v9)
    let v70: s0 = f22(v22)
    return v70
  }
  func f16(_ v0: s0) -> s0 {
    let v5: s0 = f22(v0)
    let v2: s0 = f22(v5)
    let v3: s0 = f22(v2)
    let v6: [[Double]] = v2.p1
    let v8: [[Double]] = v2.p1
    let v4: s0 = f19(v3)
    let v1: [Double] = v8[0]
    var v14: [[Double]] = v8
    let v20: [[Double]] = v4.p0
    var v12: s0 = v5
    v12.p0 = v20
    v12.p1 = v14
    var v13: [[Double]] = v20
    v14[0] = v1
    v12.p1 = v6
    let v18: s0 = s0(p0: v20, p1: v6)
    let v29: [[Double]] = v12.p1
    let v21: s0 = s0(p0: v13, p1: v14)
    let v26: s0 = f22(v5)
    var v30: s0 = v18
    let v48: [[Double]] = v30.p1
    let v33: [Double] = v13[1]
    let v73: [[Double]] = v21.p1
    let v22: [[Double]] = v30.p0
    v12.p1 = v73
    v13[0] = v33
    var v55: s0 = v26
    let v39: s0 = f22(v55)
    v55.p1 = v29
    var v90: [[Double]] = v8
    v55.p0 = v22
    let v76: s0 = f19(v39)
    let v102: [[Double]] = v21.p1
    v30.p1 = v48
    v55.p1 = v90
    v30.p1 = v102
    return v76
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [s1], _ v2: s1, _ v3: Double) -> Double {
    let v4: [s0] = v2.p0
    let v10: s1 = v1[0]
    var v11: s1 = v10
    let v13: [s0] = v10.p0
    let v20: s0 = v11.p1
    v11.p0 = v13
    v11.p0 = v4
    let v44: s0 = f16(v20)
    let v70: [[Double]] = v44.p1
    let v56: [Double] = v70[0]
    var v128: [Double] = v56
    let v48: Double = v128[0]
    return v48
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]))
    let v1: [s1] = [s1(p0: [s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])], p1: s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]))]
    let v2: s1 = s1(p0: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]]), s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])], p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]))
    let v3: Double = 45.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 45.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
