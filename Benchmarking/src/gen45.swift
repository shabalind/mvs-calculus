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
    var p0: s1
    var p1: [[s1]]
  }
  struct s3 {
    var p0: s2
    var p1: [[s0]]
    var p2: [s1]
  }
  func f71(_ v0: s1) -> s1 {
    let v4: s0 = v0.p1
    var v2: s0 = v4
    var v1: s1 = v0
    v1.p0 = v2
    var v7: s1 = v1
    var v3: s0 = v2
    let v6: [[Double]] = v4.p1
    v2.p1 = v6
    v2 = v3
    let v18: s0 = v7.p1
    v1.p1 = v18
    v3.p1 = v6
    let v35: [[Double]] = v2.p0
    var v26: [[Double]] = v35
    v2.p0 = v26
    v2.p0 = v35
    return v7
  }
  func f70(_ v0: s1) -> s1 {
    let v5: [s1] = [v0, v0, v0, v0, v0]
    let v7: s1 = f71(v0)
    var v8: [s1] = v5
    var v4: [s1] = v5
    let v6: s1 = f71(v7)
    let v1: s0 = v6.p1
    v8 = v4
    let v12: s1 = v8[0]
    var v11: s1 = v12
    v11.p1 = v1
    let v17: s1 = v4[4]
    let v9: [[Double]] = v1.p1
    v11.p1 = v1
    var v10: [[Double]] = v9
    var v16: s0 = v1
    var v27: [[Double]] = v9
    v27 = v9
    let v22: [Double] = v27[0]
    v11.p0 = v1
    v16.p1 = v10
    v10[2] = v22
    let v13: s1 = f71(v17)
    var v35: [[Double]] = v10
    v4[1] = v13
    var v20: s0 = v1
    let v34: [[Double]] = v20.p0
    var v25: [[Double]] = v35
    let v41: [Double] = v34[0]
    let v31: [Double] = v34[0]
    var v37: [[Double]] = v9
    v16.p1 = v37
    v25[2] = v22
    var v38: [Double] = v41
    v16.p1 = v10
    v11.p0 = v1
    let v57: s1 = f71(v11)
    v27[0] = v38
    v11.p0 = v20
    let v64: [[Double]] = v16.p0
    v35[1] = v31
    v16.p0 = v34
    v10[2] = v38
    v10[2] = v31
    let v62: s0 = s0(p0: v34, p1: v9)
    v37 = v25
    v20.p0 = v34
    let v77: [Double] = v64[1]
    v16 = v62
    v20.p0 = v64
    let v54: [[Double]] = v20.p0
    v27[0] = v77
    v35[2] = v31
    var v162: [[Double]] = v54
    v20.p0 = v162
    v35[1] = v31
    return v57
  }
  func f65(_ v0: s1) -> s1 {
    let v2: s1 = f70(v0)
    let v4: s0 = v2.p1
    let v10: s0 = v0.p1
    var v8: s0 = v10
    let v15: [[Double]] = v8.p0
    var v13: [[Double]] = v15
    let v9: s1 = f70(v0)
    let v18: [[Double]] = v4.p1
    let v11: [[Double]] = v10.p1
    let v29: s0 = v2.p1
    v8.p1 = v18
    var v21: [[Double]] = v13
    let v22: [Double] = v21[1]
    v13[1] = v22
    v13[1] = v22
    let v27: [Double] = v13[0]
    let v32: s0 = v9.p1
    var v20: s1 = v9
    let v37: s0 = v0.p1
    let v106: s0 = v2.p1
    v13[0] = v22
    let v113: s0 = s0(p0: v21, p1: v11)
    let v159: [[Double]] = v106.p1
    v21[1] = v27
    let v119: s0 = s0(p0: v15, p1: v159)
    let v66: s1 = f71(v20)
    let v110: [s0] = [v119, v32, v37, v29]
    var v253: [s0] = v110
    let v122: s0 = v66.p0
    v253[0] = v122
    let v157: s0 = v253[2]
    let v142: s1 = s1(p0: v113, p1: v157)
    return v142
  }
  func f50(_ v0: s1) -> s1 {
    let v1: s0 = v0.p1
    let v4: s0 = v0.p1
    let v2: [s0] = [v1]
    let v9: s0 = v2[0]
    var v8: s0 = v9
    var v36: s0 = v4
    let v33: s1 = s1(p0: v36, p1: v8)
    return v33
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: [s0], _ v2: Double) -> Double {
    let v5: s0 = v1[1]
    let v4: [[Double]] = v5.p1
    let v8: s1 = s1(p0: v5, p1: v5)
    let v11: s1 = f50(v8)
    let v9: s1 = f65(v11)
    let v13: s0 = v9.p1
    let v17: [Double] = v4[0]
    var v30: [Double] = v17
    var v38: Double = v2
    let v24: [[Double]] = v13.p0
    var v28: Double = v38
    let v41: [Double] = v24[1]
    var v116: [Double] = v30
    v116 = v41
    let v139: Double = v2 + v28
    let v112: Double = v116[0]
    v30[0] = v139
    return v112
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])), p1: [[s1(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]))]]), p1: [[s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])], [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])], [s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]])]], p2: [s1(p0: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]), p1: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])), s1(p0: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]), p1: s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]))])]
    let v1: [s0] = [s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]])]
    let v2: Double = 65.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 65.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
