  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s5 {
    var p0: s0
    var p1: [s0]
  }
  func f39(_ v0: [s5]) -> [s5] {
    var v6: [s5] = v0
    var v7: [s5] = v6
    let v5: s5 = v7[0]
    let v8: s5 = v7[0]
    var v2: s5 = v8
    v6[0] = v8
    let v25: [s0] = v5.p1
    v7[0] = v8
    let v9: s0 = v5.p0
    var v12: [s5] = v0
    let v13: s5 = v6[0]
    var v18: s5 = v8
    let v20: s5 = v0[0]
    let v41: [s0] = v18.p1
    v2.p1 = v41
    v12[0] = v2
    v2.p1 = v25
    v18.p1 = v25
    let v30: [s0] = v13.p1
    v18.p1 = v30
    var v58: s5 = v20
    v6[0] = v2
    var v65: s0 = v9
    v12 = v7
    v12[0] = v58
    v58.p0 = v65
    v6[0] = v13
    var v108: [s5] = v0
    var v48: [s5] = v108
    let v176: s5 = v48[0]
    v58 = v176
    v6 = v108
    return v12
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    let v3: [s5] = f39(v0)
    let v6: s5 = v3[0]
    let v2: s5 = v3[0]
    var v16: s5 = v2
    let v18: [s0] = v16.p1
    v16.p1 = v18
    let v23: s0 = v18[0]
    let v20: s0 = v6.p0
    let v10: [[Double]] = v23.p0
    v16 = v6
    var v14: s0 = v23
    let v38: [Double] = v10[0]
    v16.p0 = v14
    v16.p0 = v20
    let v31: [s0] = v6.p1
    let v36: [[Double]] = v23.p0
    let v27: Double = v38[0]
    v14.p0 = v36
    var v32: Double = v1
    v32 = v27
    v16.p1 = v31
    v32 = v27
    return v32
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: s0(p0: [[0.0], [1.0]], p1: [2.0, 3.0]), p1: [s0(p0: [[4.0], [5.0]], p1: [6.0, 7.0])])]
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
