  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s3 {
    var p0: s2
    var p1: s2
  }
  struct s7 {
    var p0: s1
    var p1: [s3]
  }
  func f70(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p0
    var v2: [[Double]] = v1
    let v4: [Double] = v1[0]
    let v5: Double = v4[0]
    let v6: [Double] = v2[1]
    let v7: [Double] = v1[0]
    v2[1] = v7
    var v15: Double = v5
    var v27: Double = v5
    var v17: [Double] = v6
    let v9: Double = v27 + v27
    let v10: Double = v9 / v15
    v2[0] = v7
    let v14: [Double] = v0.p1
    v2[1] = v14
    let v40: [[Double]] = v0.p0
    let v24: s0 = s0(p0: v40, p1: v17)
    let v26: Double = v15 + v27
    var v23: Double = v26
    let v66: Double = v4[0]
    v17[0] = v26
    let v32: s0 = s0(p0: v2, p1: v4)
    v17[0] = v66
    let v57: [[Double]] = v32.p0
    var v63: s0 = v24
    v63.p0 = v2
    v17[0] = v23
    v15 = v10
    v63.p0 = v57
    return v63
  }
  func f68(_ v0: s0) -> s0 {
    var v2: s0 = v0
    let v3: [[Double]] = v2.p0
    let v4: [Double] = v3[1]
    let v5: s0 = f70(v0)
    let v7: [Double] = v3[0]
    let v1: [Double] = v5.p1
    let v9: [[Double]] = v5.p0
    var v8: [[Double]] = v3
    v2.p0 = v9
    let v6: [Double] = v3[1]
    let v10: s0 = f70(v0)
    let v17: [Double] = v10.p1
    v2.p1 = v1
    let v11: Double = v1[0]
    let v15: [[Double]] = v0.p0
    var v13: [[Double]] = v3
    let v18: [Double] = v5.p1
    v2.p0 = v3
    let v14: s0 = f70(v0)
    v2.p1 = v17
    v13[1] = v6
    let v22: s0 = s0(p0: v8, p1: v4)
    v2.p1 = v17
    let v31: s0 = f70(v2)
    let v23: s0 = f70(v0)
    let v43: s0 = f70(v31)
    var v24: [Double] = v1
    let v21: Double = v18[0]
    v8[1] = v7
    let v25: [[Double]] = v22.p0
    var v27: s0 = v23
    let v39: s0 = f70(v2)
    let v28: [Double] = v0.p1
    let v29: Double = v24[0]
    let v35: [[Double]] = v39.p0
    v2.p1 = v4
    v27.p0 = v8
    let v46: s0 = f70(v43)
    v13[0] = v28
    let v59: [Double] = v35[0]
    v2.p0 = v13
    var v48: [[Double]] = v13
    let v52: [Double] = v48[0]
    let v51: [[Double]] = v2.p0
    let v122: s0 = f70(v23)
    v27.p1 = v28
    var v33: [[Double]] = v9
    v27.p0 = v25
    let v60: [Double] = v122.p1
    let v65: [[Double]] = v10.p0
    let v92: [Double] = v2.p1
    var v40: [Double] = v7
    let v133: [Double] = v46.p1
    let v78: s0 = f70(v27)
    v13[0] = v133
    v33[0] = v40
    let v93: s0 = f70(v2)
    var v90: [[Double]] = v8
    let v66: s0 = f70(v0)
    v27.p1 = v28
    let v49: [Double] = v51[1]
    var v71: [Double] = v18
    let v44: [[Double]] = [v52, v59, v71, v24]
    let v72: [Double] = v93.p1
    let v85: [Double] = v44[0]
    v90[1] = v85
    v2.p1 = v40
    v27.p0 = v15
    v48[0] = v40
    var v57: [Double] = v72
    let v83: [Double] = v65[1]
    v48[0] = v57
    let v150: Double = v92[0]
    let v63: s0 = f70(v14)
    v2.p0 = v3
    v71[0] = v150
    var v117: Double = v11
    let v107: Double = v83[0]
    v24[0] = v29
    v27.p1 = v7
    v27.p0 = v90
    v90 = v8
    v27.p1 = v60
    v27.p0 = v15
    var v219: [[Double]] = v35
    v27.p0 = v8
    var v165: [[Double]] = v33
    let v469: [[Double]] = v66.p0
    let v115: [Double] = v63.p1
    v57 = v49
    v27.p1 = v17
    v40[0] = v21
    v71[0] = v117
    v27.p0 = v219
    let v211: s0 = f70(v78)
    v40[0] = v107
    v27.p0 = v469
    v27.p1 = v115
    v2.p0 = v165
    v2.p0 = v33
    return v211
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s7, _ v2: Double) -> Double {
    let v9: s1 = v1.p0
    let v5: [s1] = [v9]
    let v12: s1 = v5[0]
    let v14: [s0] = v12.p0
    let v35: s0 = v14[0]
    let v52: s0 = f68(v35)
    let v38: [[Double]] = v52.p0
    let v97: [Double] = v38[1]
    var v155: [[Double]] = v38
    let v27: [Double] = v155[0]
    v155[1] = v97
    let v71: Double = v27[0]
    return v71
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: s0(p0: [[0.0], [1.0]], p1: [2.0]), p1: [[s0(p0: [[3.0], [4.0]], p1: [5.0])]]), p1: s2(p0: s0(p0: [[6.0], [7.0]], p1: [8.0]), p1: [[s0(p0: [[9.0], [10.0]], p1: [11.0])]]))
    let v1: s7 = s7(p0: s1(p0: [s0(p0: [[12.0], [13.0]], p1: [14.0])], p1: s0(p0: [[15.0], [16.0]], p1: [17.0])), p1: [s3(p0: s2(p0: s0(p0: [[18.0], [19.0]], p1: [20.0]), p1: [[s0(p0: [[21.0], [22.0]], p1: [23.0])]]), p1: s2(p0: s0(p0: [[24.0], [25.0]], p1: [26.0]), p1: [[s0(p0: [[27.0], [28.0]], p1: [29.0])]])), s3(p0: s2(p0: s0(p0: [[30.0], [31.0]], p1: [32.0]), p1: [[s0(p0: [[33.0], [34.0]], p1: [35.0])]]), p1: s2(p0: s0(p0: [[36.0], [37.0]], p1: [38.0]), p1: [[s0(p0: [[39.0], [40.0]], p1: [41.0])]]))])
    let v2: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
