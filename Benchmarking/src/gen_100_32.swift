  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v6: [s2] = [v0, v0, v0, v0, v0]
    let v3: s2 = v6[2]
    let v10: s0 = v3.p0
    let v36: s1 = v3.p1
    let v25: [[Double]] = v10.p2
    let v33: [Double] = v25[2]
    let v21: Double = v33[0]
    let v40: s0 = v36.p0
    let v34: [[Double]] = v40.p0
    let v82: [Double] = v34[0]
    let v44: Double = v82[0]
    let v53: Double = v44 / v21
    return v53
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]], p2: [[4.0], [5.0], [6.0]]), p1: s1(p0: s0(p0: [[7.0], [8.0]], p1: [[9.0], [10.0]], p2: [[11.0], [12.0], [13.0]]), p1: [s0(p0: [[14.0], [15.0]], p1: [[16.0], [17.0]], p2: [[18.0], [19.0], [20.0]])]))
    let v1: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
