  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: s2
  }
  func f21(_ v0: s0) -> s0 {
    var v7: s0 = v0
    v7 = v0
    let v5: [s0] = [v7, v7, v7, v0, v0, v0, v0]
    let v4: [s0] = [v0, v7, v0, v0, v0, v7, v7]
    let v2: s0 = v5[4]
    let v3: [[Double]] = v7.p1
    var v6: [[Double]] = v3
    let v11: s0 = v4[5]
    v7.p1 = v6
    var v10: s0 = v11
    var v9: s0 = v2
    v10.p1 = v6
    var v15: s0 = v0
    let v14: [Double] = v3[0]
    v10.p1 = v6
    v6[1] = v14
    v6[1] = v14
    let v17: [[Double]] = v2.p0
    let v41: [[Double]] = v7.p1
    let v16: [[Double]] = v9.p0
    let v18: [Double] = v41[1]
    var v19: [Double] = v14
    v6[1] = v19
    let v20: s0 = v5[3]
    v6[1] = v14
    let v30: s0 = v4[5]
    let v29: [[Double]] = v20.p0
    var v21: s0 = v2
    let v22: [Double] = v17[0]
    let v23: [[Double]] = v11.p0
    v21.p0 = v29
    v6[0] = v14
    let v31: s0 = v5[4]
    var v27: [s0] = v5
    v10.p0 = v29
    v15.p0 = v16
    let v51: s0 = v27[4]
    let v55: s0 = v27[5]
    let v49: Double = v19[0]
    v21 = v9
    v27[4] = v21
    let v40: [Double] = v23[0]
    var v37: Double = v49
    v19[0] = v49
    v19[0] = v49
    v27[3] = v21
    v6[0] = v18
    v6[0] = v22
    let v60: [[Double]] = v15.p1
    v10.p1 = v60
    v21 = v31
    let v46: [[Double]] = v20.p0
    v9.p0 = v23
    let v42: s0 = v5[4]
    let v36: s2 = s2(p0: v31, p1: v30)
    let v73: [[Double]] = v42.p1
    v7.p1 = v6
    v19[0] = v37
    v19[0] = v49
    let v74: s0 = v36.p0
    let v63: [[Double]] = v55.p1
    let v52: [[Double]] = v10.p0
    v27[0] = v74
    v7.p0 = v52
    v6[0] = v40
    v9.p1 = v73
    v9.p0 = v23
    v6[0] = v22
    v9.p0 = v46
    v9.p1 = v63
    return v51
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s1, _ v2: [s3], _ v3: Double) -> Double {
    var v5: s3 = v0
    var v7: s3 = v5
    var v9: s3 = v7
    let v8: s2 = v5.p1
    let v14: [s0] = v9.p0
    let v13: s0 = v14[0]
    let v21: s3 = v2[0]
    let v17: s0 = f21(v13)
    var v22: s0 = v17
    v5 = v9
    let v33: [[Double]] = v17.p1
    v9.p0 = v14
    let v51: s0 = v8.p0
    let v45: [[Double]] = v51.p1
    var v66: [[Double]] = v33
    let v98: s2 = v21.p1
    let v60: [[Double]] = v22.p1
    let v106: [Double] = v60[1]
    v22.p1 = v45
    v7.p1 = v98
    v22.p1 = v33
    v22.p1 = v66
    let v93: Double = v106[0]
    return v93
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], p1: s2(p0: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]), p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])))
    let v1: s1 = s1(p0: [[s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])], [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])]], p1: [s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]]), s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])])
    let v2: [s3] = [s3(p0: [s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0], [39.0]])], p1: s2(p0: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0], [44.0]]), p1: s0(p0: [[45.0], [46.0], [47.0]], p1: [[48.0], [49.0]])))]
    let v3: Double = 50.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 50.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
