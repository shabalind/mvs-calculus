  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v2: s0 = v0.p0
    let v3: s0 = v0.p1
    let v5: [[Double]] = v3.p0
    let v15: [Double] = v5[0]
    let v25: Double = v15[0]
    let v29: [[Double]] = v2.p1
    var v57: Double = v25
    let v48: [Double] = v29[2]
    v57 = v1
    let v131: Double = v48[0]
    let v86: Double = v57 * v131
    return v86
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]))
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
