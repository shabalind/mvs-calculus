  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f20(_ v0: s1) -> s1 {
    var v7: s1 = v0
    let v3: [s0] = v0.p1
    let v2: [s0] = v0.p1
    v7.p1 = v2
    let v28: [s0] = v0.p0
    let v23: [s0] = v7.p1
    let v29: [s0] = v0.p1
    v7.p1 = v2
    let v35: [s0] = v0.p1
    v7.p1 = v29
    v7.p1 = v3
    v7.p1 = v23
    var v47: s1 = v7
    v7.p1 = v35
    v47.p0 = v28
    var v86: s1 = v47
    return v86
  }
  func f2(_ v0: Double, _ v1: s1) -> Double {
    let v27: Double = v0 + v0
    var v68: Double = v27
    return v68
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v7: [s1] = v0[0]
    var v8: [[s1]] = v0
    let v4: s1 = v7[0]
    v8[0] = v7
    let v2: [s1] = v0[0]
    let v9: [s1] = v0[0]
    let v3: s1 = f20(v4)
    let v5: [s1] = v8[0]
    v8[0] = v2
    let v6: s1 = v5[0]
    v8[0] = v9
    let v20: Double = f2(v1, v3)
    v8[0] = v5
    let v11: [s1] = v0[0]
    v8 = v0
    v8[0] = v7
    let v17: [s0] = v4.p1
    var v24: s1 = v3
    v8[0] = v7
    let v32: Double = f2(v20, v4)
    let v18: [s0] = v6.p0
    v8[0] = v5
    v24.p0 = v18
    var v19: s1 = v6
    let v23: s1 = f20(v19)
    var v30: s1 = v6
    v19.p0 = v18
    v8[0] = v2
    let v55: Double = v20 * v32
    var v44: [s1] = v11
    v44[0] = v30
    var v33: s1 = v23
    let v48: s1 = f20(v33)
    let v53: s1 = f20(v48)
    v30 = v19
    v33.p1 = v17
    let v50: Double = f2(v55, v53)
    v8[0] = v7
    v8[0] = v44
    let v57: [s0] = v24.p0
    v8[0] = v44
    v8[0] = v44
    v8[0] = v11
    v33.p0 = v57
    return v50
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]])], p1: [s0(p0: [[3.0]], p1: [[4.0], [5.0]]), s0(p0: [[6.0]], p1: [[7.0], [8.0]])])]]
    let v1: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
