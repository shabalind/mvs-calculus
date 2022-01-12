  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s4 {
    var p0: s0
    var p1: s1
  }
  func f32(_ v0: s1) -> s1 {
    let v1: s0 = v0.p1
    let v11: s4 = s4(p0: v1, p1: v0)
    let v26: s1 = v11.p1
    var v29: s1 = v26
    return v29
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v2: s1 = f32(v0)
    let v6: s0 = v2.p0
    let v4: [[Double]] = v6.p1
    let v10: [Double] = v4[0]
    let v11: Double = v10[0]
    return v11
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
