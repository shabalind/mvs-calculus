  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f45(_ v0: Double) -> Double {
    var v2: Double = v0
    var v4: Double = v2
    var v8: Double = v0
    var v12: Double = v4
    v12 = v8
    return v12
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: s1, _ v2: Double) -> Double {
    var v20: Double = v2
    let v46: Double = f45(v20)
    let v55: Double = f45(v46)
    let v37: Double = v20 * v55
    return v37
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])), s1(p0: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]))]
    let v1: s1 = s1(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]))
    let v2: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
