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
  func f0(_ v0: [s1], _ v1: s0, _ v2: Double) -> Double {
    let v4: s1 = v0[0]
    let v8: [[Double]] = v1.p0
    let v12: s0 = v4.p0
    let v14: [[Double]] = v12.p0
    let v19: [Double] = v14[1]
    var v39: [Double] = v19
    var v38: [[Double]] = v8
    v38[1] = v39
    let v165: [Double] = v38[0]
    let v113: Double = v165[0]
    return v113
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]]))]
    let v1: s0 = s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])
    let v2: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
