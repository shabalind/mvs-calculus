  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s3 {
    var p0: [s0]
    var p1: s0
  }
  func f22(_ v0: s3) -> s3 {
    var v5: s3 = v0
    var v7: s3 = v5
    let v4: [s3] = [v5, v7]
    let v3: s0 = v5.p1
    let v8: [s0] = v7.p0
    let v12: s0 = v8[1]
    let v14: s3 = s3(p0: v8, p1: v3)
    v5.p0 = v8
    v7.p1 = v12
    let v13: s3 = v4[0]
    let v15: s0 = v13.p1
    v5.p1 = v15
    return v14
  }
  func f9(_ v0: [s0]) -> [s0] {
    let v5: s0 = v0[2]
    let v1: [[Double]] = v5.p0
    let v4: s0 = v0[2]
    let v2: [Double] = v5.p1
    var v13: s0 = v5
    let v11: s0 = v0[0]
    var v17: [s0] = v0
    v13.p0 = v1
    let v10: [Double] = v11.p1
    v13.p0 = v1
    v17[2] = v13
    v13.p1 = v10
    v13.p1 = v2
    let v56: s3 = s3(p0: v17, p1: v4)
    let v34: s3 = f22(v56)
    let v49: s3 = f22(v34)
    let v93: s3 = f22(v49)
    let v59: s3 = f22(v93)
    v17 = v0
    let v63: s3 = f22(v59)
    let v123: s3 = f22(v63)
    let v111: [s0] = v123.p0
    return v111
  }
  func f3(_ v0: Double) -> Double {
    var v6: Double = v0
    var v7: Double = v0
    var v3: Double = v6
    var v5: Double = v6
    var v10: Double = v5
    var v12: Double = v10
    v12 = v3
    v12 = v7
    return v12
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    var v7: s3 = v0
    let v6: Double = f3(v1)
    let v3: s0 = v7.p1
    v7.p1 = v3
    v7.p1 = v3
    v7.p1 = v3
    let v20: s3 = f22(v0)
    var v11: s0 = v3
    let v12: [Double] = v3.p1
    let v14: [[Double]] = v3.p0
    let v17: [Double] = v14[1]
    var v32: [Double] = v17
    var v22: s0 = v3
    var v21: s0 = v3
    let v35: s0 = v20.p1
    var v25: [[Double]] = v14
    var v28: s0 = v35
    let v27: [s0] = v7.p0
    v28.p0 = v14
    var v75: [[Double]] = v14
    let v52: s0 = v27[2]
    var v43: [Double] = v32
    var v61: [[Double]] = v75
    let v44: [[Double]] = v11.p0
    v75 = v44
    var v60: s0 = v21
    let v81: [s0] = f9(v27)
    let v69: s0 = v27[1]
    v75[0] = v43
    v32[0] = v6
    v7.p1 = v22
    v25[2] = v17
    v22.p1 = v12
    var v49: s0 = v28
    v21.p0 = v25
    let v70: [Double] = v11.p1
    let v53: [Double] = v69.p1
    var v48: s0 = v52
    let v110: s0 = v81[1]
    let v56: [Double] = v110.p1
    v7.p1 = v60
    v21.p1 = v56
    v28.p0 = v14
    var v68: [Double] = v17
    v49.p1 = v70
    let v100: [Double] = v49.p1
    v28.p0 = v25
    v75[0] = v68
    v21.p1 = v100
    v75[2] = v17
    let v74: Double = v100[0]
    v25[0] = v32
    v28.p0 = v61
    v60 = v69
    v28.p1 = v53
    v7.p1 = v48
    return v74
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0, 4.0]), s0(p0: [[5.0], [6.0], [7.0]], p1: [8.0, 9.0]), s0(p0: [[10.0], [11.0], [12.0]], p1: [13.0, 14.0])], p1: s0(p0: [[15.0], [16.0], [17.0]], p1: [18.0, 19.0]))
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
