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
    var p0: s0
    var p1: [s1]
  }
  struct s3 {
    var p0: [s1]
    var p1: [s2]
    var p2: [s2]
  }
  struct s4 {
    var p0: [s1]
    var p1: [s1]
  }
  func f32(_ v0: s1) -> s1 {
    var v4: s1 = v0
    var v1: s1 = v0
    var v5: s1 = v1
    let v6: s0 = v0.p0
    v1.p0 = v6
    let v7: s0 = v5.p1
    v4.p0 = v7
    v4.p1 = v6
    let v2: s0 = v5.p1
    let v9: [[Double]] = v7.p1
    var v22: s0 = v2
    v22.p1 = v9
    v4.p1 = v22
    v1.p1 = v6
    v5.p0 = v2
    v4 = v5
    return v4
  }
  func f28(_ v0: s1) -> s1 {
    let v3: s0 = v0.p0
    let v1: s1 = f32(v0)
    let v4: s1 = f32(v0)
    var v9: s1 = v4
    let v8: s1 = f32(v1)
    let v7: s1 = f32(v9)
    let v5: s0 = v7.p0
    v9 = v4
    var v24: s0 = v5
    let v25: s1 = s1(p0: v3, p1: v24)
    var v12: s0 = v5
    let v38: s1 = f32(v8)
    let v19: s1 = s1(p0: v12, p1: v12)
    let v46: s0 = v4.p1
    let v39: [[Double]] = v12.p1
    let v34: s1 = f32(v38)
    let v33: s1 = f32(v34)
    let v52: s0 = v8.p0
    let v55: s1 = f32(v8)
    let v59: s1 = f32(v19)
    let v69: s0 = v8.p0
    v12.p1 = v39
    let v60: [[Double]] = v69.p0
    var v64: s1 = v25
    v24 = v46
    v24.p0 = v60
    v9.p0 = v5
    let v224: s0 = v33.p1
    v9.p1 = v224
    v64.p0 = v24
    v12 = v69
    let v114: s1 = f32(v55)
    v64.p1 = v52
    let v81: s0 = v59.p0
    let v175: s0 = v114.p0
    v9.p0 = v81
    let v156: s0 = v9.p0
    v9.p1 = v69
    v9.p0 = v156
    v64.p1 = v175
    return v64
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v6: s3 = v0[0]
    var v4: s3 = v6
    var v2: s3 = v6
    let v3: s3 = v0[0]
    let v10: s3 = v0[0]
    let v27: s3 = v0[0]
    let v19: [s1] = v4.p0
    let v17: s1 = v19[1]
    let v28: [s2] = v3.p1
    v4.p0 = v19
    let v23: [s2] = v10.p1
    let v25: s0 = v17.p1
    let v20: s1 = f28(v17)
    let v57: s1 = f32(v20)
    v4.p1 = v23
    v4.p1 = v23
    let v62: s2 = v28[0]
    let v85: [[Double]] = v25.p0
    let v41: [s1] = v62.p1
    let v94: [s2] = v27.p1
    var v60: s3 = v2
    let v140: [Double] = v85[1]
    var v164: [s1] = v41
    let v92: s4 = s4(p0: v164, p1: v19)
    var v133: s4 = v92
    let v131: [s1] = v60.p0
    let v90: [s1] = v133.p1
    v2.p1 = v94
    let v75: Double = v140[0]
    v4.p0 = v90
    v164[0] = v57
    v4.p0 = v131
    return v75
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])), s1(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]))], p1: [s2(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), p1: [s1(p0: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]), p1: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]))])], p2: [s2(p0: s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]]), p1: [s1(p0: s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]]), p1: s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]]))]), s2(p0: s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]), p1: [s1(p0: s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]]), p1: s0(p0: [[60.0], [61.0]], p1: [[62.0], [63.0], [64.0]]))])])]
    let v1: Double = 65.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 65.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
