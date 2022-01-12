  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v4: Double = v1
    var v15: Double = v1
    let v12: Double = v1 * v1
    var v46: Double = v1
    var v32: Double = v4
    var v36: Double = v32
    let v165: Double = v46 / v12
    var v113: Double = v165
    let v141: Double = v46 - v36
    let v81: Double = v141 / v15
    let v105: Double = v113 + v81
    return v105
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [[s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])]], p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])), p1: s1(p0: [[s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])))
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
