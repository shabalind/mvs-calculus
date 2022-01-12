  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f101(_ v0: s1) -> s1 {
    var v7: s1 = v0
    let v3: [s0] = v7.p0
    var v6: s1 = v0
    let v12: [s0] = v0.p1
    v6.p1 = v12
    v7 = v6
    let v33: [s0] = v0.p0
    let v63: s1 = s1(p0: v33, p1: v3)
    return v63
  }
  func f39(_ v0: s0, _ v1: Double) -> s0 {
    let v4: [[Double]] = v0.p0
    let v25: s0 = s0(p0: v4)
    return v25
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    var v7: [s1] = v0
    let v5: s1 = v7[2]
    let v3: s1 = f101(v5)
    let v18: s1 = v0[0]
    v7[0] = v3
    let v11: [s0] = v3.p1
    var v14: Double = v1
    let v21: Double = v14 * v1
    let v19: s0 = v11[0]
    let v27: s0 = f39(v19, v14)
    let v24: s0 = f39(v27, v21)
    let v13: [[Double]] = v19.p0
    let v37: [Double] = v13[0]
    let v53: Double = v37[0]
    v7[2] = v3
    v7[2] = v18
    var v67: Double = v53
    let v109: [[Double]] = v24.p0
    let v183: [Double] = v109[0]
    var v131: [Double] = v183
    let v123: Double = v131[0]
    v131[0] = v67
    return v123
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0]]), s0(p0: [[1.0]])], p1: [s0(p0: [[2.0]]), s0(p0: [[3.0]])]), s1(p0: [s0(p0: [[4.0]]), s0(p0: [[5.0]])], p1: [s0(p0: [[6.0]]), s0(p0: [[7.0]])]), s1(p0: [s0(p0: [[8.0]]), s0(p0: [[9.0]])], p1: [s0(p0: [[10.0]]), s0(p0: [[11.0]])])]
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
