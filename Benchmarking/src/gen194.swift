  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f81(_ v0: Double) -> Double {
    var v6: Double = v0
    var v1: Double = v6
    var v5: Double = v6
    var v3: Double = v5
    var v9: Double = v3
    var v13: Double = v0
    var v4: Double = v6
    let v2: [Double] = [v5, v0, v13, v4, v1, v5]
    let v10: Double = v2[3]
    let v14: Double = v2[2]
    var v19: [Double] = v2
    let v12: Double = v2[4]
    let v17: Double = v2[3]
    v19[5] = v6
    let v16: Double = v19[5]
    let v43: [Double] = [v17, v9, v14, v16, v10, v14, v9]
    v19[0] = v9
    let v20: [[Double]] = [v43, v43, v43, v43, v43, v43]
    v19[1] = v12
    v6 = v4
    var v32: [Double] = v2
    var v25: [[Double]] = v20
    let v23: [Double] = v20[4]
    v1 = v12
    var v33: [[Double]] = v25
    v32 = v19
    let v41: [Double] = v33[0]
    let v71: Double = v32[2]
    v9 = v71
    let v121: Double = v41[5]
    v33[4] = v23
    return v121
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v6: [s0] = v0.p1
    let v4: s0 = v6[2]
    let v18: [[Double]] = v4.p1
    let v14: [Double] = v18[0]
    let v39: Double = v14[0]
    let v24: Double = f81(v39)
    return v24
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: 0.0, p1: [[1.0], [2.0]]), p1: [s0(p0: 3.0, p1: [[4.0], [5.0]]), s0(p0: 6.0, p1: [[7.0], [8.0]]), s0(p0: 9.0, p1: [[10.0], [11.0]])])
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
