  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: s0
  }
  func f40(_ v0: s1) -> s1 {
    var v1: s1 = v0
    let v2: s0 = v0.p0
    var v4: s1 = v1
    let v8: s0 = v0.p0
    v4.p1 = v8
    v1 = v4
    v4.p1 = v8
    v4.p1 = v2
    let v6: s0 = v4.p0
    var v3: s0 = v8
    let v5: [[Double]] = v2.p0
    let v7: s0 = v1.p1
    v3.p0 = v5
    let v9: s0 = v4.p1
    let v14: [s0] = [v7]
    let v38: s0 = v0.p0
    v4.p1 = v6
    var v21: s1 = v1
    let v20: [s0] = [v6, v38, v3, v2, v3, v38, v6]
    var v17: s1 = v21
    let v24: s0 = v4.p0
    var v59: [s0] = v14
    var v42: [s0] = v20
    v4.p0 = v38
    v59[0] = v9
    let v58: s0 = v20[6]
    let v48: s0 = v1.p1
    var v68: s0 = v24
    var v43: [s0] = v14
    let v32: s0 = v17.p0
    let v149: s0 = v59[0]
    let v57: s0 = v43[0]
    let v85: s0 = v0.p1
    v43[0] = v6
    v59[0] = v68
    v17.p1 = v8
    v43[0] = v149
    v17.p1 = v57
    let v65: s0 = v42[3]
    v17.p1 = v85
    let v91: s0 = v59[0]
    v1.p1 = v24
    var v103: s1 = v1
    let v214: s0 = v103.p1
    v17.p0 = v48
    let v140: [[Double]] = v65.p1
    var v97: s0 = v91
    v3.p1 = v140
    v103.p1 = v9
    let v166: [[Double]] = v149.p1
    v17.p1 = v214
    let v74: [[Double]] = v2.p1
    v43[0] = v58
    v1.p0 = v32
    v97.p1 = v166
    v42[3] = v97
    v97.p1 = v74
    v103.p0 = v24
    return v103
  }
  func f34(_ v0: s0) -> s0 {
    return v0
  }
  func f33(_ v0: s1, _ v1: s3) -> s3 {
    let v2: s0 = v1.p0
    var v7: s0 = v2
    let v4: [[Double]] = v7.p1
    let v6: [[Double]] = v7.p1
    let v8: s0 = f34(v2)
    let v3: s1 = f40(v0)
    v7 = v2
    let v10: s0 = f34(v8)
    v7.p1 = v4
    v7 = v8
    let v16: s0 = f34(v10)
    v7.p1 = v4
    let v11: s0 = v1.p0
    var v21: s3 = v1
    let v34: [[Double]] = v11.p0
    let v28: s1 = f40(v3)
    let v31: [[Double]] = v7.p0
    let v30: s0 = s0(p0: v34, p1: v6)
    v21.p0 = v30
    let v37: s0 = f34(v30)
    v7.p0 = v31
    v21 = v1
    v21.p0 = v8
    let v116: s0 = f34(v16)
    v21.p0 = v116
    let v57: s0 = v28.p0
    v21.p0 = v57
    v21.p0 = v37
    return v21
  }
  func f31(_ v0: s1) -> s1 {
    let v4: s1 = f40(v0)
    let v3: s1 = f40(v0)
    var v6: s1 = v4
    let v5: s1 = f40(v0)
    let v1: s0 = v6.p0
    var v7: s0 = v1
    let v2: s1 = f40(v0)
    let v8: s0 = v3.p0
    var v11: s0 = v7
    let v10: [[Double]] = v8.p1
    let v17: s0 = f34(v7)
    var v12: [[Double]] = v10
    var v13: s1 = v5
    v13.p0 = v17
    let v20: s0 = f34(v17)
    let v18: [[Double]] = v17.p0
    let v38: s1 = f40(v2)
    let v24: [Double] = v18[1]
    let v19: s0 = v3.p0
    v13 = v5
    let v28: [[[Double]]] = [v18]
    v13.p1 = v20
    v12[0] = v24
    v12[0] = v24
    let v23: [[Double]] = v28[0]
    let v27: [Double] = v23[1]
    let v67: s0 = v38.p0
    v11.p0 = v23
    v13.p0 = v11
    v12[0] = v27
    v13.p1 = v67
    v12[0] = v27
    let v77: [[Double]] = v19.p1
    v11 = v67
    v7.p1 = v77
    v11.p1 = v12
    return v13
  }
  func f13(_ v0: s2) -> s2 {
    var v3: s2 = v0
    var v8: s2 = v3
    var v7: s2 = v3
    v7 = v8
    let v10: s0 = v0.p1
    v8.p1 = v10
    v7.p1 = v10
    var v14: s2 = v7
    return v14
  }
  func f9(_ v0: s0, _ v1: [s0]) -> s0 {
    let v2: s0 = f34(v0)
    let v19: [[Double]] = v0.p0
    let v4: s0 = f34(v2)
    let v12: s0 = f34(v4)
    let v11: [Double] = v19[1]
    let v22: s0 = f34(v12)
    let v23: s0 = f34(v12)
    let v25: s0 = f34(v0)
    let v30: s2 = s2(p0: v1, p1: v2)
    let v17: s0 = v1[0]
    var v34: [s0] = v1
    v34[0] = v25
    v34[0] = v0
    let v39: [[Double]] = v22.p0
    v34[0] = v25
    v34[0] = v0
    var v27: s0 = v23
    let v42: s2 = f13(v30)
    let v24: s2 = f13(v42)
    v34[0] = v12
    v27.p0 = v39
    let v61: s0 = v42.p1
    var v67: s2 = v42
    let v46: s0 = v67.p1
    let v58: s2 = f13(v24)
    let v52: [[Double]] = [v11]
    let v95: [s0] = [v4, v22, v12, v27, v4, v17]
    var v55: [s0] = v95
    v67.p0 = v34
    v34[0] = v17
    v67.p1 = v23
    v55[0] = v0
    var v128: [s0] = v34
    var v56: [s0] = v128
    var v72: [s0] = v56
    let v155: s0 = f34(v46)
    v56[0] = v61
    v128[0] = v4
    var v106: s2 = v58
    v34[0] = v22
    let v107: s0 = v106.p1
    v27.p1 = v52
    let v77: s0 = v55[3]
    v56[0] = v4
    v55[3] = v46
    v106.p1 = v17
    v106.p0 = v72
    v67.p1 = v77
    let v219: s0 = f34(v107)
    v106.p0 = v72
    v128[0] = v27
    v34[0] = v155
    return v219
  }
  func f6(_ v0: s3, _ v1: s3) -> s3 {
    let v7: s0 = v0.p0
    var v4: s0 = v7
    let v2: s0 = f34(v7)
    let v9: s0 = f34(v4)
    let v13: s0 = v0.p0
    let v8: [[Double]] = v2.p0
    let v19: [[Double]] = v7.p1
    var v12: s0 = v9
    var v14: s0 = v12
    var v20: [[Double]] = v8
    v12.p1 = v19
    var v29: s3 = v1
    let v30: [Double] = v19[0]
    let v33: [[[Double]]] = [v8, v20, v20, v20, v20, v20, v8]
    let v34: [[Double]] = v14.p0
    v12.p0 = v8
    var v17: [Double] = v30
    let v38: [[Double]] = v33[3]
    let v32: [[Double]] = v2.p1
    let v41: [Double] = v8[0]
    var v45: [[Double]] = v20
    v12.p0 = v38
    v20[1] = v17
    v29.p0 = v14
    let v59: [Double] = v20[0]
    v4.p0 = v34
    v20[0] = v59
    let v67: [Double] = v32[0]
    v14.p0 = v45
    v29.p0 = v13
    v45[1] = v67
    v20[0] = v41
    let v154: s1 = s1(p0: v13, p1: v7)
    v12.p0 = v20
    let v118: s3 = f33(v154, v29)
    let v64: s1 = f31(v154)
    var v219: s1 = v64
    let v222: s3 = f33(v219, v118)
    return v222
  }
  func f2(_ v0: s0) -> s0 {
    let v6: [s0] = [v0]
    var v1: s0 = v0
    let v8: s0 = f34(v1)
    var v2: s0 = v0
    let v3: s0 = v6[0]
    var v5: s0 = v0
    let v7: s0 = v6[0]
    var v4: [s0] = v6
    let v9: s0 = f34(v5)
    let v14: s0 = v4[0]
    v4[0] = v7
    var v10: s0 = v0
    let v21: [[Double]] = v8.p0
    var v23: [s0] = v6
    let v52: s0 = f9(v5, v23)
    let v30: [[Double]] = v3.p0
    v23[0] = v2
    let v22: [[Double]] = v14.p1
    let v39: [[Double]] = v52.p1
    let v49: s0 = f34(v9)
    let v29: s0 = v4[0]
    let v134: s0 = f34(v29)
    let v47: [[Double]] = v29.p0
    let v33: s3 = s3(p0: v0)
    let v73: s3 = f6(v33, v33)
    v1.p1 = v39
    var v100: s3 = v33
    let v62: s3 = s3(p0: v10)
    var v86: s3 = v33
    v100 = v62
    let v105: s1 = s1(p0: v49, p1: v134)
    v2.p1 = v22
    v10.p0 = v30
    let v88: s3 = f33(v105, v100)
    var v64: s3 = v86
    let v77: s1 = f31(v105)
    v10.p0 = v47
    var v106: [[Double]] = v21
    let v180: s3 = f33(v77, v73)
    let v115: s0 = v77.p0
    let v258: s3 = f6(v64, v88)
    v64.p0 = v115
    v10.p0 = v106
    var v211: s3 = v180
    v100.p0 = v10
    let v179: s3 = f6(v211, v258)
    let v214: s0 = v179.p0
    return v214
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v3: s0 = v0.p0
    let v26: s0 = f2(v3)
    let v34: [[Double]] = v26.p0
    let v16: [Double] = v34[0]
    let v20: Double = v16[0]
    return v20
  }
  func benchmark() {
    let v0: s3 = s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]))
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
