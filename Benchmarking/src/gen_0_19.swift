  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
    var p2: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: s1
  }
  func f10(_ v0: Double) -> Double {
    var v2: Double = v0
    var v4: Double = v2
    var v1: Double = v4
    var v3: Double = v0
    let v6: Double = v4 / v2
    v1 = v2
    var v7: Double = v2
    var v5: Double = v3
    var v9: Double = v6
    let v17: Double = v9 / v7
    var v11: Double = v2
    var v10: Double = v5
    var v14: Double = v7
    let v15: Double = v14 * v17
    let v24: [Double] = [v10]
    v10 = v15
    let v26: Double = v24[0]
    var v62: Double = v7
    var v25: [Double] = v24
    v25[0] = v3
    let v32: Double = v24[0]
    var v28: [Double] = v25
    v25[0] = v32
    v25[0] = v1
    v25[0] = v11
    v25[0] = v26
    v25[0] = v1
    v28[0] = v62
    v25[0] = v11
    let v54: Double = v28[0]
    return v54
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v5: Double = f10(v1)
    let v8: Double = f10(v5)
    let v4: s1 = v0.p0
    let v7: [[s0]] = v4.p0
    let v11: [s0] = v7[1]
    let v23: [s0] = v4.p1
    var v16: [[s0]] = v7
    let v22: [s0] = v16[2]
    let v27: Double = f10(v8)
    var v28: [[s0]] = v7
    let v61: s0 = v22[0]
    let v37: [[Double]] = v61.p0
    let v72: [Double] = v37[0]
    v16[1] = v23
    var v35: [Double] = v72
    let v42: Double = v35[0]
    v35[0] = v27
    let v68: [s0] = v28[0]
    v16[0] = v68
    v16[2] = v11
    return v42
  }
  func benchmark() {
    let v0: s3 = s3(p0: s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])]], p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])], p2: [s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]), s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])]), p1: s1(p0: [[s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])], [s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]])], [s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]])]], p1: [s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]])], p2: [s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]), s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]]), s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]])]))
    let v1: Double = 56.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 56.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
