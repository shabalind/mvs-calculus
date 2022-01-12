  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
    var p2: [s0]
    var p3: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: s1
  }
  struct s6 {
    var p0: s3
    var p1: s3
  }
  func f107(_ v0: s1) -> s1 {
    var v7: s1 = v0
    let v4: [s0] = v7.p2
    let v1: [s0] = v0.p2
    let v3: [s0] = v7.p3
    let v2: [s0] = v0.p2
    v7.p2 = v4
    let v5: s3 = s3(p0: v7)
    v7.p3 = v3
    var v15: s1 = v0
    var v13: s3 = v5
    v7 = v15
    v15.p2 = v1
    v13.p0 = v15
    let v46: s0 = v2[0]
    let v41: s1 = v13.p0
    let v26: s1 = v13.p0
    let v50: s1 = v13.p0
    var v81: s1 = v41
    v7.p0 = v46
    var v37: s3 = v13
    v13.p0 = v50
    let v52: s1 = v37.p0
    let v105: s2 = s2(p0: v81, p1: v52)
    v37.p0 = v26
    let v190: s1 = v105.p1
    return v190
  }
  func f104(_ v0: s3, _ v1: s3, _ v2: Double) -> s3 {
    return v0
  }
  func f94(_ v0: [s0]) -> [s0] {
    let v7: [[s0]] = [v0, v0]
    let v8: [s0] = v7[1]
    let v3: s0 = v8[1]
    let v12: [[Double]] = v3.p0
    let v6: [[Double]] = v3.p1
    var v2: s0 = v3
    let v17: [[Double]] = v3.p0
    let v1: [s0] = v7[0]
    let v11: [s0] = v7[0]
    let v25: [[Double]] = v3.p0
    let v39: [[Double]] = v2.p0
    let v20: [Double] = v12[0]
    v2.p0 = v17
    let v23: [[Double]] = v3.p1
    v2.p1 = v23
    let v27: s0 = v11[0]
    var v29: [[Double]] = v6
    v2.p1 = v6
    var v33: [s0] = v1
    let v45: [[Double]] = v2.p1
    v33[0] = v2
    v2.p1 = v29
    v2.p1 = v6
    v33[0] = v27
    let v46: [Double] = v23[0]
    v2.p1 = v29
    v29[0] = v20
    let v98: s0 = v0[1]
    let v49: [[Double]] = v3.p0
    let v73: [[Double]] = v3.p1
    var v69: [[Double]] = v39
    v2.p1 = v73
    v2.p0 = v69
    let v83: [[Double]] = v98.p1
    v2 = v27
    v29[0] = v46
    let v55: s0 = s0(p0: v12, p1: v83)
    v2.p1 = v6
    v2.p0 = v25
    v2.p0 = v49
    v2.p1 = v83
    let v67: [[Double]] = v55.p1
    v2.p1 = v45
    v2.p1 = v67
    v2.p1 = v29
    v2.p1 = v45
    return v33
  }
  func f88(_ v0: s3) -> s3 {
    var v4: s3 = v0
    let v5: s6 = s6(p0: v0, p1: v4)
    let v6: [s3] = [v4, v4, v0, v0, v4, v4]
    let v8: s1 = v0.p0
    var v1: s3 = v0
    var v9: s6 = v5
    var v21: s3 = v0
    let v13: s1 = v0.p0
    let v15: s1 = v1.p0
    let v7: [s0] = v13.p1
    let v17: [s0] = f94(v7)
    v21.p0 = v13
    let v16: s0 = v17[1]
    v21.p0 = v8
    var v38: [s3] = v6
    let v30: s3 = v38[2]
    v38[2] = v4
    v21.p0 = v15
    let v43: s3 = v9.p0
    let v35: [[Double]] = v16.p1
    v9.p0 = v43
    let v56: [Double] = v35[0]
    let v77: Double = v56[0]
    let v102: [Double] = v35[0]
    let v45: s3 = v9.p1
    v1.p0 = v13
    let v73: s3 = f104(v45, v21, v77)
    let v78: s3 = f104(v73, v30, v77)
    let v66: Double = v102[0]
    let v128: s3 = f104(v78, v1, v66)
    v21 = v78
    v38[3] = v45
    return v128
  }
  func f87(_ v0: s3, _ v1: s0) -> s0 {
    var v4: s3 = v0
    let v2: s1 = v4.p0
    var v5: s1 = v2
    let v12: s1 = v4.p0
    v4.p0 = v12
    var v3: s1 = v12
    let v6: [s0] = v3.p1
    let v9: [s0] = v12.p2
    let v8: [s0] = f94(v6)
    let v16: s1 = f107(v2)
    let v36: s1 = f107(v16)
    let v13: [s0] = v36.p1
    var v18: [s0] = v8
    var v19: [s0] = v9
    let v35: s0 = v19[1]
    let v33: s0 = v13[0]
    v19[0] = v33
    let v31: s0 = v8[1]
    v19[1] = v33
    v3.p2 = v6
    v19[1] = v31
    v19[1] = v1
    let v63: [s0] = f94(v6)
    v4.p0 = v5
    var v71: [s0] = v18
    v3.p1 = v71
    let v116: [s0] = f94(v63)
    let v86: s0 = v116[0]
    v4.p0 = v3
    v4.p0 = v36
    v3.p0 = v35
    return v86
  }
  func f66(_ v0: s0) -> s0 {
    var v2: s0 = v0
    let v1: [[Double]] = v2.p1
    var v5: [[Double]] = v1
    let v3: [[Double]] = v0.p1
    v2.p1 = v5
    let v6: [[Double]] = v2.p0
    v5 = v3
    var v7: [[Double]] = v6
    let v4: [Double] = v6[0]
    let v9: [[Double]] = v0.p1
    var v8: [[Double]] = v6
    let v10: [[Double]] = v2.p1
    v5[0] = v4
    let v12: [Double] = v8[2]
    let v16: [Double] = v1[0]
    var v13: s0 = v0
    let v25: [[[Double]]] = [v5, v10]
    v8 = v7
    v7[1] = v16
    v13.p0 = v6
    let v26: [[Double]] = v0.p0
    v5[0] = v4
    v5[0] = v12
    let v15: [[Double]] = v25[0]
    v8 = v26
    v7[1] = v4
    let v28: [Double] = v26[0]
    v2.p1 = v9
    v7[0] = v16
    v13.p0 = v6
    v5[0] = v28
    v13.p0 = v26
    v13.p1 = v15
    return v13
  }
  func f52(_ v0: s1) -> s1 {
    let v1: s1 = f107(v0)
    let v2: s0 = v1.p0
    var v24: s1 = v0
    let v26: s0 = f66(v2)
    v24.p0 = v26
    return v24
  }
  func f43(_ v0: s1, _ v1: s3) -> s1 {
    let v3: s1 = v1.p0
    var v6: s1 = v3
    let v8: s1 = f52(v6)
    let v13: s1 = v1.p0
    let v27: [s0] = v8.p2
    var v18: [s0] = v27
    var v21: s1 = v13
    let v15: s0 = v18[0]
    v6.p2 = v27
    let v25: [s0] = [v15, v15, v15, v15, v15, v15, v15]
    let v24: s0 = v25[6]
    let v39: s0 = v25[6]
    var v50: s1 = v21
    v18[1] = v39
    v50.p2 = v18
    let v57: [s0] = v6.p2
    v21.p1 = v18
    v50.p1 = v57
    v21.p0 = v24
    return v50
  }
  func f37(_ v0: s3, _ v1: s0) -> s3 {
    let v8: s0 = f66(v1)
    let v6: [s3] = [v0, v0, v0, v0, v0]
    let v2: s3 = v6[2]
    let v11: [[Double]] = v8.p1
    let v28: [Double] = v11[0]
    let v34: s3 = v6[1]
    let v39: Double = v28[0]
    let v61: s3 = f88(v2)
    let v58: s3 = f104(v61, v34, v39)
    return v58
  }
  func f29(_ v0: s3, _ v1: s1) -> s1 {
    var v2: s1 = v1
    let v6: [s0] = v1.p2
    let v5: s0 = v1.p0
    v2.p1 = v6
    v2.p0 = v5
    let v4: s0 = f87(v0, v5)
    let v7: [[Double]] = v4.p1
    v2.p2 = v6
    let v11: [s0] = v2.p3
    let v8: s3 = f37(v0, v4)
    var v15: s3 = v0
    let v9: [Double] = v7[0]
    let v13: s3 = f88(v8)
    let v12: s0 = v11[0]
    let v16: Double = v9[0]
    v2.p3 = v11
    let v14: [s0] = f94(v6)
    v15.p0 = v2
    let v39: s3 = f104(v0, v15, v16)
    v2.p1 = v6
    var v27: s1 = v2
    var v21: [s0] = v11
    var v20: s3 = v13
    let v23: s0 = v2.p0
    let v51: s0 = v21[0]
    let v37: s0 = v14[1]
    let v31: s3 = f37(v20, v51)
    let v25: [s0] = v1.p2
    v21[0] = v12
    let v47: [Double] = v7[0]
    v20.p0 = v1
    let v50: Double = v47[0]
    v2.p2 = v25
    let v55: s1 = v20.p0
    v20.p0 = v27
    let v65: s1 = f52(v2)
    v20.p0 = v27
    let v104: s1 = v8.p0
    let v78: s1 = v31.p0
    v15.p0 = v55
    v21[0] = v37
    let v80: [s1] = [v65, v2, v78, v1, v55, v104]
    v20.p0 = v2
    let v86: s1 = v80[0]
    v21[0] = v23
    let v48: s3 = f104(v8, v39, v50)
    v20.p0 = v55
    v20 = v48
    return v86
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: s3, _ v2: Double) -> Double {
    let v3: s3 = v0[1]
    let v4: s1 = v1.p0
    let v9: s1 = f52(v4)
    let v30: s1 = f29(v3, v9)
    let v10: s1 = f43(v9, v3)
    let v13: s1 = v1.p0
    var v39: s1 = v13
    let v50: s3 = v0[0]
    let v26: s1 = f43(v10, v50)
    let v19: [s0] = v39.p2
    let v28: s0 = v26.p0
    let v33: s1 = v50.p0
    v39.p0 = v28
    let v35: s0 = v19[0]
    let v48: s0 = v30.p0
    v39.p0 = v48
    let v60: [[Double]] = v35.p1
    let v64: [Double] = v60[0]
    let v89: [s0] = v33.p3
    v39.p3 = v89
    let v43: [s0] = v26.p1
    let v68: Double = v64[0]
    let v57: s0 = v43[1]
    v39.p0 = v57
    return v68
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p2: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])], p3: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])])), s3(p0: s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), p1: [s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]), s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])], p2: [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]), s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])], p3: [s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]])]))]
    let v1: s3 = s3(p0: s1(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), p1: [s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]]), s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])], p2: [s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]]), s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]])], p3: [s0(p0: [[68.0], [69.0], [70.0]], p1: [[71.0]])]))
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
