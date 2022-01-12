  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s3 {
    var p0: [[Double]]
    var p1: [[s0]]
    var p2: [[s0]]
    var p3: [s1]
    var p4: [[s0]]
  }
  func f117(_ v0: Double) -> Double {
    var v4: Double = v0
    var v6: Double = v0
    var v5: Double = v4
    let v8: Double = v4 * v5
    let v2: Double = v0 / v8
    var v1: Double = v4
    v6 = v1
    var v23: Double = v4
    let v14: [Double] = [v6, v4, v1, v4, v6]
    var v18: Double = v23
    var v25: [Double] = v14
    let v21: Double = v14[4]
    var v13: [Double] = v14
    var v20: Double = v18
    v13[4] = v1
    v25[4] = v8
    v13[1] = v21
    v13[4] = v2
    v13[2] = v2
    var v32: [Double] = v13
    var v35: Double = v0
    v5 = v1
    let v90: Double = v14[3]
    var v39: Double = v20
    v32[3] = v18
    var v57: Double = v2
    v32[1] = v8
    v25[0] = v1
    v1 = v39
    var v45: Double = v90
    let v49: Double = v32[0]
    v13[1] = v57
    var v44: [Double] = v25
    var v75: [Double] = v44
    v45 = v1
    v5 = v23
    v13[4] = v45
    v75[3] = v23
    let v109: [[Double]] = [v25]
    let v97: Double = v75[3]
    let v79: Double = v14[3]
    var v58: [[Double]] = v109
    let v148: [Double] = v58[0]
    v13[3] = v49
    v58[0] = v14
    v44[2] = v79
    v13 = v148
    v75[3] = v35
    v75[3] = v20
    v57 = v21
    v44[0] = v49
    return v97
  }
  func f104(_ v0: Double) -> Double {
    let v1: Double = f117(v0)
    var v6: Double = v0
    let v5: Double = f117(v6)
    let v3: Double = f117(v1)
    let v8: Double = f117(v5)
    var v2: Double = v8
    let v4: Double = f117(v2)
    let v10: Double = f117(v0)
    let v20: Double = f117(v10)
    var v7: Double = v3
    let v13: [Double] = [v8, v7, v1, v3]
    let v9: Double = f117(v20)
    var v24: [Double] = v13
    let v45: Double = v24[1]
    var v28: [Double] = v24
    v28[2] = v9
    v24[2] = v45
    let v12: Double = f117(v10)
    var v22: Double = v3
    var v62: [Double] = v13
    v24[2] = v22
    let v27: Double = f117(v4)
    v62 = v28
    v28[2] = v8
    v62[1] = v45
    let v56: Double = v62[2]
    var v30: Double = v56
    v30 = v12
    v62[1] = v22
    v24[2] = v27
    return v30
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: Double) -> Double {
    var v4: Double = v1
    let v32: Double = f104(v4)
    let v31: Double = f117(v32)
    return v31
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: [[0.0], [1.0]], p1: [[s0(p0: [2.0], p1: [[3.0]])], [s0(p0: [4.0], p1: [[5.0]])], [s0(p0: [6.0], p1: [[7.0]])]], p2: [[s0(p0: [8.0], p1: [[9.0]])]], p3: [s1(p0: [[s0(p0: [10.0], p1: [[11.0]])], [s0(p0: [12.0], p1: [[13.0]])], [s0(p0: [14.0], p1: [[15.0]])]], p1: s0(p0: [16.0], p1: [[17.0]]))], p4: [[s0(p0: [18.0], p1: [[19.0]])], [s0(p0: [20.0], p1: [[21.0]])]])], [s3(p0: [[22.0], [23.0]], p1: [[s0(p0: [24.0], p1: [[25.0]])], [s0(p0: [26.0], p1: [[27.0]])], [s0(p0: [28.0], p1: [[29.0]])]], p2: [[s0(p0: [30.0], p1: [[31.0]])]], p3: [s1(p0: [[s0(p0: [32.0], p1: [[33.0]])], [s0(p0: [34.0], p1: [[35.0]])], [s0(p0: [36.0], p1: [[37.0]])]], p1: s0(p0: [38.0], p1: [[39.0]]))], p4: [[s0(p0: [40.0], p1: [[41.0]])], [s0(p0: [42.0], p1: [[43.0]])]])], [s3(p0: [[44.0], [45.0]], p1: [[s0(p0: [46.0], p1: [[47.0]])], [s0(p0: [48.0], p1: [[49.0]])], [s0(p0: [50.0], p1: [[51.0]])]], p2: [[s0(p0: [52.0], p1: [[53.0]])]], p3: [s1(p0: [[s0(p0: [54.0], p1: [[55.0]])], [s0(p0: [56.0], p1: [[57.0]])], [s0(p0: [58.0], p1: [[59.0]])]], p1: s0(p0: [60.0], p1: [[61.0]]))], p4: [[s0(p0: [62.0], p1: [[63.0]])], [s0(p0: [64.0], p1: [[65.0]])]])]]
    let v1: Double = 66.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 66.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
