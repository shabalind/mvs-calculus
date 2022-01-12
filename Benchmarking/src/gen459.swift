  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: [[s0]]
  }
  struct s3 {
    var p0: [s2]
  }
  struct s4 {
    var p0: s1
    var p1: [[s3]]
  }
  func f42(_ v0: s0, _ v1: s3) -> s3 {
    var v17: s3 = v1
    return v17
  }
  func f39(_ v0: s0) -> s0 {
    let v1: [s0] = [v0]
    let v13: s0 = v1[0]
    let v10: s1 = s1(p0: v1, p1: v13)
    var v36: s1 = v10
    let v71: [s1] = [v36, v36, v10, v10, v10, v36]
    let v28: s1 = v71[4]
    let v38: s0 = v28.p1
    return v38
  }
  func f22(_ v0: s0) -> s0 {
    var v3: s0 = v0
    var v2: s0 = v3
    let v1: s0 = f39(v3)
    var v9: s0 = v1
    let v5: s0 = f39(v0)
    let v4: s0 = f39(v5)
    let v12: s0 = f39(v2)
    let v13: [[Double]] = v12.p1
    let v26: [s0] = [v9, v0, v5, v0, v4, v0]
    let v17: s0 = v26[2]
    let v27: [[Double]] = v3.p1
    let v30: [[Double]] = v9.p0
    let v32: [[Double]] = v5.p0
    var v51: [s0] = v26
    v2.p0 = v27
    v2.p1 = v30
    let v44: [[Double]] = v4.p0
    v2.p0 = v44
    v51 = v26
    let v62: [[Double]] = v17.p1
    v51[3] = v12
    v2.p0 = v13
    let v117: [[s0]] = [v26, v26, v51, v51, v26, v26]
    let v40: [[Double]] = v3.p1
    v3.p0 = v62
    let v122: [s0] = v117[0]
    v9.p0 = v44
    v3.p0 = v32
    v2.p0 = v40
    v3.p1 = v30
    let v78: s0 = v122[3]
    return v78
  }
  func f12(_ v0: Double, _ v1: s3) -> Double {
    var v4: s3 = v1
    v4 = v1
    let v2: [s2] = v4.p0
    var v6: [s2] = v2
    v4.p0 = v6
    let v7: [s2] = v4.p0
    let v8: [s2] = v4.p0
    let v13: s2 = v7[0]
    v4.p0 = v7
    let v9: s2 = v8[0]
    v6[0] = v13
    v6[0] = v9
    let v14: s2 = v6[0]
    let v26: [s2] = v4.p0
    let v18: [s2] = v4.p0
    let v15: [s2] = v1.p0
    let v10: s2 = v26[0]
    v4.p0 = v26
    v6[0] = v14
    let v20: s2 = v2[0]
    let v21: s3 = s3(p0: v18)
    let v34: s2 = v18[0]
    let v33: s2 = v18[0]
    var v19: [s2] = v18
    let v27: s2 = v6[0]
    var v30: s2 = v10
    var v16: s3 = v4
    let v54: s3 = s3(p0: v6)
    v4.p0 = v26
    let v29: [[s0]] = v27.p1
    v30.p1 = v29
    let v50: [[s2]] = [v6]
    let v43: s2 = v18[0]
    v19[0] = v20
    let v28: [[s0]] = v9.p1
    v6[0] = v20
    var v17: s3 = v16
    v19[0] = v9
    var v24: [[s0]] = v29
    var v35: [s2] = v19
    let v38: [s2] = v50[0]
    let v36: [s1] = v34.p0
    let v66: s2 = v35[0]
    let v45: [s2] = v17.p0
    let v65: s2 = v19[0]
    v16.p0 = v15
    v30.p1 = v28
    var v49: s2 = v30
    let v59: [s1] = v49.p0
    let v37: [s2] = v21.p0
    var v68: [s1] = v36
    let v39: [s2] = v54.p0
    let v67: s3 = s3(p0: v39)
    let v61: [s1] = v49.p0
    v19[0] = v33
    v6[0] = v33
    v17.p0 = v38
    v35[0] = v13
    v4.p0 = v39
    v49.p1 = v28
    v6[0] = v66
    let v53: s1 = v68[2]
    let v85: s1 = v59[1]
    let v41: [s0] = v53.p0
    v16.p0 = v2
    v30.p0 = v59
    let v130: [s1] = v27.p0
    v49.p0 = v61
    v17 = v67
    let v90: s1 = v59[0]
    v4.p0 = v38
    let v122: s2 = v38[0]
    let v120: s0 = v85.p1
    v17.p0 = v35
    v4.p0 = v45
    let v69: s0 = v90.p1
    v24[0] = v41
    let v71: s0 = f22(v69)
    v35[0] = v43
    let v104: s1 = v130[1]
    v68[1] = v104
    v30.p0 = v130
    let v72: s0 = f22(v120)
    v19[0] = v10
    let v142: s3 = f42(v72, v67)
    v16.p0 = v45
    v30.p1 = v24
    let v113: [[Double]] = v71.p1
    v19[0] = v122
    v4.p0 = v37
    v68[0] = v104
    let v134: [[s0]] = v13.p1
    v30.p1 = v134
    v30.p0 = v59
    let v105: [Double] = v113[0]
    v6[0] = v65
    v17 = v142
    let v402: Double = v105[0]
    return v402
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: [s0], _ v2: Double) -> Double {
    let v6: s0 = v1[0]
    let v7: [[Double]] = v6.p0
    let v23: [Double] = v7[0]
    let v14: Double = v23[0]
    let v21: s4 = v0[0]
    let v27: [[s3]] = v21.p1
    let v77: [s3] = v27[0]
    let v44: s3 = v77[0]
    let v40: Double = f12(v14, v44)
    return v40
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s1(p0: [s0(p0: [[0.0]], p1: [[1.0]])], p1: s0(p0: [[2.0]], p1: [[3.0]])), p1: [[s3(p0: [s2(p0: [s1(p0: [s0(p0: [[4.0]], p1: [[5.0]])], p1: s0(p0: [[6.0]], p1: [[7.0]])), s1(p0: [s0(p0: [[8.0]], p1: [[9.0]])], p1: s0(p0: [[10.0]], p1: [[11.0]])), s1(p0: [s0(p0: [[12.0]], p1: [[13.0]])], p1: s0(p0: [[14.0]], p1: [[15.0]]))], p1: [[s0(p0: [[16.0]], p1: [[17.0]])], [s0(p0: [[18.0]], p1: [[19.0]])]])])], [s3(p0: [s2(p0: [s1(p0: [s0(p0: [[20.0]], p1: [[21.0]])], p1: s0(p0: [[22.0]], p1: [[23.0]])), s1(p0: [s0(p0: [[24.0]], p1: [[25.0]])], p1: s0(p0: [[26.0]], p1: [[27.0]])), s1(p0: [s0(p0: [[28.0]], p1: [[29.0]])], p1: s0(p0: [[30.0]], p1: [[31.0]]))], p1: [[s0(p0: [[32.0]], p1: [[33.0]])], [s0(p0: [[34.0]], p1: [[35.0]])]])])]]), s4(p0: s1(p0: [s0(p0: [[36.0]], p1: [[37.0]])], p1: s0(p0: [[38.0]], p1: [[39.0]])), p1: [[s3(p0: [s2(p0: [s1(p0: [s0(p0: [[40.0]], p1: [[41.0]])], p1: s0(p0: [[42.0]], p1: [[43.0]])), s1(p0: [s0(p0: [[44.0]], p1: [[45.0]])], p1: s0(p0: [[46.0]], p1: [[47.0]])), s1(p0: [s0(p0: [[48.0]], p1: [[49.0]])], p1: s0(p0: [[50.0]], p1: [[51.0]]))], p1: [[s0(p0: [[52.0]], p1: [[53.0]])], [s0(p0: [[54.0]], p1: [[55.0]])]])])], [s3(p0: [s2(p0: [s1(p0: [s0(p0: [[56.0]], p1: [[57.0]])], p1: s0(p0: [[58.0]], p1: [[59.0]])), s1(p0: [s0(p0: [[60.0]], p1: [[61.0]])], p1: s0(p0: [[62.0]], p1: [[63.0]])), s1(p0: [s0(p0: [[64.0]], p1: [[65.0]])], p1: s0(p0: [[66.0]], p1: [[67.0]]))], p1: [[s0(p0: [[68.0]], p1: [[69.0]])], [s0(p0: [[70.0]], p1: [[71.0]])]])])]])]
    let v1: [s0] = [s0(p0: [[72.0]], p1: [[73.0]])]
    let v2: Double = 74.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 74.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
