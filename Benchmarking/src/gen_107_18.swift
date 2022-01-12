  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f81(_ v0: Double) -> Double {
    var v6: Double = v0
    var v3: Double = v6
    v6 = v0
    var v1: Double = v6
    var v4: Double = v1
    var v10: Double = v0
    var v2: Double = v3
    var v9: Double = v4
    var v5: Double = v6
    var v12: Double = v10
    var v21: Double = v5
    let v27: [Double] = [v0, v12, v2, v3]
    var v61: [Double] = v27
    v61[1] = v9
    let v16: [[Double]] = [v61, v27, v27, v61]
    let v33: Double = v61[0]
    v61[2] = v33
    var v34: [[Double]] = v16
    let v53: [Double] = v34[3]
    var v32: [[Double]] = v34
    var v37: [[Double]] = v32
    let v40: [Double] = v37[1]
    v61[3] = v21
    let v71: [Double] = v34[1]
    let v48: [[Double]] = [v71, v71, v71, v27, v53, v71, v40]
    v32[1] = v61
    let v101: [Double] = v48[5]
    v34 = v16
    let v112: Double = v101[3]
    return v112
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v2: [[Double]] = v0.p0
    var v10: Double = v1
    let v9: [Double] = v2[2]
    var v17: [Double] = v9
    let v75: [[Double]] = [v17, v9, v17, v9, v9]
    let v23: Double = v10 + v1
    let v29: Double = f81(v1)
    v10 = v29
    var v34: [[Double]] = v75
    let v73: Double = v23 - v1
    v34[1] = v9
    let v59: [Double] = v34[0]
    let v33: [Double] = v75[3]
    var v63: [[Double]] = v75
    v63[4] = v59
    v63[0] = v59
    v17[0] = v73
    v63[1] = v33
    let v62: Double = v17[0]
    v17[0] = v23
    var v111: [[Double]] = v63
    v17[0] = v62
    let v189: [Double] = v111[1]
    let v190: Double = v189[0]
    let v107: [Double] = v111[0]
    v63[4] = v107
    return v190
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
