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
    var p0: s1
    var p1: s1
    var p2: s0
  }
  struct s7 {
    var p0: s2
    var p1: s1
  }
  func f38(_ v0: [s1]) -> [s1] {
    let v1: s1 = v0[1]
    var v4: s1 = v1
    let v6: s1 = v0[1]
    let v8: s1 = v0[1]
    let v3: s1 = v0[1]
    let v7: s0 = v3.p1
    let v9: [[Double]] = v7.p1
    let v21: [[Double]] = v7.p1
    let v25: s1 = v0[2]
    let v18: s0 = v4.p0
    var v39: [s1] = v0
    v39[2] = v25
    let v22: s0 = s0(p0: v9, p1: v21)
    var v46: [s1] = v0
    let v60: s0 = v4.p1
    let v29: s1 = v39[2]
    let v41: s0 = v8.p0
    v4.p1 = v18
    var v37: [s1] = v0
    var v57: [s1] = v37
    v4.p1 = v60
    v4.p1 = v41
    var v47: [s1] = v39
    v47[0] = v6
    let v76: [s1] = [v8, v6]
    let v28: s1 = v46[0]
    v37[1] = v4
    let v79: s1 = v76[0]
    let v73: s1 = v76[0]
    var v113: [s1] = v76
    var v126: [s1] = v113
    let v43: s0 = v29.p0
    var v72: [s1] = v57
    v4.p1 = v7
    v72[0] = v8
    var v81: [s1] = v72
    let v130: s1 = v47[0]
    v72[1] = v28
    let v134: s1 = v126[1]
    let v127: s1 = v72[0]
    v4.p1 = v22
    v57[2] = v134
    v37[0] = v73
    v46[0] = v73
    v47[1] = v127
    v57 = v81
    let v218: [[s1]] = [v0, v47, v72, v81, v57, v47]
    v4.p0 = v43
    v37[2] = v79
    v37[2] = v130
    let v186: [s1] = v218[2]
    return v186
  }
  func f23(_ v0: s1) -> s1 {
    let v1: s0 = v0.p1
    let v8: [[Double]] = v1.p1
    let v5: s0 = s0(p0: v8, p1: v8)
    var v2: s0 = v5
    var v9: s0 = v2
    var v14: s0 = v1
    var v10: s1 = v0
    let v11: [[Double]] = v14.p1
    v14 = v1
    var v19: s1 = v10
    var v24: s0 = v14
    let v22: s0 = v0.p1
    let v36: s0 = v19.p0
    var v18: s0 = v36
    let v17: [[Double]] = v36.p1
    var v27: s1 = v0
    var v50: s0 = v24
    v14.p0 = v11
    let v65: [[Double]] = v22.p0
    v9.p0 = v17
    v14.p0 = v11
    v2.p0 = v65
    let v53: s0 = v0.p1
    v2.p0 = v17
    let v35: [[Double]] = v53.p1
    v19 = v10
    v18.p0 = v35
    v10.p0 = v18
    v2.p1 = v35
    var v58: [[Double]] = v8
    v18.p0 = v35
    v50 = v24
    v18.p0 = v58
    v27.p1 = v50
    let v56: s3 = s3(p0: v27, p1: v27, p2: v9)
    v14.p1 = v11
    let v63: s1 = v56.p1
    return v63
  }
  func f16(_ v0: s2) -> s2 {
    var v4: s2 = v0
    var v6: s2 = v4
    let v5: s0 = v4.p1
    let v9: [[Double]] = v5.p1
    let v3: s0 = s0(p0: v9, p1: v9)
    v6.p1 = v3
    v4.p1 = v3
    return v6
  }
  func f1(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v4: s1 = s1(p0: v0, p1: v7)
    let v3: s1 = f23(v4)
    let v1: s1 = f23(v3)
    var v2: s0 = v0
    let v6: s1 = f23(v1)
    var v9: s0 = v2
    var v10: s0 = v0
    let v20: s1 = f23(v3)
    let v13: s1 = f23(v6)
    let v5: s1 = f23(v13)
    let v11: [[Double]] = v0.p1
    v9.p0 = v11
    v7.p0 = v11
    var v18: s1 = v4
    let v12: s1 = f23(v1)
    let v22: s0 = s0(p0: v11, p1: v11)
    var v27: s0 = v2
    let v14: s1 = f23(v18)
    var v19: [[Double]] = v11
    let v16: s1 = f23(v18)
    v2.p0 = v19
    let v33: [Double] = v11[0]
    var v45: [Double] = v33
    let v55: s0 = v20.p0
    let v42: [Double] = v11[0]
    let v34: [[Double]] = v27.p0
    let v44: [s1] = [v5, v12, v16]
    v10 = v22
    let v52: Double = v42[0]
    v9.p1 = v34
    let v39: [[Double]] = v10.p1
    let v43: [[Double]] = v9.p1
    var v62: [[Double]] = v34
    var v66: [s1] = v44
    let v90: s1 = f23(v14)
    v19[0] = v33
    let v69: [[Double]] = v0.p0
    let v51: [s1] = f38(v66)
    v45[0] = v52
    v19[0] = v45
    v2.p0 = v69
    let v82: [[s1]] = [v66, v51, v66, v66]
    let v102: [Double] = v11[0]
    v66[1] = v18
    var v54: [[s1]] = v82
    v7.p0 = v39
    v2.p0 = v19
    var v172: [s1] = v51
    v66[1] = v90
    let v145: s0 = v16.p1
    let v97: [s1] = v54[1]
    var v151: [Double] = v102
    v18.p0 = v55
    v2.p1 = v69
    v66 = v172
    v172 = v97
    v7.p1 = v62
    v18.p0 = v145
    v10.p0 = v34
    let v118: s1 = v172[2]
    v45 = v151
    let v163: s0 = v118.p0
    v2.p1 = v43
    v10.p1 = v39
    return v163
  }
  @inline(never)
  func f0(_ v0: s7, _ v1: Double) -> Double {
    let v6: s2 = v0.p0
    let v5: s2 = f16(v6)
    let v2: s2 = f16(v5)
    let v3: s2 = f16(v6)
    let v13: s2 = f16(v5)
    var v10: s2 = v2
    let v18: [s0] = v2.p0
    let v20: s2 = f16(v2)
    let v9: s2 = f16(v10)
    v10.p0 = v18
    var v40: s2 = v20
    v10.p0 = v18
    let v26: s2 = f16(v13)
    let v19: s0 = v18[0]
    var v31: s2 = v26
    let v30: s0 = v18[0]
    let v22: [s0] = v9.p0
    let v35: s0 = v22[1]
    let v44: s0 = f1(v35)
    let v24: [[Double]] = v19.p0
    let v59: s0 = f1(v35)
    let v28: [[Double]] = v35.p0
    let v25: [[Double]] = v30.p1
    let v23: [Double] = v25[0]
    let v56: s0 = f1(v44)
    v31 = v40
    let v37: s0 = f1(v56)
    v10.p1 = v35
    let v53: [[Double]] = v59.p0
    let v38: [Double] = v24[0]
    let v76: [s0] = v6.p0
    let v72: s0 = f1(v37)
    v31.p1 = v72
    v10.p0 = v76
    let v65: [s0] = v3.p0
    let v82: [Double] = v28[0]
    let v132: [Double] = v53[0]
    let v79: [[Double]] = v30.p0
    let v176: [Double] = v79[0]
    let v192: [[Double]] = [v38, v23, v23, v176, v38, v132, v82]
    let v171: s0 = v65[0]
    v40.p1 = v171
    let v174: [s0] = v31.p0
    let v156: [Double] = v192[6]
    let v154: Double = v156[0]
    v10.p0 = v174
    return v154
  }
  func benchmark() {
    let v0: s7 = s7(p0: s2(p0: [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]])], p1: s0(p0: [[4.0]], p1: [[5.0]])), p1: s1(p0: s0(p0: [[6.0]], p1: [[7.0]]), p1: s0(p0: [[8.0]], p1: [[9.0]])))
    let v1: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
