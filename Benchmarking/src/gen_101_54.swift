  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  func f29(_ v0: s0) -> s0 {
    return v0
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v4: s0 = v0[2]
    let v7: s0 = f29(v4)
    let v5: s0 = v0[1]
    let v12: [[Double]] = v7.p1
    let v8: [Double] = v12[2]
    let v11: Double = v8[0]
    let v26: Double = v8[0]
    var v50: s0 = v5
    let v36: [[Double]] = v50.p1
    let v24: [[Double]] = v7.p1
    var v27: [Double] = v8
    let v43: s0 = f29(v50)
    let v25: Double = v27[0]
    let v37: Double = v43.p0
    v27[0] = v11
    v50.p1 = v24
    let v38: Double = v27[0]
    v50.p0 = v25
    let v112: [[Double]] = v43.p1
    v27[0] = v26
    v50.p1 = v36
    v50.p0 = v38
    v50.p1 = v112
    return v37
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: 0.0, p1: [[1.0], [2.0], [3.0]]), s0(p0: 4.0, p1: [[5.0], [6.0], [7.0]]), s0(p0: 8.0, p1: [[9.0], [10.0], [11.0]])]
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
