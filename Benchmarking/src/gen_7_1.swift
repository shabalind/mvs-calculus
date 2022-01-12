  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [Double]
  }
  func f27(_ v0: s0, _ v1: [s0], _ v2: s0, _ v3: s0) -> s0 {
    var v8: [s0] = v1
    v8[2] = v2
    let v7: s0 = v8[2]
    let v6: [s0] = [v7, v0, v2, v3, v3, v0, v2]
    v8 = v1
    let v9: s0 = v6[2]
    v8[2] = v9
    var v23: [s0] = v6
    var v20: [s0] = v23
    v23 = v6
    v23[1] = v2
    var v45: [s0] = v8
    let v50: s0 = v45[1]
    v8 = v45
    let v84: [[s0]] = [v20, v20, v6]
    var v49: [s0] = v6
    var v58: [[s0]] = v84
    let v114: [[[s0]]] = [v58]
    var v95: [[[s0]]] = v114
    let v94: [[s0]] = v95[0]
    var v117: [s0] = v49
    let v113: [s0] = v94[0]
    v58[0] = v117
    v49[1] = v7
    let v180: s0 = v113[5]
    v49[1] = v50
    return v180
  }
  func f25(_ v0: s0) -> s0 {
    var v5: s0 = v0
    let v7: [Double] = v5.p1
    let v8: [Double] = v0.p0
    var v2: [Double] = v8
    var v3: [Double] = v2
    var v1: [Double] = v8
    let v9: [Double] = v0.p1
    let v4: Double = v1[0]
    v5 = v0
    v5.p0 = v8
    v5.p0 = v2
    v1[0] = v4
    v5.p1 = v1
    let v6: Double = v7[0]
    var v12: [Double] = v1
    let v22: Double = v2[0]
    v12[0] = v22
    let v24: Double = v12[0]
    v12[0] = v22
    var v13: Double = v24
    var v33: Double = v13
    v5.p1 = v12
    v5 = v0
    var v19: [Double] = v3
    let v38: Double = v2[0]
    let v23: [Double] = v0.p0
    var v31: s0 = v5
    v5.p1 = v12
    var v27: s0 = v0
    v27.p0 = v7
    let v59: [Double] = v0.p1
    let v61: [Double] = v31.p1
    let v20: Double = v23[0]
    let v34: [Double] = v5.p1
    v33 = v13
    v27 = v31
    let v32: [Double] = v0.p1
    let v46: Double = v59[0]
    let v42: [Double] = v0.p0
    v27.p0 = v42
    let v41: Double = v61[0]
    let v54: Double = v9[0]
    v2[0] = v46
    let v57: Double = v12[0]
    let v120: [Double] = v5.p1
    v5.p1 = v32
    let v75: [Double] = v31.p0
    v3[0] = v6
    v5.p1 = v120
    v3[0] = v46
    var v47: [Double] = v2
    v19[0] = v54
    v5.p0 = v19
    v31.p1 = v34
    v5.p1 = v23
    v12[0] = v57
    let v79: [Double] = [v20, v41, v33]
    let v103: [Double] = v27.p0
    let v179: [Double] = v27.p0
    v27.p1 = v47
    v5.p0 = v23
    let v185: [Double] = v31.p0
    v27.p1 = v103
    var v141: [Double] = v7
    var v97: s0 = v0
    let v176: [Double] = v97.p0
    v27.p0 = v120
    v31.p1 = v75
    var v76: [Double] = v79
    v47[0] = v38
    v31.p1 = v185
    let v306: Double = v76[2]
    let v208: Double = v306 * v24
    let v276: [[Double]] = [v179, v9]
    var v160: [[Double]] = v276
    let v214: [Double] = v160[1]
    v27.p1 = v141
    v19[0] = v41
    v97.p1 = v214
    v27.p0 = v176
    v3[0] = v208
    return v27
  }
  func f7(_ v0: s0) -> s0 {
    let v5: s0 = f25(v0)
    var v4: s0 = v5
    var v3: s0 = v4
    let v7: [Double] = v3.p1
    let v11: s0 = s0(p0: v7, p1: v7)
    v3 = v4
    let v14: s0 = f25(v11)
    return v14
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s0], _ v2: Double) -> Double {
    let v5: s0 = f27(v0, v1, v0, v0)
    let v3: s0 = f7(v5)
    let v12: [Double] = v3.p0
    let v9: [Double] = v5.p0
    let v18: s0 = s0(p0: v12, p1: v9)
    let v39: [Double] = v18.p1
    let v42: Double = v39[0]
    return v42
  }
  func benchmark() {
    let v0: s0 = s0(p0: [0.0], p1: [1.0])
    let v1: [s0] = [s0(p0: [2.0], p1: [3.0]), s0(p0: [4.0], p1: [5.0]), s0(p0: [6.0], p1: [7.0])]
    let v2: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
