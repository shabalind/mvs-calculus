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
    var p0: [[s0]]
    var p1: s0
  }
  struct s3 {
    var p0: s2
    var p1: [s1]
  }
  func f40(_ v0: s2) -> s2 {
    let v3: s0 = v0.p1
    let v1: [[Double]] = v3.p0
    let v4: s0 = v0.p1
    var v8: s2 = v0
    var v17: s2 = v0
    let v7: [Double] = v1[1]
    var v9: s0 = v4
    v9.p0 = v1
    let v11: s0 = v8.p1
    v17.p1 = v11
    v9.p0 = v1
    var v30: s2 = v17
    let v23: [[Double]] = v3.p1
    let v37: [[s0]] = v8.p0
    let v16: [s0] = v37[0]
    v9.p0 = v1
    let v36: s0 = v30.p1
    v8.p1 = v36
    var v47: [[Double]] = v23
    v9.p1 = v47
    let v72: s0 = v16[0]
    v8.p1 = v9
    v47[0] = v7
    v8.p1 = v4
    v8 = v30
    v17.p1 = v11
    v30.p1 = v72
    return v8
  }
  func f33(_ v0: [s0]) -> [s0] {
    let v1: [[s0]] = [v0, v0, v0]
    var v7: [[s0]] = v1
    v7 = v1
    v7[1] = v0
    v7 = v1
    v7 = v1
    v7[2] = v0
    v7 = v1
    let v26: [s0] = v7[2]
    return v26
  }
  func f6(_ v0: s0, _ v1: [[s0]], _ v2: Double, _ v3: s0, _ v4: s3) -> Double {
    return v2
  }
  func f3(_ v0: s3) -> s3 {
    var v2: s3 = v0
    let v5: s2 = v2.p0
    var v7: s3 = v0
    var v4: s2 = v5
    var v3: s3 = v7
    var v10: s3 = v7
    var v8: s2 = v4
    v3.p0 = v8
    let v9: s2 = v3.p0
    var v37: s3 = v10
    let v30: s2 = f40(v9)
    let v16: s2 = f40(v9)
    let v38: [[s0]] = v30.p0
    let v25: [s1] = v7.p1
    var v31: s3 = v0
    let v34: [s0] = v38[0]
    let v41: [s0] = f33(v34)
    let v42: s0 = v41[0]
    v37.p1 = v25
    v37.p0 = v30
    v10.p0 = v16
    v7.p0 = v30
    let v24: s1 = v25[0]
    v2.p0 = v16
    v8.p1 = v42
    var v49: [s1] = v25
    v49[0] = v24
    v49[0] = v24
    v10.p1 = v49
    v10 = v0
    v10.p1 = v49
    v10 = v31
    v10.p1 = v49
    v49[0] = v24
    return v37
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [[s0]], _ v2: Double) -> Double {
    let v8: s2 = v0.p0
    let v6: [s0] = v1[1]
    let v3: [s0] = v1[0]
    let v7: s0 = v8.p1
    let v5: s0 = v3[0]
    var v10: s0 = v5
    let v31: [[Double]] = v7.p1
    let v9: [Double] = v31[1]
    v10 = v5
    let v29: [[s0]] = [v3, v6, v3, v6, v3, v3, v6]
    let v12: s3 = f3(v0)
    let v18: Double = f6(v10, v1, v2, v10, v0)
    let v21: [s0] = v29[4]
    v10.p1 = v31
    let v40: [[Double]] = v10.p0
    var v23: [[Double]] = v40
    var v41: [[s0]] = v1
    let v76: s0 = v21[0]
    v23[0] = v9
    v10.p1 = v40
    let v34: s3 = f3(v12)
    v10.p1 = v23
    v10.p1 = v40
    v41[2] = v21
    let v65: s2 = v0.p0
    v41[0] = v21
    let v50: s0 = v65.p1
    v10.p1 = v23
    let v124: Double = f6(v50, v41, v18, v76, v34)
    return v124
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])]], p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])), p1: [s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), p1: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]))])
    let v1: [[s0]] = [[s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])], [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])], [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0], [40.0], [41.0]])]]
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
