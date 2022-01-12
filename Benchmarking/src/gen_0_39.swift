  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v2: [s0] = v0.p0
    let v4: [s0] = v0.p0
    let v5: s0 = v2[1]
    let v10: s0 = v4[0]
    let v12: [[Double]] = v5.p0
    let v30: [[Double]] = v10.p1
    var v18: [[Double]] = v12
    let v19: [Double] = v30[0]
    v18[0] = v19
    let v48: [Double] = v18[1]
    let v79: Double = v48[0]
    return v79
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], p1: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]))
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
