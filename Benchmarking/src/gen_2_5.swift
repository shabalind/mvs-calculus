  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s4 {
    var p0: s1
    var p1: s1
  }
  func f90(_ v0: s4) -> s4 {
    var v1: s4 = v0
    var v8: s4 = v0
    let v13: s1 = v1.p0
    v8.p0 = v13
    return v8
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v11: s4 = v0[2]
    let v22: s4 = f90(v11)
    let v16: s1 = v22.p1
    let v32: s0 = v16.p1
    let v36: [[Double]] = v32.p0
    let v41: [Double] = v36[0]
    let v190: Double = v41[0]
    return v190
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s1(p0: [s0(p0: [[0.0]]), s0(p0: [[1.0]])], p1: s0(p0: [[2.0]])), p1: s1(p0: [s0(p0: [[3.0]]), s0(p0: [[4.0]])], p1: s0(p0: [[5.0]]))), s4(p0: s1(p0: [s0(p0: [[6.0]]), s0(p0: [[7.0]])], p1: s0(p0: [[8.0]])), p1: s1(p0: [s0(p0: [[9.0]]), s0(p0: [[10.0]])], p1: s0(p0: [[11.0]]))), s4(p0: s1(p0: [s0(p0: [[12.0]]), s0(p0: [[13.0]])], p1: s0(p0: [[14.0]])), p1: s1(p0: [s0(p0: [[15.0]]), s0(p0: [[16.0]])], p1: s0(p0: [[17.0]])))]
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
