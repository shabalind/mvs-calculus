  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  func f15(_ v0: [s0]) -> [s0] {
    var v2: [s0] = v0
    let v5: s0 = v2[0]
    var v10: [s0] = v2
    let v6: [[Double]] = v5.p1
    var v14: [[Double]] = v6
    let v11: s0 = v10[1]
    let v20: [Double] = v5.p0
    var v12: [Double] = v20
    var v25: s0 = v11
    v2[1] = v5
    var v18: [s0] = v10
    let v31: [Double] = v14[0]
    v14[0] = v12
    let v22: [Double] = v5.p0
    let v13: [[Double]] = v11.p1
    v18[0] = v25
    v25.p0 = v31
    let v42: [[Double]] = v25.p1
    v14[0] = v22
    v25.p1 = v6
    v25.p1 = v13
    v25.p0 = v22
    v25.p1 = v42
    var v53: [s0] = v18
    v25.p0 = v22
    return v53
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s0], _ v2: [s0], _ v3: Double) -> Double {
    var v7: [s0] = v1
    let v13: s0 = v0[1]
    v7[0] = v13
    let v8: [s0] = f15(v7)
    let v4: s0 = v7[1]
    let v21: [s0] = f15(v8)
    let v14: s0 = v21[1]
    let v18: [Double] = v14.p0
    v7 = v1
    let v32: [Double] = v4.p0
    let v55: Double = v32[0]
    let v37: Double = v18[0]
    let v94: Double = v37 * v55
    return v94
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [0.0], p1: [[1.0]]), s0(p0: [2.0], p1: [[3.0]]), s0(p0: [4.0], p1: [[5.0]])]
    let v1: [s0] = [s0(p0: [6.0], p1: [[7.0]]), s0(p0: [8.0], p1: [[9.0]])]
    let v2: [s0] = [s0(p0: [10.0], p1: [[11.0]]), s0(p0: [12.0], p1: [[13.0]]), s0(p0: [14.0], p1: [[15.0]])]
    let v3: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
