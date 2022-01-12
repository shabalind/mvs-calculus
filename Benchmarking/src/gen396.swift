  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: [[s0]]
  }
  func f72(_ v0: [[s0]]) -> [[s0]] {
    let v6: [s0] = v0[0]
    let v7: s0 = v6[0]
    let v3: [s0] = v0[0]
    var v9: s0 = v7
    let v12: [[Double]] = v7.p0
    let v2: [s0] = v0[0]
    let v1: [[Double]] = v9.p1
    var v4: [s0] = v2
    let v13: s0 = v3[0]
    let v10: [[Double]] = v13.p0
    var v5: [s0] = v3
    let v16: s0 = v6[0]
    v4[0] = v7
    var v20: s0 = v9
    v9 = v20
    v9.p1 = v12
    var v23: s0 = v13
    v20.p1 = v12
    var v35: s0 = v7
    let v29: [[Double]] = v35.p0
    let v31: [s0] = v0[0]
    let v17: s0 = v5[0]
    v20.p1 = v12
    var v43: s0 = v13
    var v59: [[Double]] = v29
    v35.p1 = v59
    let v58: s1 = s1(p0: v4, p1: v23)
    let v78: [[Double]] = v16.p0
    var v66: s1 = v58
    let v64: [s0] = v66.p0
    let v76: s0 = s0(p0: v1, p1: v59)
    v4[0] = v43
    v9.p1 = v29
    let v57: [[Double]] = v76.p0
    var v60: [[Double]] = v57
    let v97: [s0] = v58.p0
    let v51: s0 = v31[0]
    let v149: s0 = v97[0]
    v23.p0 = v1
    v5[0] = v51
    let v68: [Double] = v10[1]
    v23.p1 = v60
    v43.p1 = v1
    let v133: [[Double]] = v9.p1
    v60 = v57
    let v70: [[Double]] = v16.p1
    v9.p1 = v133
    var v124: [[s0]] = v0
    let v55: [[Double]] = v43.p0
    let v85: [[Double]] = v149.p0
    v5[0] = v35
    v20.p0 = v70
    let v108: [[Double]] = v76.p1
    v20.p0 = v55
    v59[2] = v68
    v124[1] = v64
    v35.p1 = v57
    v4[0] = v17
    v5[0] = v20
    v20.p0 = v85
    v35.p0 = v108
    v66.p0 = v97
    v9.p0 = v108
    v23.p1 = v78
    return v124
  }
  func f66(_ v0: [s1]) -> [s1] {
    var v5: [s1] = v0
    let v8: s1 = v0[0]
    let v6: s1 = v0[0]
    var v3: s1 = v6
    let v4: [s0] = v3.p0
    let v1: s1 = v5[0]
    var v11: [s1] = v5
    let v2: [s0] = v8.p0
    v3.p0 = v4
    let v10: s0 = v8.p1
    let v15: s0 = v1.p1
    v11[0] = v1
    let v17: s1 = v5[0]
    v5[0] = v17
    let v22: [s1] = [v8]
    v11[0] = v17
    v3.p0 = v2
    v5[0] = v3
    let v38: s0 = v6.p1
    v3.p1 = v38
    v3.p1 = v15
    v3.p1 = v10
    let v34: s1 = v0[0]
    v5[0] = v3
    let v56: s1 = v0[0]
    let v36: s0 = v34.p1
    v3.p1 = v36
    v3.p0 = v4
    v5 = v22
    let v42: s0 = v56.p1
    v3.p1 = v36
    v5[0] = v8
    v3.p1 = v42
    v11[0] = v34
    return v11
  }
  func f4(_ v0: s3) -> s3 {
    return v0
  }
  func f2(_ v0: s3) -> s3 {
    var v6: s3 = v0
    let v1: [s1] = v0.p0
    let v4: [s3] = [v6, v6]
    let v9: s3 = f4(v6)
    let v7: [s1] = f66(v1)
    let v3: s1 = v1[0]
    let v10: [s1] = f66(v7)
    let v18: s3 = f4(v6)
    var v2: [s3] = v4
    let v8: s1 = v10[0]
    let v11: [s1] = [v8, v8, v3, v8]
    let v16: s1 = v11[0]
    var v12: [s1] = v7
    let v19: [[s0]] = v9.p1
    var v31: [[s0]] = v19
    let v44: [s0] = v16.p0
    let v29: s3 = s3(p0: v7, p1: v19)
    let v50: [s1] = f66(v12)
    let v33: s0 = v44[0]
    let v38: [s0] = v31[1]
    var v43: s1 = v3
    let v24: [[s0]] = f72(v19)
    let v45: [[s0]] = f72(v31)
    let v32: [s1] = f66(v50)
    let v85: s3 = v4[0]
    var v71: s3 = v85
    v12[0] = v43
    let v36: [s1] = f66(v10)
    let v39: [[s0]] = f72(v24)
    v12[0] = v43
    let v61: s3 = v2[1]
    v2[1] = v18
    v6.p0 = v12
    let v54: [s1] = f66(v7)
    let v115: [s1] = v29.p0
    var v56: [s0] = v38
    v2[1] = v9
    let v89: [[s0]] = v71.p1
    v6.p1 = v89
    v6.p0 = v36
    v31[0] = v56
    let v80: [[s1]] = [v10, v10, v54, v32, v50, v115, v36]
    let v102: [s1] = v80[5]
    v71.p0 = v102
    v71.p1 = v39
    v56[0] = v33
    v71.p1 = v45
    return v61
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v3: s3 = v0[1]
    let v12: Double = v1 * v1
    let v8: s3 = f2(v3)
    let v2: [Double] = [v1, v12, v12, v12]
    let v13: s3 = f4(v8)
    let v11: [[s0]] = v13.p1
    var v24: Double = v12
    var v9: Double = v12
    var v30: [Double] = v2
    v30[1] = v1
    v30[3] = v24
    let v10: Double = v30[2]
    v30[2] = v9
    let v43: [s0] = v11[0]
    let v36: s0 = v43[0]
    v9 = v10
    let v96: [[Double]] = v36.p1
    let v69: [Double] = v96[0]
    let v99: Double = v69[0]
    v30[2] = v99
    return v10
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])], p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]]))], p1: [[s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]])], [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])], [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]]), s3(p0: [s1(p0: [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])], p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]]))], p1: [[s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0], [47.0]])], [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]])], [s0(p0: [[54.0], [55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])]]), s3(p0: [s1(p0: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0], [64.0], [65.0]])], p1: s0(p0: [[66.0], [67.0], [68.0]], p1: [[69.0], [70.0], [71.0]]))], p1: [[s0(p0: [[72.0], [73.0], [74.0]], p1: [[75.0], [76.0], [77.0]])], [s0(p0: [[78.0], [79.0], [80.0]], p1: [[81.0], [82.0], [83.0]])], [s0(p0: [[84.0], [85.0], [86.0]], p1: [[87.0], [88.0], [89.0]])]])]
    let v1: Double = 90.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 90.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
