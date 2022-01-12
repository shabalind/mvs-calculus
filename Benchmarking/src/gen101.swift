  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: Double
  }
  struct s4 {
    var p0: s3
    var p1: s1
  }
  func f12(_ v0: s0) -> s0 {
    let v2: [Double] = v0.p0
    let v7: Double = v2[0]
    var v4: s0 = v0
    v4.p0 = v2
    let v9: [[Double]] = v0.p1
    let v1: [[Double]] = v0.p1
    let v5: [Double] = v4.p0
    var v13: [[Double]] = v9
    v4.p0 = v5
    var v19: s0 = v4
    let v30: [Double] = v1[1]
    v4.p1 = v13
    var v11: [[Double]] = v9
    v19.p1 = v13
    let v17: [Double] = v4.p0
    var v25: [[Double]] = v13
    let v27: [Double] = v19.p0
    let v22: [Double] = [v7, v7]
    let v52: [Double] = v11[2]
    v19.p0 = v27
    var v47: [Double] = v30
    v13[0] = v47
    v19.p0 = v17
    let v57: s0 = s0(p0: v27, p1: v11)
    v19.p0 = v22
    v13[1] = v52
    v19.p1 = v25
    v13[0] = v30
    return v57
  }
  func f11(_ v0: [s0]) -> [s0] {
    var v5: [s0] = v0
    var v4: [s0] = v0
    var v2: [s0] = v5
    var v3: [s0] = v0
    var v7: [s0] = v4
    let v6: s0 = v3[0]
    let v8: s0 = f12(v6)
    v3 = v0
    let v1: [Double] = v8.p0
    let v11: [[Double]] = v6.p1
    let v10: s0 = v0[1]
    let v9: s0 = f12(v6)
    v7[1] = v8
    let v18: s0 = s0(p0: v1, p1: v11)
    v4 = v3
    let v16: s0 = f12(v9)
    let v26: [[s0]] = [v7, v7, v0, v0, v2]
    v2[0] = v10
    let v41: s0 = f12(v9)
    v7[1] = v16
    var v33: [[s0]] = v26
    let v94: [s0] = v33[4]
    v7[0] = v41
    v5[0] = v18
    return v94
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    var v5: [s1] = v0
    let v4: s1 = v5[1]
    let v7: [[s0]] = v4.p0
    var v11: s1 = v4
    let v3: [s0] = v7[0]
    v11.p0 = v7
    var v9: [[s0]] = v7
    v11.p0 = v9
    v11.p0 = v9
    let v13: [s0] = v11.p1
    v9[0] = v3
    let v10: [s0] = f11(v13)
    let v12: [s0] = f11(v10)
    let v38: s0 = v3[0]
    let v23: [[Double]] = v38.p1
    v5[2] = v11
    var v14: s0 = v38
    v11.p1 = v12
    var v25: s0 = v38
    var v18: [s0] = v3
    v25.p1 = v23
    var v41: [s0] = v18
    let v22: s0 = v41[0]
    let v21: s0 = f12(v25)
    v25.p1 = v23
    let v61: s3 = s3(p0: v11, p1: v1)
    let v56: s0 = v3[0]
    let v40: s4 = s4(p0: v61, p1: v4)
    var v68: [s0] = v41
    v14 = v56
    v14.p1 = v23
    v14.p1 = v23
    let v42: [Double] = v21.p0
    v14.p1 = v23
    let v47: s3 = v40.p0
    v18[0] = v14
    v9[0] = v41
    v25.p0 = v42
    var v52: [[Double]] = v23
    let v130: Double = v47.p1
    v14.p1 = v52
    v68[0] = v22
    v14.p0 = v42
    v11.p1 = v13
    v9[1] = v68
    return v130
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [[s0(p0: [0.0, 1.0], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [5.0, 6.0], p1: [[7.0], [8.0], [9.0]])]], p1: [s0(p0: [10.0, 11.0], p1: [[12.0], [13.0], [14.0]]), s0(p0: [15.0, 16.0], p1: [[17.0], [18.0], [19.0]])]), s1(p0: [[s0(p0: [20.0, 21.0], p1: [[22.0], [23.0], [24.0]])], [s0(p0: [25.0, 26.0], p1: [[27.0], [28.0], [29.0]])]], p1: [s0(p0: [30.0, 31.0], p1: [[32.0], [33.0], [34.0]]), s0(p0: [35.0, 36.0], p1: [[37.0], [38.0], [39.0]])]), s1(p0: [[s0(p0: [40.0, 41.0], p1: [[42.0], [43.0], [44.0]])], [s0(p0: [45.0, 46.0], p1: [[47.0], [48.0], [49.0]])]], p1: [s0(p0: [50.0, 51.0], p1: [[52.0], [53.0], [54.0]]), s0(p0: [55.0, 56.0], p1: [[57.0], [58.0], [59.0]])])]
    let v1: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
