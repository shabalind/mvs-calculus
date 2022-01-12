  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f37(_ v0: [s0]) -> [s0] {
    var v3: [s0] = v0
    var v6: [s0] = v3
    let v1: s0 = v6[1]
    let v4: s0 = v6[2]
    var v8: [s0] = v0
    var v13: s0 = v4
    var v10: s0 = v1
    v8[2] = v4
    let v7: [[Double]] = v4.p0
    let v5: s0 = s0(p0: v7)
    v10.p0 = v7
    v13.p0 = v7
    let v20: [[Double]] = v13.p0
    v3[0] = v1
    v8[1] = v5
    v3[0] = v10
    var v15: s0 = v10
    let v12: [[Double]] = v15.p0
    let v24: [[Double]] = v10.p0
    let v21: s0 = s0(p0: v7)
    v13.p0 = v12
    let v26: s0 = v0[2]
    let v27: [[Double]] = v10.p0
    var v25: [s0] = v8
    v13.p0 = v20
    v15.p0 = v24
    v8[1] = v26
    let v37: s0 = v25[0]
    let v55: [[Double]] = v21.p0
    let v100: s1 = s1(p0: v15, p1: v25)
    v8[1] = v5
    v6[1] = v13
    var v49: s0 = v4
    v15.p0 = v12
    let v48: [[Double]] = v26.p0
    var v38: s1 = v100
    v15.p0 = v48
    v15.p0 = v27
    v13.p0 = v55
    v38.p0 = v49
    v38.p1 = v25
    v8[1] = v37
    let v116: [s0] = v38.p1
    return v116
  }
  func f35(_ v0: s1) -> s1 {
    var v6: s1 = v0
    var v2: s1 = v6
    let v7: s0 = v6.p0
    var v1: s0 = v7
    v6.p0 = v7
    var v4: s0 = v1
    var v5: s0 = v1
    let v9: [s0] = v0.p1
    var v3: s0 = v7
    let v11: [s0] = f37(v9)
    var v10: s0 = v7
    let v8: [s0] = f37(v11)
    let v14: [[Double]] = v5.p0
    v3 = v4
    let v21: [s0] = v0.p1
    var v17: s1 = v0
    v4.p0 = v14
    var v20: s1 = v17
    let v61: s0 = s0(p0: v14)
    let v37: [[Double]] = v5.p0
    let v36: [s1] = [v6, v17, v20, v20, v6]
    let v62: [Double] = v14[2]
    var v16: [[Double]] = v14
    v17 = v2
    v16[0] = v62
    v1.p0 = v16
    let v24: [[Double]] = v10.p0
    let v23: [Double] = v16[1]
    v20.p1 = v9
    var v48: [[Double]] = v24
    v48[0] = v62
    let v27: [Double] = v48[2]
    v10.p0 = v37
    let v54: [s0] = f37(v8)
    v5.p0 = v14
    var v25: [[Double]] = v14
    let v43: s1 = v36[2]
    v16[1] = v27
    let v47: [s0] = f37(v21)
    let v45: [[Double]] = v5.p0
    v2 = v43
    v10.p0 = v14
    v16 = v48
    v2.p1 = v47
    v5.p0 = v45
    let v51: [[Double]] = v61.p0
    var v46: [[Double]] = v37
    v1.p0 = v51
    var v215: [s1] = v36
    v20.p1 = v9
    v2.p0 = v10
    v46[0] = v23
    var v76: [[Double]] = v46
    v4.p0 = v14
    v46 = v25
    v10.p0 = v76
    let v156: s1 = v36[0]
    v17.p1 = v54
    v215[3] = v156
    let v104: s1 = v215[3]
    v25[1] = v62
    v16[1] = v23
    v20.p0 = v3
    return v104
  }
  func f32(_ v0: s1) -> s1 {
    var v4: s1 = v0
    let v8: s1 = f35(v0)
    let v7: s0 = v4.p0
    var v9: s0 = v7
    let v3: s0 = v4.p0
    let v1: s1 = f35(v4)
    var v5: s0 = v7
    v4.p0 = v9
    v4.p0 = v7
    v4.p0 = v7
    var v6: s1 = v1
    v4.p0 = v3
    let v18: s0 = v4.p0
    let v13: [[Double]] = v3.p0
    let v12: [Double] = v13[1]
    var v16: [Double] = v12
    var v14: [Double] = v16
    let v11: [Double] = v13[2]
    let v27: [[Double]] = v9.p0
    var v30: [[Double]] = v27
    v5.p0 = v27
    var v17: s0 = v5
    var v24: s1 = v4
    v30[1] = v14
    let v20: s1 = f35(v8)
    var v19: [Double] = v12
    let v23: Double = v11[0]
    let v22: s0 = s0(p0: v13)
    v17.p0 = v13
    let v32: [Double] = v13[0]
    let v43: [Double] = v13[2]
    let v49: Double = v19[0]
    let v37: [[Double]] = v22.p0
    let v50: [[Double]] = v18.p0
    let v56: [s0] = v20.p1
    let v35: [[Double]] = v9.p0
    let v118: [s0] = f37(v56)
    let v39: s1 = f35(v24)
    v16[0] = v23
    v30[1] = v14
    v5.p0 = v30
    v9.p0 = v37
    let v59: s0 = v56[0]
    v19[0] = v23
    let v61: [s0] = f37(v56)
    let v70: s0 = v6.p0
    v6.p1 = v61
    let v76: [s0] = [v17, v22]
    v4.p0 = v70
    let v40: [[Double]] = v59.p0
    v14[0] = v49
    let v82: [s0] = f37(v61)
    v4.p0 = v7
    let v134: [s0] = f37(v56)
    let v71: s0 = v118[0]
    let v160: s1 = f35(v39)
    v9.p0 = v35
    v30[2] = v43
    v9.p0 = v40
    v24.p0 = v9
    v6.p1 = v82
    let v123: Double = v11[0]
    let v72: Double = v32[0]
    v30[1] = v32
    let v92: s0 = v76[1]
    v14[0] = v72
    let v162: s0 = v134[0]
    v30[1] = v16
    let v129: Double = v19[0]
    v6.p1 = v134
    v19[0] = v72
    let v154: [s0] = f37(v118)
    v14[0] = v72
    v17.p0 = v50
    v14[0] = v129
    let v125: [[Double]] = v71.p0
    v24.p1 = v118
    v24.p1 = v134
    v24.p0 = v92
    v14[0] = v123
    v24.p0 = v162
    v17.p0 = v125
    v6.p1 = v154
    return v160
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v5: s1 = v0
    let v6: [s0] = v5.p1
    let v2: [s0] = v0.p1
    let v11: [s0] = f37(v6)
    let v3: s1 = f32(v5)
    let v4: s0 = v11[0]
    let v8: [[Double]] = v4.p0
    let v13: s0 = v2[0]
    var v14: [[Double]] = v8
    let v34: [Double] = v14[2]
    let v12: s0 = v2[0]
    v5 = v3
    v14[0] = v34
    let v41: [[Double]] = v13.p0
    let v17: [s0] = v3.p1
    let v24: [Double] = v41[2]
    v14[1] = v34
    let v20: s0 = v11[0]
    v5.p0 = v20
    let v30: s0 = v17[0]
    v5.p0 = v30
    var v26: Double = v1
    var v82: [s0] = v17
    v14[1] = v24
    v14[0] = v24
    v5.p0 = v12
    let v98: Double = v34[0]
    v5.p1 = v2
    v5.p1 = v82
    var v97: Double = v26
    let v206: Double = v97 / v98
    return v206
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]]), p1: [s0(p0: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0], [8.0]]), s0(p0: [[9.0], [10.0], [11.0]])])
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
