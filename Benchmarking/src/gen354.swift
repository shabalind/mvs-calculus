  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: [[s2]]
  }
  func f111(_ v0: s0) -> s0 {
    var v1: s0 = v0
    var v2: s0 = v1
    var v6: s0 = v0
    v2 = v1
    let v3: [[Double]] = v6.p0
    let v11: [[Double]] = v1.p0
    var v4: [[Double]] = v3
    let v9: [[Double]] = v2.p2
    let v7: [Double] = v3[0]
    let v10: s0 = s0(p0: v11, p1: v4, p2: v9)
    v6.p1 = v11
    var v8: s0 = v6
    var v14: [[Double]] = v9
    var v22: s0 = v8
    v14[0] = v7
    let v17: [Double] = v9[0]
    let v16: [[Double]] = v1.p1
    var v21: [[Double]] = v9
    v14[1] = v17
    v4[1] = v17
    let v28: [[Double]] = v22.p0
    let v24: [[Double]] = v0.p1
    v4[0] = v17
    let v52: [Double] = v16[2]
    v4[1] = v7
    v14[0] = v17
    v4[2] = v52
    let v23: [Double] = v21[1]
    v4[1] = v23
    let v55: [[Double]] = v2.p2
    let v40: [Double] = v14[0]
    v21 = v9
    var v27: [[Double]] = v28
    v21 = v14
    let v44: [[Double]] = v22.p2
    v14[1] = v40
    v6.p1 = v11
    v14[1] = v17
    let v69: [[Double]] = v6.p0
    v1.p2 = v44
    v6.p1 = v69
    let v31: [[Double]] = v1.p0
    let v45: [[Double]] = v10.p0
    v22.p1 = v24
    v22.p2 = v55
    var v38: [[Double]] = v27
    var v306: [[Double]] = v55
    v1.p0 = v31
    var v114: [[Double]] = v38
    let v120: [[Double]] = v1.p0
    let v54: s0 = s0(p0: v45, p1: v27, p2: v306)
    v22.p0 = v114
    v1.p0 = v38
    v2.p1 = v120
    return v54
  }
  func f107(_ v0: s0) -> s0 {
    var v6: s0 = v0
    var v2: s0 = v6
    let v5: s0 = f111(v0)
    var v7: s0 = v6
    var v11: s0 = v6
    var v17: s0 = v6
    var v3: s0 = v0
    let v10: [[Double]] = v11.p1
    let v13: [[Double]] = v0.p1
    let v14: s0 = f111(v2)
    let v24: [[Double]] = v17.p0
    v11.p1 = v10
    let v34: s0 = f111(v3)
    var v22: s0 = v14
    let v47: [[Double]] = v5.p2
    v3.p2 = v47
    let v19: s0 = f111(v22)
    v2.p0 = v10
    let v27: [[Double]] = v2.p0
    let v36: [[Double]] = v7.p0
    v11.p0 = v13
    let v28: s0 = f111(v19)
    v6.p1 = v27
    let v61: [[Double]] = v17.p0
    v7.p1 = v61
    v2.p1 = v36
    let v58: s0 = f111(v28)
    let v93: [[Double]] = v34.p0
    v22.p0 = v24
    v22 = v19
    v7.p1 = v93
    return v58
  }
  func f102(_ v0: s2) -> s2 {
    let v4: [s0] = v0.p1
    let v3: [s0] = v0.p1
    let v2: s0 = v4[0]
    let v7: s1 = v0.p0
    let v9: [s2] = [v0, v0, v0, v0, v0]
    let v28: s0 = v3[0]
    var v22: [s0] = v3
    let v14: s2 = v9[0]
    var v27: s2 = v14
    v27.p1 = v22
    var v37: s1 = v7
    v37.p0 = v4
    v27.p1 = v3
    v27.p0 = v37
    v37.p1 = v2
    let v33: s0 = f111(v28)
    v37.p1 = v33
    return v27
  }
  func f100(_ v0: s3, _ v1: s3, _ v2: s3) -> s3 {
    let v4: [s3] = [v2]
    var v5: [s3] = v4
    let v7: s3 = v4[0]
    v5[0] = v1
    v5 = v4
    v5[0] = v0
    var v28: s3 = v0
    v5[0] = v28
    var v24: [s3] = v4
    v5[0] = v0
    v24 = v5
    v24[0] = v7
    v24[0] = v7
    v24[0] = v2
    let v19: s3 = v24[0]
    return v19
  }
  func f99(_ v0: Double) -> Double {
    var v5: Double = v0
    v5 = v0
    v5 = v0
    let v1: [Double] = [v5, v5]
    var v2: Double = v5
    var v11: [Double] = v1
    let v7: Double = v1[0]
    var v8: Double = v0
    let v3: Double = v11[0]
    v11[0] = v2
    var v4: [Double] = v1
    var v17: Double = v0
    let v9: Double = v1[1]
    let v22: Double = v4[1]
    let v10: Double = v1[0]
    v4[1] = v7
    var v19: [Double] = v4
    v17 = v5
    v19[0] = v22
    let v21: Double = v10 + v22
    var v24: [Double] = v19
    let v18: Double = v19[0]
    let v15: Double = v19[0]
    v4[1] = v18
    var v20: [Double] = v1
    v19[0] = v3
    let v13: Double = v11[1]
    v19[1] = v9
    let v39: Double = v20[0]
    v24[1] = v21
    let v44: Double = v11[0]
    v19[1] = v13
    v24[0] = v17
    v19[0] = v8
    let v32: Double = v11[0]
    v19[0] = v32
    let v47: Double = v1[0]
    let v78: Double = v24[0]
    v5 = v47
    let v46: [Double] = [v44, v39, v15, v78, v17]
    let v126: Double = v46[4]
    return v126
  }
  func f75(_ v0: s2) -> s2 {
    let v3: [s2] = [v0, v0, v0, v0]
    let v11: s2 = v3[1]
    return v11
  }
  func f70(_ v0: [s2]) -> [s2] {
    let v1: s2 = v0[0]
    var v6: s2 = v1
    let v5: [s2] = [v6, v6]
    let v10: [s0] = v6.p1
    var v14: [s0] = v10
    let v9: s0 = v14[0]
    let v12: s0 = f107(v9)
    let v40: s0 = f107(v12)
    let v22: s2 = v5[0]
    let v60: s0 = f107(v9)
    v14[0] = v60
    let v73: s2 = f75(v22)
    var v49: [s2] = v0
    let v27: s1 = s1(p0: v10, p1: v40)
    v49[0] = v73
    v6.p0 = v27
    var v105: [s2] = v49
    return v105
  }
  func f45(_ v0: s3) -> s3 {
    let v6: s3 = f100(v0, v0, v0)
    var v4: s3 = v0
    let v3: [[s2]] = v6.p1
    v4.p1 = v3
    let v9: [s2] = v3[1]
    var v11: s3 = v0
    let v8: [s2] = f70(v9)
    v4.p1 = v3
    v11.p1 = v3
    v11.p1 = v3
    let v14: [[s2]] = v6.p1
    let v5: s2 = v8[0]
    var v20: [[s2]] = v14
    let v16: [s2] = v20[1]
    let v23: [s2] = f70(v8)
    var v30: [s2] = v9
    v11.p1 = v14
    v11.p1 = v20
    let v19: s2 = f102(v5)
    v20[1] = v23
    let v70: s3 = f100(v4, v11, v4)
    v20[0] = v16
    v20[1] = v30
    v30[0] = v19
    v20[1] = v16
    v4.p1 = v3
    return v70
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s3, _ v2: Double) -> Double {
    let v28: s3 = f45(v1)
    let v68: s0 = v28.p0
    let v73: [[Double]] = v68.p0
    let v81: [Double] = v73[2]
    let v42: Double = v81[0]
    let v109: Double = f99(v42)
    var v108: Double = v109
    v108 = v109
    return v108
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]], p2: [[6.0], [7.0]])], p1: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0], [12.0], [13.0]], p2: [[14.0], [15.0]]))
    let v1: s3 = s3(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0], [20.0], [21.0]], p2: [[22.0], [23.0]]), p1: [[s2(p0: s1(p0: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]], p2: [[30.0], [31.0]])], p1: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0], [36.0], [37.0]], p2: [[38.0], [39.0]])), p1: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0], [45.0]], p2: [[46.0], [47.0]])])], [s2(p0: s1(p0: [s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0], [52.0], [53.0]], p2: [[54.0], [55.0]])], p1: s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0], [60.0], [61.0]], p2: [[62.0], [63.0]])), p1: [s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0], [68.0], [69.0]], p2: [[70.0], [71.0]])])]])
    let v2: Double = 72.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 72.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
